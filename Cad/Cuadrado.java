package Cad;

public class Cuadrado extends Rectangulo {

    public Cuadrado(int x, int y, int lado) {
        super(x, y , lado, lado);
    }

    @Override
    public String toString() {
        return "Cuadrado [origen=" + origen + " lado=" + super.getAlto() + "]";
    }

    public void setAlto(int alto) {
        super.setAlto(alto);
        super.setAncho(alto);
    }

    public void setAncho(int ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
    }

    public double superficie() {
        return Math.pow(super.getAlto(), 2);
    }

    public void mover(int dx, int dy) {
        super.mover(dx, dy);
    }
}
