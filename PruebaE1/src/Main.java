import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "entrada.txt";
        String outputFile = "alternancias.txt";

        File leerFichero = new File(inputFile);
        Scanner sc = new Scanner(leerFichero);

        ArrayList<String> contenido = new ArrayList<>();
        while (sc.hasNextLine()){
            String lines = sc.nextLine();
            contenido.add(lines + "\n");
        }
        sc.close();

        if (contenido.size() < 2) System.out.println("El contenido no tiene dos lineas");

        int numeroAlternancias = Integer.parseInt(contenido.get(0).trim());

        String[] palabrasARepetir = new String[2];

        palabrasARepetir = contenido.get(1).trim().split(" ");

        File fichero = new File(outputFile);
        FileWriter ficheroAGuardar = new FileWriter(fichero);

        int i = 0;
        while(i < numeroAlternancias){
            for (String game:palabrasARepetir){
                ficheroAGuardar.write(game + "\n");
            }
            i++;
        }
        ficheroAGuardar.close();
    }
}