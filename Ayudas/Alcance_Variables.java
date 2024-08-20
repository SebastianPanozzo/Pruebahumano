package Ayudas;

public class Alcance_Variables {
    public static void main(String[] args) {
       /*
        El alcance de las variables en Java define dónde y cómo se pueden utilizar las variables en un programa.
        Las variables pueden ser de varios tipos, cada uno con su propio ámbito de visibilidad y vida útil.
        Aquí se explica cada uno de estos tipos de variables y sus características:




### 1. Variables Locales
Las variables locales son declaradas dentro de un método, constructor o bloque.
Solo son accesibles dentro del método, constructor o bloque donde se han declarado.
Estas variables no tienen valores predeterminados, por lo que deben ser inicializadas antes de usarlas.

#### Características:
- **Alcance**: Solo dentro del método, constructor o bloque donde se declaran.
- **Vida Útil**: Desde la declaración hasta la terminación del método, constructor o bloque.
- **Inicialización**: Deben ser inicializadas antes de ser usadas.

#### Ejemplo:
```java
public class Ejemplo {
    public void metodo() {
        int variableLocal = 10; // Declaración de una variable local
        System.out.println(variableLocal); // Acceso dentro del método
    }
}
```




### 2. Variables de Instancia
Las variables de instancia son declaradas dentro de una clase pero fuera de cualquier método, constructor o bloque.
Son variables no estáticas y cada instancia de la clase tiene su propia copia de estas variables.
Estas variables pueden tener valores predeterminados.

#### Características:
- **Alcance**: Accesibles por todos los métodos, constructores y bloques de la clase.
- **Vida Útil**: Desde la creación de la instancia de la clase hasta que la instancia es destruida.
- **Inicialización**: Pueden tener valores predeterminados (por ejemplo, 0 para int, null para objetos).

#### Ejemplo:
```java
public class Ejemplo {
    private int variableDeInstancia; // Declaración de una variable de instancia

    public void metodo() {
        variableDeInstancia = 5; // Acceso y modificación dentro de un método
    }
}
```




### 3. Variables de Clase (Estáticas)
Las variables de clase (o variables estáticas) son declaradas con la palabra clave `static`.
Estas variables son compartidas por todas las instancias de la clase.
Lo que significa que existe solo una copia de la variable, independientemente del número de instancias de la clase.

#### Características:
- **Alcance**: Accesibles por todos los métodos, constructores y bloques de la clase, incluso sin crear una instancia de la clase.
- **Vida Útil**: Desde que la clase se carga hasta que se descarga.
- **Inicialización**: Pueden ser inicializadas en su declaración o en un bloque estático.

#### Ejemplo:
```java
public class Ejemplo {
    private static int variableDeClase; // Declaración de una variable de clase

    public static void metodoEstatico() {
        variableDeClase = 10; // Acceso dentro de un método estático
    }

    public void metodo() {
        variableDeClase = 20; // Acceso dentro de un método de instancia
    }
}

         */

    }
}
