/*
Implementa un método genérico al que se le pasa una lista de valores de la clase gené-	
rica T y devuelve otra donde se han eliminado las repeticiones.	
 */
package pg408_aplicacion_12.pkg15_quitarrepes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg408_Aplicacion_1215_QuitarRepes {

	//Rápido pero no sigue orden (tabla)
	public static <T> T[] quitarRepeticionesTablaHashSet(T[] tabla) {
		//Si no nos importa el orden
		//Lo podemos pasar a un Set para que quite las repeticiones
		Set<T> otra = new LinkedHashSet<>();
		otra.addAll(Arrays.asList(tabla));

		//Y luego pasarlo otra vez a lista
		T[] nueva = (T[]) otra.toArray((T[]) new Object[0]);

		return nueva;
	}

	//Óptimo (tabla)
	public static <T> T[] quitarRepeticionesTablaArrayList(T[] tabla) {
		//Creamos un ArrayList vacío
		ArrayList<T> lista = new ArrayList<>();

		//Recorremos todo el ArrayList si contiene elementos del array
		for (T elemento : tabla) {
			if (!lista.contains(elemento)) {  //Si el ArrayList no contiene el elemento, lo añadirá
				lista.add(elemento);
			}
		}

		//Ahora lo pasamos a tabla
		T[] nueva = (T[]) lista.toArray((T[]) new Object[0]);

		return nueva;
	}

	//Óptimo (lista)
	public static <T> List<T> quitarRepeticionesListaArrayList(List<T> lista) {
		List<T> nuevaLista = new ArrayList<>();
		
		for (T elemento : lista) {
			if (!nuevaLista.contains(elemento)) {
				nuevaLista.add(elemento);
			}
		}
		
		return nuevaLista;
	}
	
	public static <T> List<T> eliminarRepetidos(List<T> original) {
		//Creamos un conjunto para eliminar repetidos
		Set<T> c = new LinkedHashSet<>(original); //preserva el orden de inserción.
		
		//Volvemos a la forma de lista
		return new ArrayList<>(c);
	}

	public static void main(String[] args) {
		//Creamos un array normal de Integers
		Integer[] array = {1, 5, 5, 5, 8, 4, 99};
		System.out.println("Array completo: " + Arrays.toString(array));
		
		ArrayList<Integer> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(array));
		
		//Le quitamos las repeticiones a la tabla
		System.out.println("Array sin repeticiones, procedimiento LinkedHashSet (si fuera solo HashSet, no es un orden concreto): " + Arrays.toString(quitarRepeticionesTablaHashSet(array)));
		System.out.println("Array sin repeticiones, procedimiento ArrayList: " + Arrays.toString(quitarRepeticionesTablaArrayList(array)));
		
		//Le quitamos las repeticiones a la lista (ES ESTO LO QUE PEDÍA)
		System.out.println("Lista sin repetidos (ArrayList, QUE ES ESTO LO QUE PEDÍA): " + quitarRepeticionesListaArrayList(lista));
		System.out.println("Lista sin repetidos (HashSet a LinkedList) (poco seguro, mejor no hacerlo): " + eliminarRepetidos(lista));
	}
}