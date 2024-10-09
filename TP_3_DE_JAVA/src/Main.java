import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        String cadena;
        int[] numeros = new int[20];
        int entero1 = 0;
        int entero2 = 0;
        int suma = 0;
        int i;
        do {
            System.out.println(" ");
            System.out.println("ingrese un ejercicio, ingrese 0 para salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    int[] enteros = new int[10];
                    //se crea el array con el tamaño 10

                    System.out.println("ingrese 10 valores");
                    //se le pide al usuario que ingrese 10 valores para asignar al array
                    for (i = 0; i < enteros.length; i++)
                        //se utiliza un bucle for para llenar cada uno de los espacios del array
                        enteros[i] = sc.nextInt();
                    //se imprime el array
                    System.out.println(" ");
                    System.out.println("array original:");
                    for (i = 0; i < enteros.length; i++)
                        System.out.print(enteros[i] + " ");

                    //se crea un nuevo array, y se clona el array original para obtener los valores a ordenar
                    int arrayAscendente[] = enteros.clone();
                    //mediante la funcion sort, se ordenan los valores en orden ascendente
                    Arrays.sort(arrayAscendente);
                    //imprimimos en orden ascendente
                    System.out.println(" ");
                    System.out.println("array en orden ascendente:");
                    for (i = 0; i < arrayAscendente.length; i++)
                        System.out.print(arrayAscendente[i] + " ");

                    int arrayDescendente[] = new int[arrayAscendente.length];

                    //ahora para obtener los valores en orden descendiente, invertiremos el array arrayAscendente y lo asignaremos a arrayDescendente
                    for (i = 0; i < arrayAscendente.length; i++)
                        arrayDescendente[i] = arrayAscendente[arrayDescendente.length - 1 - i];

                    //se imprime el array descendente
                    System.out.println(" ");
                    System.out.println("array en orden descendente:");
                    for (i = 0; i < arrayDescendente.length; i++)
                        System.out.print(arrayDescendente[i] + " ");
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println("ingrese su DNI sin puntos");
                    int numDNI = sc.nextInt();
                    obtenerLetra(numDNI);
                    break;

                case 3:
                    int arrayEjer12[] = new int[10];
                    int numABuscar;
                    int cuentaNum = 0;

                    System.out.println("ingrese 10 valores para el array:");
                    for (i = 0; i < arrayEjer12.length; i++) {
                        arrayEjer12[i] = sc.nextInt();
                    }

                    // se pide al usuario el numero a buscar en el array
                    System.out.println("ingrese el numero a buscar:");
                    numABuscar = sc.nextInt();

                    for (i = 0; i < arrayEjer12.length; i++) {
                        if (arrayEjer12[i] != numABuscar) {
                            cuentaNum++;
                        }
                    }

                    int arraySinNum[] = new int[cuentaNum];
                    int index = 0;

                    for (i = 0; i < arrayEjer12.length; i++) {
                        if (arrayEjer12[i] != numABuscar) {
                            arraySinNum[index++] = arrayEjer12[i];
                        }
                    }

                    // se imprime el array nuevo
                    System.out.println("array sin el numero ingresado");
                    for (int num : arraySinNum) {
                        System.out.print(num + " ");
                    }
                    break;
                case 7:
                    Random random = new Random();
                    System.out.println("Números generados:");
                    for (i = 0; i < numeros.length; i++) {
                        numeros[i] = random.nextInt(10);
                        System.out.print(numeros[i] + " ");
                    }
                    for (i = 0; i < numeros.length; i++) {
                        if (numeros[i] % 2 == 0) {
                            entero1 += numeros[i];
                        } else {
                            entero2 += numeros[i];
                        }
                    }
                    System.out.println("\n\nSuma de números pares: " + entero1);
                    System.out.println("Suma de números impares: " + entero2);
                    break;
                case 9:
                    System.out.println("Ingrese una cadena de numeros separados por guiones medios");
                    cadena = sc.nextLine();
                    String[] cadenaNum = cadena.split("-");
                    for (i = 0; i < cadenaNum.length; i++){
                        suma += Integer.parseInt(cadenaNum[i]);
                    }
                    int promedio = suma/i;
                    System.out.println(promedio);
                    break;
                case 11:
                    int[] array1 = new int [5];
                    int[] array2 = new int [10];
                    int[] array3 = new int [5];
                    for (i = 0; i < array1.length; i++){
                        System.out.println("Ingrese el numero entero del primer arreglo " + i);
                        array1[i] = sc.nextInt();
                    }
                    for (i = 0; i < array2.length; i++){
                        System.out.println("Ingrese el numero entero del segundo arreglo " + i);
                        array2[i] = sc.nextInt();
                    }
                    for (i = 0; i < array1.length; i++){
                        suma = 0;
                        for ( int e = 0; e < array2.length; e++){
                            suma += array1[i] * array2[e];
                        }
                        array3[i] = suma;
                    }
                    for (i = 0; i < array3.length; i++){
                        System.out.println(array3[i]);
                    }
                    break;
            }

        } while (opcion != 0);
    }

    public static void obtenerLetra(int numeroDNI) {
        int resto;
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        resto = (numeroDNI % 23);
        System.out.println(" ");
        System.out.println("su DNI con letra es: " + numeroDNI + letrasDNI[resto]);
    }
}