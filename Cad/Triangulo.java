package Cad;

import javax.management.RuntimeErrorException;

public class Triangulo extends Figura {

    private Punto vertice2;
    private Punto vertice3;

    public Triangulo(int x, int y, int x2, int y2, int x3, int y3) {
        super(x, y);
        vertice2 = new Punto(x2, y2);
        vertice3 = new Punto(x3, y3);
    }

    @Override
    public String toString() {
        return "Triangulo [origen=" + super.origen + "vertice2=" + vertice2 + ", vertice3=" + vertice3 + "]";
    }

    public void dibujar() {
        System.out.println(super.toString());
    }

    public double superficie() {
        throw new RuntimeErrorException(null, "No implementado");
    }

    @Override
    public void mover(int dx, int dy) {
        super.mover(dx, dy);
    }
    
}
