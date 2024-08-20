package caco_gutierrez;

import java.util.Scanner;

public class practica4 {
    public static void main(String[] args){
        System.out.println("hola");
        int cont, cant, indice;
        System.out.println("ingrese la cantidad de numeros primos que desea ver impresos");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        cant = 0;
        indice = 1;
        do{
            cont = 0;
            indice += 1;
            for (int i = 1; i <= indice; i++){
                if (indice % i == 0){
                    cont += 1;
                    if (i == indice && cont == 2){
                        System.out.println(indice);
                        cant += 1;
                    }
                }
            }
        }while(cant < num);
    }
}
