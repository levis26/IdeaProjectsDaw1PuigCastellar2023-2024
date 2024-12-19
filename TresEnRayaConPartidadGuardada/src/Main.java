import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[3][3];
        char jugadorActual = 'X';
        boolean juegoIniciado = false;
        boolean juegoTerminado = false;
        char simboloJugador1 = 'X';
        char simboloJugador2 = 'O';

        int opcion;
        boolean partidaGuardada = false;

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
                    if (partidaGuardada) {
                        System.out.println("Se ha cargado una partida guardada. Presiona 'M' para volver al menú.");
                        partidaGuardada = false;
                    } else {
                        tablero = new char[3][3];
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                tablero[i][j] = '-';
                            }
                        }
                        juegoIniciado = true;
                        juegoTerminado = false;
                        imprimirTablero(tablero);
                    }

                    while (!juegoTerminado) {
                        int fila, columna;
                        do {
                            System.out.print("Jugador " + jugadorActual + ", introduce la fila (1-3): ");
                            fila = scanner.nextInt() - 1;
                            System.out.print("Jugador " + jugadorActual + ", introduce la columna (1-3): ");
                            columna = scanner.nextInt() - 1;
                        } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != '-');

                        tablero[fila][columna] = jugadorActual;
                        imprimirTablero(tablero);

                        if (comprobarVictoria(tablero)) {
                            System.out.println("El jugador " + jugadorActual + " ha ganado!");
                            juegoTerminado = true;
                        } else if (tableroLleno(tablero)) {
                            System.out.println("¡El juego ha terminado en empate!");
                            juegoTerminado = true;
                        }

                        jugadorActual = (jugadorActual == simboloJugador1) ? simboloJugador2 : simboloJugador1;

                        System.out.print("Presiona 'S' para guardar la partida, 'M' para volver al menú o cualquier otra tecla para continuar: ");
                        char tecla = scanner.next().toUpperCase().charAt(0);
                        if (tecla == 'S') {
                            try {
                                guardarPartida(tablero);
                                System.out.println("Partida guardada.");
                                partidaGuardada = true;
                            } catch (IOException e) {
                                System.out.println("Error al guardar la partida: " + e.getMessage());
                            }
                        } else if (tecla == 'M') {
                            break;
                        }
                    }
                    break;
                case 2:
                    // Cargar partida
                    if (!juegoIniciado && !partidaGuardada) {
                        System.out.println("Aún no has iniciado un juego. Por favor, selecciona la opción 1 para comenzar una nueva partida.");
                        break;
                    }
                    System.out.println("\nCargar partida:");
                    System.out.println("Tablero guardado:");

                    try {
                        tablero = cargarPartida();
                        imprimirTablero(tablero);
                        partidaGuardada = true;
                        juegoIniciado = true;
                    } catch (IOException e) {
                        System.out.println("Error al cargar la partida: " + e.getMessage());
                    }

                    while (!juegoTerminado) {
                        int fila, columna;
                        do {
                            System.out.print("Jugador " + jugadorActual + ", introduce la fila (1-3): ");
                            fila = scanner.nextInt() - 1;
                            System.out.print("Jugador " + jugadorActual + ", introduce la columna (1-3): ");
                            columna = scanner.nextInt() - 1;
                        } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != '-');

                        tablero[fila][columna] = jugadorActual;
                        imprimirTablero(tablero);

                        if (comprobarVictoria(tablero)) {
                            System.out.println("El jugador " + jugadorActual + " ha ganado!");
                            juegoTerminado = true;
                        } else if (tableroLleno(tablero)) {
                            System.out.println("¡El juego ha terminado en empate!");
                            juegoTerminado = true;
                        }

                        jugadorActual = (jugadorActual == simboloJugador1) ? simboloJugador2 : simboloJugador1;

                        System.out.print("Presiona 'S' para guardar la partida, 'M' para volver al menú o cualquier otra tecla para continuar: ");
                        char tecla = scanner.next().toUpperCase().charAt(0);
                        if (tecla == 'S') {
                            try {
                                guardarPartida(tablero);
                                System.out.println("Partida guardada.");
                                partidaGuardada = true;
                            } catch (IOException e) {
                                System.out.println("Error al guardar la partida: " + e.getMessage());
                            }
                        } else if (tecla == 'M') {
                            break;
                        }
                    }
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
        } while (opcion != 4);

        scanner.close();
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

    public static void guardarPartida(char[][] tablero) throws IOException {
        FileWriter escritor = new FileWriter("partida_guardada.txt");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                escritor.write(tablero[i][j]);
            }
            escritor.write("\n");
        }
        escritor.close();
    }

    public static char[][] cargarPartida() throws IOException {
        char[][] tablero = new char[3][3];
        File archivo = new File("partida_guardada.txt");
        Scanner lector = new Scanner(archivo);

        for (int i = 0; i < 3; i++) {
            String fila = lector.nextLine();
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = fila.charAt(j);
            }
        }

        lector.close();
        return tablero;
    }
}
