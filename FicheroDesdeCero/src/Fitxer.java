import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Fitxer {
    public void createFile(String folderPath, String fileName, String content) throws IOException {
        File fol = new File(folderPath);
        if (!fol.exists()){
            fol.mkdirs();
            System.out.println("Directorio:  " + "\"" + fol.getPath() + "\"" + " creado correctamente.");
        }else {
            System.out.println("Error al crear directorio.");
        }

        File fichero = new File(folderPath + "/" + fileName);

        if (!fichero.exists()){
            FileWriter writer = new FileWriter(fichero);
            writer.write(content);
            writer.close();
            System.out.println("Archivo: " + "\"" + fichero.getName() + "\"" + " creado correctamente.");
        }else {
            System.out.println("Error al crear fichero.");
        }


    }
    
    public String readFile(String relPath) throws FileNotFoundException {
        File folder1 = new File(relPath);
        Scanner sc = new Scanner(folder1);
        String lines = "";
        if (sc.hasNextLine()){
            System.out.println("Contenido del archivo: ");
            while(sc.hasNextLine()){
                lines = sc.nextLine();
                System.out.println(lines);
            }

            System.out.println("Archivo: " + "\"" + folder1.getName() + "\"" + ", leido correctamente.");
        }else {
            System.out.println("Error al leer el archivo");
        }
        sc.close();
        return lines.toString();
    }

    public void deleteFile(String relPath){
        File ficheroABorrar = new File(relPath);
            if (ficheroABorrar.delete()){
                System.out.println("Archivo: " + "\"" + ficheroABorrar.getName() + "\"" + ", borrado correctamente.");
            }else {
                System.out.println("Error al borrar archivo");
            }
    }

    public void deleteDirectory(String relPath){
        File folder = new File(relPath);
        if (folder.isDirectory()){
            if (folder.delete()){
                System.out.println("Directorio: " + "\"" + folder.getPath() + "\"" + ", borrado correctamente.");
            }else {
                System.out.println("Error al borrar directorio.");
            }
        }else {
            System.out.println("No hay directorio.");
        }
    }

}
