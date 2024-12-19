import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        boolean PoS = sc.nextBoolean();

        for (int i = 1; i <= N/2; i++) {
            for (int j = 1; j <= N/2; j++) {
                if(PoS == true && matrix[i][j]%2 ==0 ){

                    System.out.println("true");
                    return;
                }else {
                    System.out.println("false");
                    return;
                }


            }
        }

        for (int i = 1; i <= N/2; i++) {
            for (int j = 1; j <= N/2; j++) {
                if (PoS == false && matrix[i][j]%2 !=0 ){
                    System.out.println("true");
                    return;
                }else {
                    System.out.println("false");
                    return;
                }
            }
        }





    }
}