/*
Orden en la Cola
Para entrar en un sitio hay que coger un ticket con un número y esperar en la cola. Hay gente que se cansa de esperar y abandona la cola. Y hay otros que tratan de colarse…

Cuando a uno le toca entrar y tiene un número mayor del que tocaría, la única forma de saber si realmente se ha colado es ver si de los que van por detrás de él en la cola hay alguien que tiene un número más bajo.

Se desea hacer un programa que diga, por cada persona que hay en la cola, por delante de cuántas personas se han colado.

Input Format
El primer número indica la cantidad de gente que hay en la cola.

A continuación vienen los números de ticket de cada persona.

Constraints
-

Output Format
Se imprimirá (en orden de aparición en la cola) el número de ticket de las personas que se hayan colado, y por delante de cuántas personas se ha colado. Con el siguiente formato:

La persona con el ticket T se ha colado por delante de X personas.
Si no se ha colado nadie se escribirá "COLA EN ORDEN".

Sample Input 1
5
1 4 3 2 5

Sample Output 1
La persona con el ticket 4 se ha colado por delante de 2 personas.
La persona con el ticket 3 se ha colado por delante de 1 personas.
 */



import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();
        int[] tickets = new int[numero];

        for (int i = 0; i < numero; i++) {
            tickets[i] = sc.nextInt();
        }

        boolean colaEnOrden = true;

        for (int i = 0; i < numero; i++) {
            int count = 0;
            for (int j = i + 1; j < numero; j++) {
                if (tickets[j] < tickets[i]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("La persona con el ticket " + tickets[i] + " se ha colado por delante de " + count + " personas.");
                colaEnOrden = false;
            }
        }

        if (colaEnOrden) {
            System.out.println("COLA EN ORDEN");
        }
    }
}
