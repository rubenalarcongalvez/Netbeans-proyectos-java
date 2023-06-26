/*
Comparador de Edades
*/

package clases;

import java.util.Comparator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ComparaEdades implements Comparator {
	@Override
	public int compare(Object ob1, Object ob2) {
		return ((Socio)ob1).edad() - ((Socio)ob2).edad();
	}
}