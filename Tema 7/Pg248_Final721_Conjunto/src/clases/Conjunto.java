/*
Un conjunto es una estructura dinámica de datos como la lista, con dos diferencias: en	
primer lugar, en una lista puede haber elementos repetidos, mientras que en un conjun-	
to, no. Además, en una lista el orden de inserción de los elementos puede ser relevante	
y debemos tenerlo en cuenta, mientras que en un conjunto solo interesa si un elemento	
pertenece o no al conjunto y no el lugar que ocupa. Se pide implementar la clase Conjun-	
to utilizando una lista para almacenar números de tipo Integer. Implementa los siguien-	
tes métodos:

- Un constructor sin parámetros.	
- int numeroElementos(): devuelve el número de elementos del conjunto.	
- boolean insertar(Integer nuevo): inserta un nuevo elemento en el conjunto.	
- boolean insertar(Conjunto otroConjunto ): añade al conjunto los elementos del	conjunto otroConjunto.	
- boolean eliminarElemento(Integer elemento): en caso de pertenecer al conjunto, elimina elemento.	
- boolean eliminarConjunto(Conjunto otroConjunto): elimina del conjunto invocante
los elementos del conjunto que se pasa como parámetro.	
- boolean pertenece(Integer elemento): indica si el elemento que se le pasa
como parámetro pertenece o no al conjunto.	
- muestra(): muestra el conjunto por consola.	

De forma general, los métodos que devuelven un booleano indican con él si el conjunto	
se ha modificado.	
 */
package clases;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Conjunto {

	private Integer[] lista;

	public Conjunto() {
		lista = new Integer[0];
	}

	public int numeroElementos() {
		return lista.length;
	}

	public boolean insertar(Integer nuevo) {
		boolean sePuede = true;

		for (Integer lista2 : lista) {
			if (nuevo == lista2) {
				sePuede = false;
			}
		}

		if (sePuede) {
			lista = Arrays.copyOf(lista, lista.length + 1);
			lista[lista.length - 1] = nuevo;
		}

		return sePuede;
	}

	public boolean insertar(Conjunto otroConjunto) {
		boolean sePuede = false;

		for (int i = 0; i <= lista.length; i++) {
			for (int j = 0; j < otroConjunto.lista.length; j++) {
				if (insertar(otroConjunto.lista[j])) {
					sePuede = true;
				}
			}
		}

		return sePuede;
	}

	public boolean eliminarElemento(Integer elemento) {
		boolean sePuede = false;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == elemento) {
				sePuede = true;

				for (int j = i + 1; j < lista.length; j++) {
					lista[j - 1] = lista[j];
				}

				lista = Arrays.copyOf(lista, lista.length - 1);
			}
		}

		return sePuede;
	}

	public boolean eliminarConjunto(Conjunto otroConjunto) {
		boolean sePuede = false;

		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < otroConjunto.lista.length; j++) {
				if (eliminarElemento(otroConjunto.lista[j])) {
					sePuede = true;
				}
			}
		}

		return sePuede;
	}

	public boolean pertenece(Integer elemento) {
		boolean siPertenece = false;

		for (Integer lista2 : lista) {
			if (lista2 == elemento) {
				siPertenece = true;
			}
		}

		return siPertenece;
	}

	public void mostrar() {
		System.out.println(Arrays.toString(this.lista));
	}

	/*
Añade a la clase Conjunto los siguientes métodos estáticos:	

- static boolean incluido(Conjunto c1, Conjunto c2): que devuelve true si c1	
está incluido en c2, es decir, si todos los elementos de c1 están también en c2.	
- static Conjunto union(Conjunto c1, Conjunto c2): devuelve un nuevo conjunto	
con todos los elementos que están en c1, en c2 o en ambos (elementos comunes y no	
comunes).	
- static Conjunto interseccion(Conjunto c1, Conjunto c2): que devuelve un nuevo conjunto	
con todos los elementos que están en c1 y en c2 a la vez (elementos comunes).	
- static Conjunto diferencia(Conjunto c1, Conjunto c2): que devuelve un nuevo conjunto	
con todos los elementos que están en c1, pero no en c2 (elementos no comunes).	
	 */
	public static boolean incluido(Conjunto c1, Conjunto c2) {
		boolean dentro = true;
		boolean bandera = false; //para cerciorarnos de que es igual un número que en el otro conjunto

		for (int i = 0; i < c1.lista.length && dentro == true; i++) {
			for (int j = 0; j < c2.lista.length; j++) {
				if (c1.lista[i] == c2.lista[j]) {
					bandera = true;
				}
			}
			if (bandera == false) {
				dentro = false;
			} else {
				bandera = false;
			}
		}

		return dentro;
	}

	public static Conjunto union(Conjunto c1, Conjunto c2) {
		Conjunto c3 = new Conjunto();

		c3.insertar(c1);
		c3.insertar(c2);

		return c3;
	}

	public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
		Conjunto c3 = new Conjunto();

		for (Integer lista1 : c1.lista) {
			for (Integer lista2 : c2.lista) {
				if (lista1 == lista2) {
					c3.insertar(lista1);
				}
			}
		}
		return c3;
	}

	public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
		Conjunto c3 = new Conjunto();
		boolean iguales = false;

		for (Integer lista1 : c1.lista) {
			for (Integer lista2 : c2.lista) {
				if (lista1 == lista2) {
					iguales = true;
				}
			}
			if (iguales == false) {
				c3.insertar(lista1);
			}
			iguales = false;
		}
		return c3;
	}
}