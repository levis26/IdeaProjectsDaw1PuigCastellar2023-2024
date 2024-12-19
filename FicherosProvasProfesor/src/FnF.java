import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FnF {
    public void createFile(String folderPath, String fileName, ArrayList<String>content) throws IOException {
        File dir = new File(folderPath);
        if (!dir.exists()) dir.mkdirs();

        File f = new File(dir,fileName);
        FileWriter fw = new FileWriter(f);
        for (String c:content){
            fw.write(c + "\n");
        }
        fw.close();
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



}
