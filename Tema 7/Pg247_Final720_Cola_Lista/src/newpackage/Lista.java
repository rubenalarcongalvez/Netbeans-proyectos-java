/* Implementamos las listas con tablas de tipo Integer, que iremos	
redimensionando según vaya haciendo falta. El indice de un elemento en la	
lista coincide con el indice del lugar me ocupa en la tabla	*/
package newpackage;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Lista {

	private Integer[] tabla; //Tiene que ser private

	public Lista() {
		tabla = new Integer[0];
	}

	public void insertarPrincipio(Integer nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
		tabla[0] = nuevo;
	}

	public void insertarFinal(Integer nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = nuevo;
	}

	public void insertarFinal(Lista otraLista) {
		int tamIni = tabla.length; //tamaño inicial tabla
		tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
		System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
	}

	//El primer parámetro es el índice del lugar donde queremos insertar
	//el valor del segundo parámetro
	public void insertar(int posicion, Integer nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
		tabla[posicion] = nuevo;
	}

	//Se elimina el elemento correspondiente a indice y se devuelve
	public Integer eliminar(int indice) {
		Integer eliminado = null;
		if (indice >= 0 && indice < tabla.length) {
			eliminado = tabla[indice];
			for (int i = indice + 1; i < tabla.length; i++) {
				tabla[i - 1] = tabla[i];
			}
			tabla = Arrays.copyOf(tabla, tabla.length - 1);
		}
		return eliminado;
	}

	/*	Al siguiente método le pasaremos un indice y nos devolverá el elemento	
		correspondiente de la tabla sin modificarla. En el caso de que el indice no	
		sea válido, devolverá null, con lo cual evitamos que el programa aborte.	  */
	public Integer get(int indice) {
		Integer resultado = null;
		if (indice >= 0 && indice < tabla.length) { //índice válido
			resultado = tabla[indice];
		}
		return resultado;
	}
	
	public int buscar(Integer claveBusqueda) {
		int indice = -1;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i].equals(claveBusqueda)) { //no vale tabla[i]==claveBusqueda porque es Integer y no int
				indice = i;
			}
		}
		return indice;
	}
	
	//El número de elementos de la lista es el número de elementos de la tabla
	public int numeroElementos() {
		return tabla.length;
	}
	
	//Muestra por consola el contenido de la lista
	public void mostrar() {
		System.out.println(Arrays.toString(tabla));
	}
	
	//7.12
	//Crearemos un objeto Lista donde insertaremos todos los elementos de l1 y l2.
	public static Lista concatena(Lista l1, Lista l2) {
		Lista resultado = new Lista(); //objeto Lista que contendrá la concatenación
		
		for (Integer e : l1.tabla) { //recorremos los elementos de l1 e insertamos
			resultado.insertarFinal(e); //insertamos al final para mantener el orden
		}
		
		for (Integer e : l2.tabla) { //recorremos los elementos de l2 e insertamos
			resultado.insertarFinal(e); //insertamos al final para mantener el orden
		}
		return resultado;
	}
}