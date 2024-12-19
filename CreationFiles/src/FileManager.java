import java.io.*;
import java.util.Scanner;

public class FileManager {

    private static final String FILE_PATH = "example.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Crear archivo");
            System.out.println("2. Escribir en el archivo");
            System.out.println("3. Leer archivo");
            System.out.println("4. Añadir texto al archivo");
            System.out.println("5. Eliminar archivo");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    createFile();
                    break;
                case 2:
                    System.out.print("Introduce el texto a escribir en el archivo: ");
                    String writeContent = scanner.nextLine();
                    writeFile(writeContent);
                    break;
                case 3:
                    readFile();
                    break;
                case 4:
                    System.out.print("Introduce el texto a añadir al archivo: ");
                    String appendContent = scanner.nextLine();
                    appendToFile(appendContent);
                    break;
                case 5:
                    deleteFile();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 6.");
            }
        }

        scanner.close();
    }

    public static void createFile() {
        File file = new File(FILE_PATH);
        try {
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.err.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }

    public static void writeFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            writer.write(content);
            System.out.println("Texto escrito en el archivo correctamente.");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

    public static String readFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void appendToFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(content);
            System.out.println("Texto añadido al archivo correctamente.");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al añadir texto al archivo.");
            e.printStackTrace();
        }
    }

    public static void deleteFile() {
        File file = new File(FILE_PATH);
        if (file.delete()) {
            System.out.println("Archivo eliminado: " + file.getName());
        } else {
            System.err.println("Error al eliminar el archivo.");
        }
    }
}
