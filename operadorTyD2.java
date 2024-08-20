import java.util.Locale;
import java.util.Scanner;

public class operadorTyD2 {
    public static void main(String[] args) {
        double nota;
        String operadorT = "";
        System.out.println("ingrese su nota promedio");
        Scanner teclado = new Scanner (System.in).useLocale(Locale.US);
        nota = teclado.nextDouble();
        operadorT = nota >=6 ? "aprobado":"desaprobado";
        System.out.println(operadorT);
        double notas;
        String operador = "";
        System.out.println("ingrese su nota promedio");
        Scanner teclad = new Scanner (System.in).useLocale(Locale.US);
        notas = teclad.nextDouble();
        operador = notas >=6 ? "aprobado":"desaprobado";
        System.out.println(operador);
    }
}
