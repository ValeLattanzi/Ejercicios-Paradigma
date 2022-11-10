package Cad;

public class Circulo extends Figura {

    private int radio;
    
    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    public void dibujar() {
        System.out.println(toString());
    }

    public double superficie() {
        return Math.PI*Math.pow(radio, 2);
    }

    public void mover(int dx, int dy) {
        super.mover(dx, dy);
    }
}