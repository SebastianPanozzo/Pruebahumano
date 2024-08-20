import java.util.*;

public class ListasPilasyColas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Clase 21/05/24 Martes
        // Ingresar y quitar elementos de arraylist

        // Se carga una lista conformada por enteros
        int[] enteros = {1, 4, 3, 2, 5};
        System.out.println(Arrays.toString(enteros));

        // Se crea una copia de dicha lista
        int[] copia = Arrays.copyOf(enteros, enteros.length);

        // Se ordena la copia de la lista
        Arrays.sort(copia);

        // Se busca un valor especifico de la copia ordenada
        int indice = Arrays.binarySearch(copia, 3);
        // Muestra el elemento buscado y muestra la lista original
        System.out.println("El elemento está en la ubicación: " + indice);

        // Se crea un arraylist
        ArrayList<String> ListaNombres = new ArrayList<>();

        // Agregar elementos a la lista
        ListaNombres.add("a");
        ListaNombres.add("b");
        ListaNombres.add("c");
        ListaNombres.add(2, "test"); // Corrige el error en la sintaxis

        // Mostrar los elementos de la lista
        System.out.println(ListaNombres);

        // Se crea una pila
        Stack<Integer> pila = new Stack<>();
        // Metodos de pilas : push, pop, peek

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        // Mostrar el último elemento de la pila
        System.out.println(pila.peek());
        // Quitar el último elemento de la pila
        pila.pop();

        // Mostrar el estado de la pila después del pop
        System.out.println(pila);

        // Se crea una cola (Queue)
        Queue<Integer> cola = new LinkedList<>(); // Corrige el error en la creación de la cola

        // Métodos de colas: offer, poll, peek
        // Agregar elementos a la cola
        cola.offer(30);
        cola.offer(40);
        // Mostrar el primer elemento de la cola
        System.out.println(cola.peek());
        // Quitar el primer elemento de la cola
        cola.poll();

        // Mostrar el estado de la cola después del poll
        System.out.println(cola);
    }
}