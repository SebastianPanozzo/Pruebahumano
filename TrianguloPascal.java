import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas del Triángulo de Pascal: ");
        int numRows = scanner.nextInt();

        mostrarTrianguloPascal(numRows);

        scanner.close();
    }

    public static void mostrarTrianguloPascal(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(calcularCoeficienteBinomial(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int calcularCoeficienteBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calcularCoeficienteBinomial(n - 1, k - 1) + calcularCoeficienteBinomial(n - 1, k);
        }
    }
}