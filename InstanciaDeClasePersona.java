public class InstanciaDeClasePersona {
    public static void main(String[] args) {
        // Crear instancias de la clase Persona
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona();

        // Invocar métodos en las instancias
        persona1.mostrarInfo(); // Output: Nombre: Juan, Edad: 30
        persona2.mostrarInfo(); // Output: Nombre: Ana, Edad: 25

        System.out.println("id persona1 = " + persona1.getNombre());
        persona2.setEdad(40);
        persona2.setNombre("jolypacha");
        System.out.println("id persona2 = " + persona2.getNombre());
        //sobreescritura
        persona2.setNombre("joly");
        System.out.println("id persona2 = " + persona2.getNombre());
    }
}
