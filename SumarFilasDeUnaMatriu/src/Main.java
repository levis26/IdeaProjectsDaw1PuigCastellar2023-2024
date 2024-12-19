import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int filas = sc.nextInt();
        int columnas = sc.nextInt();

        int[][] matrix = new int[filas][columnas];
        sc.nextLine();

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++) matrix[i][j] = sc.nextInt();
        }

        for (int i = 0; i < filas; i++){
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) sumaFila += matrix[i][j];
            System.out.println(sumaFila);
        }
    }
}