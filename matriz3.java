package caco_gutierrez;

import java.util.Locale;
import java.util.Scanner;

public class matriz3 {
    public static void main(String[] args) {
        double matrix[][] = new double [4][4];
        double nota = 0;
        Scanner teclado = new Scanner (System.in).useLocale(Locale.US);
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese la nota del alumno");
                matrix[f][c] = teclado.nextDouble();
            }
        }
        for (int f = 0; f < 4; f ++) {
            for (int c = 0; c < 3; c ++) {
                nota = nota + matrix[f][c];
                if (c == 2){
                    nota = nota/3;
                    System.out.println("la nota promedio del alumno es:"+ nota);
                    matrix[f][3] = nota;
                    nota = 0;
                }
            }
        }
        for (int f = 0; f < 4; f ++) {
            for (int c = 0; c < 4; c ++) {
                System.out.println("matriz (" + matrix[f][c] + ")");
            }
        }
    }
}
