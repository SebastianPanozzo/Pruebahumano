package caco_gutierrez;

public class ifySwitch {
    public static void main(String[] args) {
        int n1 = 2, n2 = 5;
        System.out.println("sout =  System.out.println, psvm = ");
        if (n1 < n2) {
            System.out.println("psvm =  public static void main(String[] args) ");
        }
        else{
            System.out.println("jajopa");
        }
        switch (n1){
            case 2 :
                System.out.println("jakopa");
                break;
            default:
                System.out.println("jaa");
                break;

        }
    }
}
