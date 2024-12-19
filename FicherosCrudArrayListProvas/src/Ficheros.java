import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ficheros {
    public void createFile(String folderPath, String fileName, ArrayList<String>content) throws IOException {
        File folder = new File(folderPath);
        if (!folder.exists()) folder.mkdirs();

        File file = new File(folder + "/" + fileName);
        FileWriter writer = new FileWriter(file);
        for (String c:content){
            writer.write(c + "\n");
        }
        writer.close();
    }

    public ArrayList<String> readFile(String relPath) throws FileNotFoundException {
        File fileName = new File(relPath);
        Scanner sc = new Scanner(fileName);

        ArrayList<String> content = new ArrayList<>();
        while (sc.hasNextLine()){
            content.add(sc.nextLine());
        }
        sc.close();
        return content;
    }

    public void deleteFile(String relPath) {
        File fileNew = new File(relPath);
        if (fileNew.exists()) { // Cambiado para eliminar el archivo si existe
            if (fileNew.delete()) {
                System.out.println("Deleted file: " + fileNew.getName());
            } else {
                System.out.println("Failed to delete the file: " + fileNew.getName());
            }
        } else {
            System.out.println("File does not exist: " + fileNew.getName());
        }
    }

    public void deleteFolder(String relPath){
      File folderNew = new File(relPath);
      if (folderNew.isDirectory()){
          if (folderNew.delete()){
              System.out.println("Deleted folder: " + folderNew.getName());
          }else {
              System.out.println("Failed to delete the folder: " + folderNew.getName());
          }
      }else {
          System.out.println("Folder does not exist: " + folderNew.getName());
      }
    }

}
