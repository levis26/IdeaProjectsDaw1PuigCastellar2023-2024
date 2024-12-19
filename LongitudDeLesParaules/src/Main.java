import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        sc.nextLine();
        String[] paraules = sc.nextLine().split(" ");
        int l = sc.nextInt();

        String max = paraules[0];
        String min = paraules[0];
        String pl = null;

        for (String p:paraules){
            if (p.length() > max.length()) max = p;
            if (p.length() < min.length()) min = p;
            if (p.length() == l) pl = p;
        }

        System.out.println("La paraula més llarga és: " + max + " ( " + max.length() + " lletres).");
        System.out.println("La paraula més curta és: " + min + " ( " + min.length() + " lletres).");
        System.out.println(pl==null? "No s'ha trobat cap paraula de longitud " + l + ".":"La paraula de longitud " + l + " que s'ha trobat és: " + pl);

    }
}
