package caco_gutierrez;

import java.util.Scanner;

public class cadena {
    public static void main(String[] args) {
        String palabra = "";
        Scanner scan= new Scanner (System.in);
        do{
            System.out.println("ingrese la clave");
            palabra = scan.nextLine();
        }while (!palabra.equalsIgnoreCase ("salir"));
        System.out.println("se ingreso la clave correcta (salir)");
    }
}
