/*
Enunciado
*/

package pkg1.pruebas;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ExcepcionEdadNegativa extends Exception {
	@Override
	public String toString() {
		return "Edad negativa";
	}
}
