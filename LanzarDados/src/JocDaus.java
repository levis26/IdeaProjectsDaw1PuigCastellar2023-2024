public class JocDaus {
    private Daus[] daus;
    private int partidesJugades;
    private int partidesGuanyades;

    public JocDaus() {
        this.daus = new Daus[3];
        for (int i = 0; i < daus.length; i++) {
            daus[i] = new Daus();
        }
        this.partidesJugades = 0;
        this.partidesGuanyades = 0;
    }

    public int getPartidesJugades() {
        return partidesJugades;
    }

    public int getPartidesGuanyades() {
        return partidesGuanyades;
    }

    public int getPartidesPerdudes() {
        return partidesJugades - partidesGuanyades;
    }

    public void jugar() {
        System.out.println("Tirant els daus...");
        for (int i = 0; i < daus.length; i++) {
            daus[i].tirar();
            System.out.println("Dau " + (i + 1) + ": " + daus[i].getValor());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        partidesJugades++;

        if (daus[0].equals(daus[1]) && daus[1].equals(daus[2])) {
            partidesGuanyades++;
            System.out.println("Has guanyat aquesta partida!");
        } else {
            System.out.println("No has guanyat aquesta partida. Torna a intentar-ho!");
        }
    }
}
