package Cad;

public class Punto implements Desplazable {

    private int x;
    private int y;

    @Override
    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

}
