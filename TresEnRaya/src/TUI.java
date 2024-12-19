import java.util.Scanner;
class TUI {

    private Scanner sc;

    public int mostrarMenu() {
        sc = new Scanner(System.in);
        System.out.println("Menú:");
        System.out.println("1. Nova partida");
        System.out.println("2. Carregar partida");
        System.out.println("3. Configuració");
        System.out.println("4. Sortir");
        return sc.nextInt();
    }

    public void mostrarTaulell(char[][] taulell, int torn) {
        System.out.println("Torn del jugador " + (torn % 2 == 0 ? "X" : "O"));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(taulell[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[] recollirJugada() {
        int[] jugada = new int[2];
        sc = new Scanner(System.in);
        System.out.print("Introduce la fila (0-2): ");
        jugada[0] = sc.nextInt();
        System.out.print("Introduce la columna (0-2): ");
        jugada[1] = sc.nextInt();
        return jugada;
    }

    public void fiDePartida(int guanyador) {
        if (guanyador == -1) {
            System.out.println("La partida ha finalitzat en empat.");
        } else {
            System.out.println("El jugador " + ((guanyador % 2 == 0) ? "X" : "O") + " ha guanyat la partida.");
        }
    }
}
