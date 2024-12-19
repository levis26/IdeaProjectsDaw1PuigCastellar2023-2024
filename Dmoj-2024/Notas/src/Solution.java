import java.util.*;
class Alumno {
    float[] notas;

    // Constructor que inicializa las notas
    public Alumno(int numeroNotas) {
        this.notas = new float[numeroNotas];
    }

    // Método para calcular la nota media
    public float calcularNotaMedia() {
        float suma = 0;
        for (float nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Alumno alumno = new Alumno(numeroNotas);

        int numeroNotas = scanner.nextInt();

        alumno.notas = new float[numeroNotas];

        for(int i=0; i<numeroNotas; i++){
            alumno.notas[i] = scanner.nextFloat();
        }

        float suma = 0;
        for(int i=0; i<numeroNotas; i++){
            suma += alumno.notas[i];
        }

        System.out.println("Nota media: " + suma/numeroNotas);
        scanner.close();
    }
}
