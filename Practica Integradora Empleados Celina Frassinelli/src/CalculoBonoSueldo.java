import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CalculoBonoSueldo {

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

    private static List<Integer> codigosIngresados = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args)
    {


        //2a
        Empleado empleado = new Empleado();
        //2d
        BonoSueldo bonoSueldo = new BonoSueldo();


        //2b

        System.out.print("Ingrese el nombre del empleado: ");
        empleado.setNombreEmpleado(sc.nextLine());
        bonoSueldo.setEmpleado(empleado);

        System.out.print("Ingrese el cuil del empleado: ");
        empleado.setCuil(sc.nextLong());

        System.out.println("Ingrese el año de ingreso del empleado: xxxx ");
        int ingreso = sc.nextInt();
        ingreso = validarAnio(ingreso);
        empleado.setAnioIngreso(ingreso);

        System.out.print("Ingrese el mes de liquidación: xx ");
        int mes = sc.nextInt();
        while (mes > 12) {
            System.out.print("Por favor ingrese un mes válido." );
            mes = sc.nextInt();
        }
        empleado.setMesLiquidacion(mes);

        System.out.print("Ingrese el año de liquidación: xxxx ");
        int anio = sc.nextInt();
        anio = validarAnio(anio);
        empleado.setAnioLiquidacion(anio);

        System.out.println("Ingrese el sueldo básico del empleado: xxxx ");
        empleado.setSueldoBasico(sc.nextInt());




        //2c
        int antiguedad = anio -ingreso;
        empleado.setMontoAntiguedad(empleado.getSueldoBasico() * (antiguedad * 0.02));


        System.out.println(bonoSueldo.getEmpleado());


        //2e
        String [][] bonoCalculado = new String[10][4];

        //2f procesar haberes
        procesarItems(bonoSueldo , true);
        //2f procesar deducciones
        procesarItems(bonoSueldo , false);


    }

    public static void procesarItems(BonoSueldo bonoSueldo, boolean esHaber)
    {
        String tipo = esHaber ? "haberes" : "deducciones";
        String[][] items = esHaber ? haberes : deducciones;
        boolean itemIngresado = false;
        int filaActual = esHaber ? 2 : 7;

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


            if (cod < 100 || cod > 104) {
                System.out.println("Por favor ingrese un código válido.");
            } else {
                if (codigosIngresados.contains(cod)) {
                    System.out.println("El código ya ha sido cargado");
                } else {
                    codigosIngresados.add(cod);
                }
            }

            // Buscar el código en el array correspondiente
            for (String[] item : items) {
                if (item[0].equals(cod)) {

                    double monto;
                    if (item[2].equals("M")) {
                        System.out.print("Ingrese el monto para " + item[1] + ": ");
                        monto = sc.nextDouble();
                    } else {
                        monto = bonoSueldo.getEmpleado().getSueldoBasico() * (Double.parseDouble(item[2]) / 100);
                    }

                    // Guardar en bonoCalculado
                    bonoSueldo.getBonoCalculado()[filaActual][0] = String.valueOf(cod);
                    bonoSueldo.getBonoCalculado()[filaActual][1] = item[1];
                    if (esHaber) {
                        bonoSueldo.getBonoCalculado()[filaActual][2] = String.valueOf(monto);
                        bonoSueldo.getBonoCalculado()[filaActual][3] = "0";
                    } else {
                        bonoSueldo.getBonoCalculado()[filaActual][2] = "0";
                        bonoSueldo.getBonoCalculado()[filaActual][3] = String.valueOf(monto);
                    }

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


}
