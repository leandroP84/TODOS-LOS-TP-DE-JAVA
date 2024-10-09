import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int opcion1, contadorDo;
        String opcion3;
        double totalVentas = 0;
        contadorDo = 1;
        do {
            System.out.println("Ingrese el ejercicio que desea ver y para salir ingrese 0");
            opcion1 = sc.nextInt();
            switch (opcion1) {
                case 1:
                    //Crea un programa que pida por pantalla cuatro países y a continuación tres
                    //ciudades de cada uno de estos países. Los nombres de ciudades deben
                    //almacenarse en un array multidimensional cuyo primer índice sea el número
                    //asignado a cada país y el segundo índice el número asignado a cada ciudad. Es decir
                    //el array deberá tener un tamaño de 4x4
                    opcion3 = sc.nextLine();
                    String[][] PaisesCiudades = new String[4][4];
                    int i;
                    int e;
                    for (i = 0; i < 4; i++) {
                        System.out.println("Ingrese el nombre del pais #" + (i + 1));
                        PaisesCiudades[i][0] = sc.nextLine();
                        for (e = 1; e < 4; e++) {
                            System.out.println("Ingrese el nombre de la ciudad #" + e);
                            PaisesCiudades[i][e] = sc.nextLine();
                        }
                    }
                    for (i = 0; i < 4; i++) {
                        System.out.println("Pais #" + (i + 1) + ": " + PaisesCiudades[i][0]);
                        for (e = 1; e < 4; e++) {
                            System.out.println("Ciudad #" + (i + 1) + ": " + PaisesCiudades[i][e]);
                        }
                    }
                    break;
                case 2:
                    //Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
                    //primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
                    //entero que deberá ser ingresado por el usuario. A continuación cree un segundo
                    //array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
                    //ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y] que será
                    //el resultante de multiplicar cada una de las posiciones de las filas del array uno por
                    //cada una de las posiciones de las columnas del array 2.
                    //Muestre por pantalla cada uno de los arrays con sus valores
                    int X, Y;
                    System.out.println("Ingrese el valor X (filas de array): ");
                    X = sc.nextInt();
                    System.out.println("Ingrese el valor Y (columnas de array): ");
                    Y = sc.nextInt();

                    int[][] array1 = new int[X][Y];
                    for (i = 0; i < X; i++) {
                        System.out.println("Ingrese el valor de la posicion #" + i + " #0");
                        array1[i][0] = sc.nextInt();
                        for (e = 1; e < Y; e++) {
                            System.out.println("Ingrese el valor de la posicion #" + i + " #" + (e));
                            array1[i][e] = sc.nextInt();
                        }
                    }
                    int[][] array2 = new int[Y][X];
                    for (i = 0; i < Y; i++) {
                        System.out.println("Ingrese el valor de la posicion #" + i + " #0");
                        array2[i][0] = sc.nextInt();
                        for (e = 1; e < X; e++) {
                            System.out.println("Ingrese el valor de la posicion #" + i + " #" + (e));
                            array2[i][e] = sc.nextInt();
                        }
                    }
                    int[][] resultado = new int[X][Y];
                    for (i = 0; i < X; i++) {
                        for (e = 0; e < Y; e++) {
                            resultado[i][e] = array1[i][e] * array2[e][i];
                        }
                    }
                    System.out.println("\nPrimer array:");
                    imprimirMatriz(array1);

                    System.out.println("\nSegundo array:");
                    imprimirMatriz(array2);

                    System.out.println("\nArray resultante de la multiplicación:");
                    imprimirMatriz(resultado);
                    break;
                case 3:
                    int num1 = 0;
                    boolean opcion;
                    Scanner scanner = new Scanner(System.in);
                    opcion = false;

                    do {
                        System.out.println("ingrese un entero mayor o igual a 3 y menor o igual a 10");
                        num1 = scanner.nextInt();
                        if (num1 >= 3 && num1 <= 10)
                            opcion = true;
                        else {
                            System.out.println("Número inválido");
                            opcion = false;
                        }

                    } while (opcion == false);

                    int[][] arregloMulti = new int[num1][num1];

                    int fila;
                    int columna;
                    for (fila = 0; fila < arregloMulti.length; fila++) {
                        for (columna = 0; columna < arregloMulti[fila].length; columna++) {
                            System.out.println("ingrese un valor para " + fila + "," + columna);
                            arregloMulti[fila][columna] = scanner.nextInt();
                        }


                    }

                    System.out.println("---------------------------------------------------");
                    for (fila = 0; fila < arregloMulti.length; fila++) {
                        for (columna = 0; columna < arregloMulti[fila].length; columna++) {
                            System.out.print(arregloMulti[fila][columna] + "\t");

                        }
                        System.out.println();


                    }

                    int[] sumaColumnas = new int[num1];

                    for (columna = 0; columna < num1; columna++) {
                        for (fila = 0; fila < num1; fila++) {
                            sumaColumnas[columna] += arregloMulti[fila][columna];
                        }


                    }
                    int sumaColumnas2 = 0;
                    for (i = 0; i < sumaColumnas.length; i++) {
                        System.out.print(sumaColumnas[i] + " ");
                        sumaColumnas2 += sumaColumnas[i];
                    }

                    System.out.println("");
                    System.out.println("TOTAL: " + sumaColumnas2);
                    break;
                case 4:
                    //Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o
                    //igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú
                    //con estas opciones:
                    //a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
                    //b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
                    //c) Suma de una columna que se pedirá al usuario (controlar que elija una
                    //correcta)
                    //d) Sumar la diagonal principal
                    //e) Sumar la diagonal inversa
                    //f) La media de todos los valores de la matriz
                    //IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se
                    //deberán de ejecutar, simplemente mostrar un mensaje que diga que debes
                    //rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de
                    //las opciones del menú.7
                    int num;
                    int opcion2;
                    int contador;
                    int suma;
                    suma = 0;
                    contador = 0;
                    System.out.println("Ingrese un numero mayor o igual a 4 y menor o igual a 10");
                    num = sc.nextInt();
                    do {
                        if (num < 4 || num > 10) {
                            System.out.println("ERROR. El numero es menor a 4 o mayor a 10");
                            System.out.println("Ingrese un numero mayor o igual a 4 y menor o igual a 10");
                            num = sc.nextInt();
                        }
                    } while (num < 4 || num > 10);
                    int[][] array4 = new int[num][num];

                    do {
                        System.out.println("""
                                    Ingrese una de las siguientes opciones:
                                    1) Rellenar TODA la matriz de números, debes pedírselo al usuario.
                                    2) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
                                    3) Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
                                    4) Sumar la diagonal principal
                                    5) Sumar la diagonal inversa
                                    6) La media de todos los valores de la matriz""");
                        opcion2 = sc.nextInt();
                        suma = 0;
                        while (contador != 1) {
                            if (opcion2 != 1) {
                                System.out.println("ERROR. Primero debe rellenar toda la matriz");
                                System.out.println("Ingrese 1");
                                opcion2 = sc.nextInt();
                            } else {
                                contador = 1;
                            }
                        }
                        switch (opcion2) {
                            case 1:
                                for (i = 0; i < num; i++) {
                                    for (e = 0; e < num; e++) {
                                        System.out.println("Ingrese el numero de la posicion #" + i + " #" + e);
                                        array4[i][e] = sc.nextInt();
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese la fila en la que desea que se sumen los numeros:");
                                int numfil;
                                numfil = sc.nextInt();
                                for (i = 0; i < num; i++) {
                                    suma += array4[numfil - 1][i];

                                }
                                System.out.println("La suma de la fila " + numfil + " es:" + suma);
                                break;
                            case 3:
                                System.out.println("Ingrese la columna en la que desea que se sumen los numeros:");
                                int numcol;
                                numcol = sc.nextInt();
                                for (i = 0; i < num; i++) {
                                    suma += array4[i][numcol - 1];
                                }
                                System.out.println("La suma de la fila " + numcol + " es:" + suma);
                                break;
                            case 4:
                                for (i = 0; i < num; i++) {
                                    suma += array4[i][i];
                                }
                                System.out.println("La suma de la diagonal es:" + suma);
                                break;
                            case 5:
                                for (i = 0; i < num; i++) {
                                    int o = num - 1;
                                    suma += array4[i][o];
                                    o -= 1;
                                }
                                System.out.println("La suma de la diagonal inversa es:" + suma);
                                break;
                            case 6:
                                for (i = 0; i < num; i++) {
                                    int o = num - 1;
                                    suma += array4[i][o];
                                    o -= 1;
                                }
                                float media = (float) ((suma * 1.0) / (((num - 1) * 1.0) * ((num - 1) * 1.0)));
                                System.out.println("La media del array es de: " + media);
                                break;
                            default:
                                contador = 0;
                                break;
                        }
                    } while (contador != 0);
                    break;
                case 5:
                    Scanner no = new Scanner(System.in);
                    String[][] nom = new String[12][3];
                    nom[0][0] = "kit kat";
                    nom[0][1] = "32";
                    nom[0][2] = "10";
                    nom[1][0] = "chicles";
                    nom[1][1] = "2";
                    nom[1][2] = "50";
                    nom[2][0] = "caramelos de menta";
                    nom[2][1] = "2";
                    nom[2][2] = "50";
                    nom[3][0] = "huevo kinder";
                    nom[3][1] = "25";
                    nom[3][2] = "10";
                    nom[4][0] = "chetoos";
                    nom[4][1] = "30";
                    nom[4][2] = "10";
                    nom[5][0] = "twix";
                    nom[5][1] = "26";
                    nom[5][2] = "10";
                    nom[6][0] = "M&M";
                    nom[6][1] = "35";
                    nom[6][2] = "10";
                    nom[7][0] = "papas lays";
                    nom[7][1] = "40";
                    nom[7][2] = "20";
                    nom[8][0] = "milkybar";
                    nom[8][1] = "30";
                    nom[8][2] = "10";
                    nom[9][0] = "alfajor tofi";
                    nom[9][1] = "20";
                    nom[9][2] = "15";
                    nom[10][0] = "lata cola";
                    nom[10][1] = "50";
                    nom[10][2] = "20";
                    nom[11][0] = "chitos";
                    nom[11][1] = "45";
                    nom[11][2] = "10";
                    String jua = "";
                    while (!jua.equals("salir")) {
                        System.out.println("ingrese la opcion sabiendo que :");
                        System.out.println("a- pedir golosina");
                        System.out.println("b- mostrar golosina");
                        System.out.println("c- rellenar golosina");
                        System.out.println("d- apagar maquina");
                        String opi = no.nextLine();
                        switch (opi) {
                            case "a":
                                System.out.println("""
                                        KitKat posicion [0]
                                        Chicles posicion [1]
                                        Caramelos de Menta posicion [2]
                                        Huevo Kinder posicion [3]
                                        Chetoos posicion [4]
                                        Twix posicion [5]
                                        M&M'S posicion [6]
                                        Papas Lays posicion [7]
                                        Milkybar posicion [8]
                                        Alfajor Tofi posicion [9]
                                        Lata Coca posicion [10]
                                        Chitos posicion [11]\s""");
                                System.out.println("ingrese la pocicion de la golosina que quiere ");
                                int g = no.nextInt();
                                int o = 0;
                                int m = g + 2;
                                int t = o + 1;
                                int a = Integer.parseInt(nom[g][2]);
                                int su = Integer.parseInt(nom[g][t]);
                                int b = a - 1;
                                int suma1 = 0;
                                suma1 += su;
                                for (i = 0; i < nom.length; i++) {
                                    for (int j = 0; j < nom.length; j++) {
                                        nom[g][2] = String.valueOf(b);
                                    }
                                }
                                if (b < 0) {
                                    System.out.println("no hay stock, ingrese otra golosina ");
                                } else {
                                    System.out.println("la golocina es " + nom[g][o] + " el precio es de " + nom[g][t] + " la cantidad disponible es de " + b);
                                    String precio = nom[g][t];
                                    totalVentas += Integer.parseInt(precio);
                                }
                                break;
                            case "b":
                                for (int j = 0; j < nom.length; j++) {
                                    System.out.println("[" + nom[j][0] + "]" + "[" + nom[j][2] + "]" + "[" + nom[j][1] + "]");
                                }
                                break;
                            case "c":
                                System.out.println("ingrese la contraseña para entrar ");
                                String contrs = no.nextLine();
                                String guarda = "adminxyz";
                                if (contrs.equals(guarda)) {
                                    System.out.println("ingrese la pocicion de la golosina que quiere ingresar ");
                                    int k = no.nextInt();
                                    int l = no.nextInt();
                                    int p = k + 2;
                                    System.out.println("ingrese la cantidad a recargar ");
                                    int c = no.nextInt();
                                    int fa = Integer.parseInt(nom[k][p]);
                                    int gi = fa + c;
                                    for (i = 0; i < nom.length; i++) {
                                        for (int j = 0; j < nom.length; j++) {
                                            nom[k][2] = String.valueOf(gi);
                                        }
                                    }
                                    System.out.println("la golocina es :" + nom[k][l] + " la cantidad actualizada es de :" + nom[k][2]);
                                }
                                break;
                            case "d":
                                String suma11 = "";
                                System.out.println("la suma de los productos vendidos es de " + totalVentas);
                                System.out.println("Usted esa saliendo de la maquina");
                                jua = "salir";
                                break;
                        }
                        if (!jua.equals("salir")) {
                            System.out.println("¿Desea hacer otra operación? Escriba 'salir' para terminar o presione Enter para continuar.");
                            jua = no.nextLine();
                        }

                    }
                default:
                    contadorDo = 0;
            }
        }while (contadorDo != 0) ;

    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}