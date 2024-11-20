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
            {"FFF","Placa de Video", "42000" , "N"} ,
            {"GGG", "Monitor Led 21", "32000" , "N"} ,
            {"HHH","Monitor Led 25", "41000" , "N"} ,
            {"JJJ","Kit Teclado - Mouse", "9000" , "N"} ,
            {"KKK","Gabinete", "6500" , "N"},
            {"LLL","Fuente Alimentación", "6500" , "S"},
            {"MMM","Placa de Sonido", "16500" , "N"}
    };
    public static String [] obligatorios =
            {"AAA", "BBB", "CCC", "EEE", "LLL"};

    public static void main(String[] args)
    {
        int intAux;
        String stringAux;
        int cantidadComponentes;
        double recargo = 0.0;

        Computadora compu = new Computadora();

        //1a
        System.out.println("Ingrese la marca de la computadora: ");
        compu.setMarca(sc.nextLine());

        System.out.println("Ingrese el modelo: ");
        compu.setModelo(sc.nextLine());


        System.out.println("Ingrese el codigo de barras: ");
        do {
            stringAux = sc.nextLine();
            if (stringAux.length() >= 7 && stringAux.length() <= 15)
            {
                compu.setCodigoBarras(Long.parseLong(stringAux));
                break;
            }
            else {
                System.out.println("Ingrese un codigo entre 7 y 15 caracteres:");
            }
        } while (true);

        //1b
        System.out.println("Ingrese la cantidad de componentes: ");
        do {
            intAux = sc.nextInt();
            if (intAux >= 5 && intAux <= 12)
            {
                cantidadComponentes = intAux;
                break;
            }
            else
            {
                System.out.println("Por favor ingrese un numero entre 5 y 12.");
            }
        } while (true);

        //2c
        compu.inicializarComponentes(cantidadComponentes);

        //2d
        System.out.println("\n---Componentes disponibles:---");
        for (int i = 0; i < 12; i++) // i = filas
        {
            for (int j = 0; j < 4; j++) // j = columnas
            {
                System.out.print(componentesPc[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("\n---Ingrese el codigo del componente: ----");

        boolean found = false;
        int posicion = 0;
        do
        {
            String codigo = sc.nextLine().toUpperCase();
            System.out.println(codigo);
            //verificar si esta disponible el codigo
            for (int i= 0; i < 12; i++)
            {
                if (componentesPc[i][0].equals(codigo))
                {
                    if (compu.existeComponente(codigo))
                    {
                        System.out.println("Ese componente ya ha sido agregado.");
                        break;
                    }
                    compu.agregarComponentes(
                            posicion,               //fila de la matriz componentes
                            componentesPc[i][0],    //codigo
                            componentesPc[i][1],    //denominacion
                            componentesPc[i][2],    //precio
                            componentesPc[i][3]     //obligatorio
                    );
                    found = true;
                    posicion++;
                }
            }
            if (!found)
            {
                System.out.println("Ingrese un código válido.");
            }
        } while (posicion < cantidadComponentes);


        //e
        found = false;
        String codigo;
        for (int i= 0; i < 5; i++) //for componente in componentes obligatorios
        {
            //codigo de obligatorios (i)
            codigo = obligatorios[i];
            if (compu.existeComponente(codigo))
            {
                found = true;
            }
            else {
                found = false;
                break;
            }
        }

        if (!found)
        {
            System.out.println("\nAtención, 1 o más de los componentes obligatorios no fueron agregados, \npor este motivo se cobrara un recargo del 20%.\n");
            recargo = 0.2;
        }

        double totalComponentes = compu.sumarPrecios();
        recargo = recargo*totalComponentes;
        double montoFinal = totalComponentes + recargo;

        compu.mostrarTicket(montoFinal, recargo, totalComponentes);














    }
}
