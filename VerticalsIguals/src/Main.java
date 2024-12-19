import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean columnaIgual = false;

        for (int j = 0; j < M; j++) {
            boolean todosIguales = true;
            for (int i = 1; i < N; i++) {
                if (matriz[i][j] != matriz[i - 1][j]) {
                    todosIguales = false;
                    break;
                }
            }
            if (todosIguales) {
                columnaIgual = true;
                System.out.println("La columna " + j + " té tots els números iguals.");
                break;
            }
        }

        if (!columnaIgual) {
            System.out.println("No hi ha cap columna amb els números iguals.");
        }
    }
}
