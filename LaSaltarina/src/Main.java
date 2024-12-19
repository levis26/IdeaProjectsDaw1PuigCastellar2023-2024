import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int longitud = sc.nextInt();
        int energia = sc.nextInt();
        int[] numeros = new int[longitud];

        for (int i = 0; i < longitud; i++) numeros[i] = sc.nextInt();

        int passosDreta = 0;
        int passosEsquerra = 0;
        int unitatsEnergiaDreta = 0;
        int unitatsEnergiaEsquerra = 0;
        int energiaResultantDreta = energia;
        int energiaResultantEsquerra = energia;

        // Per a la porta dreta.
        int j = (longitud - 1);
        while (j >= 0 && energiaResultantDreta > 0 && energia <= 100) {
            int energiaAcumulatDreta = 0;
            passosDreta++;
            energiaAcumulatDreta += (numeros[j] < 4 && numeros[j] != -1) ? 2 : 0;
            unitatsEnergiaDreta += energiaAcumulatDreta * numeros[j];
            energiaResultantDreta = energia - unitatsEnergiaDreta;
            if (numeros[j] == -1) {
                System.out.println("Pel cantó dret, s'arriba al tresor en " + passosDreta + " passos consumint " + unitatsEnergiaDreta + " unitats d'energia.");
                break;
            } else if (numeros[j] >= 4) {
                System.out.println("Pel cantó dret, no es pot arribar al tresor perquè hi ha un forat massa gran.");
                break;
            }
            if (energiaResultantDreta <= 0) System.out.println("Pel cantó dret, no es pot arribar al tresor perquè s'acaba l'energia.");
            j--;
        }

        // Per a la porta esquerra;
        int k = 0;
        while (k < longitud && energiaResultantEsquerra > 0 && energia <= 100) {
            int energiaAcumulatEsquerra = 0;
            passosEsquerra++;
            energiaAcumulatEsquerra += (numeros[k] < 4 && numeros[k] != -1) ? 2 : 0;
            unitatsEnergiaEsquerra += energiaAcumulatEsquerra * numeros[k];
            energiaResultantEsquerra = energia - unitatsEnergiaEsquerra;
            if (numeros[k] == -1) {
                System.out.println("Pel cantó esquerra, s'arriba al tresor en " + passosEsquerra + " passos consumint " + unitatsEnergiaEsquerra + " unitats d'energia.");
                break;
            } else if (numeros[k] >= 4) {
                System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè hi ha un forat massa gran.");
                break;
            }
            if (energiaResultantEsquerra <= 0) System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè s'acaba l'energia.");
            k++;
        }
    }
}
