package Cad;

import java.util.ArrayList;

public class Cad {
    ArrayList<Figura> listOf_Figuras;

    public Cad() {
        listOf_Figuras = new ArrayList<Figura>();
    }

    public void dibujar() {
        for (Figura f : listOf_Figuras) {
            f.dibujar();
        }
    }

    public void agregar(Figura f) {
        listOf_Figuras.add(f);
    }

    public double calcularSuperficieTotal() {
        double _total = 0.0;
        for (Figura f : listOf_Figuras) {
            _total += f.superficie();
        }
        return _total;
    }
}