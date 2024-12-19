import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++){
            for (int j = 0; j < numero; j++){
                if (i>=j){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}