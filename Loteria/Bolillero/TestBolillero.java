package Loteria.Bolillero;
import Loteria.Bolillero.Model.Bolillero;
public class TestBolillero {
    public static void main(String[] args) {
        Bolillero _bolillero = new Bolillero();
        System.out.println("El valor obtenido es: " + String.valueOf(_bolillero.rodarBolillero()));
    }
}