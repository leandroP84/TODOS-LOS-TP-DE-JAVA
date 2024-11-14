import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        System.out.println("---Pokemon");
        Pikachu pika = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();

        pika.atacarAraniazo();
        pika.atacarImpactrueno();
        bulbasaur.atacarAraniazo();

        //Operador Ternario // if en una fila
        //variable  = condición ? valor_si_verdadero : valor_si_falso;
        //mayorEdad = edad >=18 ?     "Es mayor"     :   "Es menor"  ;

        //ArrayList de Perros
        System.out.println("---ArrayList");
        List <Perro> lista1 = new ArrayList<Perro>(); //no hace falta definir el tamaño, porque puede cambiar.
        lista1.add(new Perro("Luna", "Messi",5)); //agrego un perro nuevo  la lista
        lista1.add(new Perro("Sara", "Pao",3));
        lista1.add(new Perro("Lara", "Fausti",5));

        Perro salchicha = new Perro("Sr. Salchicha", "La loca", 6); //creo perros nuevos
        Perro mutt = new Perro("Sara", "Pao", 3);
        lista1.add(salchicha); //agrego un objeto existente

        //Remove en array
        lista1.remove(1); //quito el elemento de la posición 1 (Sara)

        for (int i=0; i<lista1.size(); i++) {} //
        for (Perro aux:lista1) //foreach
        {
            System.out.println(aux.getName());
        }

        //otros metodos
        // .add(x) añade elemento x
        // .size() devuelve int numero de elementos
        // .get(posición)
        // .remove(posición) Elimina el elementp. Devuelve el elemento eliminado.
        // .remove(x) Elimina la primera ocurrencia del objeto x. Devuelve true si el elemento estaba en la lista.
        // .clear()
        //.set(posición, x) sustituye el elemento de la posicion, por el elemento x. Devuelve el elemento sustituido.
        // .contains (x) devuelve boolean
        // .indexOf(x) devuelve la posicion del objeto x. Si no existe, devuelve -1.


        //LinkedList
        System.out.println("---LinkedList");
        List <Perro> lista2 = new LinkedList<Perro>();
        lista2.add(salchicha);
        System.out.println("added salchicha.");
        lista2.add(new Perro("Lara", "Fausti",5));
        System.out.println("added Lara.");
        lista2.add(0, mutt);
        System.out.println("added 0, Sara."); //0 indica que este se guardara al principio del linkedlist.

        //Borrar un elemento en la LinkedList
        //Ej: lista2.remove(salchicha)
        String nombreBorrar = "Lara";
        for (Perro aux:lista2)
        {
            if (aux.getName().equals(nombreBorrar))
            {
                lista2.remove(aux);
                break; //rompo el ciclo antes de correr el codigo de nuevo, para darle tiempo a enlazar los nuevos eslabones de la lista.
            }
        }
        System.out.println("removed " + nombreBorrar);

        System.out.println("--lista 2:");
        for (Perro aux:lista2) //foreach
        {
            System.out.println(aux.getName());
        }

        //otros metodos
        // .addFirst()
        // .addLast()
        // .remove()
        // .removeFirst()
        // .removeLast()
        // .size()
        System.out.println("Tamaño de la lista1: " + lista1.size());
        System.out.println("--show last lista2: ");
        // .getFirst()
        // .getLast()
        // .toString()  metodo de la clase trido usando override. devuelve el valor almacenado en el atributo.
        System.out.println(((LinkedList<Perro>) lista2).getFirst().toString());
        System.out.println("Borrar lista1");
        lista1.clear();
        System.out.println("Lista1 isEmpty?: " + lista1.isEmpty());


        //STACKS  -Lifo
        System.out.println("---Stacks");
        Stack<Integer> pila1 = new Stack<Integer>();
        pila1.push(1); //agrega elementos nuevos.
        pila1.push(2);
        pila1.push(3);

        System.out.println(pila1); //Muestra_todo el stack, no hace falta instanciar el indice.
        pila1.pop(); //elimina el ultimo elemento que se agregó.
        pila1.push(3);
        pila1.push(4);
        System.out.println(pila1);
        System.out.println("existe el elemento 3? " + pila1.search(3)); //no funciona con objetos
        System.out.println("Ultimo elemento agregado: " + pila1.peek());



        //HashMap
        System.out.println("---HashMap");
        Map<Integer,String> mapaEmpleados = new HashMap<>(); //cREA EL MAPA
        mapaEmpleados.put(1,"Sr.Salchicha"); //agrega un nuevo valor al mapa
        mapaEmpleados.put(2,"Lara");
        mapaEmpleados.put(3,"Sara");

        mapaEmpleados.get(1); //Muestra la pareja asociada a esta clave.
        mapaEmpleados.containsKey(1); //true-false
        mapaEmpleados.containsValue("Sara");
        mapaEmpleados.remove(2); //elimina una pareja
        mapaEmpleados.keySet(); //devuelve un conjunto con todas las keys del map
        mapaEmpleados.values(); //devuelve un conjunto con todos los values del map



        //HashSet
        //array no ordenado, sin duplicados
        System.out.println("---HashSet");
        Set<String> conjuntoHash = new HashSet<String>();
        conjuntoHash.add("Argentina");
        conjuntoHash.add("Peru");
        conjuntoHash.add("Brasil");
        conjuntoHash.add("Argentina");
        conjuntoHash.add("Argentina");

        for (String valor : conjuntoHash)
        {
            System.out.println("Pais: " + valor);
        }

        //TreeSet
        //ordenado, sin duplicados
        System.out.println("---TreeSet");
        Set<String> conjuntoTree = new TreeSet <>();
        conjuntoTree.add("Zoro");
        conjuntoTree.add("Sanji");
        conjuntoTree.add("Ace");
        conjuntoTree.add("Luffy");

        for (String valor : conjuntoTree)
        {
            System.out.println(valor);
        }
        System.out.println(conjuntoTree.size());

        //LikedHashSet
        //array de orden FIFO, sin duplicados
        System.out.println("---LinkedHashSet");
        Set<Character> conjuntoLinkedHashSet = new LinkedHashSet<>();
        conjuntoLinkedHashSet.add('g');
        conjuntoLinkedHashSet.add('z');
        conjuntoLinkedHashSet.add('c');
        conjuntoLinkedHashSet.add('l');

        for (Character valor : conjuntoLinkedHashSet)
        {
            System.out.println(valor);
        }

        //otros metodos
        lista1.size();
        ((LinkedList<Perro>) lista2).getFirst().toString();
        lista1.clear();
        lista1.isEmpty();
    }
}