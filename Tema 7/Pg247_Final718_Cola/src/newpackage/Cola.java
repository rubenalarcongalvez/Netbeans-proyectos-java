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
package newpackage;

import java.util.Arrays;
import utilidades.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Cola {

	private Integer[] tabla;

	public Cola() {
		tabla = new Integer[0];
	}

	public void encolar(int numero) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = numero;
	}

	public Integer desencolar() {
		Integer desencolado = null;

		if (!(limites.esVacia(tabla))) {
			desencolado = tabla[0];
			for (int i = 1; i < tabla.length; i++) {
				tabla[i - 1] = tabla[i];
			}
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
		}

		return desencolado;
	}
	
	public void mostrar() {
		System.out.println(Arrays.toString(tabla));
	}
}