package Cad_2;

public abstract class Figura implements Desplazable {
    protected Punto origen;

    public Figura(int x, int y) {
        origen = new Punto(x, y);
    }

    public abstract void dibujar();

    public abstract double superficie();

    @Override
    public String toString() {
        return "Figura [origen=" + origen + "]";
    }

    public void mover(int x, int y) {
        this.origen.mover(x, y);
    }
}
