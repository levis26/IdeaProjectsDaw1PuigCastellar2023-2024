import java.util.Scanner;

public class Main {

    private static TUI tui;
    private static Joc joc;

    public static void main(String[] args) {
        boolean sortir = false;
        tui = new TUI(); // Inicialización de TUI
        joc = new Joc(); // Inicialización de Joc
        joc.novaPartida(); // Inicialización de la partida
        while (!sortir) {
            int opcio = tui.mostrarMenu();
            switch (opcio) {
                case 1:
                    novaPartida();
                    break;
                case 2:
                    carregarPartida();
                    break;
                case 3:
                    configuracio();
                    break;
                case 4:
                    sortir = true;
                    break;
                default:
                    System.out.println("Opció invàlida.");
            }
        }
    }

    private static void novaPartida() {
        joc.novaPartida();
        boolean partidaAcabada = false;
        while (!partidaAcabada) {
            tui.mostrarTaulell(joc.getTaulell(), joc.getTorn());
            int[] jugada = tui.recollirJugada();
            joc.jugar(jugada[0], jugada[1]);
            if (joc.jugadaGuanyadora(jugada[0], jugada[1])) {
                tui.fiDePartida(joc.getTorn());
                partidaAcabada = true;
            } else if (joc.getTorn() == 9) {
                tui.fiDePartida(-1);
                partidaAcabada = true;
            }
        }
    }

    private static void carregarPartida() {
        // Implementación de la lógica para cargar una partida previamente guardada
        System.out.println("Carregar partida: Funcionalidad no implementada.");
    }

    private static void configuracio() {
        // Implementación de la lógica para la configuración del juego
        System.out.println("Configuració: Funcionalidad no implementada.");
    }
}