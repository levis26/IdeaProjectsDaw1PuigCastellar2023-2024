import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n = sc.nextInt();
        sc.nextLine();
        String[][] matrix = new String[n][n];

        for (int i = 0; i < n; i++){
            String[] subCadenas = sc.nextLine().split(" ");
            for(int j = 0; j < n; j++){
                matrix[i][j]= subCadenas[j];
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>=0 && x<n && y>=0 && y<n){
            boolean ispalindrome = true;
            int left = 0;
            int right = matrix[x][y].length()-1;
            while (left<right){
                if (matrix[x][y].charAt(left)!=matrix[x][y].charAt(right)){
                    ispalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            System.out.println(ispalindrome);
        }
    }
}