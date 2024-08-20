package caco_gutierrez;

import java.util.Scanner;

public class practica2 {
    public static void main(String[] args){
        System.out.println("ingresa el primer numero");
        int num = 9;
        int n;
        boolean tato = true;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n == num){
            System.out.println(tato);
        }else {
            tato = !tato;
            System.out.println(tato);
        }
    }
}
