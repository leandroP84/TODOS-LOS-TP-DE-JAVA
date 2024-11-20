import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int tamanioMatriz = 0;
        int intAux = 0;
        boolean impar = false;
        boolean numValido = false;
        String correr = "S";

        do {
            //1
            System.out.println("Ingrese el tamaño de la matriz: ");
            do {
                intAux = sc.nextInt();

                if ((intAux % 2) != 0) {impar = true;}
                if (intAux >=3 && intAux <= 11) {numValido = true;}

                if (impar && numValido)
                {
                    tamanioMatriz = intAux;
                    intAux = 0;
                    break;
                }
                else
                {
                    System.out.println("Ingrese un número impar entre 3 y 11.");
                }
            } while (true);

            //2
            int [][] matriz = new int[tamanioMatriz][tamanioMatriz];
            System.out.println("Ingrese valores para la matriz:");

            for (int j = 0; j < tamanioMatriz; j++) // por cada columna de la primera fila
            {
                do {
                    intAux = sc.nextInt();
                    if (intAux >= 50 && intAux <= 200) {
                        matriz[0][j] = intAux;
                        break;
                    } else {
                        System.out.println("Ingrese un numero entre 50 y 200.");
                    }
                } while (true);
            }

            for (int i = 1; i < tamanioMatriz; i++) {
                for (int j = 0; j < tamanioMatriz; j++) {
                    matriz[i][j] = (int) (Math.random() * 251 + 50);
                }
            }

            //3
            for (int i = 0; i < tamanioMatriz; i++) {
                for (int j = 0; j < tamanioMatriz; j++) {
                    System.out.print(matriz[i][j] + ", ");
                }
                System.out.println();
            }

            //5
            int [] diagonales = new int[tamanioMatriz*2];
            diagonales = calcularDiagonales(matriz);
            System.out.println("\nDiagonales: ");
            for (int i = 0; i < diagonales.length; i++)
            {
                System.out.print(diagonales[i] + ", ");
            }
            System.out.println();

            //6
            boolean intercambio = false;
            do
            {
                intercambio = false;
                for (int i = 1; i < 5; i++) {
                    //si el par no está ordenado
                    if (diagonales[i - 1] > diagonales[i])
                    { //lo intercambiamos y recordamos que algo ha cambiado
                        int aux = diagonales[i - 1];
                        diagonales[i - 1] = diagonales[i];
                        diagonales[i] = aux;
                        intercambio = true;
                    }
                }
            } while (intercambio == true);

            //7
            System.out.println("\nDiagonales ordenadas: ");
            for (int i = 0; i < diagonales.length; i++)
            {
                System.out.print(diagonales[i] + ", ");
            }
            System.out.println();

            //9
            System.out.println("Diferencia: " + compararMatrices(matriz, diagonales));

            System.out.println("\nDesea correr el programa nuevamente? S/N");
            sc.nextLine();
            correr = sc.nextLine().toUpperCase();

        } while (correr.equals("S"));



    }

    //4
    private static int [] calcularDiagonales(int matriz [][])
    {
        int length = matriz.length;
        int [] diagonales = new int[length * 2];
        int fila = 0;
        int columna = length - 1;

        for (int i = 0; i < (length); i++)
        {
            diagonales[i] = matriz[i][i];
        }
        for (int i = length; i < length*2; i++)
        {
            diagonales[i] = matriz [fila][columna];
            fila++;
            columna--;
        }

        return diagonales;
    }

    //8
    private static int compararMatrices(int matriz[][], int diagonales[])
    {
        int sumaMatriz = 0;
        int sumaDiagonales = 0;
        int diferencia= 0;

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                sumaMatriz = sumaMatriz + matriz[i][j];
            }
        }
        System.out.println("\nSuma de la matriz: " + sumaMatriz);

        for (int i = 0; i < diagonales.length; i++)
        {
            sumaDiagonales = sumaDiagonales + diagonales[i];
        }
        System.out.println("Suma de las diagonales: " + sumaDiagonales);
        diferencia = sumaMatriz - sumaDiagonales;

        return diferencia;
    }
}