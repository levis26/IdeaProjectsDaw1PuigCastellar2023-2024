import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String[] palabras =sc.nextLine().split(" ");
        for (int i = 0; i < palabras.length; i++){
            String acro = palabras[i].substring(0,1).toUpperCase();
            System.out.print(acro);
        }
    }
}