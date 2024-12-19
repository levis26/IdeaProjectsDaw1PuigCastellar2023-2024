import java.util.Locale;
import java.util.Scanner;

class Paella{
    private int comensals;
    private float preuKiloArros;
    private float preuKiloGambes;

    public Paella(int comensals, float preuKiloArros, float preuKiloGambes) {
        this.comensals = comensals;
        this.preuKiloArros = preuKiloArros;
        this.preuKiloGambes = preuKiloGambes;
    }

    public String calcularInfo(){
        float kiloArros = this.comensals * 0.5f/4;
        float kiloGambes = this.comensals * 0.5f/4;

        float preuArros = this.preuKiloArros * kiloArros;
        float preuGambes = this.preuKiloArros * kiloGambes;

        String info = kiloArros + " kg arros\n" +
                kiloGambes + " kg gambes\n" +
                preuArros + " euros arros\n" +
                preuGambes + " euros gambes\n" +
                "TOTAL: " + (preuArros + preuGambes) + " euros";
        return info;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int comensals = sc.nextInt();
        float preuKiloArros = sc.nextFloat();
        float preuKiloGambes = sc.nextFloat();

        Paella p = new Paella(comensals, preuKiloArros, preuKiloGambes);
        String informe = p.calcularInfo();

        System.out.println(informe);
    }
}