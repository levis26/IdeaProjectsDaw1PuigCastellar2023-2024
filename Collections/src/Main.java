import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 2. Crear dos cajas de lápices
        List<Llapis> caixa1 = new ArrayList<>();
        List<Llapis> caixa2 = new ArrayList<>();

        // 3. Llenar una caja con colores aleatorios
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int color = random.nextInt(8);
            caixa1.add(new Llapis(color, 1.0f)); // mismo grosor
        }

        // 4. Llenar la otra caja con colores y grosores aleatorios
        for (int i = 0; i < 10; i++) {
            int color = random.nextInt(8);
            float gruix = 0.1f + random.nextFloat() * (3.0f - 0.1f);
            caixa2.add(new Llapis(color, gruix));
        }

        // 5. Imprimir información de las dos cajas
        System.out.println("Caixa 1:");
        for (Llapis llapis : caixa1) System.out.println(llapis);

        System.out.println("\nCaixa 2:");
        caixa2.forEach(System.out::println);



        // 6. Ordenar por color
        caixa1.sort(Comparator.comparingInt(Llapis::getColor).reversed());
        System.out.println("\nCaixa 1 ordenada por color:");
        caixa1.forEach(System.out::println);

        // 7. Ordenar por grosor con Comparator anónimo
        caixa2.sort(new Comparator<Llapis>() {
            @Override
            public int compare(Llapis l1, Llapis l2) {
                return Float.compare(l1.getGruix(), l2.getGruix());
            }
        });
        System.out.println("\nCaixa 2 ordenada por gruix:");
        caixa2.forEach(System.out::println);

        // 8 y 9. Crear una LinkedList y añadir ambas cajas
        LinkedList<Llapis> linkedList = new LinkedList<>(caixa2);
        linkedList.addAll(caixa1);
        System.out.println("\nContenido de la LinkedList:");
        linkedList.forEach(System.out::println);

        // 10 y 11. Eliminar duplicados
        List<Llapis> caixaUnica = new ArrayList<>(new HashSet<>(linkedList));
        System.out.println("\nCaixa única sin duplicados:");
        caixaUnica.forEach(System.out::println);

        // 12. Map de colores
        Map<Integer, String> mapColors = new HashMap<>();
        mapColors.put(0, "Negre");
        mapColors.put(1, "Vermell");
        mapColors.put(2, "Groc");
        mapColors.put(3, "Verd");
        mapColors.put(4, "Verd");
        mapColors.put(3, "Blanc");

        // Explicación: La clave 3 se sobrescribe, por lo que "Verd" se reemplaza por "Blanc"

        System.out.println("\nMapa de colores:");
        for (Map.Entry<Integer, String> entry : mapColors.entrySet()) {
            System.out.println("Clau: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        System.out.println("\nValores del mapa:");
        for (String color : mapColors.values()) {
            System.out.println(color);
        }

        // 13 y 14. Frecuencia de lanzamientos de dados
        List<Integer> resultados = new ArrayList<>();
        Random rand = new Random();

        // Llenar resultados con las sumas de dos dados
        for (int i = 0; i < 100; i++) {
            int resultado = rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
            resultados.add(resultado);
        }

        System.out.println("\nFrecuencia usando List:");
        for (int i = 2; i <= 12; i++) {
            System.out.println("Suma " + i + ": " + Collections.frequency(resultados, i));
        }

        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int resultado : resultados) {
            frecuencia.put(resultado, frecuencia.getOrDefault(resultado, 0) + 1);
        }

        System.out.println("\nFrecuencia usando Map:");
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println("Suma " + entry.getKey() + ": " + entry.getValue());
        }

        // 15. Ejemplo de enum para Alumnos
        List<Alumne> alumnes = new ArrayList<>();
        Alumne alumne1 = new Alumne("Anna");
        Alumne alumne2 = new Alumne("Bernat");
        Alumne alumne3 = new Alumne("Clara");

        alumne1.afegirNota(7.5);
        alumne1.afegirNota(8.0);
        alumne1.afegirNota(9.0);

        alumne2.afegirNota(5.5);
        alumne2.afegirNota(6.0);
        alumne2.afegirNota(6.5);

        alumne3.afegirNota(9.5);
        alumne3.afegirNota(8.5);
        alumne3.afegirNota(10.0);

        alumnes.add(alumne1);
        alumnes.add(alumne2);
        alumnes.add(alumne3);

        System.out.println("\nNotes de cada alumne:");
        for (Alumne alumne : alumnes) {
            System.out.println(alumne.getNotes());
        }

        System.out.println("\nAlumnes ordenats per nom amb nota mitjana:");
        alumnes.sort(Comparator.comparing(Alumne::getNom));
        alumnes.forEach(System.out::println);
    }
}