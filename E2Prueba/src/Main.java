import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "cuentas.txt";
        String outputFile = "resposta.txt";

        File leerFichero = new File(inputFile);
        Scanner sc = new Scanner(leerFichero);

        ArrayList<String> contenido = new ArrayList<>();
        while (sc.hasNextLine()) {
            String lines = sc.nextLine();
            contenido.add(lines);
        }
        sc.close();

        float total = 0.0f;

        for (String line : contenido) {
            // Dividir la línea en partes usando ":"
            String[] parts = line.split(":");

            // Asegurarse de que la línea tenga tres partes
            if (parts.length == 3) {

                    // Obtener cantidad y precio
                float cantidad = Float.parseFloat(parts[1]);
                float precio = Float.parseFloat(parts[2]);

                    // Multiplicar cantidad por precio y sumar al total
                total += cantidad * precio;

            }
        }

       File ficheroAGUardar = new File(outputFile);
        FileWriter writer = new FileWriter(ficheroAGUardar);
        writer.write(String.valueOf(total));
        writer.close();
    }
}
