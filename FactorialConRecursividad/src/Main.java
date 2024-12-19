import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();
        System.out.println(fact(numero));
    }
    public static int fact(int n){
        if (n==0) return 1;
        else return n*fact(n-1);
    }
}