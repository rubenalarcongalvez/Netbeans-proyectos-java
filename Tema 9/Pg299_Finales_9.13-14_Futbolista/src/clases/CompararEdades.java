package clases;

import java.util.Comparator;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CompararEdades implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista fut1, Futbolista fut2) {
		int resultado = 0;
		
		if (fut1.getEdad() > fut2.getEdad()) {
			resultado = 1;
		} else if (fut1.getEdad() < fut2.getEdad()) {
			resultado = -1;
		}
		
		return resultado;
	}
	
}