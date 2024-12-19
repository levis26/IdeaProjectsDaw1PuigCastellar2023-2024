import java.io.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File folder = new File("folderNuevo/");
        if (!folder.exists()){folder.mkdirs();}

        File folder2 = new File("folderNuevo/subFolder/");
        if (!folder2.exists()){folder2.mkdirs();}

        String file = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".txt";
        FileWriter fileName = new FileWriter("folderNuevo/subFolder/" + file);
        fileName.write("Los 4 jinetes del Apocalipses!");
        fileName.close();
        System.out.println("Successfully wrote to the file.");

        File myObject = new File("folderNuevo/subFolder/" + file);
        Scanner myReader = new Scanner(myObject);

        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();

        File myObject2 = new File("folderNuevo/subFolder/" + file);
        if (myObject2.delete()){
            System.out.println("Deleted file.");
        }else {
            System.out.println("Failed to delete the file.");
        }
    }
}