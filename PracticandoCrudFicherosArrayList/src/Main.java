import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Fitxer fitxer = new Fitxer();

        ArrayList<String> content = new ArrayList<>();
        content.add("Primer linea agregada.");
        content.add("Segunda linea agregada.");
        content.add("Tercera linea agregada.");
        content.add("Comprobando la lectura del fichero.");

        fitxer.createFile("directorio/subdirectorio","archivo1",content);

        ArrayList<String> fileName = fitxer.readFile("directorio/subdirectorio/archivo1");
        for (String lines:fileName){
            System.out.println(lines);
        }

        fitxer.deleteFile("directorio/subdirectorio/archivo1");

        fitxer.deleteFolder("directorio/subdirectorio");

        fitxer.deleteFolder("directorio/");
    }
}