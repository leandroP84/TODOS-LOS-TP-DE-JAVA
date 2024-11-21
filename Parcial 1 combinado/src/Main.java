
//parciales combinados + guardar el numero central primero, y los colindantes después.


import java.util.Scanner;


public class Main {
    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int intAux = 0;
        int tamanioMatriz = 0;

        //3
        System.out.println("Ingrese el tamaño de la matriz: ");
        do {
            intAux = sc.nextInt();
            if (intAux >= 3 && intAux <= 11)
            {
                if (intAux % 2 != 0)
                {
                    tamanioMatriz = intAux;
                    break;
                }
                else {
                    System.out.println("Debe ser impar. ");
                }
            }
            else {
                System.out.println("Debe ser un numero entre 3 y 11. ");
            }
        } while (true);

        //4
        int[][] matriz = new int[tamanioMatriz][tamanioMatriz];

        for (int j = 0; j < tamanioMatriz; j++)  //for columna in fila 1
        {
            System.out.println("Ingrese el valor del elemento: ");
            do {
                intAux = sc.nextInt();
                if (intAux >= 50 && intAux <= 200)
                {
                    matriz[0][j] = intAux;
                    break;
                }
                else {
                    System.out.println("Debe ser un numero entre 50 y 200. ");
                }

            } while (true);
        }

        for (int i = 1; i < tamanioMatriz; i++)
        {
            for (int j = 0; j < tamanioMatriz; j++)
            {
                matriz[i][j] = (int) (Math.random()*251+50);
            }
        }

        //5
        System.out.println("Matriz resultante: ");
        for (int i = 0; i < tamanioMatriz; i++)
        {
            for (int j = 0; j < tamanioMatriz; j++ )
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }

        //6 //7
        int [] valoresCentrales = new int[9];
        valoresCentrales = obtenerValoresCentrales(matriz);

        System.out.println("\nValores Centrales: ");
        System.out.println("Valor central: " + valoresCentrales[0]);
        System.out.print("Valores colindantes: ");
        for (int i = 1; i < 9; i++)
        {
            System.out.print(valoresCentrales[i] + ", ");
        }

        //8
        boolean intercambio = false;
        do
        {
            intercambio = false;
            for (int i = 1; i < 9; i++) {
                //si el par no está ordenado
                if (valoresCentrales[i - 1] > valoresCentrales[i])
                { //lo intercambiamos y recordamos que algo ha cambiado
                    int aux = valoresCentrales[i - 1];
                    valoresCentrales[i - 1] = valoresCentrales[i];
                    valoresCentrales[i] = aux;
                    intercambio = true;
                }
            }
        } while (intercambio);

        //9
        System.out.print("Valores centrales ordenados: ");
        for (int i = 1; i < 9; i++)
        {
            System.out.print(valoresCentrales[i] + ", ");
        }

    }

    //6
    public static int[] obtenerValoresCentrales(int matriz [][])
    {
        int [] valoresCentrales = new int[9];
        int lenght = matriz.length;
        int center = (lenght-1)/2;
        int k = 1;

        valoresCentrales[0] = matriz[center][center];

        for (int i = (center - 1); i < (center + 2); i++) {
            for (int j = (center - 1); j < (center + 2); j++) {
                if (i == center && j == center) {

                }
                else {
                    valoresCentrales[k] = matriz[i][j];
                    k++;
                }


            }
        }




        return valoresCentrales;
    }
}