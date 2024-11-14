//resolución practica parcial (main)


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main2 {

    private static final String[][] haberes = {
            {"100", "Presentismo", "9"},
            {"101", "Titulo Profesional", "9"},
            {"102", "Horas Extraordinarias", "M"},
            {"103", "Horas Nocturnas", "M"},
            {"104", "Otros Haberes", "M"}
    };

    private static final String[][] deducciones = {
            {"200", "Obra Social", "3"},
            {"201", "Jubilacion", "11"},
            {"202", "Sindicato", "2"},
            {"203", "Seguro", "1.5"},
            {"204", "Otros", "M"}
    };

    private static List<Integer> codigosIngresados = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    public static void main2(String[] args)
    {
        //Perro salchicha = new Perro("Luna", "Messi", 5); //parametros ordenados
        //salchicha.setColor("marrón");
        //salchicha.sayOwner();
        //Perro labrador = new Perro();

        boolean continuarGenerando = true;
        Empleado empleado = crearEmpleado();

        while (continuarGenerando) {
            BonoSueldo bono = generarBonoSueldo(empleado);
            empleado.addBono(bono);

            System.out.print("¿Desea generar un nuevo bono de sueldo? (S/N): ");
            continuarGenerando = scanner.next().toUpperCase().equals("S");
            codigosIngresados.clear(); // Limpiar códigos para el siguiente bono
        }

        // Mostrar todos los bonos generados
        mostrarBonosGenerados(empleado);
    }

    private static Empleado crearEmpleado() {
        Empleado empleado = new Empleado();
        System.out.println("Ingrese los datos del empleado:");

        scanner.nextLine(); // Limpiar buffer
        System.out.print("Nombre completo: ");
        empleado.setNombreEmpleado(scanner.nextLine());

        System.out.print("CUIL: ");
        empleado.setCuil(scanner.nextLong());

        int anioActual = LocalDate.now().getYear();
        int anioIngreso;
        do {
            System.out.print("Año de ingreso: ");
            anioIngreso = scanner.nextInt();
            if (anioIngreso > anioActual) {
                System.out.println("El año de ingreso no puede ser mayor al año actual.");
            }
        } while (anioIngreso > anioActual);
        empleado.setAnioIngreso(anioIngreso);

        System.out.print("Sueldo básico: ");
        empleado.setSueldoBasico(scanner.nextDouble());
        empleado.calcularAntiguedad();

        return empleado;
    }

    private static BonoSueldo generarBonoSueldo(Empleado empleado) {
        BonoSueldo bono = new BonoSueldo(empleado);
        int anioActual = LocalDate.now().getYear();

        // Solicitar mes y año de liquidación
        System.out.print("Mes de liquidación (1-12): ");
        bono.setMesLiquidacion(scanner.nextInt());

        do {
            System.out.print("Año de liquidación: ");
            bono.setAnioLiquidacion(scanner.nextInt());
            if (bono.getAnioLiquidacion() > anioActual) {
                System.out.println("El año de liquidación no puede ser mayor al año actual.");
            }
        } while (bono.getAnioLiquidacion() > anioActual);

        // Procesar haberes
        procesarItems(bono, true);
        // Procesar deducciones
        procesarItems(bono, false);

        // Calcular monto final
        calcularMontoLiquidacion(bono);

        return bono;
    }

    private static void procesarItems(BonoSueldo bono, boolean esHaber) {
        String tipo = esHaber ? "haberes" : "deducciones";
        String[][] items = esHaber ? haberes : deducciones;
        boolean itemIngresado = false;
        int filaActual = esHaber ? 2 : 7; // Posición inicial en la matriz bonoCalculado

        do {
            System.out.println("Ingrese los " + tipo + " del empleado (000 para finalizar)");
            System.out.print("Ingrese el código del ítem: ");
            String codigo = scanner.next();

            if (codigo.equals("000")) {
                if (!itemIngresado) {
                    System.out.println("Debe ingresar al menos 1 " + tipo.substring(0, tipo.length()-1));
                    continue;
                }
                break;
            }

            // Verificar si el código ya fue ingresado
            if (codigosIngresados.contains(Integer.parseInt(codigo))) {
                System.out.println("El código ya ha sido cargado");
                continue;
            }

            // Buscar el código en el array correspondiente
            boolean codigoEncontrado = false;
            for (String[] item : items) {
                if (item[0].equals(codigo)) {
                    codigoEncontrado = true;
                    double monto;
                    if (item[2].equals("M")) {
                        System.out.print("Ingrese el monto para " + item[1] + ": ");
                        monto = scanner.nextDouble();
                    } else {
                        monto = bono.getEmpleado().getSueldoBasico() * (Double.parseDouble(item[2]) / 100);
                    }

                    // Guardar en bonoCalculado
                    bono.getBonoCalculado()[filaActual][0] = codigo;
                    bono.getBonoCalculado()[filaActual][1] = item[1];
                    if (esHaber) {
                        bono.getBonoCalculado()[filaActual][2] = String.valueOf(monto);
                        bono.getBonoCalculado()[filaActual][3] = "0";
                    } else {
                        bono.getBonoCalculado()[filaActual][2] = "0";
                        bono.getBonoCalculado()[filaActual][3] = String.valueOf(monto);
                    }

                    codigosIngresados.add(Integer.parseInt(codigo));
                    itemIngresado = true;
                    filaActual++;
                    break;
                }
            }

            if (!codigoEncontrado) {
                System.out.println("El código ingresado es incorrecto");
            }
        } while (true);
    }

    private static void calcularMontoLiquidacion(BonoSueldo bono) {
        double totalHaberes = bono.getEmpleado().getSueldoBasico() + bono.getEmpleado().getMontoAntiguedad();
        double totalDeducciones = 0;

        // Agregar sueldo básico y antigüedad a la matriz
        bono.getBonoCalculado()[0][1] = "Sueldo Básico";
        bono.getBonoCalculado()[0][2] = String.valueOf(bono.getEmpleado().getSueldoBasico());
        bono.getBonoCalculado()[1][1] = "Antigüedad";
        bono.getBonoCalculado()[1][2] = String.valueOf(bono.getEmpleado().getMontoAntiguedad());

        // Sumar haberes y deducciones
        for (String[] fila : bono.getBonoCalculado()) {
            if (fila != null && fila[2] != null) {
                totalHaberes += Double.parseDouble(fila[2]);
            }
            if (fila != null && fila[3] != null) {
                totalDeducciones += Double.parseDouble(fila[3]);
            }
        }

        bono.setMontoLiquidacion(totalHaberes - totalDeducciones);
    }

    private static void mostrarBonosGenerados(Empleado empleado) {
        for (BonoSueldo bono : empleado.getBonos()) {
            System.out.println("\nBono de sueldo a Liquidar:");
            System.out.println("Nombre: " + empleado.getNombreEmpleado());
            System.out.println("CUIL: " + empleado.getCuil());
            System.out.println("Mes Liquidación: " + bono.getMesLiquidacion() +
                    " Año Liquidación: " + bono.getAnioLiquidacion());
            System.out.println("Sueldo Básico: " + empleado.getSueldoBasico() +
                    " Año Ingreso: " + empleado.getAnioIngreso());
            System.out.println("\nCódigo\tÍtem\t\tHaberes\t\tDeducciones");

            double totalHaberes = 0;
            double totalDeducciones = 0;

            for (String[] fila : bono.getBonoCalculado()) {
                if (fila != null && fila[1] != null) {
                    System.out.printf("%s\t%-20s\t%s\t\t%s%n",
                            fila[0] != null ? fila[0] : "",
                            fila[1],
                            fila[2] != null ? fila[2] : "0",
                            fila[3] != null ? fila[3] : "0");

                    if (fila[2] != null) totalHaberes += Double.parseDouble(fila[2]);
                    if (fila[3] != null) totalDeducciones += Double.parseDouble(fila[3]);
                }
            }

            System.out.println("\nSUB TOTAL\t\t" + totalHaberes + "\t\t" + totalDeducciones);
            System.out.println("NETO\t\t\t" + bono.getMontoLiquidacion());
            System.out.println("----------------------------------------");
        }

    }


}
