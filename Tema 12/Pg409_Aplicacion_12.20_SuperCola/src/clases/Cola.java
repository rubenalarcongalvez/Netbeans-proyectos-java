/* 12.17
Implementa la clase Cola genérica utilizando un objeto ArrayList para guardar los elementos.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class Cola<T> {

	private ArrayList<T> cola;

	public Cola(List<T> cola) {
		this.cola = (ArrayList<T>) cola; //Solo para admitir más tipos de lista
	}

	public void encolar(T nuevo) {
		cola.add(0, nuevo); //Inserta al principio
	}

	public T desencolar(Cola<T> otraCola) {
		T eliminado = null;

		if (cola.isEmpty()) { //Si nuestra cola está vacía, mira en la otra cola
			if (!otraCola.cola.isEmpty()) { //Si no está vacía, desencola de ahí
				eliminado = otraCola.cola.get(otraCola.cola.size() - 1);

				otraCola.cola.remove(otraCola.cola.size() - 1); //Extrae del final de la otra cola
			}
		} else { //Si nuestra cola tiene elementos, desencolará uno
			eliminado = cola.get(cola.size() - 1);

			cola.remove(this.cola.size() - 1); //Extrae del final
		}

		return eliminado; //Dice cuál extrae
	}

	@Override
	public String toString() {
		return cola.toString();
	}
}