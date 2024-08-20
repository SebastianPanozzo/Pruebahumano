package Planctas;

class Main {
    public static void main(String[] args) {
        // Creación de objetos de las clases Arbol, Flor, y Arbusto
        Arbol arbol = new Arbol("Roble", 5.5, true, "Templado", "Quercus", "Grueso", 1.2, "Marrón", "Largas");
        Flor flor = new Flor("Rosa", 0.5, true, "Mediterráneo", "Rojo", 30, "Amarillo", "Rojo", "Rosa", "Primavera");
        Arbusto arbusto = new Arbusto("Boj", 1.0, true, "Templado", 0.8, true, "Buxus", "Verde", true);

        // Llamada a los métodos mostrarMensaje
        arbol.mostrarMensaje();
        flor.mostrarMensaje();
        arbusto.mostrarMensaje();

        // Accediendo a los atributos usando getters
        System.out.println("Árbol: " + arbol.getNombre() + ", Variedad: " + arbol.getVariedad());
        System.out.println("Flor: " + flor.getNombre() + ", Color de los Pétalos: " + flor.getColorDePetalos());
        System.out.println("Arbusto: " + arbusto.getNombre() + ", Ancho del Arbusto: " + arbusto.getAnchoArbusto());

        // Ejemplo de modificación de atributos usando setters
        arbol.setColor("Verde Oscuro");
        flor.setColorDePetalos("Blanco");
        arbusto.setAnchoArbusto(1.2);

        // Mostrando los cambios realizados
        System.out.println("Árbol modificado: " + arbol.getNombre() + ", Color: " + arbol.getColor());
        System.out.println("Flor modificada: " + flor.getNombre() + ", Color de los Pétalos: " + flor.getColorDePetalos());
        System.out.println("Arbusto modificado: " + arbusto.getNombre() + ", Ancho del Arbusto: " + arbusto.getAnchoArbusto());
    }
}