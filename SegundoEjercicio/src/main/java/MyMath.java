public class MyMath {
    public static void main(String[] args) {
        System.out.println("Bienvenido a MyMath");

        double result1 = div(10, 2);
        System.out.println("Resultado de div(10, 2): " + result1);

        double result2 = div(30, 3, 2);
        System.out.println("Resultado de div(30, 3, 2): " + result2);
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double div(double a, double b, double c) {
        return a / (b * c);
    }
}
//</editor-fold>
