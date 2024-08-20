package caco_gutierrez;

import java.util.Scanner;

public class matriz5 {
    public static void main(String[] args) {
        System.out.println("ingrese las filas de la matriz");
        int filas, columnas, pares = 0;
        Scanner sc = new Scanner (System.in);
        filas = sc.nextInt();
        System.out.println("ingrese las columnas de la matriz");
        columnas = sc.nextInt();
        int matriz[][] = new int [filas][columnas];
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("ingrese el valor de la matriz en la posicion " + f + "x" + c);
                matriz[f][c] = sc.nextInt();
                if (matriz[f][c] % 2 == 0){
                    pares ++;
                }
            }
        }
        for (int f = 0; f < filas; f ++) {
            for (int c = 0; c < columnas; c ++) {
                if ( c == columnas - 1){
                    System.out.println("["+ matriz[c][f] +"]");
                }else {
                    System.out.print("["+ matriz[c][f] +"]");
                }
                System.out.println("los numeros pares en la matriz son en total" + pares);
            }
        }
    }
}
