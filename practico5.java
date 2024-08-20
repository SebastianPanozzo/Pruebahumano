package caco_gutierrez;

import java.util.Scanner;

public class practico5 {
    public static void main(String[] args){
        char inicial;
        System.out.println("ingrese el su letra inicial");
        Scanner sc = new Scanner(System.in);
        char ini = sc.next().charAt(0);
        switch (ini){
            case 'a' :
                inicial = 'a';
                System.out.println(inicial);
                break;
            case 'b' :
                inicial = 'b';
                System.out.println(inicial);
                break;
            default:
                inicial = 'c';
                System.out.println(inicial);
                break;

        }
    }
}
