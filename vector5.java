package caco_gutierrez;

public class vector5 {
    public static void main(String[] args) {
        String vector1[] = new String [5];
        int vector2[] = new int[5];
        int vector3[] = new int[5];
        String ciudad1 = "", ciudad2 = "";
        int tempMin = 0,aux, posicion;
        int tempMax = 0, ayud, posicion2;
        vector1 [0] = "a";
        vector1 [1] = "b";
        vector1 [2] = "c";
        vector1 [3] = "d";
        vector1 [4] = "e";

        vector2 [0] = 1;
        vector2 [1] = 2;
        vector2 [2] = 3;
        vector2 [3] = 4;
        vector2 [4] = 5;

        vector3 [0] = 10;
        vector3 [1] = 11;
        vector3 [2] = 12;
        vector3 [3] = 13;
        vector3 [4] = 14;
        aux = 1000;
        ayud = -1000;
        for (int i = 0; i < 5; i ++){
            if (vector2[i] <= aux ){
                tempMin = vector2[i];
                aux = vector2[i];
                ciudad1 = vector1[i];
            }
            if (vector3[i] >= ayud ){
                tempMax = vector3[i];
                ayud = vector3[i];
                ciudad2 = vector1[i];
            }
        }
        System.out.println("la ciudad con la temperatura mas baja es la " + ciudad1 + " con " + tempMin + " grados");
        System.out.println("la ciudad con la temperatura mas alta es la " + ciudad2 + " con " + tempMax + " grados");
    }
}
