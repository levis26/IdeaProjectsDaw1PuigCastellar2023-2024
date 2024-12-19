import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();
        System.out.println(factorial(BigInteger.valueOf(numero)));

    }
    public static BigInteger factorial(BigInteger f){
        if (f.compareTo(BigInteger.ZERO) == 0 || f.compareTo(BigInteger.ONE) ==0) return BigInteger.ONE;
        else return f.multiply(factorial(f.subtract(BigInteger.ONE)));
    }
}