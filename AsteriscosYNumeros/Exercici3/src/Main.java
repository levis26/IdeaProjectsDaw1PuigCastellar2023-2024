/*
//Crea un método en JAVA que dibuje un rectángulo formado por asteriscos(*).
//El método debe recibir la base y altura.
//Además, añade un método adicional para que dibuje dicho rectángulo sin relleno.
//Más abajo puedes ver un ejemplo con base 12 y altura 8.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int base = sc.nextInt();
       int altura = sc.nextInt();

       rectanguloConRelleno(base,altura);
        System.out.println();
        rectanguloHueco(base,altura);
    }
    private static void rectanguloConRelleno(int num1, int num2){
        for (int i = 0; i < num2; i++){
            for (int j = 0; j < num1;j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    private static void rectanguloHueco(int num1, int num2){
        for (int i = 0; i < num2; i++){
            for (int j = 0; j < num1;j++) {
                if (i == 0 || j == 0 || i == num2 -1 ||  j == num1 -1){
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}