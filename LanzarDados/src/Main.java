import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JocDaus jocDaus = new JocDaus();
        boolean sortir = false;

        while (!sortir) {
            System.out.println("\nMenú principal:");
            System.out.println("1. Jugar als Daus");
            System.out.println("2. Jugar al Parxís");
            System.out.println("3. Jugar al Tic Tac Toe");
            System.out.println("4. Sortir");
            System.out.print("Indica una opció: ");

            int opcio = scanner.nextInt();

            switch (opcio) {
                case 1:
                    boolean tornarMenu = false;
                    while (!tornarMenu) {
                        System.out.println("\nSubmenú:");
                        System.out.println("1. Tirar els daus");
                        System.out.println("2. Tornar al menú principal");
                        System.out.print("Indica una opció: ");

                        int subOpcio = scanner.nextInt();

                        switch (subOpcio) {
                            case 1:
                                jocDaus.jugar();
                                break;
                            case 2:
                                tornarMenu = true;
                                break;
                            default:
                                System.out.println("Opció no vàlida. Torna a intentar-ho.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("El joc del Parxís encara no està implementat.");
                    break;

                case 3:
                    System.out.println("El joc del Tic Tac Toe encara no està implementat.");
                    break;

                case 4:
                    sortir = true;
                    System.out.println("\nFinalitzant l'aplicació...");
                    System.out.println("Estadístiques de Joc dels Daus:");
                    System.out.println("Partides jugades: " + jocDaus.getPartidesJugades());
                    System.out.println("Partides guanyades: " + jocDaus.getPartidesGuanyades());
                    System.out.println("Partides perdudes: " + jocDaus.getPartidesPerdudes());
                    break;

                default:
                    System.out.println("Opció no vàlida. Torna a intentar-ho.");
            }
        }
        scanner.close();
    }
}
