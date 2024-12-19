import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.ENGLISH);
            boolean juegoSigue = true;

            while (juegoSigue) {
                try {
                    System.out.println("Introduce el primer número decimal:");
                    float numeroDecimal1 = sc.nextFloat();

                    System.out.println("Introduce el segundo número decimal:");
                    float numeroDecimal2 = sc.nextFloat();

                    System.out.println("Introduce un operador * o /:");
                    String textoTerminal = sc.next();

                    float resultado = 0f;

                    switch (textoTerminal) {
                        case "*":
                            resultado = numeroDecimal1 * numeroDecimal2;
                            break;
                        case "/":
                            if (numeroDecimal2 == 0) {
                                System.out.println("Error: No se puede dividir por cero.");
                                continue; // Continúa el bucle sin terminar
                            } else {
                                resultado = numeroDecimal1 / numeroDecimal2;
                            }
                            break;
                        default:
                            System.out.println("Operación no válida. Por favor, introduce * o /.");
                            continue; // Continúa el bucle sin terminar
                    }

                    System.out.printf("El resultado es: %.2f%n", resultado);

                    System.out.println("¿Deseas realizar otra operación? (sí/no):");
                    String respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("no")) {
                        juegoSigue = false;
                        System.out.println("Adeu!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un número decimal válido.");
                    sc.next(); // Limpia el buffer del scanner
                }
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
