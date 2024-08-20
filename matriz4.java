package caco_gutierrez;

import java.util.Scanner;

public class matriz4 {
    public static void main(String[] args) {
        System.out.println("ingrese las filas de la primer matriz");
        int filas, columnas, filcol, filas2, columnas2;
        Scanner sc = new Scanner (System.in);
        filas = sc.nextInt();
        System.out.println("ingrese las columnas de la primer matriz");
        columnas = sc.nextInt();
        int matriz[][] = new int [filas][columnas];
        System.out.println("ingrese las filas de la segunda matriz");
        filas2 = sc.nextInt();
        System.out.println("ingrese las columnas de la segunda matriz");
        columnas2 = sc.nextInt();
        int matroz[][] = new int [filas2][columnas2];
        if (columnas == filas2){
            int matrix[][] = new int [filas][columnas2];
            for (int f = 0; f < filas; f++) {
                for (int c = 0; c < columnas; c++) {
                    System.out.println("ingrese el valor de la primer matriz");
                    matriz[f][c] = sc.nextInt();
                }
            }
            for (int f = 0; f < filas2; f++) {
                for (int c = 0; c < columnas2; c++) {
                    System.out.println("ingrese el valor de la segunda matriz");
                    matroz[f][c] = sc.nextInt();
                }
            }
            for (int f = 0; f < filas; f++) {
                for (int c = 0; c < columnas2; c++) {
                    for (int fc = 0; fc < columnas; fc++) {
                        matrix[f][c] += matriz[f][fc] * matroz[fc][c];
                    }
                }
            }
            for (int f = 0; f < filas; f++) {
                for (int c = 0; c < columnas2; c++) {
                    if ( c == columnas2 - 1){
                        System.out.println("["+ matrix[f][c] +"]");
                    }else {
                        System.out.print("["+ matrix[f][c] +"]");
                    }
                }
            }
        }else {
            System.out.println("no puede realizarse una multiplicacion");
        }
    }
}
