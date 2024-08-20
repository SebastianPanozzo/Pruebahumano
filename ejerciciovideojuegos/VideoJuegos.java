package ejerciciovideojuegos;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

/*
Paquete: package ejerciciovideojuegos; - Indica que esta clase pertenece al paquete ejerciciovideojuegos.
Importaciones:
import ejerciciovideojuego.logica.VideoJuego; - Importa la clase VideoJuego del paquete ejerciciovideojuego.logica para poder utilizarla.
import java.util.ArrayList; y import java.util.List; - Importan las clases ArrayList y List de la biblioteca estándar de Java para trabajar con listas.
*/

public class VideoJuegos {
    public static void main(String[] args) {
        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();

        /*
        Lista de Videojuegos: List<VideoJuego> listaVideoJuegos - Declara una lista para almacenar objetos VideoJuego.
        Inicialización: new ArrayList<VideoJuego>(); - Crea una nueva instancia de ArrayList que almacenará los objetos VideoJuego.
         */

        VideoJuego video1 = new VideoJuego(123, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
        VideoJuego video2 = new VideoJuego(456, "Mario Party 3", "Nintendo 64", 4, "Plataforma");
        VideoJuego video3 = new VideoJuego(789, "Age of Empire II", "PC", 2, "Estrategia");
        VideoJuego video4 = new VideoJuego(101, "Counter Strike 1.6", "PC", 1, "Shooter");
        VideoJuego video5 = new VideoJuego(100, "Mario Kart 64", "Nintendo 64", 2, "Plataforma");

        /*
        Creación: Cada línea crea una nueva instancia de VideoJuego con los valores específicos para cada atributo (código, título, consola, cantidad de jugadores, categoría).
         */

        listaVideoJuegos.add(video1);
        listaVideoJuegos.add(video2);
        listaVideoJuegos.add(video3);
        listaVideoJuegos.add(video4);
        listaVideoJuegos.add(video5);

        /*
        Adición: Los objetos VideoJuego creados se añaden a la lista listaVideoJuegos utilizando el método add.
         */

        //Punto 3 - recorrido
        for (VideoJuego video : listaVideoJuegos) {
            System.out.println("Título: " + video.getTitulo() +
                    " Consola: " + video.getConsola() +
                    " Cant Jugadores: " + video.getCantJugadores());
        }

        /*
        Recorrido: Utiliza un bucle for-each para iterar sobre cada objeto VideoJuego en listaVideoJuegos.
        Visualización: Imprime el título, consola y cantidad de jugadores de cada videojuego.
         */

        //Punto 4 - cambio de nombre y jugadores
        video1.setTitulo("Banjo Kazooie II");
        video1.setCantJugadores(1);

        video5.setTitulo("Super Mario Kart 64");
        video5.setCantJugadores(4);

        /*
        Modificación: Cambia el título y la cantidad de jugadores de video1 y video5 utilizando los métodos setTitulo y setCantJugadores.
         */

        //Punto 5
        for (VideoJuego video : listaVideoJuegos) {
            if (video.getConsola().equals("Nintendo 64")) {
                System.out.println(video.toString());
            }
        }

        /*
        Filtrado: Utiliza un bucle for-each para iterar sobre cada objeto VideoJuego en listaVideoJuegos.
        Condición: Verifica si la consola del videojuego es "Nintendo 64".
        Visualización: Imprime los detalles del videojuego utilizando el método toString.
         */

    }
}
