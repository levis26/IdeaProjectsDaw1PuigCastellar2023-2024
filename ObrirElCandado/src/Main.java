import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int clave = sc.nextInt();
        sc.nextLine();
        String numeros = sc.nextLine();

        String[] arrayDeNumeros = numeros.split(" ");
        int[] numerosAOperar = new int[arrayDeNumeros.length];

        for (int i = 0; i < arrayDeNumeros.length; i++) numerosAOperar[i] = Integer.parseInt(arrayDeNumeros[i]);

        boolean esIgualQueLaClave = false;

        int i = 0;
        while (numerosAOperar[i] != -1 && numerosAOperar[(i + 1)] != -1 && numerosAOperar[(i + 2)] != -1) {
            if ((numerosAOperar[i] + numerosAOperar[(i + 1)]) * numerosAOperar[(i + 2)] == clave) {
                esIgualQueLaClave = true;
                break;
            }
            i++;
        }
        if (esIgualQueLaClave) System.out.println("true");
        else System.out.println("false");
    }
}