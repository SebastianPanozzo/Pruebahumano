import java.util.Stack;
public class Pila {
    public static Stack<Integer> sumarDiagonalPrincipal(int[][] matriz) {
        Stack<Integer> pila = new Stack<>();

        // Suponemos que la matriz es cuadrada
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            pila.push(matriz[i][i]);
        }

        return pila;
    }
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Stack<Integer> resultado = sumarDiagonalPrincipal(matriz);

        System.out.println("Elementos de la diagonal principal en la pila:");
        while (!resultado.isEmpty()) {
            System.out.println(resultado.pop());
        }
    }
}
