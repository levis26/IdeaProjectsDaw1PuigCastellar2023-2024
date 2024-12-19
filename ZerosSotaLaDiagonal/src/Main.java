import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean todosCerosBajoDiagonal = true;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != 0) {
                    todosCerosBajoDiagonal = false;
                    break;
                }
            }
            if (!todosCerosBajoDiagonal) {
                break;
            }
        }

        if (todosCerosBajoDiagonal) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
