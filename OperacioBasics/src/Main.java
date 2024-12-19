public class Main {
    public static void main(String[] args) {

        float numero1 = 8f;
        float numero2 = 10f;
        float numero3 = 30f;

        float c = sumarDosNumeros(numero1,numero2);
        float d = dividirDosNumeros(c,numero3);

        System.out.println(d);
    }
    public static float sumarDosNumeros(float a, float b){
        return a + b;
    }
    public static float dividirDosNumeros(float a, float b){
        return a / b;
    }
}