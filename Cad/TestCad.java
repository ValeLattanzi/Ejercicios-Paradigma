package Cad;

public class TestCad {
    public static void main(String[] args) {
        Cad d = new Cad();
        Figura f = new Cuadrado(8,6,10);
        d.agregar(f);
        Rectangulo r = new Rectangulo(10,12,20,15);
        Figura c = new Circulo(20,10,12);
        d.agregar(r);
        d.agregar(c);
        d.dibujar();
        
        System.out.println("La superficie total de todas las figuras es: " + d.calcularSuperficieTotal());
    }
}