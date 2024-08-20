package Ayudas;

public class Tipos_Metodos {
    /*
        Métodos Estáticos
Definición: Los métodos estáticos se definen utilizando la palabra clave static.
Acceso: No requieren una instancia de la clase para ser llamados.
Se pueden invocar utilizando el nombre de la clase.
Variables: Pueden acceder y modificar variables estáticas de la clase.
No pueden acceder directamente a variables de instancia (no estáticas) porque estas están asociadas a una instancia específica de la clase.
Modificación de Variables: Pueden modificar variables estáticas.
Ejemplo de método estático:

java
Copiar código
public class Ejemplo {
    private static int contador = 0;

    public static void incrementarContador() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}

public class Main {
    public static void main(String[] args) {
        Ejemplo.incrementarContador();
        System.out.println(Ejemplo.getContador()); // Salida: 1
    }
}
Métodos de Instancia
Definición: Los métodos de instancia no tienen la palabra clave static.
Acceso: Requieren una instancia de la clase para ser llamados.
Variables: Pueden acceder y modificar tanto variables de instancia como variables estáticas de la clase.
Modificación de Variables: Pueden modificar tanto variables de instancia como estáticas.
Ejemplo de método de instancia:

java
Copiar código
public class Ejemplo {
    private int contador = 0;
    private static int contadorEstático = 0;

    public void incrementarContador() {
        contador++;
        contadorEstático++;
    }

    public int getContador() {
        return contador;
    }

    public static int getContadorEstático() {
        return contadorEstático;
    }
}

public class Main {
    public static void main(String[] args) {
        Ejemplo obj1 = new Ejemplo();
        Ejemplo obj2 = new Ejemplo();

        obj1.incrementarContador();
        obj2.incrementarContador();

        System.out.println("obj1 contador: " + obj1.getContador()); // Salida: 1
        System.out.println("obj2 contador: " + obj2.getContador()); // Salida: 1
        System.out.println("Contador estático: " + Ejemplo.getContadorEstático()); // Salida: 2
    }
}
Resumen
Métodos Estáticos: No pueden modificar variables de instancia directamente.
Pueden modificar variables estáticas y trabajar con ellas.
Métodos de Instancia: Pueden modificar tanto variables de instancia como variables estáticas.
En los métodos estáticos, no puedes acceder directamente a las variables de instancia porque no están asociados a ninguna instancia particular de la clase.
Por otro lado, los métodos de instancia, al ser llamados en una instancia específica de la clase, pueden acceder y modificar tanto las variables de instancia como las variables estáticas.
         */
}
