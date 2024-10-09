import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static int IVA = 21;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String nombre;
        int numeroEjercicio;
        double valor1, valor2;
        int contador;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el ejercicio que desea ejecutar:");
        numeroEjercicio = input.nextInt();
        do {
            switch (numeroEjercicio) {
                case 1:
                    //ejercicio1
                    //Ejercicio 1
                    //Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por
                    //consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”
                    nombre = "Leandro";
                    System.out.println("Bienvenido " + nombre);
                    break;
                case 2:
                    //ejercicio2
                    //Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (aplica
                    //Scanner y JOptionPane)
                    input = new Scanner(System.in);
                    System.out.print("Escriba el nombre de usuario: ");
                    nombre = input.nextLine();
                    System.out.println("Bienvenido " + nombre);
                    break;
                case 3:
                    //ejercicio3
                    //Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
                    //multiplicación, división y módulo (resto de la división).
                    Scanner calculadora = new Scanner(System.in);
                    System.out.println("Ingrese el primer numero");
                    valor1 = calculadora.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    valor2 = calculadora.nextDouble();
                    System.out.println("La suma de:" + valor1 + " + " + valor2 + " es " + (valor1 + valor2));
                    System.out.println("La resta de:" + valor1 + " - " + valor2 + " es " + (valor1 - valor2));
                    System.out.println("La multiplicacion de:" + valor1 + " * " + valor2 + " es " + (valor1 * valor2));
                    System.out.println("La division de:" + valor1 + " / " + valor2 + " es " + (valor1 / valor2));
                    System.out.println("El resto de:" + valor1 + " / " + valor2 + " es " + (valor1 % valor2));
                    break;
                case 4:
                    //ejercicio 4
                    //Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
                    //son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona
                    System.out.println("Ingrese el primer numero");
                    valor1 = input.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    valor2 = input.nextInt();
                    if (valor1 > valor2)
                        System.out.println(valor1 + " es mayor que " + valor2);
                    else if (valor1 < valor2)
                        System.out.println(valor2 + " es mayor que " + valor1);
                    else
                        System.out.println(valor1 + " y " + valor2 + "son iguales");
                    break;
                case 5:
                    //ejercicio 5
                    //Lee un numero por teclado e indica si es divisible entre 2 (resto=0) si no lo es, tambien debemos indicarlo
                    System.out.println("Ingrese un numero:");
                    valor1 = input.nextInt();
                    if (valor1 % 2 == 0) {
                        System.out.println("Su numero es divisible entre 2");
                    } else {
                        System.out.println("Su numero no es divisible entre 2");
                    }
                    break;
                case 6:
                    //ejercicio 6
                    //Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
                    //el precio final con IVA. El IVA sera una constante que sera del 21%.
                    System.out.println("Ingrese el precio del producto:");
                    valor1 = input.nextInt();
                    valor2 = valor1 + (valor1 / 100 * IVA);
                    System.out.println("El precio final con IVA es de: " + valor2); //El valor1 es el precio el producto y el valor2 es el precio con IVA
                    break;
                case 7:
                    //ejercicio 7
                    //Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while
                    valor1 = 1;
                    while (valor1 <= 100) {
                        System.out.println(valor1);
                        valor1 = valor1 + 1;
                    }
                    break;
                case 8:
                    //ejercicio8
                    //Haz el mismo ejercicio anterior con un bucle for
                    for (int valor = 1; valor <= 100; valor++) {
                        System.out.println(valor);
                    }
                    break;
                case 9:
                    //ejercicio9
                    //Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que
                    //desees.
                    for (int valor = 1; valor <= 100; valor++) {
                        if (valor % 2 == 0 && valor % 3 == 0)
                            System.out.println(valor + " es divisible por 2 y 3");
                        else if (valor % 2 == 0)
                            System.out.println(valor + " es divisible por 2");
                        else if (valor % 3 == 0)
                            System.out.println(valor + " es divisible por 3");
                        else
                            System.out.println(valor);
                    }
                    break;
                case 10:
                    //ejercicio10
                    // Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es
                    //lo volverá a pedir (do while), después muestra ese número por consola.
                    System.out.println("Ingrese un numero ");
                    valor1 = input.nextInt();
                    do {
                        if (valor1 < 0) {
                            System.out.println("Ingrese un numero mayor o igual a 0");
                            valor1 = input.nextInt();
                        }
                    } while (valor1 < 0);
                    break;
                case 11:
                    //ejercicio11
                    //Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te
                    //pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la
                    //contraseña y mostrara un mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de
                    //salida (3 intentos y si acierta sale, aunque le queden intentos).
                    String contrasena;
                    contador = 3;
                    contrasena = "hola";
                    do {
                        System.out.println("Ingrese su contraseña");
                        System.out.println("Tiene " + contador + " intentos");
                        String ingresoDeContrasena = input.next();
                        if (contrasena.equals(ingresoDeContrasena)) {
                            System.out.println("Acceso correcto");
                            contador = 0;
                        } else {
                            contador = contador - 1;
                            if (contador == 0) {
                                System.out.println("Acceso denegado");
                            } else
                                System.out.println("contraseña incorrecta");
                        }

                    } while (contador != 0);
                    break;
                case 12:
                    //ejercicio12
                    //Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no
                    //(siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número
                    //ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente.
                    do {
                        System.out.println("Ingrese un dia de la semana en orden numerico siendo el 1 lunes y 7 domingo");
                        valor1 = input.nextInt();
                        switch ((int) valor1) {
                            case 1:
                                System.out.println("El lunes es un dia laboral");
                                break;
                            case 2:
                                System.out.println("El martes es un dia laboral");
                                break;
                            case 3:
                                System.out.println("El miercoles un dia laboral");
                                break;
                            case 4:
                                System.out.println("El jueves es un dia laboral");
                                break;
                            case 5:
                                System.out.println("El viernes es un dia laboral");
                                break;
                            case 6:
                                System.out.println("El sabado no es un dia laboral");
                                break;
                            case 7:
                                System.out.println("El domingo no es un dia laboral");
                                break;
                            default:
                                valor1 = 0;
                                break;
                        }
                    } while (valor1 == 0);
                    break;
                case 13:
                    //ejercicio 13
                    //Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
                    //solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible
                    //entre 5, sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e
                    //ir comprobando que si es divisible desde ese número hasta 1.
                    //NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
                    System.out.println("Ingrese un numero para saber si es primo");
                    valor1 = input.nextInt();
                    valor2 = 2;
                    contador = 0;
                    while (valor2 != (valor1 + 1)) {
                        if (valor1 % valor2 == 0) {
                            contador++;
                            if(contador > 2)
                                break;
                        }
                        valor2++;
                    }
                    if (contador == 2) {
                        System.out.println(valor1 + " es primo");
                    } else {
                        System.out.println(valor1 + " no es primo");
                    }
                    break;
                case 14:
                    //ejercicio 14
                    //) Codifique un programa de consola en Java que permita realizar las siguientes acciones:
                    //Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:
                    //int x = new Double(Math.random() * 100).intValue();
                    //Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio
                    //ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número
                    //aleatorio buscado. Una vez encontrado el número muestre la cantidad de intentos necesarios
                    //para lograrlo.
                    contador = 0;
                    int numAleatorio = new Double(Math.random() * 100).intValue();
                    do {
                        System.out.println("Ingrese un numero entre 0 y 100");
                        valor1 = input.nextInt();
                        contador++;
                        if (valor1 == numAleatorio) {
                            System.out.println("Correcto, numero encontrado, cantidad de intentos: " + contador);
                        } else {
                            if (valor1 > numAleatorio) {
                                System.out.println("Es muy alto");
                            } else {
                                System.out.println("Es muy bajo");
                            }
                        }
                    } while (valor1 != numAleatorio);
                    break;
                default:
                    numeroEjercicio = 0;
                    break;
            }
            System.out.println("Ingrese otro ejercicio que desea ejecutar o escriba 0 para finalizar");
            numeroEjercicio = input.nextInt();
        } while (numeroEjercicio != 0);
    }
}