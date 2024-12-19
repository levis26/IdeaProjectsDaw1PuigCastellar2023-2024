import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println(evaluate(sc.nextLine()));
    }
    private static int evaluate(String exp) {
        int operatorSum = exp.lastIndexOf('+');
        int operatorMultip = exp.lastIndexOf('*');

        if (exp.indexOf('*') == -1 && exp.indexOf('+') == -1) return Integer.parseInt(exp);
        else if (operatorSum >= 0) {
            String left = exp.substring(0, operatorSum);
            String right = exp.substring(operatorSum + 1);
            return evaluate(left) + evaluate(right);
        } else {
            String left = exp.substring(0, operatorMultip);
            String right = exp.substring(operatorMultip + 1);
            return evaluate(left) * evaluate(right);
        }
    }
}
