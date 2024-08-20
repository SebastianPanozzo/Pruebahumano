import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Ejemplo_Pilas_Colas_Listas {
    public static void main(String[] args) {
        // Listas
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        lista.add(6);
        lista.remove(0);
        System.out.println("Lista: " + lista);

        // Pilas
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        System.out.println("Pila antes de pop: " + pila);
        pila.pop();
        System.out.println("Pila después de pop: " + pila);
        System.out.println("Elemento en la cima de la pila: " + pila.peek());

        // Colas
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(100);
        cola.offer(200);
        System.out.println("Cola antes de poll: " + cola);
        cola.poll();
        System.out.println("Cola después de poll: " + cola);
        System.out.println("Elemento en la cabeza de la cola: " + cola.peek());

        /*
        Explicación de las importaciones:
import java.util.List; y import java.util.ArrayList; para usar listas y la implementación de ArrayList.
import java.util.Arrays; para usar Arrays.asList(), que convierte un array en una lista.
import java.util.Stack; para usar la clase Stack.
import java.util.Queue; y import java.util.LinkedList; para usar colas y la implementación de LinkedList.
         */
    }
}
