import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nElige una opción:");
            System.out.println("1. Crear directorio");
            System.out.println("2. Crear subdirectorio1");
            System.out.println("3. Crear archivo");
            System.out.println("4. Leer archivo");
            System.out.println("5. Escribir en archivo");
            System.out.println("6. Borrar archivo");
            System.out.println("7. Borrar subdirectorio1");
            System.out.println("8. Borrar directorio");
            System.out.println("9. Salir");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Crear directorio
                    File directorio = new File("Directorio");
                    if (!directorio.exists()) {
                        directorio.mkdir();
                        System.out.println("Directorio creado.");
                    } else {
                        System.out.println("El directorio ya existe.");
                    }
                    break;
                case 2:
                    // Crear subdirectorio1
                    File subdirectorio1 = new File("Directorio/subdirectorio1");
                    if (!subdirectorio1.exists()) {
                        subdirectorio1.mkdir();
                        System.out.println("Subdirectorio creado.");
                    } else {
                        System.out.println("El subdirectorio ya existe.");
                    }
                    break;

                case 3:
                    // Crear archivo
                    File archivo = new File("Directorio/subdirectorio1/archivo.txt");
                    if (!archivo.exists()) {
                        try {
                            archivo.createNewFile();
                            System.out.println("Archivo creado.");
                        } catch (IOException e) {
                            System.out.println("No se pudo crear el archivo.");
                        }
                    } else {
                        System.out.println("El archivo ya existe.");
                    }
                    break;

                case 4:
                    // Leer archivo
                    try {
                        File leer = new File("Directorio/subdirectorio1/archivo.txt");
                        Scanner lector = new Scanner(leer);
                        while (lector.hasNextLine()) {
                            String dato = lector.nextLine();
                            System.out.println(dato);
                        }
                        lector.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("El archivo no se encontró.");
                    }
                    break;

                case 5:
                    // Escribir en el archivo
                    try {
                        FileWriter escritor = new FileWriter("Directorio/subdirectorio1/archivo.txt", true); // 'true' para append
                        System.out.println("Escribe el contenido a añadir (termina con una línea vacía):");
                        String linea;
                        while (!(linea = sc.nextLine()).isEmpty()) {
                            escritor.write(linea + "\n");
                        }
                        escritor.close();
                        System.out.println("Contenido añadido.");
                    } catch (IOException e) {
                        System.out.println("No se pudo escribir en el archivo.");
                    }
                    break;

                case 6:
                    // Borrar archivo
                    File archivoBorrar = new File("Directorio/subdirectorio1/archivo.txt");
                    if (archivoBorrar.exists()) {
                        if (archivoBorrar.delete()) {
                            System.out.println("Archivo borrado.");
                        } else {
                            System.out.println("No se pudo borrar el archivo.");
                        }
                    } else {
                        System.out.println("El archivo no existe.");
                    }
                    break;

                case 7:
                    // Borrar subdirectorio1
                    File subdirectorioBorrar = new File("Directorio/subdirectorio1");
                    if (subdirectorioBorrar.exists()) {
                        if (subdirectorioBorrar.list().length == 0 && subdirectorioBorrar.delete()) {
                            System.out.println("Subdirectorio borrado.");
                        } else {
                            System.out.println("No se pudo borrar el subdirectorio. Asegúrate de que esté vacío.");
                        }
                    } else {
                        System.out.println("El subdirectorio no existe.");
                    }
                    break;

                case 8:
                    // Borrar directorio
                    File directorioB = new File("Directorio");
                    if (directorioB.exists()) {
                        if (directorioB.list().length == 0 && directorioB.delete()) {
                            System.out.println("Directorio borrado.");
                        } else {
                            System.out.println("No se pudo borrar el directorio. Asegúrate de que esté vacío.");
                        }
                    } else {
                        System.out.println("El directorio no existe.");
                    }
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 9);

        sc.close();
    }
}
