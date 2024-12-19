import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();

        deleteRutaFolder(ruta);
       //createFiles();

    }
    public static void deleteRutaFolder(String targetFolderName) {
        File rootDirectory = new File(".");  // Comienza desde el directorio actual
        deleteFolderRecursively(rootDirectory, targetFolderName);
    }

    private static boolean deleteFolderRecursively(File currentDir, String targetFolderName) {
        if (currentDir.isDirectory()) {
            for (File file : currentDir.listFiles()) {
                if (file.isDirectory()) {
                    if (file.getName().equals(targetFolderName)) {
                        encontrarFilesEnFolder(file);
                        file.delete();
                        return true;
                    } else {
                        boolean found = deleteFolderRecursively(file, targetFolderName);
                        if (found) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static void encontrarFilesEnFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    encontrarFilesEnFolder(file);
                }
                file.delete();
            }
        }
    }


    public static void createFiles() throws IOException {
        // Crear archivos en el directorio folder11
        String[] fileNames1 = {"file11", "folder12", "file13"};
        String directory1 = "folder11";
        createDirectoryAndFiles(directory1, fileNames1);

        // Crear archivos en el directorio folder22
        String[] fileNames2 = {"file21", "folder12", "file13"};
        String directory2 = "folder22";
        createDirectoryAndFiles(directory2, fileNames2);

        // Crear archivos en el directorio folder32 dentro de folder22
        String[] fileNames3 = {"file31", "folder32", "file33"};
        String directory3 = directory2 + "/folder32";  // Directorio folder32 dentro de folder22
        createDirectoryAndFiles(directory3, fileNames3);
    }

    private static void createDirectoryAndFiles(String directory, String[] fileNames) throws IOException {
        File folder = new File(directory);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        for (String fileName : fileNames) {
            File file = new File(directory + "/" + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        }
    }
}