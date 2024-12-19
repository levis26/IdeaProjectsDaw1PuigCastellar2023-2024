import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < numero; i++){
            c = a +b;
            a = b;
            b = c;
        }
        System.out.print(a);
    }
}
