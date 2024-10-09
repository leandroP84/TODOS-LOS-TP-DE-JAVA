import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner (System.in);
        int opcion;
        int numero;
        int num3;
        double precio;
        String string1;
        String string2;
        String string3;
        char char1;

        do {
            System.out.println("ingrese un ejercicio para ejecutar");
            System.out.println("para salir del programa, ingrese 0");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:{
                    precio = 2.0;
                    System.out.println(precio);
                    System.out.println(precio);
                    int entero = (int) precio;
                    System.out.println(entero);
                    short decimalmenor = (short) precio;
                    System.out.println(decimalmenor);
                    long longg = (long) precio;
                    System.out.println(longg);
                    float flotante = (float) precio;
                    System.out.println(flotante);
                    String cadena =String.valueOf(precio);
                    System.out.println(cadena);
                    System.out.println(cadena.getClass());
                    break;
                }
                case 2:{//Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
                    //¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.
                    System.out.println("""
                            Cuando asignas un valor que excede el límite de un tipo de dato, el valor se envuelve al mínimo del rango permitido
                            Ejemplo:
                            numero =2147483647;
                            numero ++;
                            """);
                    numero =2147483647;
                    numero ++;
                    System.out.println(numero);
                    System.out.println("La mejor manera de resolverlo es verificar el rango maximo del dato antes de asignar un valor o asignar el valor a un tipo de dato con mayor rango");
                    break;
                }
                case 3:
                {
                    //Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -999)
                    // y por medio del uso de las operaciones matemáticas módulo 10 y división
                    //por 10 efectué la suma de los 3 dígitos del número.

                    System.out.print("ingrese un numero:");
                    numero = sc.nextInt();
                    num1 = (numero / 10 / 10);
                    num2 = (numero / 10 % 10);
                    num3 = (numero % 10);
                    numero = num1 + num2 + num3;
                    System.out.println("la suma de " + num1 + " + " + num2 + " + " + num3 + " es " + numero);
                    break;

                }
                case 4:
                {

                    System.out.print("ingrese una cantidad de dinero: ");
                    precio = sc.nextDouble();
                    System.out.println("Usted tiene un total de: ");

                    if (precio >= 200)
                    {
                        num1 = (int) precio / 200;
                        precio = precio - (num1 * 200);
                        if (num1 == 1) {System.out.print( " " + num1 + " billete de 200;");}
                        else {System.out.print( " " + num1 + " billetes de 200;");}

                    }
                    if (precio >= 100)
                    {
                        num1 = (int) precio / 100;
                        precio = precio - (num1 * 100);
                        if (num1 == 1) {System.out.print( " " + num1 + " billete de 100;");}
                        else {System.out.print( " " + num1 + " billetes de 100;");}

                    }
                    if (precio >= 50)
                    {
                        num1 = (int) precio / 50;
                        precio = precio - (num1 * 50);
                        if (num1 == 1) {System.out.print( " " + num1 + " billete de 50;");}
                        else {System.out.print( " " + num1 + " billetes de 50;");}

                    }
                    if (precio >= 20)
                    {
                        num1 = (int) precio / 20;
                        precio = precio - (num1 * 20);
                        if (num1 == 1) {System.out.print( " " + num1 + " billete de 20;");}
                        else {System.out.print( " " + num1 + " billetes de 20;");}

                    }
                    if (precio >= 10)
                    {
                        num1 = (int) precio / 10;
                        precio = precio - (num1 * 10);
                        if (num1 == 1) {System.out.print( " " + num1 + " billete de 10;");}
                        else {System.out.print( " " + num1 + " billetes de 10;");}

                    }
                    if (precio >= 5)
                    {
                        num1 = (int) precio / 5;
                        precio = precio - (num1 * 5);
                        if (num1 == 1) {System.out.print( " " + num1 + " billete de 5;");}
                        else {System.out.print( " " + num1 + " billetes de 5;");}

                    }
                    if (precio >= 2)
                    {
                        num1 = (int) precio / 2;
                        precio = precio - (num1 * 2);
                        if (num1 == 1) {System.out.print( " " + num1 + " billete de 2;");}
                        else {System.out.print( " " + num1 + " billetes de 2;");}

                    }
                    if (precio >= 1)
                    {
                        num1 = (int) precio;
                        precio = precio - (num1);
                        if (num1 == 1) {System.out.print( " " + num1 + " billete de 1;");}
                        else {System.out.print( " " + num1 + " billetes de 1;");}

                    }
                    if (precio < 1)
                    {
                        string1 = String.valueOf(precio);
                        string3 = "00";
                        string1= string1 + string3;
                        string2 = string1.substring(2,4);
                        num2 = Integer.parseInt(string2);
                        if (num2 >= 50)
                        {
                            num1 = num2 / 50;
                            num2 = num2 - (num1 * 50);
                            System.out.print( " " + num1 + " moneda de 50;");

                        }
                        if (num2 >= 25)
                        {
                            num1 = num2 / 25;
                            num2 = num2 - (num1 * 25);
                            System.out.print( " " + num1 + " moneda de 25;");

                        }
                        if (num2 >= 10)
                        {
                            num1 = num2 / 10;
                            num2 = num2 - (num1 * 10);
                            if (num1 == 1) {System.out.print( " " + num1 + " moneda de 10;");}
                            else {System.out.print( " " + num1 + " monedas de 10;");}

                        }
                        if (num2 >= 5)
                        {
                            num1 = num2 / 5;
                            if (num1 == 1) {System.out.print( " " + num1 + " moneda de 5;");}
                            else {System.out.print( " " + num1 + " monedas de 5;");}

                        }

                    }
                    break;


                }
                case 5:
                {
                    System.out.print("Ingrese un numero: ");
                    numero = sc.nextInt();
                    string1 = String.valueOf(numero);
                    System.out.println("El entero convertido en cadena es "+ string1);
                    break;
                }
                case 6:
                {
                    string1= "La lluvia en Mendoza es escasa";
                    numero= string1.length();
                    System.out.println("'La lluvia en Mendoza es escasa' tiene " + numero + " caracteres.");
                    break;
                }
                case 7 , 8:
                {
                    int contador = 0;

                    System.out.print("Ingrese una frase: ");
                    System.out.println(" ");
                    string1 = sc.nextLine();
                    numero= string1.length();
                    System.out.println( "'" + string1 + "' tiene " + numero + " caracteres.");

                    for (int i = 0; i < numero; i++)
                    {
                        char1 = string1.charAt(i);
                        if (char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u')
                        {
                            contador ++;
                        }
                    }
                    System.out.println("La frase '" + string1 + "' tiene " + contador + " vocales.");
                    string2 = string1.replace('a' , 'e');
                    System.out.println("La frase '" + string1 + "' con sus a reemplazadas por e: '" + string2 + "'");
                    break;
                }
                case 9:
                {
                    string1= "La lluvia en Mendoza es escasa";
                    num1= string1.length();
                    byte[] result = string1.getBytes();
                    for (int i = 0; i < num1; i++)
                    {
                        System.out.println(result [i] + " ");
                    }
                }
                break;
                case 10:{
                    //ejercicio10
                    // Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
                    //usuario lo pida y mostraremos el resultado por pantalla.
                    System.out.println("Ingrese una frase");
                    string1 = sc.nextLine();
                    System.out.println("Si desea convertir la frase a mayusculas escriba: MAYUS. y en caso de querer convertir a minuscula escriba: minus");
                    do {
                        string2 = sc.nextLine();
                        if (string2.equals("MAYUS")) {
                            System.out.println(string1.toUpperCase());
                        } else {
                            if (string2.equals("minus")){
                                System.out.println(string1.toLowerCase());

                            }
                            else {
                                System.out.println("ERROR. Ingrese MAYUS o minus");
                            }
                        }
                    }while (!string2.equals("MAYUS") && !string2.equals("minus"));
                    break;
                }
                case 11:{
                    //ejercicio11
                    //Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
                    //compareToIgnoreCase)
                    System.out.println("Ingrese la primer palabra");
                    string1 = sc.nextLine();
                    System.out.println("Ingrese la segunda palabra");
                    string2 = sc.nextLine();
                    boolean verOFal = string1.equals(string2);
                    if (verOFal) {
                        System.out.println("Las cadenas son iguales");
                    }
                    else
                        System.out.println("Las cadenas no son iguales");
                    break;
                }
                case 12:{
                    //ejercicio12
                    //Dada una cadena, extraer la cuarta y quinta letra usando el método substring
                    System.out.println("Ingrese una palabra");
                    string1 = sc.nextLine();
                    System.out.println(string1.substring(3, 5));
                    break;
                }
                case 13:{
                    //ejercicio13
                    //Pedir el ingreso de dos cadenas por teclado, indicar si la segunda cadena se
                    //encuentra dentro de la primera (usar indexOf o contains)
                    System.out.println("Ingrese una frase");
                    string1= sc.nextLine();
                    System.out.println("Ingrese otra frase");
                    string2= sc.nextLine();
                    int indice = string1.indexOf(string2);
                    System.out.println(indice);
                    if (indice != -1) {
                        System.out.println("La segunda cadena se encuentra dentro de la primera");
                    }else{
                        System.out.println("La segunda cadena no se encuentra dentro de la primera");
                    }
                    break;
                }
                case 14:{
                    //ejercicio14
                    //Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo el int
                    //y su contraparte por referencia ejemplo Integer.
                    System.out.println("Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo el int y su contraparte por referencia ejemplo Integer");
                    System.out.println("Datos Primitivos: Son más eficientes en términos de memoria y velocidad, y se utilizan para almacenar valores directamente. No pueden ser null. ");
                    System.out.println("Datos por referencia: Representan los valores primitivos como objetos y ofrecen métodos útiles. Pueden ser null y se usan cuando se necesita manipulación más avanzada o en colecciones.");
                    break;
                }
                case 15:{
                    //ejercicio15
                    //- Indique que sucede si realizo la siguiente declaración de variable:
                    //int numero = null;
                    //¿Qué debo modificar para poder asignar null a la variable?
                    System.out.println("""
                Indique que sucede si realizo la siguiente declaración de variable:
                int numero = null;
                ¿Qué debo modificar para poder asignar null a la variable?""");
                    System.out.println("""
                Debo declarar la variable con una clase envolvente(Por Referencia)
                en este caso con la clase Integer para el dato primitivo int ya que estos
                no permiten alojar null mientras que las clases envolventes si lo permiten
                como se ve en el siguiente ejemplo""");
                    Integer numeroPorReferencia = null;
                    System.out.println(numeroPorReferencia);
                    break;
                }
                case 16:{
                    //ejercicio16
                    // Como transformo una variable tipo Double a una variable tipo double
                    System.out.println("¿Como transformo una variable tipo Double a una variable tipo double?");
                    System.out.println("""
                De dos maneras con el unboxing automatico o el unboxing manual
                Con el unboxing automatico basta con agregarle el valor de la variable tipo Double a una
                variable del tipo double como en el siguiente ejemplo:
                Double numero_Double = 12.4;
                double numero_double = numero_Double;
                
                Con el unboxinf manual seria lo mismo que el anterior pero agregando el metodo doubleValue()
                Double numero_Double = 12.4;
                double numero_double = numero_Double.doubleValue();""");
                    Double numero_Double = 12.4;
                    double numero_double = numero_Double;
                    System.out.println(numero_double);
                    numero_Double = 15.2;
                    numero_double = numero_Double.doubleValue();
                    System.out.println(numero_double);
                    break;
                }
                case 17:{
                    //ejercicio17
                    // Cree una clase FuncionesPrograma y codifique una función estática que reciba
                    //como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
                    //public static String getFechaString(Date fecha){
                    //……….
                    //}
                    //Cree una clase Principal que contenga un método main y haga uso de la función
                    //getFechaString.
                    Date fecha = new Date();
                    String fechaCadena = FuncionesProgramas.cadenaFecha(fecha);
                    System.out.println("La fecha es: " + fechaCadena);
                    break;
                }
                case 18:{
                    //ejercicio18
                    //En la clase FuncionesPrograma codifique una función estática que reciba como
                    //parámetro 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date
                    //correspondiente.
                    //public static Date getFechaDate(int día, int mes, int anio){
                    //……….
                    //}
                    //En la clase Principal creada en el punto anterior haga uso de la función
                    //getFechaDate.
                    int dia, mes, anio;
                    System.out.println("Escriba el dia");
                    dia = sc.nextInt();
                    System.out.println("Escriba el mes");
                    mes = sc.nextInt();
                    System.out.println("Escriba el anio");
                    anio = sc.nextInt();
                    Date fechaConvertida = FuncionesProgramas.getFechaDate(dia, mes, anio);
                    System.out.println(fechaConvertida);
                    break;
                }

                case 19:


                    OperacionMath operacion = new OperacionMath();

                    operacion.setValor1(4.0);
                    operacion.setValor2(5.5);

                    System.out.println("suma: " + operacion.aplicarOperacion("+"));
                    System.out.println("resta: " + operacion.aplicarOperacion("-"));
                    System.out.println("multiplicacion: " + operacion.aplicarOperacion("*"));
                    System.out.println("division: " + operacion.aplicarOperacion("/"));
                    break;

                case 20:



                    Scanner input = new Scanner(System.in);

                    System.out.print("ingrese el numerador de la primera fraccion: ");
                    int numerador1 = input.nextInt();
                    System.out.print("ingrese el denominador de la primera fraccion: ");
                    int denominador1 = input.nextInt();

                    System.out.print("ingrese el numerador de la segunda fraccion: ");
                    int numerador2 = input.nextInt();
                    System.out.print("ingrese el denominador de la segunda fraccion: ");
                    int denominador2 = input.nextInt();

                    Fraccion f1 = new Fraccion(numerador1, denominador1);
                    Fraccion f2 = new Fraccion(numerador2, denominador2);

                    Fraccion suma = f1.sumarFracciones(f2);
                    Fraccion resta = f1.restarFracciones(f2);
                    Fraccion multiplicacion = f1.multiplicarFracciones(f2);
                    Fraccion division = f1.dividirFracciones(f2);

                    System.out.print("Suma: ");
                    suma.mostrar();
                    System.out.print("Resta: ");
                    resta.mostrar();
                    System.out.print("Multiplicación: ");
                    multiplicacion.mostrar();
                    System.out.print("División: ");
                    division.mostrar();

                    break;

                case 21:
                    do {
                        System.out.print("ingrese un numero entero mayor a cero: ");
                        num1 = scanner.nextInt();
                    } while (num1 <= 0);

                    int resultado = sumaRecursiva(num1);
                    System.out.println("la suma de los numeros desde " + num1 + " hasta 1 es: " + resultado);
                    break;

                case 22:
                    System.out.println("ingrese 4 digitos para sumar");
                    num1 = scanner.nextInt();
                    System.out.println("la suma de los 4 digitos de " + num1 + " es " + sumaDigitos(num1));
                    break;

                case 23:
                    System.out.println("ingrese una cadena");
                    String cadena = scanner.next();
                    String cadenaInvertida = invertirCadena(cadena);
                    System.out.println("cadena invertida: " + cadenaInvertida);
                    break;

                case 0:
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }

    static class OperacionMath {
        private double valor1;
        private double valor2;
        private String operacion;

        public double getValor1() {
            return valor1;
        }

        public void setValor1(double valor1) {
            this.valor1 = valor1;
        }

        public double getValor2() {
            return valor2;
        }

        public void setValor2(double valor2) {
            this.valor2 = valor2;
        }

        private double sumarNumeros() {
            return valor1 + valor2;
        }

        private double restarNumeros() {
            return valor1 - valor2;
        }

        private double multiplicarNumeros() {
            return valor1 * valor2;
        }

        private double dividirNumeros() {
            return valor1 / valor2;
        }

        public double aplicarOperacion(String operacion) {
            this.operacion = operacion;
            switch (operacion) {
                case "+":
                    return sumarNumeros();
                case "-":
                    return restarNumeros();
                case "*":
                    return multiplicarNumeros();
                case "/":
                    return dividirNumeros();
            }
            return 0; // Para evitar error de retorno
        }
    }

    public static String invertirCadena(String cadena) {
        if (cadena.isEmpty()) {
            return "";
        } else {
            char ultimoCaracter = cadena.charAt(cadena.length() - 1);
            return ultimoCaracter + invertirCadena(cadena.substring(0, cadena.length() - 1));
        }
    }

    public static int sumaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return (numero % 10) + sumaDigitos(numero / 10);
        }
    }

    public static int sumaRecursiva(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero + sumaRecursiva(numero - 1);
        }
    }
}
class FuncionesProgramas {
    public static String cadenaFecha(Date fecha){
        SimpleDateFormat formato = new SimpleDateFormat();
        return formato.format(fecha);
    }
    public static Date getFechaDate (int dia, int mes, int anio){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, dia);
        cal.set(Calendar.MONTH, mes - 1);  // Los meses en Calendar empiezan desde 0
        cal.set(Calendar.YEAR, anio);
        return cal.getTime();
    }

}
class Fraccion {
    int numerador;
    int denominador;



    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumarFracciones(Fraccion f) {
        int nuevoNumerador = this.numerador * f.denominador + f.numerador * this.denominador;
        int nuevoDenominador = this.denominador * f.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restarFracciones(Fraccion f) {
        int nuevoNumerador = this.numerador * f.denominador - f.numerador * this.denominador;
        int nuevoDenominador = this.denominador * f.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicarFracciones(Fraccion f) {
        int nuevoNumerador = this.numerador * f.numerador;
        int nuevoDenominador = this.denominador * f.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividirFracciones(Fraccion f) {
        int nuevoNumerador = this.numerador * f.denominador;
        int nuevoDenominador = this.denominador * f.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public void mostrar() {
        System.out.println(numerador + "/" + denominador);
    }
}