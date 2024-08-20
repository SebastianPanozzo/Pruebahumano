package Ayudas;

public class Lista_Explicada {
     /*
        #### Creación de Listas
        List<Integer> lista = new ArrayList<>();  // Lista vacía de enteros
List<String> lista2 = new ArrayList<>(Arrays.asList("a", "b", "c"));  // Lista inicializada con elementos
```

- `ArrayList<>`: Crea una lista vacía o inicializa la lista con elementos específicos.
- `Arrays.asList("a", "b", "c")`: Crea una lista a partir de un array de elementos.
// Creamos el Array nombres
String [] nombres = {"Marco","Marisol","Roberto"};

// Mediante Arrays creamos una nueva lista
List<String> listaNombres = Arrays.asList(nombres);

#### Añadir Elementos a la Lista

// Creamos una lista a la cual le pasamos una lista de autos
List <String> elementos = new ArrayList<>(listaAutos);

// A la lista elementos ahora le agregamos la listaNombres
// De esta forma estamos combinando dos listas
elementos.addAll(listaNombres);

```java
lista.add(10);  // Añade 10 al final de la lista
lista.add(1, 20);  // Añade 20 en la posición 1
```

- `lista.add(10)`: Añade un elemento al final de la lista.
- `lista.add(1, 20)`: Inserta un elemento en la posición especificada.

#### Eliminar Elementos de la Lista

```java
lista.remove(1);  // Elimina el elemento en la posición 1
lista.remove(Integer.valueOf(10));  // Elimina el primer elemento que sea igual a 10
```
// Para eliminar todos los elmentos de la lista usamos clear
listaNombres.clear();
- `lista.remove(1)`: Elimina el elemento en la posición especificada.
- `lista.remove(Integer.valueOf(10))`: Elimina el primer elemento que coincida con el valor especificado.

#### Mostrar Elementos de la Lista

```java
for (int elemento : lista) {
    System.out.println(elemento);
}

// Creamos el iterador
ListIterator<String> iterador = listaNombres.listIterator();
// Mediante el ciclo while lo recorremos
while (iterador.hasNext()){
	System.out.println(iterador.next());
}

int segundoNumero = lista.get(1); // Obtiene el número en la segunda posición (índice 1)

System.out.println(lista);  // Imprime toda la lista
```

- Bucle `for-each`: Recorre y muestra cada elemento de la lista.
- `System.out.println(lista)`: Imprime la lista completa.

         */
}
