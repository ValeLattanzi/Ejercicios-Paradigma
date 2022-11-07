package MarcadorTenis;

public class PartidoTenis {
    private int SetsGanadosA;
    private int SetsGanadosB;
    private Set[] listOf_Sets;
    public Set setActual;

    public PartidoTenis() {
        SetsGanadosA = 0;
        SetsGanadosB = 0;
        listOf_Sets = new Set[7];
        for (int i = 0; i < listOf_Sets.length; i++) {
            listOf_Sets[i] = new Set();
        }
        setActual = listOf_Sets[0];
    }

    /**
     * Añade puntos al jugador que marcó los puntos
     */
    public void ganoSet(Integer jugador) {
        if (this.setActual.haFinalizado()) {
            if (jugador == 1) {
                this.SetsGanadosA += 1;
            }
            else if (jugador == 2) {
                this.SetsGanadosB += 1;
            }
            if (this.setActual.haFinalizado()) {
                for (int i = 0; i < this.listOf_Sets.length - 1; i++) {
                    if (this.setActual == this.listOf_Sets[i]) {
                        this.setActual = this.listOf_Sets[i + 1];
                        break;
                    }
                }
            }
        }
    }

    public void getGanadorPartido(){
        if (haFinalizado() == true){
            if (this.SetsGanadosA > this.SetsGanadosB){
                System.out.println("El ganador es el Jugador 1 con " + this.SetsGanadosA +" Sets ganados");
            }
            if (this.SetsGanadosB > this.SetsGanadosA){
                System.out.println("El ganador es el Jugador 2 con " + this.SetsGanadosB +" Sets ganados");
            }
            else{

            }
        }
    }

    public boolean haFinalizado() {
        if (this.SetsGanadosA + this.SetsGanadosB == 7) {
            return true;
        }
        else {
            return false;
        }
    }

    public String puntoJugador(int jugador) {
        this.setActual.gameActual.ganoPunto(jugador);
        if (this.setActual.gameActual.haFinalizado()) {
            this.setActual.ganoGame(jugador);
            if (this.setActual.haFinalizado()) {
                ganoSet(jugador);
            }
        }
        String _salida = "--------------------------------------------------\n\r" 
            + this.setActual.gameActual.toString() + "\n\r" + this.setActual.toString() +  
            "\n\r" + this.toString();
        return _salida;
    }

    public String toString() {
        return "Sets Ganados A = " + this.SetsGanadosA + ", Sets Ganados B = " + this.SetsGanadosB; 
    }

}