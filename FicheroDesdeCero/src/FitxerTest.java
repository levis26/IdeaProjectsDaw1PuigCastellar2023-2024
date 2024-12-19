import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FitxerTest {

    @org.junit.jupiter.api.Test
    void createFileTest() throws IOException {
        String contenido = "Soy un viejo sabroso.";
        String file = "file";
        String folders = "dir1/dir2";
        Fitxer fitcher = new Fitxer();
        fitcher.createFile(folders,file,contenido);

        File prueba = new File(folders,file);
        Assertions.assertTrue(prueba.exists());

        prueba.delete();
        File borrarFolders = new File(folders);
        borrarFolders.delete();

        File borrarFolders2 = new File("dir1");
        borrarFolders2.delete();
    }

    @org.junit.jupiter.api.Test
    void readFileTest() throws IOException {
        String contenido = "    -----Soy un negro que baila sabroso.";
        String file = "bitacora";
        String folders = "dir1/dir2";
        Fitxer fitcher = new Fitxer();

        fitcher.createFile(folders,file,contenido);


        String lectura2 = fitcher.readFile(folders + "/" + file);
        Assertions.assertEquals(contenido,lectura2);

        File lectura = new File(folders + "/" + file);
        lectura.delete();
        File borrarFolders = new File(folders);
        borrarFolders.delete();

        File borrarFolders2 = new File("dir1");
        borrarFolders2.delete();
    }

    @org.junit.jupiter.api.Test
    void deleteFileTest() throws IOException {
        String content = "Aqui esta mi contenido.";
        String file = "bitacora";
        String folders = "dir1/dir2";
        Fitxer fitcher = new Fitxer();
        fitcher.createFile(folders, file, content);

        File ficheroQueQuieroorrar = new File(folders + "/" + file);
        fitcher.deleteFile(String.valueOf(ficheroQueQuieroorrar));

        Assertions.assertTrue(!ficheroQueQuieroorrar.exists());
        File borrarFolders = new File(folders);
        borrarFolders.delete();

        File borrarFolders2 = new File("dir1");
        borrarFolders2.delete();
    }

    @org.junit.jupiter.api.Test
    void deleteDirectoryTest() throws IOException {
        String content = "Aqui esta mi contenido.";
        String file = "bitacora";
        String folders = "dir1/dir2";
        Fitxer fitcher = new Fitxer();
        fitcher.createFile(folders, file, content);

        File ficheroQueQuieroorrar = new File(folders + "/" + file);
        fitcher.deleteFile(String.valueOf(ficheroQueQuieroorrar));

        File folder2 = new File("dir1/dir2");
        fitcher.deleteDirectory(String.valueOf(folder2));

        File folder1 = new File("dir1");
        fitcher.deleteDirectory(String.valueOf(folder1));

        Assertions.assertEquals(true, !folder2.exists());
        Assertions.assertEquals(true, !folder1.exists());
    }

}