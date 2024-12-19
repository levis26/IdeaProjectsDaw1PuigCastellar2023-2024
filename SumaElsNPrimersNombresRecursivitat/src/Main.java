import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int number = sc.nextInt();
        System.out.println(accumulator(number));
    }
    public static int accumulator(int adder){
        if (adder == 1) return 1;
        else return adder + accumulator(adder-1);
    }
}