import java.util.Scanner;

public class GeneraPC {
    public static Scanner sc = new Scanner(System.in);

    public static String[][] componentesPc = {
            //codigo, denominación, precio, obligatorio? S/N
            {"AAA","Placa Madre", "20000", "S"} ,
            {"BBB","Procesador" , "25000" , "S"} ,
            {"CCC","Memoria RAM", "5000" , "S"} ,
            {"DDD","Placa de Red", "3000" , "N"} ,
            {"EEE","Disco Rigido SSD", "22000" , "S"} ,
            {"FFF"," Placa de Video", "42000" , "N"} ,
            {"GGG", "Monitor Led 21", "32000" , "N"} ,
            {"HHH","Monitor Led 25", "41000" , "N"} ,
            {"JJJ","Kit Teclado - Mouse", "9000" , "N"} ,
            {"KKK","Gabinete", "6500" , "S"},
            {"LLL","Fuente Alimentación", "6500" , "S"},
            {"MMM","Placa de Sonido", "16500" , "N"}
    };
    public static String[] componentesObligatorios = {
            "AAA","BBB","CCC","EEE","KKK","LLL"
    };
    public static void main(String[] args) {

        String stringAux;
        int numAux = 0;
        int cantidadComponentes = 0;
        double recargo = 0;


        Computadora compu = new Computadora();

        System.out.println("Ingrese la marca de su computadora: ");
        compu.setMarca(sc.nextLine());
        System.out.println("Ingrese el modelo: ");
        compu.setModelo(sc.nextLine());
        System.out.println("Ingrese el codigo de barras: ");
        stringAux = sc.nextLine();
        do {
            if ((stringAux.length() >= 7) && (stringAux.length() <= 15)) {
                compu.setCodigoBarras(Long.parseLong(stringAux));
                break;
            } else {
                System.out.println("El codigo de barras no es valido; \nPor favor ingerese un número entre 7 y 15 caracteres. ");
                stringAux = sc.nextLine();
            }
        } while ((stringAux.length() <= 7) || (stringAux.length() >= 15));


        //2b
        System.out.println("Indique la cantidad de componentes que tendrá su computadora: ");
        numAux = sc.nextInt();
        do {
            if (numAux < 5 || numAux > 12)
            {
                System.out.println("Por favor ingerese un número entre 5 y 12 caracteres.");
                numAux = sc.nextInt();
            }
            else
            {
                cantidadComponentes = numAux;
            }

        } while (numAux < 5 || numAux > 12);

        //2c
        String[][] componentes1 = new String[cantidadComponentes][4];

        //2d
        System.out.println("\n---Componentes de la computadora:---");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(componentesPc[i][j] + ", ");
            }
            System.out.println("");
        }

        numAux = cantidadComponentes;
        int n = 0;
        int filasLlenas = 0;

        System.out.println("\nIngrese el código de los componentes:");
        do
        {
            stringAux = sc.nextLine();
            System.out.println(stringAux);
            boolean found = false;
            boolean found2 = false;

            for (int i = 0; i < 12; i++) {
                if (componentesPc[i][0].equalsIgnoreCase(stringAux))
                {
                    if (filasLlenas > 0)
                    {
                        for (int k = 0; k < filasLlenas; k++)
                        {
                            if (componentes1[k][0].equalsIgnoreCase(stringAux))
                            {
                                System.out.println("Este codigo ya ha sido ingresado.");
                                break;
                            }
                            else {found2 = true;}
                        }
                    }
                    else {found2 = true;}


                    //codigo correcto, llenar la matriz
                    if (found2)
                    {
                        for (int j = 0; j < 4; j++) {
                            componentes1[n][j] = componentesPc[i][j];
                        }
                        numAux = numAux-1;
                        n = n+1;
                        filasLlenas = filasLlenas+1;
                        found = true;
                        System.out.println("OK ");
                        break;
                    }

                }
            }
            if (!found)
            {
                System.out.println("Ingrese un código válido.");
            }
        }while (numAux != 0);


        for (int i = 0; i < cantidadComponentes; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(componentes1[i][j] + ", ");
            }
            System.out.println("");
        }

        compu.setComponentes(componentes1);


        //e
        boolean allFound = true;
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < cantidadComponentes; j++) {

                if(componentes1[j][0].equalsIgnoreCase(componentesObligatorios[i]))
                {
                    allFound = true;
                    break;
                }
                else {allFound = false;}

            }
        }

        if (!allFound)
        {
            System.out.println("\nAtención, 1 o más de los componentes obligatorios no fueron agregados, \npor este motivo se cobrara un recargo del 20%.\n");
            recargo = 0.2;
        }

        System.out.println("La computadora especificada es: \n" +
                "Marca: " + compu.getMarca()
                + "\nModelo: " + compu.getModelo()
                + "\nCodigo de barras: " + compu.getCodigoBarras()
                + "\nAño: 2024"
        );

        System.out.println("Codigo item:    Denominación:      Precio:");
        int total = 0;
        for (int i = 0; i < cantidadComponentes; i++)
        {
            System.out.println("   "+componentes1[i][0]+ "         " +componentes1[i][1]+ "          " +Integer.parseInt(componentes1[i][2]));
            total = total + Integer.parseInt(componentes1[i][2]);
        }

        recargo = total*recargo;
        System.out.println("                Recargo:           "+recargo);
        System.out.println("                Monto final:       "+(total+recargo));




    }
}
