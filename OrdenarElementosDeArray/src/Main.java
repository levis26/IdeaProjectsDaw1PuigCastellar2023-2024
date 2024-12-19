import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.println("Ingrese los números (ingresar -1 para terminar):");
        while(true) {
            int numero = sc.nextInt();
            if (numero == -1) break;

            if (numeros.contains(numero)) System.out.println("El número " + numero + " ya está estaba en la lista.");
                else numeros.add(numero);
        }
        Collections.sort(numeros);
        for (int n : numeros) System.out.print( n + " ");
    }
}
