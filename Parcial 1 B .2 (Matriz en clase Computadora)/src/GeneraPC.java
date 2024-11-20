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
            {"KKK","Gabinete", "6500" , "N"},
            {"LLL","Fuente Alimentación", "6500" , "S"},
            {"MMM","Placa de Sonido", "16500" , "N"}
    };
    public static String[] componentesObligatorios = {
            "AAA","BBB","CCC","EEE","LLL"
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
        compu.inicializarComponentes(cantidadComponentes);

        //2d
        System.out.println("\n---Componentes de la computadora:---");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(componentesPc[i][j] + ", ");
            }
            System.out.println("");
        }

        System.out.println("\nIngrese el código de los componentes:");


        boolean found = false;
        int posicion = 0;
        numAux = cantidadComponentes;
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
                    numAux--;
                }
            }
            if (!found)
            {
                System.out.println("Ingrese un código válido.");
            }
        } while (numAux != 0);

        compu.getComponentes();

        //e
        found = false;
        for (int i = 0; i < 5; i++) // for componente in componentesobligatorios
        {
            String codigo = componentesObligatorios[i];
            if (compu.existeComponente(codigo)) {
                found = true;}
            else {
                found = false;}

        }

        if (!found)
        {
            System.out.println("\nAtención, 1 o más de los componentes obligatorios no fueron agregados, \npor este motivo se cobrara un recargo del 20%.\n");
            recargo = 0.2;
        }

        double totalComponentes = compu.sumarPrecios();
        recargo = recargo * totalComponentes;
        double total = totalComponentes + recargo;

        compu.mostrarTicket(total, recargo, totalComponentes);
    }
}
