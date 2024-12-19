import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "cantidad_palabras.txt";
        String outputFilePath = "palabras_repetidas.txt";

        File inputFile = new File(inputFilePath);
        Scanner sc = new Scanner(inputFile);

            // Leer el archivo de entrada línea por línea y guardarlas en un ArrayList

            ArrayList<String> lines = new ArrayList<>();
            while (sc.hasNextLine()){
                lines.add(sc.nextLine());
            }

            if (lines.size() < 2) {
                System.out.println("El archivo debe contener al menos dos líneas.");
                return;
            }

            // La primera línea contiene el número de repeticiones
            int numRepeticiones = Integer.parseInt(lines.get(0).trim());

            // La segunda línea contiene el texto a repetir
            String texto = lines.get(1);

            // Crear y escribir en el archivo de salida
            FileWriter writer = new FileWriter(new File(outputFilePath));

            for (int i = 0; i < numRepeticiones; i++) {
                writer.write(texto + "\n");
            }

            writer.close();
            System.out.println("El archivo " + outputFilePath + " ha sido creado correctamente.");


    }
}
