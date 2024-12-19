import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cantidad = sc.nextInt();
        String nLibros[] = new String[cantidad];
        int[] vlibros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) nLibros[i] = sc.next();
        for (int c = 0; c < cantidad; c++) vlibros[c] = sc.nextInt();
        int menor = vlibros[0];
        for (int i = 1; i < vlibros.length; i++) if (vlibros[i] < menor) menor = vlibros[i];

        System.out.println("el llistat de llibres que menys tenim són: ");
        for (int l = 0; l < nLibros.length; l++) {
            String elementoNlibros = nLibros[l];
            int elementoLibrosC = vlibros[l];
            if (vlibros[l] == menor) System.out.println(elementoNlibros + " " + elementoLibrosC);
        }
    }
}