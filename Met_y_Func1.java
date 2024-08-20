import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Met_y_Func1 {

    public static void main(String[] args) {
        queuePrint();
    }

    public static void queuePrint() {
        Queue<String> jobPrints = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el comando 'enqueue' para agregar un archivo a la cola de impresión");
        System.out.println("Ingresa el comando 'print' para empezar a imprimir un documento de la cola");
        System.out.println("Ingresa el comando 'print-all' para imprimir todos los documentos de la cola");
        System.out.println("Ingresa el comando 'show' para mostrar todos los documentos en la cola");
        System.out.println("*".repeat(20));

        while (true) {
            System.out.print("Ingresa tu comando: ");
            String command = sc.next();

            switch (command) {
                case "show":
                    System.out.println("-".repeat(30));
                    System.out.println(String.format("Documentos en cola (%d)", jobPrints.size()));
                    for (String doc : jobPrints) {
                        System.out.println("-> " + doc);
                    }
                    break;

                case "enqueue":
                    System.out.println("-".repeat(30));
                    System.out.print("Ingresa el nombre del documento a encolar: ");
                    String docName = sc.next();
                    jobPrints.add(docName);
                    break;

                case "print":
                    System.out.println("-".repeat(30));
                    if (jobPrints.isEmpty()) {
                        System.out.println("No hay nada para imprimir");
                        break;
                    }
                    System.out.println("Imprimiendo -> " + jobPrints.poll());
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case "print-all":
                    System.out.println("-".repeat(30));
                    System.out.println("Imprimiendo todos los documentos de la cola");
                    while (!jobPrints.isEmpty()) {
                        System.out.println("Imprimiendo -> " + jobPrints.poll());
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace(System.out);
                        }
                    }
                    break;

                case "exit":
                    System.out.println("Apagando impresora");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("!".repeat(30));
                    System.out.println("Comando no reconocido");
                    break;
            }
        }
    }
}
