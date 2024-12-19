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

        int eDerecha = energia;
        int eIzquierda = energia;
        int pasosDerecha = 0;
        int pasosIzquierda = 0;
        int energiaAcumuladaDerecha = 0;
        int energiaAcumuladaIzquierda = 0;

        //derecha
        for (int j = numeros.length-1; j >= 0; j--){
            pasosDerecha++;
            int unitatsEnergiaDerecha;
            if (numeros[j] != -1){
                unitatsEnergiaDerecha = (numeros[j] != 0)? 2 : 0;
                energiaAcumuladaDerecha += unitatsEnergiaDerecha * numeros[j];
                eDerecha = energia - energiaAcumuladaDerecha;
            }
            if (numeros[j] == -1){
                System.out.println("Pel cantó dret, s'arriba al tresor en " + pasosDerecha + " passos consumint " + energiaAcumuladaDerecha + " unitats d'energia.");
                break;
            }
            if (numeros[j] >= 4){
                System.out.println("Pel cantó dret, no es pot arribar al tresor perquè hi ha un forat massa gran.");
                break;
            }
            if (eDerecha <= 0){
                System.out.println("Pel cantó dret, no es pot arribar al tresor perquè s'acaba l'energia.");
                break;
            }
        }
        //izquierda
        for (int i = 0; i < numeros.length; i++){
            pasosIzquierda++;
            int unitatsEnergiaIzquierda;
            if (numeros[i] != -1 ){
                unitatsEnergiaIzquierda = (numeros[i] != 0)? 2 : 0;
                energiaAcumuladaIzquierda += unitatsEnergiaIzquierda * numeros[i];
                eIzquierda = energia - energiaAcumuladaIzquierda;
            }
            if (numeros[i] == -1){
                System.out.println("Pel cantó esquerra, s'arriba al tresor en " + pasosIzquierda + " passos consumint " + energiaAcumuladaIzquierda + " unitats d'energia.");
                return;
            }
            if (numeros[i] >= 4){
                System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè hi ha un forat massa gran.");
                return;
            }
            if (eIzquierda <= 0) {
                System.out.println("Pel cantó esquerra, no es pot arribar al tresor perquè s'acaba l'energia.");
                return;
            }
        }
    }
}