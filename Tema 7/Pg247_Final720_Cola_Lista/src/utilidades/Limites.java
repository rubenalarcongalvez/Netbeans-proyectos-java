package utilidades;

import newpackage.Lista;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Limites {
	public static boolean esVacia(Lista tabla) {
		boolean vacia = false;
		
		if (tabla.numeroElementos() == 0) {
			vacia = true;
		}
		
		return vacia;
	}
}
