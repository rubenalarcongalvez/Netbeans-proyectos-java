package clases;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CartaTabu extends Carta implements Serializable {
	private static int numCartasTabu = 1;
	private final String respuesta;
	private final String[] condiciones;

	public CartaTabu(String pregunta, String respuesta, String[] condiciones) {
		super(numCartasTabu++, pregunta);
		this.respuesta = respuesta;
		this.condiciones = condiciones;
	}
	
	@Override
	public String toString() {
		String resultado = "";
		
		resultado += super.toString() + "\n  + Palabras tabú:\n";
		
		for (String condicion : condiciones) {
			resultado += "    - " + condicion + "\n";
		}
		
		resultado += "  + Respuesta: " + respuesta;
		
		return resultado;
	}
	
}