import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FnFTest {

    @org.junit.jupiter.api.Test
    void createFile() throws IOException {
        String fileName = "file";
        String folders = " dir1/dir2";

        File f = new File(folders, fileName);
        f.delete();

        File dirs = new File(folders,fileName);
        dirs.delete();

        FnF fnf = new FnF();
        ArrayList<String> content = new ArrayList<>();
        content.add("Soy la linea 4, puesta con un add.");
        fnf.createFile("dir1/dir2", "file", content);
    }

    @org.junit.jupiter.api.Test
    void readFile() {
    }
}