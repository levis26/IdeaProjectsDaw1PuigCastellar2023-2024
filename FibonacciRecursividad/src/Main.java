import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();
        System.out.println(fibonacci(numero));
    }
    public static int fibonacci(int number){
        if (number == 0) return 0;
        else if (number == 1) return 1;
        else return fibonacci(number-1) + fibonacci(number-2);
    }
}
