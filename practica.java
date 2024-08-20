package caco_gutierrez;

import java.util.Locale;
import java.util.Scanner;

public class practica {
    public static void main(String[] args){
        boolean vOf = true;
        String nombre;
        float num;

        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para la entrada del usuario

        // Leer el nombre
        System.out.println("Ingrese el nombre:");
        nombre = scanner.next(); // Utilizamos el mismo objeto Scanner

        System.out.println(nombre); // Mostramos el nombre ingresado

        // Leer el valor de verdad
        System.out.println("Ingrese el valor de verdad (true o false):");
        vOf = scanner.nextBoolean(); // Utilizamos el mismo objeto Scanner

        System.out.println(vOf); // Mostramos el valor de verdad ingresado

        // Leer el número
        System.out.println("Ingrese el número:");
        Scanner scann = new Scanner(System.in).useLocale(Locale.US);
        num = scann.nextFloat(); // Utilizamos el mismo objeto Scanner
        System.out.println(num); // Mostramos el número ingresado

        scanner.close(); // Cerramos el objeto Scanner
    }
}