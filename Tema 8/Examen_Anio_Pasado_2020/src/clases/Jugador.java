package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Jugador {
	private final String id;
	private static int numero;
	private final Carta [] cartas;

	public Jugador() {
		numero++;
		this.id = "J-" + numero;
		cartas = new Carta[2];
		cartas[0] = new Carta();
		cartas[1] = new Carta();
	}

	public Carta getCarta(int carta) {
		return cartas[carta];
	}

	@Override
	public String toString() {
		return id;
	}
	
}