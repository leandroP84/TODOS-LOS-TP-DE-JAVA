import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //al poner atributos fuera del main, las funciones pueden acceder a ellos.

    //      static final: atributos constantes que no van a cambiar.
    private static final String[][] haberes = {
            {"100", "Presentismo", "9"},           // 9% del sueldo básico
            {"101", "Titulo Profesional", "9"},    // 9% del sueldo básico
            {"102", "Horas Extraordinarias", "M"}, // M = monto manual
            {"103", "Horas Nocturnas", "M"},      // M = monto manual
            {"104", "Otros Haberes", "M"}         // M = monto manual
    };
    // Deducciones (descuentos)
    private static final String[][] deducciones = {
            {"200", "Obra Social", "3"},    // 3% del sueldo básico
            {"201", "Jubilacion", "11"},    // 11% del sueldo básico
            {"202", "Sindicato", "2"},      // 2% del sueldo básico
            {"203", "Seguro", "1.5"},       // 1.5% del sueldo básico
            {"204", "Otros", "M"}          // M = monto manual
    };
    private static List<Integer> codigosIngresados = new ArrayList<>(); //lista de enteros
    private static Scanner sc = new Scanner(System.in);


    //main
    public static void main(String[] args)
    {
        Empleado empleado1 = new Empleado();

        //2b

        System.out.print("Ingrese el nombre del empleado: ");
        empleado1.setNombreEmpleado(sc.nextLine());

        System.out.print("Ingrese el cuil del empleado: ");
        empleado1.setCuil(sc.nextLong());

        System.out.println("Ingrese el año de ingreso del empleado: xxxx ");
        int ingreso = sc.nextInt();
        ingreso = validarAnio(ingreso);
        empleado1.setAnioIngreso(ingreso);

        //instancia de BonoSueldo
        BonoSueldo bonoSueldo1 = new BonoSueldo();
        System.out.print("Ingrese el mes de liquidación: xx ");
        int mes = sc.nextInt();
        while (mes > 12) {
            System.out.print("Por favor ingrese un mes válido." );
            mes = sc.nextInt();
        }
        bonoSueldo1.setMesLiquidacion(mes);

        System.out.print("Ingrese el año de liquidación: xxxx ");
        int anio = sc.nextInt();
        anio = validarAnio(anio);
        bonoSueldo1.setAnioLiquidacion(anio);

        System.out.println("Ingrese el sueldo básico del empleado: ");
        empleado1.setSueldoBasico(sc.nextInt());

        //2c
        int antiguedad = anio -ingreso;
        empleado1.setMontoAntiguedad(empleado1.getSueldoBasico() * (antiguedad * 0.02));



        //2f procesar haberes
        procesarItems(bonoSueldo1 , empleado1 , true);
        //2f procesar deducciones
        procesarItems(bonoSueldo1 , empleado1 ,false);


        mostrarBonosGenerados(empleado1, bonoSueldo1);


    }


    public static void procesarItems(BonoSueldo bonoSueldo1, Empleado empleado1, boolean esHaber)
    {
        String tipo = esHaber ? "haberes" : "deducciones";
        String[][] items = esHaber ? haberes : deducciones;
        boolean itemIngresado = false;
        int filaActual = esHaber ? 2 : 7; // Posición inicial en la matriz bonoCalculado

        do {

            System.out.println("Ingrese los "+ tipo +" del empleado: ");
            if (tipo == "haberes") {
                for (int i = 0; i < 5; i++) {
                    System.out.println("        " + haberes[i][0] + ": " + haberes[i][1]);
                }
            }
            else
            {
                for (int i = 0; i < 5; i++) {
                    System.out.println("        " + deducciones[i][0] + ": " + deducciones[i][1]);
                }
            }
            System.out.println("        000 para finalizar.");
            System.out.println("Ingrese el codigo de ítem: ");
            int cod = sc.nextInt(); //codigo sin verificar

            //validacion del código
            if (cod == 000)
            {
                if (!itemIngresado)
                {
                    System.out.println("Debe ingresar al menos 1 " + tipo.substring(0, tipo.length()-2));
                    continue;
                }
                break;
            }

            if (tipo == "haberes") {
                if (cod < 100 || cod > 104) {
                    System.out.println("Por favor ingrese un código válido.");
                } else {
                    if (codigosIngresados.contains(cod)) {
                        System.out.println("El código ya ha sido cargado");
                    } else {
                        codigosIngresados.add(cod);
                    }
                }
            }
            else
            {
                if (cod < 200 || cod > 204) {
                    System.out.println("Por favor ingrese un código válido.");
                } else {
                    if (codigosIngresados.contains(cod)) {
                        System.out.println("El código ya ha sido cargado");
                    } else {
                        codigosIngresados.add(cod);
                    }
                }
            }

            // Buscar el código en el array correspondiente
            for (String[] item : items) {
                if (item[0].equals(String.valueOf(cod))) {

                    double monto;
                    if (item[2].equals("M")) {
                        System.out.print("Ingrese el monto para " + item[1] + ": ");
                        monto = sc.nextDouble();
                    } else {
                        monto = empleado1.getSueldoBasico() * (Double.parseDouble(item[2]) / 100);
                    }

                    // Guardar en bonoCalculado
                    //2e
                    String [][] bonoCalcu = new String[10][4]; //string local temporal
                    bonoCalcu[filaActual][0] = String.valueOf(cod);
                    bonoCalcu[filaActual][1] = item[1];
                    if (esHaber) {
                        bonoCalcu[filaActual][2] = String.valueOf(monto);
                        bonoCalcu[filaActual][3] = "0";
                    } else {
                        bonoCalcu[filaActual][2] = "0";
                        bonoCalcu[filaActual][3] = String.valueOf(monto);
                    }

                    bonoSueldo1.setBonoCalculado(bonoCalcu);

                    codigosIngresados.add(cod);
                    itemIngresado = true;
                    filaActual++;
                    break;
                }
            }
        } while (true);
    }

    public static int validarAnio(int ingreso)
    {
        Scanner sc = new Scanner(System.in);
        boolean aux = false;
        while (aux == false)
        {
            if (ingreso <= 2024)
            {
                aux = true;
                break;
            }
            else
            {
                System.out.println("Error, intente de nuevo.");
                System.out.println("reingrese el año: ");
                ingreso = sc.nextInt();
            }
        }
        return ingreso;
    }

    private static void mostrarBonosGenerados(Empleado empleado, BonoSueldo bono)
    {
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