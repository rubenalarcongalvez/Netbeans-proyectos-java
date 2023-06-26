package clases;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CartaPintar extends Carta implements Serializable {
	private static int numCartasPintar = 1;
	
	public CartaPintar(String pregunta) {
		super(numCartasPintar++, pregunta);
	}
	
	@Override
	public String toString() {
		return "- ID: " + this.getId() + "\n  + Pintar: " + this.getPregunta();
	}
}
