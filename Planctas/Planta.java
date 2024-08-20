package Planctas;

class Planta {

    /*
    Esta línea define una nueva clase llamada Planta. En Java, las clases se utilizan como plantillas para crear objetos. La palabra clave public significa que esta clase es accesible desde cualquier otra clase.
     */

    private String nombre;
    private double altoDelTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    /*
    Estos son los atributos o campos de la clase Planta. Son variables que mantienen el estado de un objeto Planta. La palabra clave private significa que estos atributos solo pueden ser accedidos dentro de la clase Planta.
    nombre: almacena el nombre de la planta.
    altoDelTallo: almacena la altura del tallo de la planta.
    tieneHojas: un valor booleano que indica si la planta tiene hojas o no.
    climaIdeal: almacena el tipo de clima ideal para la planta.
     */

    public Planta(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    /*
    El constructor es un método especial que se llama cuando se crea un nuevo objeto de la clase Planta. El propósito del constructor es inicializar los nuevos objetos. Aquí, el constructor toma cuatro parámetros (nombre, altoDelTallo, tieneHojas, y climaIdeal) y los asigna a los atributos correspondientes de la clase utilizando this.
    this.nombre = nombre;: this es una referencia al objeto actual, y se utiliza para diferenciar entre los atributos del objeto y los parámetros del constructor que tienen el mismo nombre.
     */

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(double altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;

        /*
        Métodos Getters y Setters
        Estos métodos se utilizan para acceder y modificar los atributos privados de la clase. Son parte de la encapsulación en Java, que es un principio fundamental de la programación orientada a objetos.
         */

    }
}

