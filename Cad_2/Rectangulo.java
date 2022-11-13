package Cad_2;

public class Rectangulo extends Figura {

    private int ancho;
    private int alto;

    public Rectangulo(int x, int y, int ancho, int alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println(this.toString());
    }

    @Override
    public double superficie() {
        return alto * ancho;
    }

    @Override
    public void mover(int x, int y) {
        super.mover(x, y);
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    @Override
    public String toString() {
        return "Rectangulo [origen=" + super.origen + " ancho=" + ancho + ", alto=" + alto + "]";
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

}
