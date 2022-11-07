package MarcadorTenis;

public class Set {
    private int GamesA;
    private int GamesB;
    private Game[] listOf_Games;
    public Game gameActual;

    public Set() {
        GamesA = 0;
        GamesB = 0;
        listOf_Games = new Game[11];
        for (int i = 0; i < listOf_Games.length; i++) {
            listOf_Games[i] = new Game();
        }
        gameActual = listOf_Games[0];
    }

    /**
     * Añade puntos al jugador que marcó los puntos
     */
    public void ganoGame(int jugador) {
        
        if (jugador == 1) {
            this.GamesA += 1;
        }
        else if (jugador == 2) {
            this.GamesB += 1;
        }
        if (this.gameActual.haFinalizado()) {
            for (int i = 0; i < this.listOf_Games.length - 1; i++) {
                if (this.gameActual == this.listOf_Games[i]) {
                    this.gameActual = this.listOf_Games[i + 1];
                    break;
                }
            }
        }
    }

    /**
     * Determina quien gana el set
     * @return
     */
    public int getGanadorSet() {
        // 1.- Recorre el vector listOf_Games
        // 2.- De cada game llama al metodo haFinalizado()
        // 3.- En caso de ser verdadero, llama al método getGanador()
        // 4.- Una vez obtenido el ganador del game, llama al método 
        // ganoPunto del objeto Set y este aumenta en 1 la variable de instancia listOf_GamesGanados correspondiente
        int _ganador = 0;
        for (int i = 0; i < listOf_Games.length; i++) {
            if (this.listOf_Games[i].haFinalizado()) {
                _ganador = this.listOf_Games[i].getGanadorGame();
                ganoGame(_ganador);
            }
        }
        return _ganador;
    }

    /**
     * Devuelve True en el momento en que la lista de listOf_Games del set tienen en True su respectivo haFinalizado()
     * @return
     */
    public boolean haFinalizado() {
        // boolean _gamesFinalizados = false;
        // for (int i = 0; i < this.listOf_Games.length; i++) {
        //     // Verifica que todos los listOf_Games finalizaron
        //     if (this.listOf_Games[i].haFinalizado()) {
        //         _gamesFinalizados = true;
        //     }
        //     else {
        //         _gamesFinalizados = false;
        //     }
        // }
        // if (_gamesFinalizados && (GamesA == 6 || GamesB == 6)){
        //     _gamesFinalizados = true;
        // }
        // else {
        //     _gamesFinalizados = false;
        // }
        // return _gamesFinalizados;
        if (this.GamesA == 6 || this.GamesB == 6) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Games A = " + GamesA + ", Games B = " + GamesB;
    }

}