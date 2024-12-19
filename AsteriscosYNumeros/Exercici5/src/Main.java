/*
Crea un método en JAVA que dibuje pirámide creciente formada por asteriscos(*).
El método debe recibir la altura del triángulo.
Además, añade un método adicional para que dibuje dicha pirámide sin relleno.
Más abajo puedes ver un ejemplo de pirámide con altura 10.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();

        piramideConRelleno(altura);
        System.out.println();
        piramideHueco(altura);
    }
    private static void piramideConRelleno(int altura){
        for (int i = 0; i < altura ; i++){
            for (int j = 0; j < 2 * altura -1 ; j++) {
                if (i + j >= altura - 1 && j <= altura-1 + i ) System.out.print("*  ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    private static void piramideHueco(int altura){
        for (int i = 0; i < altura ; i++){
            for (int j = 0; j < 2 * altura -1 ; j++) {
                if (i + j == altura - 1  || j == altura-1 + i || i == altura - 1 ) System.out.print("*  ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}