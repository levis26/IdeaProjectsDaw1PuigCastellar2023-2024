import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int numero = sc.nextInt();
        sc.nextLine();
        String[] paraulas = sc.nextLine().split(" ");

        String paraula = "";
        String elementoCero = paraulas[0];

        for (int i = 0; i < numero; i++){
            if (elementoCero.length() > paraulas[i].length()){
                paraula = elementoCero;
            }else{
                paraula = paraulas[i];
            }
        }
        System.out.println(paraula);
        int tamanoParaula = sc.nextInt();

      // for (int i = 0; i < numero; i++) System.out.println(paraulas[i]);


    }
}