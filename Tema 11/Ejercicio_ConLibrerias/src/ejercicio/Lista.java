package ejercicio;

import java.util.Arrays;
import java.io.Serializable;
import java.util.Comparator;

public class Lista<T> implements Serializable {

	private T[] tabla;

	public Lista() {
		tabla = (T[]) new Object[0];
	}

	public void insertarFinal(T nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = nuevo;
	}

	public T eliminar(int indice) {
		T objeto = null; //Creamos el objeto, nulo si no encuentra el índice

		//Si el objeto se corresponde con algo
		if (indice < tabla.length && indice >= 0) {
			objeto = this.tabla[indice];

			//Copiamos el Array a una posición atrás
			for (int i = indice; i < tabla.length - 1; i++) {
				tabla[i] = tabla[i + 1];
			}

			tabla = Arrays.copyOf(tabla, tabla.length - 1); //Quitamos el que nos sobra
		}
		
		return objeto;
	}

	public T get(int indice) {
		T resultado = null;
		if (indice >= 0 && indice < tabla.length) {//índice válido
			resultado = tabla[indice];
		}
		return resultado;
	}

	public int buscar(T claveBusqueda) {
		int indice = -1;
		for (int i = 0; i < tabla.length && indice == -1; i++) {
			if (tabla[i].equals(claveBusqueda)) {
				indice = i;
			}
		}
		return indice;
	}

	public void ordenar(Comparator<T> comparador) {
		Arrays.sort(tabla, comparador); //Solo hay que usar las clases comparadoras y el método Arrays.sort()
	}

	@Override
	public String toString() {
		return Arrays.deepToString(tabla);
	}

}