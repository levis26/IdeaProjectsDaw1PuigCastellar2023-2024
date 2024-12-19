import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String[] fila1 = sc.nextLine().split(" ");
        String[] fila2 = sc.nextLine().split(" ");
        int posicion = sc.nextInt();
        sc.nextLine();

        char letraFila1 = fila1[posicion].charAt(0);
        char letraFila2 = fila2[posicion].charAt(0);

        if (letraFila1 == letraFila2) System.out.println("La paraula a la posició " + posicion + " comença per la mateixa lletra a les dues línies.");
        else System.out.println("La paraula a la posició " + posicion + " comença per lletres diferents a les dues línies.");

        boolean sonIguales = true;
        for (int i = 0; i < fila1.length; i++) {
            if (!compararCadenas(fila1[i], fila2[i])) {
                sonIguales = false;
                break;
            }
        }

        if (sonIguales) System.out.println("Totes les paraules són les mateixes.");
        else System.out.println("Les paraules no són les mateixes.");
    }
    public static boolean compararCadenas(String cadena1, String cadena2) {
        if (cadena1.length() != cadena2.length()) return false;
        for (int i = 0; i < cadena1.length(); i++) if (cadena1.charAt(i) != cadena2.charAt(i)) return false;
        return true;
    }
}
