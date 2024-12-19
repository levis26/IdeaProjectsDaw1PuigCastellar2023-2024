import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int number = sc.nextInt();
        int accumulator = 0;
        for (int i = 1; i <= number; i++) accumulator += i;
        System.out.println(accumulator);
    }
}