/*
Una cola es otra estructura dinámica como la pila, donde los elementos, en vez de apilar-	
se y desapilarse, se encolan y desencolan. La diferencia con las pilas es que se desencola	
el primer elemento encolado, ya que así es como funcionan las colas del autobús o del	
cine. El primero que llega es el primero que sale de la cola (vamos a suponer que nadie	
se cuela). Por tanto, los elementos se encolan y desencolan en extremos opuestos de la	
estructura, llamados primero (el que está primero y será el próximo en abandonar la cola)	
y último (el que llegó último). Implementa la clase Cola donde los elementos Integer	
encolados se guardan en una tabla.	
 */
//Repite la actividad 7.18 usando una Lista para guardar los elementos encolados
package newpackage;

import utilidades.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Cola {

	private Lista tabla;

	public Cola() {
		tabla = new Lista();
	}

	public void encolar(Integer elemento) {
		tabla.insertarFinal(elemento);
	}

	public Integer desencolar() {
		Integer desencolado = null;

		if (!(Limites.esVacia(tabla))) {
			tabla.eliminar(0);
		}

		return desencolado;
	}

	public void mostrar() {
		tabla.mostrar();
	}
}