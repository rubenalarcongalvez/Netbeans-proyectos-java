package clases;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class Pila<T> {

	private ArrayList<T> lista;

	public Pila(Collection<T> lista) {
		this.lista = new ArrayList<>(lista); //Para admitir todos los tipos posibles
	}

	public void apilar(T nuevo) {
		this.lista.add(nuevo); //Inserta al final
	}

	public T desapilar() {
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