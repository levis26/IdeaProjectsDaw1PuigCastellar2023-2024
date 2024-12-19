import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) numeros[i] = sc.nextInt();


        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < cantidad; i++) {
            // Si el número actual es igual al siguiente, salta a la siguiente iteración
            if (i < cantidad - 1 && numeros[i] == numeros[i + 1]) {
                continue;
            }
            System.out.print(numeros[i] + " ");
        }
    }
}
