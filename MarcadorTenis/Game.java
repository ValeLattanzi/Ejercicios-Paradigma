package MarcadorTenis;

/**
 * Clase encargada de resolver el incremento de los juegos
 */
public class Game {
    private String puntosA;
    private String puntosB;
    private String[] listOf_Puntajes;

    public Game() {
        puntosA = "00";
        puntosB = "00";
        listOf_Puntajes = new String[] {"00", "15", "30", "40", "Ventaja", "Gano"};
    }

    /**
     * Añade puntos al jugador que marcó los puntos
     * Recibe un número (1 o 2) y determina el nuevo valor de los puntos del jugador
     */
    public void ganoPunto(int jugador) {
        if (!haFinalizado()) {
            // 1.- En caso de que sea el jugador A, verifica que el puntaje actual de A sea menor a gano
            if (jugador == 1) {
                // 2.- Recorre la lista de puntajes para darle el siguiente valor
                for (int i = 0; i < listOf_Puntajes.length; i++) {
                    // 3.- Controla que los puntos de A no sean Gano
                    if (puntosA == listOf_Puntajes[i] && puntosA != "Gano") {
                        // 4.- Compara si los puntos de B son Ventaja
                        if (listOf_Puntajes[i+1] == "Ventaja" && puntosB == "Ventaja") {
                            puntosB = listOf_Puntajes[i];
                            puntosA = listOf_Puntajes[i];
                        }
                        else if (puntosB == "40" && puntosA == "40") {
                            puntosA = "Ventaja";
                        }
                        else {
                            if (listOf_Puntajes[i + 1] == "Ventaja") {
                                puntosA = "Gano";
                            }
                            else { 
                                puntosA = listOf_Puntajes[i + 1];
                            }
                        }
                        break;
                    }
                }
            }
            // En caso de ser el Jugador B repite la misma secuencia que para A
            else if (jugador == 2) {
                for (int i = 0; i < listOf_Puntajes.length; i++) {
                    if (puntosB == listOf_Puntajes[i] && puntosB != "Gano") {
                        if (listOf_Puntajes[i+1] == "Ventaja" && puntosA == "Ventaja") {
                            puntosA = listOf_Puntajes[i];
                            puntosB = listOf_Puntajes[i];
                        }
                        else if (puntosB == "40" && puntosA == "40") {
                            puntosB = "Ventaja";
                        }
                        else {
                            if (listOf_Puntajes[i + 1] == "Ventaja") {
                                puntosB = "Gano";
                            }
                            else { 
                                puntosB = listOf_Puntajes[i + 1];
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    /**
     * Determina quien gana el juego
     * @return Devuelve el numero del jugador que gano el Game
     */
    public int getGanadorGame() {
        if (puntosA == listOf_Puntajes[listOf_Puntajes.length - 1]) {
            return 1;
        }
        else if (puntosB == listOf_Puntajes[listOf_Puntajes.length - 1]) {
            return 2;
        }
        else {
            return 0;
        }
    }

    /**
     * Devuelve si un game ha finalizado o no
     * @return
     */
    public boolean haFinalizado() {
        if (this.puntosA == listOf_Puntajes[listOf_Puntajes.length - 1] || 
            this.puntosB == listOf_Puntajes[listOf_Puntajes.length - 1]) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "puntos A = " + puntosA + ", puntos B = " + puntosB;
    }
    
}