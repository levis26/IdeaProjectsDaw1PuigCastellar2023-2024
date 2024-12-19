import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cantidadNumeros = sc.nextInt();

        int[] array = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            array[i] = sc.nextInt();
        }
        int contador = -1;
        int ultimo = array[cantidadNumeros - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ultimo) {
                contador++;
            }

        }
        System.out.println(contador);
    }
}