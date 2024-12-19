import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int filas = sc.nextInt();
        int columnas = sc.nextInt();

        int[][] matrix = new int[filas][columnas];

        for (int i = 0; i < filas; i++) for (int j = 0; j < columnas; j++) matrix[i][j] = sc.nextInt();

        int countOnes = 0;
        int countZeros = 0;
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                if (matrix[i][j] == 1)countOnes++;
                else if (matrix[i][j] == 0) countZeros++;
            }
        }
        System.out.println(countZeros + " " + countOnes);
    }
}