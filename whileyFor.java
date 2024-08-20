import java.util.Scanner;

public class whileyFor {
    public static void main(String[] args) {

        int categoria = 0;
        String operadorTernario = "";
        double sueldo = 0;
        while (categoria < 4){
            System.out.println("ingrese el tipo de categoria de la que desea calcular el sueldo");
            Scanner valora = new Scanner (System.in);
            categoria = valora.nextInt();
            for (int i = 1; i <= categoria; i ++ ) {
                switch(categoria){
                    case 1:
                        sueldo = 15890 + (15890 * 0.10);
                        operadorTernario = sueldo ==1 ? "correcto" : "incorrecto";
                        break;
                    case 2:
                        sueldo = 256930.89;
                        operadorTernario = sueldo ==2 ? "PAPU":"PAPACA";
                        break;
                    case 3:
                        sueldo = 35560.20 - (35560.20 * 0.20);
                        operadorTernario = sueldo ==3 ? "CACA":"CHEHCA";
                        break;
                    default:
                        System.out.println("debe ingresar un numero de categoria valida");
                        break;
                }
                if (categoria > 0 && categoria < 4) {
                    System.out.println("el sueldo de la categoria ingresada es: " + sueldo + "," + operadorTernario);
                }
            }
        }
    }
}
