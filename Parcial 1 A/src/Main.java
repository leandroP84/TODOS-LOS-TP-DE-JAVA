import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int tamanioMatriz = 0;
        int intAux = 0;
        String sn = "S";

        do {
            //1
            System.out.println("Ingrese el tamaño de la matriz: ");
            do {
                tamanioMatriz = sc.nextInt();
                if (tamanioMatriz >= 3 && tamanioMatriz <= 15)
                {
                    if (tamanioMatriz % 2 == 0)
                    {
                        System.out.println("Por favor ingrese un numero impar. ");
                    }
                    else {break;}
                }
                else
                {
                    System.out.println("Por favor ingrese un numero entre 3 y 15. ");
                }

            } while (true);

            //2
            int [][] matriz = new int[tamanioMatriz][tamanioMatriz];
            for (int i = 0; i < tamanioMatriz-1; i++)
            {
                for (int j = 0; j < (tamanioMatriz); j++)
                {
                    matriz[i][j] = (int) (Math.random()*88+10);
                }
            }
            System.out.println("Ingrese los valores de la ultima fila de la matriz: ");
            for (int j = 0; j < tamanioMatriz; j++)
            {
                do {
                    intAux = sc.nextInt();
                    if (intAux >= 10 && intAux <= 99) {
                        matriz[tamanioMatriz - 1][j] = intAux;
                        System.out.println("OK; ");
                        break;
                    } else {
                        System.out.println("Por favor ingrese un numero del 10 al 99. ");
                    }

                } while (true);
            }

            //3
            System.out.println("\nMatriz final: ");
            for (int i = 0; i < tamanioMatriz; i++)
            {
                for (int j = 0; j < tamanioMatriz; j++)
                {
                    System.out.print(matriz[i][j] + ", ");
                }
                System.out.println("");
            }

            //4
            intAux = tamanioMatriz /2;
            int[] valoresCentrales = new int[9];


            //5
            obtenerValoresCentrales(tamanioMatriz, valoresCentrales, matriz);
            System.out.println("\nValores centrales de la Matriz:");
            for (int i = 0; i < 9; i++)
            {
                System.out.print(valoresCentrales[i] + ", ");
                if (i==2 || i == 5)
                {
                    System.out.println("");
                }
            }

            //6
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
            } while (intercambio == true);

            //7
            System.out.println("\n \nValores centrales ordenados:");
            for (int i = 0; i < 9; i++)
            {
                System.out.print(valoresCentrales[i] + ", ");
            }

            //8
            double promedio = calcularPromedioMatrices(tamanioMatriz, matriz, valoresCentrales);

            //9
            System.out.println("Promedio de los promedios: " + promedio);
            System.out.println("\n \nDesea volver a ejecutar el programa? S/N: ");
            sc.nextLine();
            sn = sc.nextLine().toUpperCase();


        } while (sn.equals("S"));

        System.out.println("Programa finalizado.");
    }





    //4
    private static void obtenerValoresCentrales(int tamanioMatriz, int valoresCentrales[], int matriz[][]) {
        int centroMatriz = (tamanioMatriz-1)/2;
        int c = 0;

        for (int i = centroMatriz-1; i < centroMatriz+2; i++) {
            for (int j = centroMatriz-1; j < centroMatriz+2; j++) {
                valoresCentrales[c] = matriz[i][j];
                c++;
            }
        }
    }

    //8
    public static double calcularPromedioMatrices(int tamanioMatriz, int matriz[][], int valoresCentrales[])
    {
        double promedio = 0.0;
        double promedio1;
        double promedio2;
        int lenght1;
        int suma = 0;
        for (int i = 0; i < tamanioMatriz; i++)
        {
            for (int j = 0; j < tamanioMatriz; j++)
            {
                suma = suma + matriz[i][j];
            }
        }
        System.out.println("\n \nSuma total de la matriz original: " + suma);
        lenght1 = tamanioMatriz*tamanioMatriz;
        System.out.println("Cantidad de elementos: " + lenght1);
        promedio1 = (double) suma / lenght1;
        System.out.println("Promedio: "+ promedio1);
        suma = 0;
        for (int i = 0; i < 9; i++)
        {
            suma = suma + valoresCentrales[i];
        }
        System.out.println("\nSuma total de la matriz central : " + suma);
        System.out.println("Cantidad de elementos: " + valoresCentrales.length);
        promedio2 = (double) suma / valoresCentrales.length;
        System.out.println("Promedio:" + promedio2);
        promedio = (promedio1 + promedio2) /2;
        return promedio;
    }


}