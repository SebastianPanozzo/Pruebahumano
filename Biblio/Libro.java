package Biblio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Libro {
    private String nombre;
    private String autor;
    private String isbn;

    // Constructor
    public Libro(String nombre, String autor, String isbn) {
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Autor: " + autor + ", ISBN: " + isbn;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
