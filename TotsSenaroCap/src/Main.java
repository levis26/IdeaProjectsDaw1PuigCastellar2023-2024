import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

       boolean resultat = ((num1%2!=0 && num2%2!=0 && num3%2!=0)||(num1%2==0 && num2%2==0 && num3%2==0))? true:false;
        System.out.println(resultat);
    }
}