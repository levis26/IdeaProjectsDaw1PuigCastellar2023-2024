public class Daus {
    private int valor;

    public Daus() {
        this.valor = 1;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Daus{" + "valor=" + valor + '}';
    }

    public boolean equals(Daus altreDau) {
        return this.valor == altreDau.getValor();
    }

    public void tirar() {
        this.valor = (int) (Math.random() * 6) + 1;
    }
}
