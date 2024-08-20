import java.util.Locale;
import java.util.Scanner;

public class operadorTernarioyDoubles {
    public static void main(String[] args) {
        double nota;
        String operadorT = "";
        System.out.println("ingrese su nota promedio");
        Scanner teclado = new Scanner (System.in).useLocale(Locale.US);
        nota = teclado.nextDouble();
        operadorT = nota >=6 ? "aprobado":"desaprobado";
        System.out.println(operadorT);
    }
}
