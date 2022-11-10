package Cad;

public class Rectangulo extends Figura {
    private int ancho;
    private int alto;

    public Rectangulo(int x, int y, int ancho, int alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public void dibujar() {
        System.out.println(toString());
    }

    public double superficie() {
        return this.alto * this.ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo [origen=" + origen + ", ancho=" + ancho + ", alto=" + alto + "]";
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}