
import javax.swing.*;
import java.util.Scanner;

public class ResumenJAVAparcial
{
    public static void main(String[] args)
    {
        //scanner - input de datos por teclado
        Scanner sc = new Scanner(System.in);

        int random = (int) (Math.random()*100+1);

        //arrays unidimensionales
        int [] array1 = new int[10];
        int [] lista = new int [20];
        char [] arrayChar = new char[10];
        byte [] arrayBytes = new byte[20];

        //arrays multidimensionales
        int [] [] arrayMatriz = new int[10][10]; //filas y columnas  //bidimensional
        int [] [] [] arrayTriDim = new int [24] [60] [60]; //horas, minutos, segundos


        //system in and out
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese una palabra: ");
        String palabra1 = sc.nextLine();

        //JOptionPane - input de datos en una ventanita
        String palabra2 = JOptionPane.showInputDialog("Introduce tu nombre: ");
        System.out.println("Bienvenida " + palabra2);

        // suma: +   resta: -   mult: *   div: /    modulo: %


        // && AND     || OR
        if (num == 1)
        {
            //do x
        }
        else if (num == 2)
        {
            //x
        }
        else
        {
            //do y
        }

        while (num != 1)
        {
            //x
        }

        do
        {
            //x
        } while (num != 1);

        for (int i = 0; i < 10; i++)
        {
            //x
        }

        switch (num)
        {
            case 1:
            {
                //x

            } break;

        }

        //metodos de String
        palabra1 = palabra1.toUpperCase();
        palabra1 = palabra1.toLowerCase();
        palabra1 = String.valueOf(num); //convierte otro tipo de variable en un string
        char letra1 = palabra1.charAt(2); //devuelve el caracter en la posicion indicada
        num = palabra1.compareTo(palabra2); //compara cadenas, devuelve la diferencia. >0 = String1>String2
        num = palabra1.compareToIgnoreCase(palabra2);
        palabra1 = palabra1 + palabra2; //concatena los strings
        boolean bIsStart = palabra1.startsWith(palabra2);  //si empieza con el string parametro.
        boolean bIsEnd = palabra1.endsWith(palabra2);  //si termina con el string parametro.
        boolean bIsSame = palabra1.equals(palabra2);  //si son iguales.
        bIsSame = palabra1.equalsIgnoreCase(palabra2);  //si son iguales.
        arrayBytes = palabra1.getBytes();
        num = palabra1.indexOf(letra1); // devuelve la posición del parámetro. -1 si no existe.
        num = palabra1.indexOf(letra1+num); // para analizar desde la posición x.
        num = palabra1.lastIndexOf(letra1); // devuelve la posición del parámetro, busca de atrás hacia adelante.
        num = palabra1.length(); //devuelve la longitud de la cadena
        boolean bMatches = palabra1.matches(palabra2); //indica si son iguales
        palabra1 = palabra1.replace(palabra2, "reemplazado por trolo"); //puede reemplazar con char o string
        palabra1 = palabra1.replaceFirst(palabra2, "reemplazo solo la primer coincidencia");
        palabra1 = palabra1.replaceAll(palabra2, "reemplazado por trolo");
        palabra1 = palabra1.substring(1 + 10);
        arrayChar = palabra1.toCharArray(); //devuelve todos los caracteres en un array
        palabra1 = palabra1.trim(); //elimina los espacios


        //algoritmo de inserción:
        //Toma elementos de a uno y los ordena con respecto al anterior
        for (int i = 0; i < 5; i++)
        {
            int valor = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j] > valor) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = valor;
        }

        //algoritmo de burbuja:
        // Compara los elementos de a parejas e intercambia sus posiciones.
        boolean intercambio = false;
        do
        {
            for (int i = 1; i < 5; i++) {
                //si el par no está ordenado
                if (lista[i - 1] > lista[i])
                { //lo intercambiamos y recordamos que algo ha cambiado
                    int aux = lista[i - 1];
                    lista[i - 1] = lista[i];
                    lista[i] = aux;
                    intercambio = true;
                }
            }
        } while (intercambio == true);

        //Algoritmo por seleccion
        //busca el mas pequeño de la lista y lo pone primero.
        for (int i = 0; i < 5; i++)
        {
            int minimo = i;
            for (int j = i + 1; j < 5; j++)
            { //si el par no está ordenado
                if (lista[j] > lista[minimo])
                { //encontramos un nuevo mínimo
                    minimo = j;
                }
                //intercambiamos el actual con el minimo encontrado
                int aux = lista[minimo];
                lista[minimo] = lista[j];
                lista[j] = aux;
            }
        }

        //Busqueda secuencial
        boolean encontrado = false;
        //recorremos la lista para sir si cada elemento es el numero deseado
        System.out.println("ingrese para buscar un numero:");
        int busq = new Scanner(System.in).nextInt();
        for(int i=0; i < 5; i++)
        {
            if (lista[i] == busq)
            {
                encontrado = true;
            }
        }
        if (encontrado == false)
        {
            System.out.println("Numero no encontrado. ");
        }


        //Ascendente: menor a Mayor     //Descendente: Mayor a menor

        //Busqueda Quick Sort:
        //Se elige un pivote y ordena los elementos en Mayor y menor que el pivote. Rinse and repeat.


        //funciones
        saludar();


    }

    //FUNCIONES

    //visibilidad: public / private
    //tipo de retorno: int, double, bool, void
    //nombre
    //(parámetros)
    public static void saludar ()
    {
        System.out.println("Hola");
    }
    
    public static int sumar()
    {
        int resultado = 10;
        return resultado;
    }

    //funciones2
    public static void main2(String[] args)
    {
        int[] numeros = new int[2];

        administrador(numeros);

        System.out.println("El array originl: " + numeros[0] + ", " + numeros[1]);
    }

    public static void pedirDatos(int[] numeros)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numeros[0] = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        numeros[1] = sc.nextInt();
    }

    public static int sumar(int[] numeros)
    {
        return numeros[0] + numeros[1];
    }

    public static void administrador (int[] numeros)
    {
        pedirDatos(numeros);
        System.out.println("El resultado es: " + sumar(numeros));
    }
}

