import java.util.ArrayList;
import java.util.Scanner;

public class LiquidacionEmpresa {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        String stringAux;
        int intAux;
        boolean boolAux;
        boolean moreEmpleados = true;

        ArrayList<NivelAcademico> nivelesAcademicos = new ArrayList<>();

        nivelesAcademicos.add(new NivelAcademico(10, " Secundaro Completo ", 10));
        nivelesAcademicos.add(new NivelAcademico(20, " Universitario completo ", 30));
        nivelesAcademicos.add(new NivelAcademico(30, " Maestria completo ", 40));
        nivelesAcademicos.add(new NivelAcademico(40, " Doctorado completo ", 50));

        Empresa empresa = new Empresa();

        System.out.println("Ingrese el cuil de la empresa: ");
        do {
            stringAux = sc.nextLine();
            if (stringAux.length() == 11) {
                empresa.cuit = stringAux;
                break;
            }
            else
            {
                System.out.println("Ingrese un cuil de 11 dígitos. ");
            }
        } while (true);

        stringAux = "";
        System.out.println("Ingrese la razón Social: ");
        do {
            stringAux = sc.nextLine();
            if (stringAux.isEmpty()) {
                System.out.println("Por favor ingrese una razon social. ");
            }
            else {
                empresa.razonSocial = stringAux;
                break;
            }
        } while (true);

        //carga de Empleados
        do {
            Empleado empleado = new Empleado();

            stringAux = "";
            System.out.println("Ingrese el legajo del empleado: ");
            do {
                stringAux = sc.nextLine();
                if (stringAux.isEmpty()) {
                    System.out.println("Por favor ingrese el legajo del empleado. ");
                }
                else {
                    if (empresa.existeLegajo(Integer.parseInt(stringAux)))
                    {
                        System.out.println("Este empleado ya ha sido cargado. ");
                    }
                    else {
                        empleado.legajo = Integer.parseInt(stringAux);
                        break;
                    }
                }
            } while (true);

            System.out.println("Ingrese el nombre del empleado: ");
            stringAux = "";
            do {
                stringAux = sc.nextLine();
                if (stringAux.isEmpty()) {
                    System.out.println("Por favor ingrese un nombre. ");
                }
                else {
                    empleado.nombreCompleto = stringAux;
                    break;
                }
            } while (true);

            System.out.println("Ingrese el salario del Empleado: ");
            do {
                intAux = sc.nextInt();
                if (intAux <= 0) {
                    System.out.println("Por favor ingrese un numero mayor a cero. ");
                }
                else
                {
                    empleado.salario = intAux;
                    break;
                }
            } while (true);

            System.out.println("Ingrese el codigo del nivel academico del empleado: ");
            for (NivelAcademico nivel : nivelesAcademicos)
            {
                System.out.println(nivel.codigo + nivel.nivel + nivel.porcentajeAumento);
            }
            boolAux = false;
            do {
                intAux = sc.nextInt();
                for (NivelAcademico nivel : nivelesAcademicos)
                {
                    if (intAux == nivel.codigo)
                    {
                        empleado.nivelAcademico = nivel;
                        boolAux = true;
                        break;
                    }
                }
                if (!boolAux)
                {
                    System.out.println("Ingrese un codigo válido. ");
                }
            }while (!boolAux);

            empresa.empleados.add(empleado);

            System.out.println("Desea seguir ingresando empleados? S/N ");
            sc.nextLine();
            stringAux = sc.nextLine();

            if (stringAux.equalsIgnoreCase("S")){}
            else {
                moreEmpleados = false;
            }


        } while (moreEmpleados);

        empresa.ticket();
    }
}
