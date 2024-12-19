import java.util.Locale;
import java.util.Scanner;

public class matrixsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        String[][] matrix = new String[n][n];
        for (int x = 0; x < n; x++){
            for (int y = 0; y < n; y++){
                matrix[x][y] = sc.next();
            }
        }
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();

        for (int x = 0; x < n; x++){
            for (int y = 0; y < n; y++){
                if (sub2 >= matrix[x][y].length()){
                    System.out.print("<ERROR> ");
                }
                else{
                    System.out.print(matrix[x][y].substring(sub1, sub2) + " ");
                }
            }
            System.out.println();
        }
    }
}