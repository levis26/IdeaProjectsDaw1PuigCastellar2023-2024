/*
Crea un método en JAVA que dibuje un triángulo rectángulo creciente formado por asteriscos(*).
El método debe recibir la altura del triángulo.
Además, añade un método adicional para que dibuje dicho triángulo sin relleno.
Más abajo puedes ver un ejemplo con altura 10.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cateto = sc.nextInt();


        trainguloConRelleno(cateto);
        System.out.println();
        trianguloHueco(cateto);
    }
    private static void trainguloConRelleno(int cateto){
        for (int i = 0; i < cateto; i++){
            for (int j = 0; j < cateto;j++) {
                if (j <= i){
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
    private static void trianguloHueco(int cateto){
        for (int i = 0; i < cateto; i++){
            for (int j = 0; j < cateto;j++) {
                if (i == cateto - 1 || j == 0 || i ==  j){
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}