import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numeroMitad = 0;


        if (numero % 2 == 0){
            numeroMitad = numero/2;
        } else {
            numeroMitad = Math.round(numero/2) + 1;
        }


        for (int i = 0; i < numeroMitad; i++){
            for (int j = 0; j < numeroMitad; j++){
                if (i>=j ){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < numeroMitad+1; i++){
            for (int j = 0; j < numeroMitad+1; j++){
                if (i<=j ){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}