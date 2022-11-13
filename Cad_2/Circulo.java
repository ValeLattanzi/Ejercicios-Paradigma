package Cad_2;

public class Circulo extends Figura {
    private int radio;
    
    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public void dibujar() {
        System.out.println(this.toString());
    }

    @Override
    public void mover(int x, int y) {
        super.mover(x, y);
    }

    @Override
    public double superficie() {
        return Math.PI * (radio * radio);
    }

    @Override
    public String toString() {
        return "Circulo [origen= " + super.origen + "radio=" + radio + "]";
    }
    
}
