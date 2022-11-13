package Cad_2;

public class TestCad {
    public static void main(String[] args) {
        Cad cad = new Cad();
        Figura f = new Rectangulo(20, 15, 30, 40);
        cad.agregarFigura(f);
        Figura f1 = new Circulo(12, 10, 5);
        cad.agregarFigura(f1);
        cad.calcuarSuperficieTotal();
    }
}
