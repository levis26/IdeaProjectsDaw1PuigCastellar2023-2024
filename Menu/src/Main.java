import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[3][3];
        char jugadorActual = 'X';
        boolean juegoTerminado = false;
        char simboloJugador1 = 'X';
        char simboloJugador2 = 'O';

        // Inicializar tablero
        inicializarTablero(tablero);

        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Nueva partida");
            System.out.println("2. Cargar partida");
            System.out.println("3. Configuración");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Nueva partida
                    tablero = new char[3][3];
                    inicializarTablero(tablero);
                    jugadorActual = simboloJugador1;
                    juegoTerminado = false;
                    break;
                case 2:
                    // Cargar partida
                    System.out.println("\nCargar partida:");
                    cargarPartida(tablero, scanner);
                    break;
                case 3:
                    // Configuración
                    System.out.println("\nConfiguración:");
                    System.out.println("Selecciona el símbolo del Jugador 1: X o O");
                    char simbolo = scanner.next().charAt(0);
                    if (simbolo == 'X' || simbolo == 'x') {
                        simboloJugador1 = 'X';
                        simboloJugador2 = 'O';
                    } else if (simbolo == 'O' || simbolo == 'o') {
                        simboloJugador1 = 'O';
                        simboloJugador2 = 'X';
                    } else {
                        System.out.println("Símbolo inválido. Se utilizará X por defecto.");
                    }
                    break;
                case 4:
                    // Salir
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            if (!juegoTerminado && opcion != 4) {
                imprimirTablero(tablero);
                int fila, columna;
                do {
                    System.out.print("Jugador " + jugadorActual + ", introduce la fila (1-3): ");
                    fila = scanner.nextInt() - 1;
                    System.out.print("Jugador " + jugadorActual + ", introduce la columna (1-3): ");
                    columna = scanner.nextInt() - 1;
                } while (!hacerJugada(tablero, fila, columna, jugadorActual));

                if (comprobarVictoria(tablero)) {
                    imprimirTablero(tablero);
                    System.out.println("El jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true;
                } else if (tableroLleno(tablero)) {
                    imprimirTablero(tablero);
                    System.out.println("¡El juego ha terminado en empate!");
                    juegoTerminado = true;
                }

                jugadorActual = (jugadorActual == simboloJugador1) ? simboloJugador2 : simboloJugador1;
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public static void imprimirTablero(char[][] tablero) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean hacerJugada(char[][] tablero, int fila, int columna, char jugadorActual) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
            tablero[fila][columna] = jugadorActual;
            return true;
        }
        System.out.println("Movimiento inválido, intenta de nuevo.");
        return false;
    }

    public static boolean comprobarVictoria(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return true;
            }
            if (tablero[0][i] != '-' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
                return true;
            }
        }
        if (tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return true;
        }
        if (tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            return true;
        }
        return false;
    }

    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void cargarPartida(char[][] tablero, Scanner scanner) {
        boolean tableroValido = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce el valor de la casilla (" + (i + 1) + ", " + (j + 1) + "): ");
                char valor = scanner.next().charAt(0);

                if (valor != 'X' && valor != 'O' && valor != '-') {
                    System.out.println("Valor inválido. Se utilizará el tablero por defecto.");
                    tableroValido = false;
                    break;
                }

                tablero[i][j] = valor;
            }
            if (!tableroValido) {
                break;
            }
        }

        if (tableroValido) {
            imprimirTablero(tablero);
        }
    }
}
