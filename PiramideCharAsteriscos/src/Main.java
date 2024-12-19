import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n,m;

        boolean numeroCorrecto = false;
        do {
            System.out.print("Ingrese cantidad Filas (numero impar)");
             n = sc.nextInt();
            System.out.print("Ingrese cantidad columnas (numero impar)");
             m = sc.nextInt();

            if (n%2!=0 && m %2!=0){
                numeroCorrecto = true;
            }else {
                System.out.println("Error. Debe ingresar dos numeros pares");
            }

        }while(!numeroCorrecto);

        char[][] matriz = new char[n][m];
        int mitad = matriz[0].length / 2;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if ((i+j)>= mitad && (j-i) <= mitad){
                    matriz[i][j] = '*';
                }else{
                    matriz[i][j] = ' ';
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}