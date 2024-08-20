public class juego_vida {
    private int filas;
    private int columnas;
    private boolean[][] tablero;

    public juego_vida(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.tablero = new boolean[filas][columnas];
        // Inicializar el tablero con células vivas aleatorias
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = Math.random() < 0.5;
            }
        }
    }

    public void evolucionar() {
        boolean[][] nuevoTablero = new boolean[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int vecinosVivos = contarVecinosVivos(i, j);
                if (tablero[i][j]) {
                    nuevoTablero[i][j] = (vecinosVivos == 2 || vecinosVivos == 3);
                } else {
                    nuevoTablero[i][j] = (vecinosVivos == 3);
                }
            }
        }
        tablero = nuevoTablero;
    }

    private int contarVecinosVivos(int fila, int columna) {
        int count = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i >= 0 && i < filas && j >= 0 && j < columnas && !(i == fila && j == columna)) {
                    if (tablero[i][j]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void imprimirTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] ? "O " : ". ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;
        juego_vida juego = new juego_vida(filas, columnas);
        for (int generacion = 0; generacion < 30; generacion++) {
            System.out.println("Generación " + generacion + ":");
            juego.imprimirTablero();
            System.out.println();
            juego.evolucionar();
        }
    }
}
