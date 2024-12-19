import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        int[] fila1 = new int[0];
        int[] fila2 = new int[0];

        int suma = 0;
        for (int i= 0 ; i < fila1.length ; i++){

            fila1[i] +=sc.nextInt();
            fila2[i] +=sc.nextInt();
        }

        int posicion = sc.nextInt();
        for (int i = 0; i < posicion; i++){
            if (fila1[i] == fila2[i]){
                suma = fila1[i] + fila2[i];
            }
        }

        if (suma % == 0){
            System.out.println("La suma dels números en la posició X retorna un nombre parell.");
        }else {

            System.out.println("La suma dels números en la posició X retorna un nombre senar.");
        }



    }