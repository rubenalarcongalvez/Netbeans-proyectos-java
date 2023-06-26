package clases;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CartaMarcas extends Carta implements Serializable {
	private static int numCartasMarcas = 1;
	
	public CartaMarcas(String pregunta) {
		super(numCartasMarcas++, pregunta);
	}
	
	@Override
	public String toString() {
		return "- ID: " + this.getId() + "\n  + Marca: " + this.getPregunta();
	}
}
