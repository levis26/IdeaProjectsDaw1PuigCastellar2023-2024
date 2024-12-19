import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();
        BigInteger facto = BigInteger.valueOf(numero);
        if (numero == 0 || numero == 1) facto = BigInteger.ONE;
        for (int i = 1; i < numero; i++) facto = facto.multiply(BigInteger.valueOf(i));
        System.out.println(facto);
    }
}