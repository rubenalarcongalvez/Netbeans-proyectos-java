package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Acorazado extends Barco {
	private static int contador;
	private int canones;
	
	public Acorazado(int longitud, int canones) {
		super("Ac", ++contador, longitud);
		this.canones = canones;
	}

	public Acorazado(int longitud) {
		super("Ac", ++contador, longitud);
	}

	@Override
	public String toString() {
		return super.toString() + "\nCañones: " + canones;
	}
	
}