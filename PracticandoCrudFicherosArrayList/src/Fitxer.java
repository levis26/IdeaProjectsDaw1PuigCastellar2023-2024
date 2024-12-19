import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Fitxer {
    public void createFile(String folderPath, String fileName, ArrayList<String>content){
        try{
            File folder = new File(folderPath);
            if (!folder.exists()){
                folder.mkdirs();
            }

            File file = new File(folderPath + "/" + fileName);
            FileWriter fileWriter = new FileWriter(file);
            for (String line: content){
                fileWriter.write(line + System.lineSeparator());
            }
            fileWriter.close();
            System.out.println("Archivo creado satisfactoriamente.");
        }catch(IOException e){
            System.out.println("Error al crear fichero.");
        }
    }

    public ArrayList<String> readFile(String relPath){
        ArrayList<String> content = new ArrayList<>();
        try{
            File file = new File(relPath);
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()){
                content.add(myReader.nextLine());
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("Error mientras se  lee el archivo.");
        }
        return content;
    }

    public void deleteFile(String relPath){
        File file = new File(relPath);
        if (file.delete()){
            System.out.println("Archivo  borrado: " + file.getName());
        }else {
            System.out.println("Error al eliminar el archivo");
        }
    }

    public void deleteFolder(String relPath){
        File folder = new File(relPath);
        if (folder.isDirectory()){
            if (folder.delete()){
                System.out.println("Folder eliminado: " + folder.getName());
            }else {
                System.out.println("Error al eleiminar el directorio. Esto podria no estar vacio.");
            }
        }else{
            System.out.println(" La ruta proporcionada no es un directorio.");
        }
    }
}
