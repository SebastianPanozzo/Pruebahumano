package Planctas;

class Flor extends Planta {
    private String colorDePetalos;
    private int cantidadPromedioDePetalos;
    private String colorDelPistilo;
    private String colorDeLosPetalos;
    private String variedadDeFlor;
    private String estacionQueFlorece;

    public Flor(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal,
                String colorDePetalos, int cantidadPromedioDePetalos, String colorDelPistilo,
                String colorDeLosPetalos, String variedadDeFlor, String estacionQueFlorece) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
        this.colorDelPistilo = colorDelPistilo;
        this.colorDeLosPetalos = colorDeLosPetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public void mostrarMensaje() {
        System.out.println("Hola soy una flor");
    }

    // Getters
    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public int getCantidadPromedioDePetalos() {
        return cantidadPromedioDePetalos;
    }

    public String getColorDelPistilo() {
        return colorDelPistilo;
    }

    public String getColorDeLosPetalos() {
        return colorDeLosPetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    // Setters
    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public void setCantidadPromedioDePetalos(int cantidadPromedioDePetalos) {
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
    }

    public void setColorDelPistilo(String colorDelPistilo) {
        this.colorDelPistilo = colorDelPistilo;
    }

    public void setColorDeLosPetalos(String colorDeLosPetalos) {
        this.colorDeLosPetalos = colorDeLosPetalos;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }
}