package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Submarino extends Barco {
	private static int contador;
	private final int longitudPeriscopio;
	
	public Submarino(int longitud) {
		super("Sub", ++contador, longitud);
		this.longitudPeriscopio = longitud / 10;
	}

	public int getLongitudPeriscopio() {
		return longitudPeriscopio;
	}

	@Override
	public String toString() {
		return super.toString() + "\nLongitud de periscopio: " + longitudPeriscopio + "m";
	}
	
}