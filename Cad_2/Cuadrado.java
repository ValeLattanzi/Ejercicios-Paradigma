package Cad_2;

public class Cuadrado extends Rectangulo {

    public Cuadrado(int x, int y, int lado) {
        super(x, y, lado, lado);
    }

    @Override
    public void dibujar() {
        System.out.println(this.toString());
    }

    @Override
    public double superficie() {
        return super.getAncho() * super.getAlto();
    }

    @Override
    public void mover(int x, int y) {
        super.mover(x, y);
    }

    @Override
    public void setAlto(int alto) {
        super.setAlto(alto);
        super.setAncho(alto);
    }

    @Override
    public void setAncho(int ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
    }

    @Override
    public String toString() {
        return "Cuadrado [origen= " + super.origen + "lado=" + super.getAlto() + "]";
    }
    
}
