import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Ficheros ficher = new Ficheros();

        ArrayList<String> content = new ArrayList<>();
        content.add("primer comentario");
        content.add("segundo comentario");
        content.add("tercer comentario");
        content.add("cuarto comentario");

        ficher.createFile("directorioPrincipal/subdirectorio1/subdirectorio2/", "file", content);

        ArrayList<String> fileNew = ficher.readFile("directorioPrincipal/subdirectorio1/subdirectorio2/file");
        for (String linea:fileNew){
            System.out.println(linea);
        }

        ficher.deleteFile("directorioPrincipal/subdirectorio1/subdirectorio2/file");

        ficher.deleteFolder("directorioPrincipal/subdirectorio1/subdirectorio2/");
        ficher.deleteFolder("directorioPrincipal/subdirectorio1/");
        ficher.deleteFolder("directorioPrincipal/");
    }
}