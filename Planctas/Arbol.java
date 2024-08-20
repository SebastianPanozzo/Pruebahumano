package Planctas;

class Arbol extends Planta {

    /*
    public class Arbol: Declara una clase pública llamada Arbol.
    extends Planta: Indica que Arbol es una subclase de Planta, heredando sus atributos y métodos.
     */

    private String variedad;
    private String tipoDeTronco;
    private double radioDeTronco;
    private String color;
    private String tipoDeHojas;

    /*
    private String variedad: Un atributo de tipo String que almacena la variedad del árbol.
    private String tipoDeTronco: Un atributo de tipo String que almacena el tipo de tronco del árbol.
    private double radioDeTronco: Un atributo de tipo double que almacena el radio del tronco del árbol.
    private String color: Un atributo de tipo String que almacena el color del árbol.
    private String tipoDeHojas: Un atributo de tipo String que almacena el tipo de hojas del árbol.
    Estos atributos son privados, lo que significa que solo son accesibles dentro de la clase Arbol.
     */

    public Arbol(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal,
                 String variedad, String tipoDeTronco, double radioDeTronco, String color, String tipoDeHojas) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDeTronco = radioDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    /*
    public Arbol(...parametros...): Define el constructor de la clase Arbol que recibe múltiples parámetros.
    super(nombre, altoDelTallo, tieneHojas, climaIdeal): Llama al constructor de la clase padre Planta, inicializando los atributos heredados.
    nombre: Nombre del árbol.
    altoDelTallo: Altura del tallo del árbol.
    tieneHojas: Si el árbol tiene hojas o no.
    climaIdeal: Clima ideal para el árbol.
    this.variedad = variedad: Inicializa el atributo variedad con el valor pasado como parámetro.
    this.tipoDeTronco = tipoDeTronco: Inicializa el atributo tipoDeTronco con el valor pasado como parámetro.
    this.radioDeTronco = radioDeTronco: Inicializa el atributo radioDeTronco con el valor pasado como parámetro.
    this.color = color: Inicializa el atributo color con el valor pasado como parámetro.
    this.tipoDeHojas = tipoDeHojas: Inicializa el atributo tipoDeHojas con el valor pasado como parámetro.
     */

    public void mostrarMensaje() {
        System.out.println("Hola soy un árbol");
    }

    /*
    public void mostrarMensaje(): Declara un método público que no devuelve valor (void).
    System.out.println("Hola soy un árbol"): Imprime el mensaje "Hola soy un árbol" en la consola.
    Este método es público, lo que significa que puede ser llamado desde fuera de la clase Arbol.
     */

    // Getters
    public String getVariedad() {
        return variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public double getRadioDeTronco() {
        return radioDeTronco;
    }

    public String getColor() {
        return color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    /*
    Los métodos Getters permiten acceder a los valores de los atributos privados de la clase.
    public String getVariedad(): Devuelve el valor del atributo variedad.
    public String getTipoDeTronco(): Devuelve el valor del atributo tipoDeTronco.
    public double getRadioDeTronco(): Devuelve el valor del atributo radioDeTronco.
    public String getColor(): Devuelve el valor del atributo color.
    public String getTipoDeHojas(): Devuelve el valor del atributo tipoDeHojas.
    */

    // Setters
    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public void setRadioDeTronco(double radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    /*
    Los métodos Setters permiten modificar los valores de los atributos privados de la clase.
    public void setVariedad(String variedad): Establece el valor del atributo variedad.
    public void setTipoDeTronco(String tipoDeTronco): Establece el valor del atributo tipoDeTronco.
    public void setRadioDeTronco(double radioDeTronco): Establece el valor del atributo radioDeTronco.
    public void setColor(String color): Establece el valor del atributo color.
    public void setTipoDeHojas(String tipoDeHojas): Establece el valor del atributo tipoDeHojas.
     */
}