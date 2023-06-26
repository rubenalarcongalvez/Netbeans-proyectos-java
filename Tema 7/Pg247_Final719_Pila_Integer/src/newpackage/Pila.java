/*
Implementa la clase Pila para números Integer, usando directamente una tabla para
guardar los elementos apilados
 */
package newpackage;

import java.util.Arrays;
import utilidades.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pila {

	private Integer[] tabla;

	public Pila() {
		tabla = new Integer[0];
	}

	public void apilar(int numero) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = numero;
	}

	public Integer desapilar() {
		Integer desencolado = null;

		if (!(limites.esVacia(tabla))) {
			desencolado = tabla[tabla.length - 1];
			
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
		}

		return desencolado;
	}
	
	public void mostrar() {
		System.out.println(Arrays.toString(tabla));
	}
}