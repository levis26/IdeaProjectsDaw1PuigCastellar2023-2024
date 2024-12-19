import java.util.Locale;
import java.util.Scanner;

public class Main {

    static int longitud;
    static int energia;
    static int[] numeros;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        longitud = sc.nextInt();
        energia = sc.nextInt();
        numeros = new int[longitud];
        for (int i = 0; i < longitud; i++) numeros[i] = sc.nextInt();

        buscarTesoro(0, 0, 0, 0, energia);
    }

    static void buscarTesoro(int pos, int pasos, int energiaUsada, int energiaAcumulada, int energiaRestante) {
        if (pos >= longitud || energiaRestante <= 0) {
            System.out.println("Pel cantó " + (energiaRestante <= 0 ? "esquerra" : "dret") + ", no es pot arribar al tresor perquè " + (energiaRestante <= 0 ? "s'acaba l'energia." : "s'arriba al final del camí en " + pasos + " passos consumint " + energiaUsada + " unitats d'energia."));
            return;
        }

        if (numeros[pos] == -1) {
            System.out.println("Pel cantó " + (energiaRestante <= 0 ? "esquerra" : "dret") + ", s'arriba al tresor en " + pasos + " passos consumint " + energiaUsada + " unitats d'energia.");
            return;
        }

        if (numeros[pos] >= 4) {
            System.out.println("Pel cantó " + (energiaRestante <= 0 ? "esquerra" : "dret") + ", no es pot arribar al tresor perquè hi ha un forat massa gran.");
            return;
        }

        int energiaAcumuladaNueva = energiaAcumulada + ((numeros[pos] < 4 && numeros[pos] != -1) ? 2 : 0);
        int energiaUsadaNueva = energiaAcumuladaNueva * numeros[pos];
        int energiaRestanteNueva = energia - energiaUsadaNueva;

        buscarTesoro(pos + 1, pasos + 1, energiaUsadaNueva, energiaAcumuladaNueva, energiaRestanteNueva);
    }
}
