import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + "!");
    }
}