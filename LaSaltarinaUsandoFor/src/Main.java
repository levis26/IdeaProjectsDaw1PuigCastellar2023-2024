import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int longitud = sc.nextInt();
        int energia = sc.nextInt();
        int[] numeros = new int[longitud];
        for (int i = 0; i < longitud; i++) numeros[i]= sc.nextInt();

        int passosDreta = 0;
        int passosEsquerra = 0;
        int unitatatsEnergiaDreta = 0;
        int unitatatsEnergiaEsquerra = 0;
        int energiaResultantDreta = energia;
        int energiaResultantEsquerra = energia;

        //Per la dreta
        for (int j = longitud-1; j>=0; j--){
            int energiaDretaAcumulat = 0;
            passosDreta++;
            energiaDretaAcumulat += (numeros[j]<4 && numeros[j] != -1)?2:0;
            unitatatsEnergiaDreta += energiaDretaAcumulat * numeros[j];
            energiaResultantDreta = energia - unitatatsEnergiaDreta;
            if (numeros[j] == -1){
                System.out.println("Pel cantó dret, s'arriba al tresor en "+ passosDreta + " passos consumint " + unitatatsEnergiaDreta + " unitats d'energia.");
                break;
            }if (numeros[j] >= 4) {
                System.out.println("Pel cantó dret, no es pot arribar al tresor perquè hi ha un forat massa gran.");
                break;
            }if (energiaResultantDreta <= 0) {
                System.out.println("Pel cantó dret, no es pot arribar al tresor perquè s'acaba l'energia.");
                break;
            }
        }
        //Per la esquerra
        for (int k = 0; k < longitud; k++){
            int energiaEsquerraAcumulat = 0;
            passosEsquerra++;
            energiaEsquerraAcumulat += (numeros[k]<4 && numeros[k] != -1)?2:0;
            unitatatsEnergiaEsquerra += energiaEsquerraAcumulat * numeros[k];
            energiaResultantEsquerra = energia - unitatatsEnergiaEsquerra;
            if (numeros[k] == -1){
                System.out.println("Pel cantó esquerra, s'arriba al tresor en "+ passosEsquerra + " passos consumint " + unitatatsEnergiaEsquerra + " unitats d'energia.");
                break;
            }if (numeros[k] >= 4) {
                System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè hi ha un forat massa gran.");
                break;
            }if (energiaResultantEsquerra <= 0){
                System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè s'acaba l'energia.");
                break;
            }
        }
    }
}