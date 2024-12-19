import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       sc.useLocale(Locale.ENGLISH);
       int[] numeros = new int[sc.nextInt()];
       for (int i = 0; i< numeros.length; i++) numeros[i]= sc.nextInt();
       for (int i = numeros.length -1; i >=0; i--) System.out.print(numeros[i] + " ");
    }
}