import java.util.ArrayList;
public class Pila2 {
    public static ArrayList<Integer> getNumerosPares(int arr[]) {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                numerosPares.add(arr[i]);
            }
        }
        return numerosPares;
    }

    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> pares = getNumerosPares(numeros);
        for (Integer num : pares) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
