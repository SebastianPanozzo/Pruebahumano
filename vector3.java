package caco_gutierrez;

import java.util.Scanner;

public class vector3 {
    public static void main(String[] args) {
        int vector[] = new int [10];
        int num = 0;
        int nro = 0;
        int cont1 = 0;
        int cont2 = 0;
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < vector.length; i++){
            System.out.println("ingrese un numero:");
            vector[i] = sc.nextInt();
        }
        for (int i = 0; i < vector.length; i ++){
            if (vector[i] % 3 == 0){
                num ++;
            }else {
                nro ++;
            }
        }
        int vistor[] = new int [num];
        int vestor[] = new int [nro];
        for (int i = 0; i < vector.length; i ++){
            if (vector[i] % 3 == 0){
                vestor[cont1] = vector[i];
                cont1 ++;
            }else {
                vistor[cont2] = vector[i];
                cont2 ++;
            }
        }
        for (int i = 0; i < nro; i ++){
            System.out.println("[" + vestor[i] + "]");
        }
        for (int i = 0; i < num; i ++){
            System.out.println("[" + vistor[i] + "]");
        }
    }
}
