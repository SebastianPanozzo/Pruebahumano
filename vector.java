package caco_gutierrez;

import java.util.Scanner;

public class vector {
    public static void main(String[] args) {
        int vector [] = new int [4];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i ++) {
            System.out.println("ingrese el valor del vector");
            vector [i] = teclado.nextInt();
        }
        for (int i = 0; i < vector.length; i ++) {
            System.out.println("vector " + i + "(" + vector[i] + ")");
        }
    }
}
