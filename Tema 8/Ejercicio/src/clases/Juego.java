package clases;

/**
 *
 * @author Rubén Alarcón Gálvez
 */
public class Juego {
    private final Jugador [] jugadores;

    public Juego(Jugador jugador1, Jugador jugador2) {
        jugadores = new Jugador[2];
        jugadores[0] = jugador1;
        jugadores[1] = jugador2;
    }
    
    public static Jugador juego(Jugador jugador1, Jugador jugador2) {
        Jugador ganador = null;
        int resultado = 0;
        
        if (jugador1.getBaraja().equals(jugador2.getBaraja())) {
            if (jugador1.getCarta(0).getNumPalo() == jugador2.getCarta(0).getNumPalo()) {
                resultado += jugador1.getCarta(0).getNumero() - jugador2.getCarta(0).getNumero();
            }
            
            if (jugador1.getCarta(1).getNumPalo() == jugador2.getCarta(1).getNumPalo()) {
                resultado += jugador1.getCarta(1).getNumero() - jugador2.getCarta(1).getNumero();
            }
            
            if (jugador1.getCarta(0).getNumPalo() == jugador2.getCarta(1).getNumPalo()) {
                resultado += jugador1.getCarta(0).getNumero() - jugador2.getCarta(1).getNumero();
            }
            
            if (jugador1.getCarta(1).getNumPalo() == jugador2.getCarta(0).getNumPalo()) {
                resultado += jugador1.getCarta(1).getNumero() - jugador2.getCarta(0).getNumero();
            }
        }
        
        if (resultado > 0) ganador = jugador1; else if (resultado < 0) ganador = jugador2;
        
        return ganador;
    }
    
}