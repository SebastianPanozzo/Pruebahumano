package caco_gutierrez;

import java.util.Scanner;

public class matriz2 {
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        Scanner teclado = new Scanner (System.in);
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese el valor de la matriz");
                matrix[f][c] = teclado.nextInt();
            }
        }
        for (int f = 0; f < 3; f ++) {
            for (int c = 0; c < 3; c ++) {
                System.out.println("matriz (" + matrix[f][c] + ")");
            }
        }
    }
}
