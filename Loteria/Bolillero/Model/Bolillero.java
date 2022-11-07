package Loteria.Bolillero.Model;
import java.util.Random;

public class Bolillero {
    private int cantidadBolas = 10;
    private int valor;
    
    public Bolillero(int cantidadBolas) {
        this.cantidadBolas = cantidadBolas;
    }

    public Bolillero() {

    }

    public String getValor() {
        return String.valueOf(valor);
    }

    public int getCantidadBolas() {
        return cantidadBolas;
    }

    /**
     * Rueda el bolillero y devuelve un valor del dado
     * @return Dado con su valor correspondiente
     */
    public int rodarBolillero() {
        // Crea un objeto Random
        Random _random = new Random();
        // Obtiene el valor aleatorio entre 0 y la cantidad de bolas
        valor = _random.nextInt(cantidadBolas);
        return valor;
    }
}