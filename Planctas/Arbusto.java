package Planctas;

class Arbusto extends Planta {
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorDeHojas;
    private boolean sePodaONo;

    public Arbusto(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal,
                   double anchoArbusto, boolean esDomestico, String variedadArbusto, String colorDeHojas,
                   boolean sePodaONo) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }

    public void mostrarMensaje() {
        System.out.println("Hola soy un arbusto");
    }

    // Getters
    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    // Setters
    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
}