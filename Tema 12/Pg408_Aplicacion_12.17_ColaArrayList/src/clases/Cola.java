/* 12.17
Implementa la clase Cola genérica utilizando un objeto ArrayList para guardar los elementos.
 */
package clases;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class Cola<T> {

	private ArrayList<T> lista;

	public Cola(Collection<T> lista) {
		this.lista = new ArrayList<>(lista); //Para admitir todos los tipos posibles
	}

	public void encolar(T nuevo) {
		lista.add(0, nuevo); //Inserta al principio
	}

	public T desencolar() {
		T eliminado = null;

		if (!lista.isEmpty()) {
			eliminado = lista.get(lista.size() - 1);

			lista.remove(this.lista.size() - 1); //Extrae del final
		}
		
		return eliminado; //Dice cuál extrae
	}

	@Override
	public String toString() {
		return lista.toString();
	}
}
