import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FnF {

    public static void createFile(String dirPath, String fileName, String content) throws IOException {
        File directory = new File(dirPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File file = new File(dirPath + File.separator + fileName);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }
    }

    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
}
