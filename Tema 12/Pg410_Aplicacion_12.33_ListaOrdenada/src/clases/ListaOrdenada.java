package clases;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Define la clase ListaOrdenada, que almacena una serie de objetos de tipo genérico E,	
de forma ordenada, pudiéndose repetir. Los elementos se ordenarán según el orden na-	
tural de E o bien con el criterio de orden definido en un comparador que se le pasa al	
constructor.	
*/

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <E>
 */
public class ListaOrdenada<E> {
	ArrayList<E> objetos;
	Comparator<E> comparador;

	public ListaOrdenada(List<E> lista) {
		this.objetos = new ArrayList<>();
		this.objetos.addAll(lista);
		this.objetos.sort((Comparator<E>) Comparator.naturalOrder());
	}
	
	public ListaOrdenada(List<E> lista, Comparator<E> comparador) {
		this.objetos = new ArrayList<>();
		this.objetos.addAll(lista);
		this.objetos.sort(comparador);
	}

	@Override
	public String toString() {
		return objetos.toString();
	}
	
}