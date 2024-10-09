import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variables
        int ejercicio;
        int [] lista = new int [20];

        do
        {
            System.out.println("Ingrese el numero de ejercicio: ");
            ejercicio = new Scanner(System.in).nextInt();

            switch (ejercicio) {

                case 1:
                {
                    System.out.println("//PUNTO 1\n" +
                            "        //Algoritmos de Ordenación\n" +
                            "//Ordenamiento por Inserción: Consiste en tomar un elemento de una lista desordenada y colocarlo en su posición correcta en una lista ordenada. Se repite este proceso hasta que todos los elementos están ordenados\u200B\n" +
                            "\n" +
                            "//Algoritmo de la burbuja: Este algoritmo compara cada par de elementos adyacentes y los intercambia si están en el orden incorrecto. Este proceso se repite hasta que no hay más intercambios, ordenando la lista\u200B\n" +
                            "\n" +
                            "//Ordenamiento por selección: Recorre toda la lista buscando el menor elemento y lo coloca al inicio. Luego, continúa buscando el menor de los elementos restantes hasta que la lista esté completamente ordenada\n" +
                            "\n" +
                            "//Quick-Sort: Es un algoritmo recursivo que selecciona un \"pivote\" y reorganiza los elementos de modo que los menores queden a un lado y los mayores al otro. Luego, repite este proceso para cada sublista hasta que todo esté ordenado.\n" +
                            "\n" +
                            "//Algoritmos de Búsqueda\n" +
                            "//Búsqueda Secuencial: Se revisan los elementos de la lista uno por uno hasta encontrar el elemento buscado o hasta llegar al final\u200B\n" +
                            "\n" +
                            "//Búsqueda Binaria: Se usa en listas ordenadas. Divide la lista en dos y compara el elemento central con el buscado, descartando la mitad de la lista en la que no puede estar el elemento. El proceso se repite hasta encontrar el valor o reducir la lista a cero\u200B.\n" +
                            "\n" +
                            "//Algoritmos de Recorrido\n" +
                            "//Recorrido de Profundidad: Explora un árbol o grafo comenzando desde la raíz y siguiendo un camino hasta el nodo más profundo antes de retroceder. Utiliza una pila para gestionar los nodos visitados\u200B\n" +
                            "\n" +
                            "//Recorrido de Anchura: Procesa primero todos los nodos de un nivel antes de pasar al siguiente. Utiliza una cola para manejar los nodos por niveles\n");
                    break;
                }

                case 2: {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Orden ascendente. Ingrese un numero cualquiera: ");
                        lista[i] = new Scanner(System.in).nextInt();
                    }

                    //algoritmo de inserción
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

                    System.out.println("La lista ordenada con algoritmo de inserción: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(lista[i] + ", ");
                    }

                    //algoritmo de burbuja
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
                    System.out.println("La lista ordenada con algoritmo de burbuja: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(lista[i] + ", ");
                    }


                    //Algoritmo por seleccion
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
                    System.out.println("La lista ordenada con algoritmo de selección: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(lista[i] + ", ");
                    }



                    //Busqueda secuancial
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


                    break;
                }

                case 3:
                {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Orden descendente. Ingrese un numero cualquiera: ");
                        lista[i] = new Scanner(System.in).nextInt();
                    }





                    //algoritmo de inserción
                    for (int i = 1; i < 5; i++)
                    {
                        int valor = lista[i];
                        int j = i - 1;

                        while (j >= 0 && lista[j] > valor) {
                            lista[j + 1] = lista[j];
                            j--;
                        }
                        lista[j + 1] = valor;
                    }

                    System.out.println("La lista ordenada con algoritmo de inserción: ");
                    for (int i = 4; i > -1; i--) {
                        System.out.println(lista[i] + ", ");
                    }

                    //algoritmo de burbuja
                    boolean intercambio = false;
                    do
                    {
                        intercambio = false;
                        for (int i = 1; i < 5; i++) {
                            //si el par no está ordenado
                            if (lista[i - 1] < lista[i])
                            { //lo intercambiamos y recordamos que algo ha cambiado
                                int aux = lista[i - 1];
                                lista[i - 1] = lista[i];
                                lista[i] = aux;
                                intercambio = true;
                            }
                        }
                    } while (intercambio == true);
                    System.out.println("La lista ordenada con algoritmo de burbuja: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(lista[i] + ", ");
                    }


                    //Algoritmo por seleccion
                    for (int i = 0; i < 5; i++)
                    {
                        int minimo = i;
                        for (int j = i + 1; j < 5; j++)
                        { //si el par no está ordenado
                            if (lista[j] < lista[minimo])
                            { //encontramos un nuevo mínimo
                                minimo = j;
                            }
                            //intercambiamos el actual con el minimo encontrado
                            int aux = lista[minimo];
                            lista[minimo] = lista[j];
                            lista[j] = aux;
                        }
                    }
                    System.out.println("La lista ordenada con algoritmo de selección: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(lista[i] + ", ");
                    }

                    break;
                }

                case 4:
                {
                    for (int i = 0; i < 20; i++) {
                        System.out.println("Ingrese un numero cualquiera: ");
                        lista[i] = new Scanner(System.in).nextInt();
                    }

                    System.out.println("ingrese 1 para orden Ascendente, 2 para orden descendente.");
                    int num = new Scanner(System.in).nextInt();

                    if (num == 1)
                    {


                        //algoritmo de inserción
                        for (int i = 0; i < 20; i++)
                        {
                            int valor = lista[i];
                            int j = i - 1;

                            while (j >= 0 && lista[j] > valor) {
                                lista[j + 1] = lista[j];
                                j--;
                            }
                            lista[j + 1] = valor;
                        }

                        System.out.println("La lista ordenada con algoritmo de inserción: ");
                        for (int i = 0; i < 20; i++) {
                            System.out.println(lista[i] + ", ");
                        }

                        //algoritmo de burbuja
                        boolean intercambio = false;
                        do
                        {
                            for (int i = 1; i < 20; i++) {
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
                        System.out.println("La lista ordenada con algoritmo de burbuja: ");
                        for (int i = 0; i < 20; i++) {
                            System.out.println(lista[i] + ", ");
                        }


                        //Algoritmo por seleccion
                        for (int i = 0; i < 20; i++)
                        {
                            int minimo = i;
                            for (int j = i + 1; j < 20; j++)
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
                        System.out.println("La lista ordenada con algoritmo de selección: ");
                        for (int i = 0; i < 20; i++) {
                            System.out.println(lista[i] + ", ");
                        }



                        //Busqueda secuancial
                        boolean encontrado = false;
                        //recorremos la lista para sir si cada elemento es el numero deseado
                        System.out.println("ingrese para buscar un numero:");
                        int busq = new Scanner(System.in).nextInt();
                        for(int i=0; i < 20; i++)
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


                        break;
                    }
                    else
                    {

                        //algoritmo de inserción
                        for (int i = 1; i < 20; i++)
                        {
                            int valor = lista[i];
                            int j = i - 1;

                            while (j >= 0 && lista[j] > valor) {
                                lista[j + 1] = lista[j];
                                j--;
                            }
                            lista[j + 1] = valor;
                        }

                        System.out.println("La lista ordenada con algoritmo de inserción: ");
                        for (int i = 19; i > -1; i--) {
                            System.out.println(lista[i] + ", ");
                        }

                        //algoritmo de burbuja
                        boolean intercambio = false;
                        do
                        {
                            intercambio = false;
                            for (int i = 1; i < 20; i++) {
                                //si el par no está ordenado
                                if (lista[i - 1] < lista[i])
                                { //lo intercambiamos y recordamos que algo ha cambiado
                                    int aux = lista[i - 1];
                                    lista[i - 1] = lista[i];
                                    lista[i] = aux;
                                    intercambio = true;
                                }
                            }
                        } while (intercambio == true);
                        System.out.println("La lista ordenada con algoritmo de burbuja: ");
                        for (int i = 0; i < 20; i++) {
                            System.out.println(lista[i] + ", ");
                        }


                        //Algoritmo por seleccion
                        for (int i = 0; i < 20; i++)
                        {
                            int minimo = i;
                            for (int j = i + 1; j <20; j++)
                            { //si el par no está ordenado
                                if (lista[j] < lista[minimo])
                                { //encontramos un nuevo mínimo
                                    minimo = j;
                                }
                                //intercambiamos el actual con el minimo encontrado
                                int aux = lista[minimo];
                                lista[minimo] = lista[j];
                                lista[j] = aux;
                            }
                        }
                        System.out.println("La lista ordenada con algoritmo de selección: ");
                        for (int i = 0; i < 20; i++) {
                            System.out.println(lista[i] + ", ");


                        }

                    }


                    break;
                }
                case 5: {
                    // variables

                    int sumatoria = 0;
                    int promedio;
                    boolean coincidencia = false;

                    // input

                    System.out.print("Ingrese un numero de filas: ");
                    int filas = new Scanner(System.in).nextInt();

                    if (filas < 2) {
                        System.out.print("Por favor ingrese un numero mayor o igual que 2: ");
                        filas = new Scanner(System.in).nextInt();
                    }
                    System.out.print("Ingrese un numero de columnas: ");
                    int columnas = new Scanner(System.in).nextInt();

                    if (columnas < 2) {
                        System.out.print("Por favor ingrese un numero mayor o igual que 2: ");
                        columnas = new Scanner(System.in).nextInt();
                    }

                    //creacion del array

                    int[][] notas = new int[filas][columnas];

                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            System.out.print("Ingrese un valor para la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                            notas[i][j] = new Scanner(System.in).nextInt();
                        }
                    }

                    // sacando el promedio

                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            sumatoria += notas[i][j];
                        }
                    }

                    promedio = sumatoria / (filas * columnas);

                    //resultados

                    System.out.println("El promedio entero es: " + promedio);

                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (notas[i][j] == promedio) {
                                System.out.println("El valor " + promedio + " se encuentra en la posición " + (i + 1) + "," + (j + 1) + ". ");
                                coincidencia = true;
                            }
                        }
                    }

                    if (coincidencia == false) {
                        System.out.println("No se encontró ninguna coincidencia.");
                    }

                    break;
                }
            }

        } while (ejercicio > 0);



    }
}