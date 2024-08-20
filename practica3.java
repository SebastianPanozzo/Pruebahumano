package caco_gutierrez;

import java.util.Locale;
import java.util.Scanner;

public class practica3 {
    public static void main(String[] args){
        double aux, cont;
        System.out.println();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("ingrese el primer numero");
        Double n1 = sc.nextDouble();
        System.out.println("ingrese el segundo numero");
        Double n2 = sc.nextDouble();
        System.out.println("ingrese el tercer numero");
        Double n3 = sc.nextDouble();
        System.out.println("ingrese el cuarto numero");
        Double n4 = sc.nextDouble();
        do{
            System.out.println("ingrese el contador");
            cont = sc.nextDouble();
            if (n1 < n2){
                aux = n2;
                n2 = n1;
                n1 = aux;
            }
            if ( n2 < n3 ){
                aux = n3;
                n3 = n2;
                n2 = aux;
            }
            if ( n3 < n4 ){
                aux = n4;
                n4 = n3;
                n3 = aux;
            }
        }while (n1 < n2 && n2 < n3 && n3 < n4 || cont != 0);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
