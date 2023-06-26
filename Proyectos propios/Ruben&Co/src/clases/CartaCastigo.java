package clases;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CartaCastigo extends Carta implements Serializable {
	private static int numCartasCastigo = 1;
	
	public CartaCastigo(String pregunta) {
		super(numCartasCastigo++, pregunta);
	}
	
	@Override
	public String toString() {
		return "- ID: " + this.getId() + "\n  + Castigo: " + this.getPregunta();
	}
}
