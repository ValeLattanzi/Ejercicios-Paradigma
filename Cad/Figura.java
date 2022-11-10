package Cad;

public abstract class Figura implements Desplazable {
    protected Punto origen;

    public Figura(int x, int y) {
        this.origen = new Punto(x, y);
    }

    @Override
    public void mover(int dx, int dy) {
        origen.mover(dx, dy);
    }

    public abstract void dibujar();

    protected double superficie() {
        return 0;
    }

    @Override
    public String toString() {
        return "Figura [origen=" + origen + "]";
    }

}
