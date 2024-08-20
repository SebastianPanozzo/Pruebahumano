package Ayudas;

public class Clases_Interfaces_Anotaciones {
    /*
        import java.util.*; =

Clases: Son las unidades básicas de la programación orientada a objetos en Java.
Una clase es un "molde" que define las propiedades (atributos) y comportamientos (métodos) comunes a todos los objetos de un cierto tipo.

AbstractCollection: Clase base abstracta para implementar la interfaz Collection, proporcionando una implementación parcial.

AbstractList: Clase base abstracta para implementar la interfaz List, proporcionando una implementación parcial.

AbstractMap: Clase base abstracta para implementar la interfaz Map, proporcionando una implementación parcial.

AbstractQueue: Clase base abstracta para implementar la interfaz Queue, proporcionando una implementación parcial.

AbstractSequentialList: Clase base abstracta para listas secuenciales, útil para listas enlazadas.

AbstractSet: Clase base abstracta para implementar la interfaz Set, proporcionando una implementación parcial.

ArrayDeque: Implementación de una deque (doble cola) basada en matrices.

ArrayList: Lista redimensionable basada en una matriz, permite acceso rápido por índice.

Arrays: Contiene métodos estáticos para manipular arrays (como ordenación y búsqueda).

Base64: Proporciona métodos para codificar y decodificar datos utilizando la codificación Base64.

BitSet: Implementación de un conjunto de bits que puede crecer según sea necesario.

Calendar: Clase abstracta para la manipulación de fechas y horas en diferentes formatos de calendario.

Collections: Contiene métodos estáticos que operan en o devuelven colecciones, como ordenación y sincronización.

Currency: Representa una moneda específica, incluyendo su símbolo y número de dígitos fraccionarios.

Date: Representa una fecha y hora específicas (obsoleta, use java.time en su lugar).

Dictionary: Clase abstracta que representa un almacén de pares clave-valor (obsoleta, use Map).

DoubleSummaryStatistics: Muestra estadísticas como el recuento, suma, mínimo, máximo y promedio para valores double.

EnumMap: Mapa especializado para claves de tipo enum.

EnumSet: Conjunto especializado para elementos de tipo enum.

EventListenerProxy: Proporciona una implementación base de un proxy de EventListener.

EventObject: Clase base para todos los objetos de evento.

FormattableFlags: Proporciona constantes para los indicadores utilizados en la formateo Formattable.

Formatter: Formatea cadenas de texto de manera similar a la función printf de C.

GregorianCalendar: Implementación concreta de un calendario, extendiendo Calendar para el calendario gregoriano.

HashMap: Implementación de la interfaz Map basada en una tabla hash.

HashSet: Implementación de la interfaz Set basada en una tabla hash.

Hashtable: Implementación de la interfaz Map sincronizada basada en una tabla hash (obsoleta, use ConcurrentHashMap).

IdentityHashMap: Implementación de Map basada en una tabla hash que utiliza la identidad de las claves en lugar del método equals.

IntSummaryStatistics: Muestra estadísticas como el recuento, suma, mínimo, máximo y promedio para valores int.

LinkedHashMap: Extensión de HashMap que mantiene el orden de inserción de los elementos.

LinkedHashSet: Extensión de HashSet que mantiene el orden de inserción de los elementos.

LinkedList: Implementación de la interfaz List como una lista doblemente enlazada.

ListResourceBundle: Implementación de ResourceBundle que carga los recursos de un arreglo de objetos.

Locale: Representa una región geográfica o cultural específica para la internacionalización.

LongSummaryStatistics: Muestra estadísticas como el recuento, suma, mínimo, máximo y promedio para valores long.

Objects: Contiene métodos estáticos útiles para operar en objetos (como comprobación de null y comparación).

Observable: Clase base para la implementación del patrón Observer (obsoleta, use java.beans).

Optional: Contenedor para un valor que puede estar presente o no, evitando el uso de null.

OptionalDouble: Contenedor para un valor double que puede estar presente o no.

OptionalInt: Contenedor para un valor int que puede estar presente o no.

OptionalLong: Contenedor para un valor long que puede estar presente o no.

PriorityQueue: Implementación de una cola de prioridad basada en un heap.

Properties: Subclase de Hashtable que representa una lista de pares clave-valor persistentes.

PropertyPermission: Representa permisos para leer y escribir propiedades del sistema.

PropertyResourceBundle: Implementación de ResourceBundle que carga los recursos de un archivo de propiedades.

Random: Generador de números aleatorios.

ResourceBundle: Clase base para carga de recursos localizados.

Scanner: Utilidad para analizar primitivas y cadenas utilizando expresiones regulares.

ServiceLoader: Carga implementaciones de servicios.

SimpleTimeZone: Subclase de TimeZone que representa una zona horaria con reglas de cambio fijo.

Spliterators: Contiene varias implementaciones de la interfaz Spliterator.

Stack: Implementación de una pila basada en una lista vectorial (obsoleta, use Deque).

StringJoiner: Ayuda a construir cadenas de caracteres separados por un delimitador.

StringTokenizer: Desglosa una cadena en tokens (obsoleta, use String.split o Scanner).

Timer: Planificador para tareas que se ejecutan periódicamente o tras un retraso.

TimerTask: Representa una tarea que puede ser programada por un Timer.

TimeZone: Representa una zona horaria y maneja las conversiones entre tiempos locales y UTC.

TreeMap: Implementación de la interfaz Map basada en un árbol rojo-negro.

TreeSet: Implementación de la interfaz Set basada en un árbol rojo-negro.

UUID: Representa un identificador único universal (UUID).

Vector: Implementación de una lista vectorial sincronizada (obsoleta, use ArrayList).

WeakHashMap: Implementación de Map con claves que son débilmente referenciadas.




Interfaces:Definen un contrato que otras clases pueden implementar.
Una interfaz especifica un conjunto de métodos que una clase debe implementar, sin proporcionar la implementación de estos métodos.

Collection: Grupo de objetos conocido como elementos, es la raíz de la jerarquía de colecciones.

Comparator: Permite definir un orden alternativo para objetos.

Deque: Extensión de la interfaz Queue para soportar una cola de doble extremo.

Enumeration: Iterador para acceder a los elementos de una colección (obsoleta, use Iterator).

EventListener: Interfaz base para todos los escuchadores de eventos.

Formattable: Implementado por clases que se pueden formatear usando Formatter.

Iterator: Permite recorrer una colección, proporcionando métodos para comprobar elementos restantes y acceder al siguiente elemento.

List: Colección ordenada que puede contener elementos duplicados.

ListIterator: Extensión de Iterator que permite recorrer una lista en ambas direcciones.

Map: Mapa que asigna claves a valores, no puede contener claves duplicadas.

Map.Entry: Representa un par clave-valor en un Map.

NavigableMap: Extensión de SortedMap para la navegación en orden de clave.

NavigableSet: Extensión de SortedSet para la navegación en orden de elemento.

Observer: Implementado por clases que desean ser notificadas de cambios en objetos observables (obsoleta, use java.beans).

Queue: Colección diseñada para mantener elementos antes de procesarlos, típicamente en orden FIFO.

RandomAccess: Marcador para listas que admiten acceso rápido por índice.

Set: Colección que no permite elementos duplicados.

SortedMap: Mapa que mantiene sus claves en orden ascendente.

SortedSet: Conjunto que mantiene sus elementos en orden ascendente.

Spliterator: Iterador diseñado para la división de trabajo en paralelo.




Anotaciones:Proporcionan un modo de agregar metadatos al código.
Las anotaciones pueden ser utilizadas por el compilador o en tiempo de ejecución para realizar ciertas acciones o comprobaciones.

@Generated: Indica que un elemento del código fuente fue generado por una herramienta.
         */
}
