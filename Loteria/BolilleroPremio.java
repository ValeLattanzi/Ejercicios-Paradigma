package Loteria;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 */
public class BolilleroPremio {

    private int valor;
    private ArrayList<String> listOf_NumerosPremiados;

    public BolilleroPremio() {this.listOf_NumerosPremiados = new ArrayList<>();}

    public int getValor() {return this.valor;}

    public ArrayList<String> getListOf_NumerosPremiados() {return listOf_NumerosPremiados;}

    /**
     * Genera entre 1 y 20 un numero aleatorio
     */
    public void sortear() {
        // Crea un objeto Random
        Random _random = new Random();
        int _sizeList = listOf_NumerosPremiados.size();
        
        // Mediante un while ejecuta la secuencia para encontrar el proximo numero a premiar
        if (this.tieneBolilla()) {
            // Compara si el tamaño de la lista cambió luego de haber ejecutado el bucle
            while (listOf_NumerosPremiados.size() == _sizeList) {
                // Obtiene el valor aleatorio entre 1 y 20
                valor = _random.nextInt(20) + 1;

                // Verifica que el valor obtenido no se halle en la lista
                if (!listOf_NumerosPremiados.contains(String.valueOf(valor))) {
                    // Si no existe dentro de la lista, lo agrega
                    listOf_NumerosPremiados.add(String.valueOf(valor));
                }
            }
        }
    }

    /**
     * Verifica si aún se pueden sortear premios
     * @return Booleano
     */
    public boolean tieneBolilla() {
        if (listOf_NumerosPremiados.size() < 20) { return true;}
        else { return false; }
    }

}
