import java.util.Locale;
import java.util.Scanner;

public class Main {
                                                                                {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int option;
       do {
           System.out.println("Menu\n1. Nova partida\n2. Carregar partida\n3. Configuració\n4. Sortir");
           option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Aquesta es una nova partida");
                break;
            case 2:
                System.out.println("Aquesta es tu partida estalviada.");
                break;
            case 3:
                System.out.println("Aqui pots fer la configuració.");
                break;
            case 4:
                System.out.println("Adeu!");
                break;
            default:
                System.out.println("Aquesta no es una opció.");
        }

       }while(option != 4);
    }
}