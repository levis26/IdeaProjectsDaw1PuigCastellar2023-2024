import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) factorial *= i;
        System.out.println(factorial);
    }
}