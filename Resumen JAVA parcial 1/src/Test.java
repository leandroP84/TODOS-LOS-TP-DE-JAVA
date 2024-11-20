import  java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int nFilasColumnas = 0;
        int[][] Matriz = new int[nFilasColumnas][nFilasColumnas];
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Inglese el valor de la matriz inpar con numeros entre el 3 y el 15: ");
            nFilasColumnas = sc.nextInt();

            if (nFilasColumnas < 3 || nFilasColumnas > 15)
                System.out.println("mal");

        } while (!(nFilasColumnas < 3 || nFilasColumnas > 15) || !(nFilasColumnas % 2 != 0));



    }
}
