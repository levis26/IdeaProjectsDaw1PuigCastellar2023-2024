import java.util.ArrayList;
import java.util.List;

enum Nota {
    UF1, UF2, UF3
}

public class Alumne {
    private String nom;
    private List<Double> notes;

    public Alumne(String nom) {
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    public void afegirNota(double nota) { notes.add(nota); }

    public List<Double> getNotes() { return notes; }

    public double notaMitjana() {
        return notes.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public String getNom() { return nom; } // Getter para el nombre

    @Override
    public String toString() {
        return nom + " amb nota mitjana " + notaMitjana();
    }
}
