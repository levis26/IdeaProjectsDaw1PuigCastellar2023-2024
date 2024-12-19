import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class FileManagerTest {

    private static final String FILE_PATH = "example.txt";

    @BeforeEach
    public void setUp() {
        // Asegúrate de que el archivo no exista antes de cada prueba
        File file = new File(FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
    }

    @AfterEach
    public void tearDown() {
        // Limpia el archivo después de cada prueba
        File file = new File(FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testCreateFile() {
        FileManager.createFile();
        File file = new File(FILE_PATH);
        assertTrue(file.exists());
    }

    @Test
    public void testWriteFile() throws IOException {
        FileManager.createFile();
        String content = "Hello, World!";
        FileManager.writeFile(content);

        String fileContent = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
        assertEquals(content, fileContent);
    }

    @Test
    public void testReadFile() throws IOException {
        FileManager.createFile();
        String content = "Hello, World!";
        FileManager.writeFile(content);

        String fileContent = FileManager.readFile();
        assertEquals(content + System.lineSeparator(), fileContent);
    }

    @Test
    public void testAppendToFile() throws IOException {
        FileManager.createFile();
        String initialContent = "Hello, World!";
        FileManager.writeFile(initialContent);
        String appendContent = "\nAppended text.";
        FileManager.appendToFile(appendContent);

        String fileContent = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
        assertEquals(initialContent + appendContent, fileContent);
    }

    @Test
    public void testDeleteFile() {
        FileManager.createFile();
        FileManager.deleteFile();
        File file = new File(FILE_PATH);
        assertFalse(file.exists());
    }
}
