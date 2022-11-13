package Cad_2;

import java.util.ArrayList;

public class Cad {
    private ArrayList<Figura> figuras;

    public Cad() {
        figuras = new ArrayList<Figura>();
    }

    public void calcuarSuperficieTotal() {
        double _supTotal = 0.0;
        for (Figura figura : figuras) {
            _supTotal = figura.superficie();
        }
        System.out.println("La superficie total es: " + _supTotal + " metros cuadrados");
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }
}