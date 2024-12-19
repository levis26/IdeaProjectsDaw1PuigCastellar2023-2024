import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String[] fila1 = sc.nextLine().split(" ");
        String[] fila2 = sc.nextLine().split(" ");
        int tercera = sc.nextInt();

        int numeros1 = Integer.parseInt(fila1[tercera]);
        int numeros2 = Integer.parseInt(fila2[tercera]);

        if ((numeros1 + numeros2) % 2 == 0) System.out.println("La suma dels números en la posició " + tercera + " retorna un nombre parell.");
        else System.out.println("La suma dels números en la posició " + tercera + " retorna un nombre senar.");

        int counter = 0;
        for (int i = 0; i < fila1.length; i++) if (Integer.parseInt(fila1[i]) == Integer.parseInt(fila2[i])) counter++;

        if (counter == fila1.length) System.out.println("Tots el números són els mateixos.");
        else System.out.println("Els números no són els mateixos.");
    }
}