import java.util.Objects;

public class Llapis {
    private int color; // Del 0 al 7
    private float gruix; // De 0.1 a 3.0

    public Llapis(int color, float gruix) {
        if (color < 0 || color > 7) throw new IllegalArgumentException("Color fuera de rango (0-7)");
        if (gruix < 0.1f || gruix > 3.0f) throw new IllegalArgumentException("Gruix fuera de rango (0.1-3.0)");
        this.color = color;
        this.gruix = gruix;
    }

    public int getColor() { return color; }
    public void setColor(int color) { this.color = color; }

    public float getGruix() { return gruix; }
    public void setGruix(float gruix) { this.gruix = gruix; }

    @Override
    public String toString() {
        return "Llapis{" + "color=" + color + ", gruix=" + gruix + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Llapis)) return false;
        Llapis llapis = (Llapis) o;
        return color == llapis.color && Float.compare(llapis.gruix, gruix) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, gruix);
    }
}
