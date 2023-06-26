package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Juego {
	private final Jugador [] jugadores;

	public Juego() {
		jugadores = new Jugador[2];
		jugadores[0] = new Jugador();
		jugadores[1] = new Jugador();
	}
	
	public Jugador ganador(Jugador jugador1, Jugador jugador2) {
		Jugador gana = null;
		int diferencia = 0;
		
		if (Carta.mismoPalo(jugador1.getCarta(0), jugador2.getCarta(0))) {
			diferencia = Carta.compararNumero(jugador1.getCarta(0), jugador2.getCarta(0));
		}
		
		if (Carta.mismoPalo(jugador1.getCarta(0), jugador2.getCarta(1))) {
			diferencia = Carta.compararNumero(jugador1.getCarta(0), jugador2.getCarta(1));
		}
		
		if (Carta.mismoPalo(jugador1.getCarta(1), jugador2.getCarta(1))) {
			diferencia = Carta.compararNumero(jugador1.getCarta(1), jugador2.getCarta(1));
		}
		
		if (Carta.mismoPalo(jugador1.getCarta(1), jugador2.getCarta(0))) {
			diferencia = Carta.compararNumero(jugador1.getCarta(1), jugador2.getCarta(0));
		}
		
		if (diferencia > 0) gana = jugador1; else if (diferencia < 0) gana = jugador2;
		
		return gana;
	}
	
}