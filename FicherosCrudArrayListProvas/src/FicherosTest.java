
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class FicherosTest {

    @Test
    void testCreateFile() throws IOException {
        Ficheros ficheros = new Ficheros();
        String folderPath = "testDirectory/subFolder";
        String fileName = "testFile.txt";
        ArrayList<String> content = new ArrayList<>();
        content.add("linea 1");
        content.add("linea 2");
        content.add("linea 3");

        ficheros.createFile(folderPath, fileName, content);

        File file = new File(folderPath + "/" + fileName);
        assertTrue(file.exists(), "El archivo debería existir");

        // Cleanup
        file.delete();
        new File(folderPath).delete();
        new File("testDirectory").delete();
    }

    @Test
    void testReadFile() throws IOException {
        Ficheros ficheros = new Ficheros();
        String folderPath = "testDirectory/subFolder";
        String fileName = "testFile.txt";
        ArrayList<String> content = new ArrayList<>();
        content.add("linea 1");
        content.add("linea 2");
        content.add("linea 3");

        ficheros.createFile(folderPath, fileName, content);
        ArrayList<String> readContent = ficheros.readFile(folderPath + "/" + fileName);
        assertEquals(content, readContent, "El contenido leído debería ser igual al contenido escrito");

        // Cleanup
        new File(folderPath + "/" + fileName).delete();
        new File(folderPath).delete();
        new File("testDirectory").delete();
    }

    @Test
    void testDeleteFile() throws IOException {
        Ficheros ficheros = new Ficheros();
        String folderPath = "testDirectory/subFolder";
        String fileName = "testFile.txt";
        ArrayList<String> content = new ArrayList<>();
        content.add("linea 1");
        content.add("linea 2");
        content.add("linea 3");

        ficheros.createFile(folderPath, fileName, content);
        ficheros.deleteFile(folderPath + "/" + fileName);

        File file = new File(folderPath + "/" + fileName);
        assertFalse(file.exists(), "El archivo debería ser eliminado");

        // Cleanup
        new File(folderPath).delete();
        new File("testDirectory").delete();
    }

    @Test
    void testDeleteFolder() throws IOException {
        Ficheros ficheros = new Ficheros();
        String folderPath = "testDirectory/subFolder";
        String fileName = "testFile.txt";
        ArrayList<String> content = new ArrayList<>();
        content.add("linea 1");
        content.add("linea 2");
        content.add("linea 3");

        ficheros.createFile(folderPath, fileName, content);
        ficheros.deleteFile(folderPath + "/" + fileName);
        ficheros.deleteFolder(folderPath);

        File folder = new File(folderPath);
        assertFalse(folder.exists(), "El directorio debería ser eliminado");

        // Cleanup
        new File("testDirectory").delete();
    }
}
