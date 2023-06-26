package clases;

import java.util.Comparator;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CompararNombres implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista fut1, Futbolista fut2) {
		return fut1.getNombre().compareToIgnoreCase(fut2.getNombre());
	}
	
}