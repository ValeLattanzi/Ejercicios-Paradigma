package MarcadorTenis;
// La puntuación del tenis se contabiliza en juegos, 
// los cuales van demarcados como 15, 30, 40 los primeros tres puntos y 
// para ganar un juego se deben alcanzar los cuatro puntos, 
// manteniendo siempre una distancia de dos puntos para conseguirlo. 

// En caso de empate a 40 unidades, el ganador del juego debe igualmente sacar dos puntos de ventaja. 
// Cada seis juegos ganados (o siete en caso de empate a cinco o tie-break) significan un set.

// 6 Game -> 1 Set

// En las competencias profesionales, el ganador del partido es aquel que gane 
// dos de tres sets o tres de cinco en competiciones de Grand Slam masculino. 

// 7 Set -> 1 Patido

// El Tie-break se da cuando se establece un límite de juegos por set (siete en competencias oficiales) 
// y el mismo va empatado al estar a un punto del límite establecido. 

// Se juega una especie de 'game' el cual termina cuando un jugador llegue a siete puntos o 
// consiga una diferencia de dos puntos a partir de esa marca.

public class TestPartidoTenis {
    public static void main(String[] args) {
        PartidoTenis partido = new PartidoTenis();
        while (!partido.haFinalizado()) {
            System.out.println(partido.puntoJugador((int) (Math.random() * 2 + 1)));
        }
        partido.getGanadorPartido();
    }
}