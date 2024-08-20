package Ayudas;

public class Metodos_Elementos {
     /*
La estructura de un metodo esta compuesta por un modificador de acceso, un modificador, un tipo de dato, un nombre y los parametros de dicho metodo



Modificadores de Acceso:
Los modificadores de acceso en Java determinan la visibilidad de clases, métodos y atributos.
Es decir, controlan desde qué otras clases o paquetes se puede acceder a ellos. Los modificadores de acceso principales son:

public:
Visibilidad: El miembro (clase, método o atributo) es accesible desde cualquier otra clase.

protected:
Visibilidad: El miembro es accesible dentro del mismo paquete y por las subclases, incluso si están en paquetes diferentes.

default (sin especificar):
Visibilidad: El miembro es accesible solo dentro del mismo paquete.

private:
Visibilidad: El miembro es accesible solo dentro de la misma clase.



Modificadores:
Los modificadores en Java alteran el comportamiento de clases, métodos y atributos.
Añaden características especiales que afectan cómo se utilizan o se comportan estos miembros. Los modificadores principales son:

static:
Comportamiento: El miembro pertenece a la clase en lugar de a instancias específicas de la clase.
Se puede acceder sin crear una instancia de la clase.

final:
Comportamiento:
Atributo: El valor no puede cambiar después de la inicialización.
Método: No puede ser sobrescrito por subclases.
Clase: No puede ser heredada.

abstract:
Comportamiento:
Método: No tiene implementación y debe ser sobrescrito por subclases.
Clase: No puede ser instanciada y puede contener métodos abstractos.

synchronized:
Comportamiento: El método solo puede ser accedido por un hilo a la vez, lo que es útil en la programación concurrente.

volatile:
Comportamiento: La variable puede ser cambiada inesperadamente por diferentes hilos, y garantiza que el valor más reciente esté siempre visible a todos los hilos.

transient:
Comportamiento: El atributo no se serializa cuando el objeto se convierte en una secuencia de bytes.

native:
Comportamiento: El método está implementado en otro lenguaje de programación, típicamente C o C++.



posibles combinaciones de modificadores de acceso con modificadores:
public static
public final
public abstract (solo en clases abstractas)
public synchronized
public native

protected static
protected final
protected abstract (solo en clases abstractas)
protected synchronized
protected native

default static
default final
default abstract (solo en clases abstractas)
default synchronized
default native

private static
private final
private synchronized
private native

Nota: No es posible combinar public con static, protected con static, private con static, o default con static en el contexto de las clases.
La palabra clave static no aplica a las clases de nivel superior en Java (excepto las clases anidadas estáticas).



Clases: Son las unidades básicas de la programación orientada a objetos en Java.
Una clase es un "molde" que define las propiedades (atributos) y comportamientos (métodos) comunes a todos los objetos de un cierto tipo.
Atributos: Variables que representan el estado de un objeto.
Métodos: Funciones que definen el comportamiento de un objeto.
Constructores: Métodos especiales que se usan para crear e inicializar objetos.

         */
}
