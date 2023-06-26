/*
8.18 - Diseña la clase ColaDoble, que hereda de Cola para enteros, añadiendo los siguientes métodos:

- void encolarPrincipio(), que encola un elemento al principio de la cola
- Integer desencolarFinal(), que desencola un elemento del final de la cola
*/

package clases;

import utilidades.Limites;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ColaDoble extends Cola {
	
	public ColaDoble() {
		this.tabla = new Integer[0];
	}
	
	public void encolarPrincipio(Integer elemento) {
		super.insertarPrincipio(elemento);
	}
	
	public Integer desencolarFinal() {
		Integer desencolado = null;

		if (!(Limites.esVacia(this))) {
			this.eliminar(this.numeroElementos() - 1);
		}

		return desencolado;
	}
}
