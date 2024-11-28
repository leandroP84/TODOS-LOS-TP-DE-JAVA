import java.util.ArrayList;
import java.util.Scanner;

public class GestionRecursosONG {
    public static final Scanner sc = new Scanner(System.in);
    public static ArrayList<Especialidad>especialidades = new ArrayList<>();

    public static void main(String[] args) {

        String stringAux;
        int intAux;
        double doubleAux;
        boolean boolAux;
        boolean existeEspecialidad;
        boolean moreColaboradores = true;


        especialidades.add(new Especialidad(10, "Trabajo Social", 15));
        especialidades.add(new Especialidad(20, "Desarrollo comunitario", 25));
        especialidades.add(new Especialidad(30, "Gestion de proyectos", 35));
        especialidades.add(new Especialidad(40, "Cooperacion internacional", 45));

        ONG ong = new ONG();
        System.out.println("Ingrese el nombre de la Organización: ");
        do {
            stringAux = sc.nextLine();
            if (stringAux.isEmpty()) {
                System.out.println("Por favor ingrese un nombre. ");
            }
            else {
                ong.setNombreOrganizacion(stringAux);
                break;
            }
        }while (true);

        System.out.println("Ingrese el CUIT de la organizacion: ");
        do {
            stringAux = sc.nextLine();
            if (stringAux.length() == 11) {
                ong.setCuit(stringAux);
                break;
            }
            else {
                System.out.println("Por favor ingrese un numero de 11 digitos. ");
            }
        } while (true);


        do {
            Colaborador colaborador = new Colaborador();

            System.out.println("Ingrese el identificador del Colaborador: ");
            do {
                intAux = sc.nextInt();
                if (ong.existeColaborador(intAux)) {
                    System.out.println("Ese colaborador ya ha sido ingresado. ");
                }
                else {
                    colaborador.setIdentificador(intAux);
                    break;
                }
            }while (true);

            System.out.println("Ingrese el nombre del Colaborador: ");
            do {
                stringAux = sc.nextLine();
                if (stringAux.isEmpty()) {
                    System.out.println("Por favor ingrese un nombre. ");
                }
                else {
                    colaborador.setNombreCompleto(stringAux);
                    break;
                }
            }while (true);

            System.out.println("Ingrese el salario del colaborador: ");
            do {
                doubleAux = sc.nextDouble();
                if (doubleAux <= 0)
                {
                    System.out.println("Por favor ingrese un valor mayor que 0");
                }
                else
                {
                    colaborador.setSalarioBase(doubleAux);
                    break;
                }
            } while (true);

            System.out.println("Ingrese el codigo de la especialidad: ");
            for (Especialidad e : especialidades) {
                System.out.println(e.getCodigo() + ", " + e.getNombreEspecialidad() + ", " + e.getPorcentajeComplemento());
            }

            existeEspecialidad = false;
            do {
                intAux = sc.nextInt();

                for (Especialidad e : especialidades) {
                    if (e.getCodigo() == intAux) {
                        colaborador.setEspecialidad(e);
                        existeEspecialidad = true;
                    }
                }
                if (!existeEspecialidad) {
                    System.out.println("Ingrese un codigo valido. ");
                }
            }while (!existeEspecialidad);

            ong.addColaboradores(colaborador);

            System.out.println("Desea agregar más colaboradores? S/N");
            sc.nextLine();
            stringAux = sc.nextLine();
            if (stringAux.equalsIgnoreCase("S")) {}
            else {
                moreColaboradores = false;
            }


        } while (moreColaboradores);

        ong.ticket();

    }
}
