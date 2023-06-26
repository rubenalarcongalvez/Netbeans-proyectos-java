package utilidades;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class limites {
	//hacer un método esVacía (si la lista está vacía o no)
	public static boolean esVacia(Integer [] tabla) {
		boolean vacia = false;
		
		if (tabla.length == 0) {
			vacia = true;
		}
		
		return vacia;
	}
}
