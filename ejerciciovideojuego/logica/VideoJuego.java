package ejerciciovideojuego.logica;

public class VideoJuego {
    private int codigo;
    private String titulo;
    private String consola;
    private int cantJugadores;
    private String categoria;

    /*
    Paquete: package ejerciciovideojuego.logica; - Esto organiza la clase dentro del paquete ejerciciovideojuego.logica.
    Clase: public class ejerciciovideojuego.logica.VideoJuego - Declara una clase pública llamada ejerciciovideojuego.logica.VideoJuego.
    Atributos Privados
    Estos atributos son los datos que definen un videojuego.
    codigo: un entero que identifica el videojuego.
    titulo: una cadena que representa el título del videojuego.
    consola: una cadena que indica en qué consola se puede jugar el videojuego.
    cantJugadores: un entero que indica la cantidad de jugadores que pueden jugar el videojuego.
    categoria: una cadena que representa la categoría del videojuego (por ejemplo, "Plataforma", "Estrategia").
     */

    public VideoJuego() {
    }

    public VideoJuego(int codigo, String titulo, String consola, int cantJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
    }

    /*
    Constructor sin parámetros: public ejerciciovideojuego.logica.VideoJuego() {} - Crea un objeto ejerciciovideojuego.logica.VideoJuego con valores predeterminados (nulos o cero).
    Constructor con parámetros: public ejerciciovideojuego.logica.VideoJuego(int codigo, String titulo, String consola, int cantJugadores, String categoria) - Crea un objeto ejerciciovideojuego.logica.VideoJuego inicializando los atributos con los valores proporcionados.
     */

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /*
    Getters: Permiten obtener el valor de un atributo.
    public int getCodigo()
    public String getTitulo()
    public String getConsola()
    public int getCantJugadores()
    String getCategoria()
    Setters: Permiten modificar el valor de un atributo.
    public void setCodigo(int codigo)
    public void setTitulo(String titulo)
    public void setConsola(String consola)
    public void setCantJugadores(int cantJugadores)
    public void setCategoria(String categoria)

     */

    @Override
    public String toString() {
        return "ejerciciovideojuego.logica.VideoJuego{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cantJugadores='" + cantJugadores + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    /*
    Método toString: Sobrescribe el método toString de la clase Object para proporcionar una representación en texto del objeto ejerciciovideojuego.logica.VideoJuego.
     */
}
