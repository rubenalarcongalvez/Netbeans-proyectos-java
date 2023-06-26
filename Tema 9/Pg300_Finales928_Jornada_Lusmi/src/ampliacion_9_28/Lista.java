/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion_9_28;

import java.util.Arrays;

import java.util.Comparator;

/**
 *
 * @author Luis
 * @param <T>
 */
public class Lista<T> {

	private T[] tabla;

	public Lista() {

		this.tabla = (T[]) new Object[0];
		
	}

	public boolean insertarPrincipio(T nuevo) {

		return this.insertar(0, nuevo);

	}

	public boolean insertarFinal(T nuevo) {

		return insertar(tabla.length, nuevo); //Porque inserta en el último, creando uno nuevo (solo uno)

	}

	public boolean insertar(int posicion, T nuevo) {

		boolean existe = false;
		T [] otro;

		if (posicion >= 0 && posicion <= tabla.length) { //Porque permite incrementar el array en uno más
			existe = true;
			otro = (T []) new Object[tabla.length + 1];
			
			for (int indice = 0; indice < posicion; indice++) {
				otro[indice] = tabla[indice];
			}
			
			otro[posicion] = nuevo;
			
			for (int indice = posicion; indice < tabla.length; indice++) {
				otro[indice + 1] = tabla [indice];
			}
			
			this.tabla = otro;
			
		}
		
		return existe;
		
	}

	public T eliminar(int indice) {

		T eliminado = null;

		if (indice >= 0 && indice < tabla.length) {

			eliminado = tabla[indice];

			for (int i = indice + 1; i < tabla.length - 1; i++) {

				tabla[i - 1] = tabla[i];

			}
			tabla = Arrays.copyOf(tabla, tabla.length - 1);

		}

		return eliminado;

	}

	public T get(int indice) {

		T resultado = null;

		if (indice >= 0 && indice < tabla.length) {

			resultado = tabla[indice];

		}

		return resultado;

	}

	public int clave(T claveBusqueda) {

		int indice = -1;

		for (int i = 0; i < this.tabla.length; i++) {

			if (this.tabla[i].equals(claveBusqueda)) {
				indice = i;
			}

		}

		return indice;

	}

	public void ordenar() {

		Arrays.sort(tabla);

	}

	public void ordenar(Comparator<T> comp) {

		Arrays.sort(tabla, comp);

	}

	public int numeroElemento() {

		return tabla.length;

	}

	public String mostrar() {

		return Arrays.toString(tabla);

	}

}
