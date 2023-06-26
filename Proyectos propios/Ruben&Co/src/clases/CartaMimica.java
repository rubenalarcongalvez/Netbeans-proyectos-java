package clases;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CartaMimica extends Carta implements Serializable {
	private static int numCartasMimica = 1;
	
	public CartaMimica(String pregunta) {
		super(numCartasMimica++, pregunta);
	}
	
	@Override
	public String toString() {
		return "- ID: " + this.getId() + "\n  + Acción: " + this.getPregunta();
	}
}
