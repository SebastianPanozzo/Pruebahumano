package Biblio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private Scanner scanner;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Método para mostrar el menú
    public void mostrarMenu() {
        while (true) {
            System.out.println("BIBLIOTECA - MENÚ DE OPCIONES");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Listar libros");
            System.out.println("5. Ordenar libros alfabéticamente");
            System.out.println("6. Editar libro indicando índice");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    buscarLibro();
                    break;
                case 3:
                    eliminarLibro();
                    break;
                case 4:
                    listarLibros();
                    break;
                case 5:
                    ordenarLibros();
                    break;
                case 6:
                    editarLibro();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Método para agregar un libro
    public void agregarLibro() {
        System.out.print("Nombre del libro: ");
        String nombre = scanner.nextLine();
        System.out.print("Autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("ISBN del libro: ");
        String isbn = scanner.nextLine();
        libros.add(new Libro(nombre, autor, isbn));
        System.out.println("Biblio.Libro agregado.");
    }

    // Método para buscar un libro
    public void buscarLibro() {
        System.out.print("Nombre del libro a buscar: ");
        String nombre = scanner.nextLine();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Biblio.Libro encontrado en la posición: " + i);
                System.out.println(libros.get(i));
                return;
            }
        }
        System.out.println("Biblio.Libro no encontrado.");
    }

    // Método para eliminar un libro
    public void eliminarLibro() {
        System.out.print("Nombre del libro a eliminar: ");
        String nombre = scanner.nextLine();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                libros.remove(i);
                System.out.println("Biblio.Libro eliminado.");
                return;
            }
        }
        System.out.println("Biblio.Libro no encontrado.");
    }

    // Método para listar todos los libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    // Método para ordenar los libros alfabéticamente
    public void ordenarLibros() {
        Collections.sort(libros, (a, b) -> a.getNombre().compareToIgnoreCase(b.getNombre()));
        System.out.println("Libros ordenados alfabéticamente.");
    }

    // Método para editar un libro
    public void editarLibro() {
        listarLibros();
        System.out.print("Ingrese el índice del libro a editar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (indice >= 0 && indice < libros.size()) {
            System.out.print("Nuevo nombre del libro: ");
            String nuevoNombre = scanner.nextLine();
            libros.get(indice).setNombre(nuevoNombre);
            System.out.println("Biblio.Libro editado.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    // Método main
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.mostrarMenu();
    }
}