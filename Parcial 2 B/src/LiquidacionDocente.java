import java.util.Scanner;
import java.util.ArrayList;

public class LiquidacionDocente {
    public static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<Catedra> catedrasCarrera = new ArrayList<>();
        String stringAux;
        int intAux;
        double doubleAux;
        boolean exit = false;
        boolean moreDocentes = true;

        catedrasCarrera.add(new Catedra(10, "Analisis Matemático",8));
        catedrasCarrera.add(new Catedra(20, "Algoritmos" , 4));
        catedrasCarrera.add(new Catedra(30, "Paradigmas de la Computación", 6));
        catedrasCarrera.add(new Catedra(40, "Inteligencia Artificial", 12));

        Universidad uni = new Universidad();

        uni.inicializarListaDocentes();

        System.out.println("Ingrese el cuit de la Universidad: ");
        do {
            stringAux = sc.nextLine();
                if (stringAux.length() == 11)
                {
                    uni.setCuit(stringAux);
                    break;
                }
                else
                {
                    System.out.println("Por favor ingrese un numero de 11 dígitos. ");
                }
        } while (true);

        stringAux = "";
        System.out.println("Ingrese la razón Social de la Universidad: ");
        do {
            stringAux = sc.nextLine();
            if (stringAux.isEmpty())
            {
                System.out.println("Por favor ingrese una razón social. ");
            }
            else
            {
                uni.setRazonSocial(stringAux);
                break;
            }
        } while (true);

        System.out.println("Ingrese el valor base por hora cátedra: ");
        do {
            doubleAux = sc.nextDouble();
            if (doubleAux > 0)
            {
                uni.setValorHoraCatedraBase(doubleAux);
                break;
            }
            else
            {
                System.out.println("Por favor ingrese un numero mayor a cero. ");
            }
        } while (true);


        //carga docentes
        do {
            Docente profe = new Docente();


            stringAux = "";
            System.out.println("Ingrese el legajo del Docente: ");
            do {
                stringAux = sc.nextLine();
                if (stringAux.isEmpty())
                {
                    System.out.println("Por favor ingrese el legajo. ");
                }
                else
                {
                    if (uni.existeDocente(Integer.parseInt(stringAux)))
                    {
                        System.out.println("Este docente ya ha sido cargado. Intente nuevamente.");
                    }
                    else {
                        profe.setLegajo(Integer.parseInt(stringAux));
                        break;
                    }
                }
            } while (true);

            stringAux = "";
            System.out.println("Ingrese el nombre completo del Docente: ");
            do {
                stringAux = sc.nextLine();
                if (stringAux.isEmpty())
                {
                    System.out.println("Por favor ingrese el nombre. ");
                }
                else
                {
                    profe.setNombreCompleto(stringAux);
                    break;
                }
            } while (true);

            doubleAux = 0;
            System.out.println("Ingrese la antiguadad del docente: ");
            do {
                doubleAux = sc.nextDouble();
                if (doubleAux >= 0 && doubleAux < 120)
                {
                    profe.setAntiguedad(doubleAux);
                    break;
                }
                else
                {
                    System.out.println("Por favor ingrese un numero entre cero y 120. ");
                }
            } while (true);

            //catedra del docente
            exit = false;
            System.out.println("Ingrese el codigo de catedra del docente: ");
            do {
                intAux = sc.nextInt();
                for (Catedra c : catedrasCarrera)
                {
                    if (intAux == c.getCodigo())
                    {
                        profe.setCatedra(c);
                        exit = true;
                        break;
                    }
                }
                if (!exit)
                {
                    System.out.println("Por favor ingrese un código válido. ");
                }

            } while (!exit);


            //cargar docente armado a la lista
            uni.agregarDocente(profe);

            //continuar/salir
            System.out.println("Desea seguir cargando docentes? S/N ");
            sc.nextLine();
            stringAux = sc.nextLine();
            if (stringAux.equalsIgnoreCase("S"))
            {
                System.out.println();
            }
            else
            {
                moreDocentes = false;
            }


        }while (moreDocentes);


        uni.ticket();


    }

}
