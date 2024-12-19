import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float alturaVehicle = sc.nextFloat();
        int numeroPonts = sc.nextInt();
        sc.nextLine();

        String alturasPuentesLinea = sc.nextLine();
        String[] alturasPuentes = alturasPuentesLinea.split("\\s+");

        float[] valoresPuentes = new float[numeroPonts];

        for (int i = 0; i < alturasPuentes.length; i++) {
            valoresPuentes[i] = Float.parseFloat(alturasPuentes[i]);
        }

        boolean xocaAmbPont = false;

        for (int i = 0; i < numeroPonts; i++) {
            if (alturaVehicle > valoresPuentes[i]) {
                xocaAmbPont = true;
                String resposta = "xoca amb el pont " + (i + 1);
                System.out.println(resposta);
                break;
            }
        }
    }
}
