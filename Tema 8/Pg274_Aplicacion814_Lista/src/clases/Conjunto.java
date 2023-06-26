/* 8.19
Un conjunto es un objeto similar a las listas, capaz de guardar valores de un tipo determi-	
nado, con la diferencia de que sus elementos no pueden estar repetidos. Escribe la cla-	
se Conjunto para enteros heredando de Lista y reimplementando los métodos de inser-	
ción para evitar las repeticiones.
 */

/* 8.20
Implementa un método equals() en la clase Conjunto. Dos conjuntos se consideran igua-
les si tienen los mismos elementos, no importa en qué orden.
*/

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Conjunto extends Lista {

	public Conjunto() {
		this.tabla = new Integer[0];
	}

	@Override
	public void insertarPrincipio(Integer nuevo) {
		if (!(this.seRepite(nuevo))) {
			super.insertarPrincipio(nuevo);
		}
	}

	@Override
	public void insertarFinal(Integer nuevo) {
		if (!(this.seRepite(nuevo))) {
			super.insertarFinal(nuevo);
		}
	}

	@Override
	public void insertarFinal(Lista otraLista) {
		for (int i = 0; i < otraLista.numeroElementos(); i++) {
			if (!(this.seRepite(otraLista.tabla[i]))) {
				super.insertarFinal(otraLista.tabla[i]);
			}
		}
	}

	@Override
	public void insertar(int posicion, Integer nuevo) {
		if (!(this.seRepite(nuevo))) {
			super.insertar(posicion, nuevo);
		}
	}

	private boolean seRepite(Integer numero) {
		boolean repite = false;

		for (int i = 0; i < this.numeroElementos() && repite == false; i++) {
			if (this.tabla[i] == numero) {
				repite = true;
			}
		}

		return repite;
	}
	
	@Override
	public boolean equals(Object otroConjunto) {
		Conjunto conjunto2 = new Conjunto();
		conjunto2 = (Conjunto) otroConjunto;
		
		boolean resultado = true;
		
		if (this.numeroElementos() == conjunto2.numeroElementos()) {
			for (int i = 0; i < this.numeroElementos() && resultado == false; i++) {
				if (!(this.seRepite(conjunto2.tabla[i]))) {
					resultado = false;
				}
			}
		} else {
			resultado = false;
		}
		
		return resultado;
	}
}