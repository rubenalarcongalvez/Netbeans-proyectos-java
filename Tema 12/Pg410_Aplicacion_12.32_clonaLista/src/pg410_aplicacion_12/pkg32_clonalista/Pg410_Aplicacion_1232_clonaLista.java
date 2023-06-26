/*
Implementa la función	
static <E> List<E> clonaLista (List<E>)	
que realice una copia exacta de una lista.	
*/
package pg410_aplicacion_12.pkg32_clonalista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg410_Aplicacion_1232_clonaLista {

	public static <E> List<E> clonaLista(List<E> lista) {
		List<E> copia = new ArrayList<>();
		
		copia.addAll(lista);
		
		return copia;
	}
	
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
		lista.add("Test");
		lista.add("Test");
		lista.add("dj");
		lista.add("Ventilador");
		lista.add("Calor");
		lista.add("Frío");
		
		System.out.println("Lista: " + lista);
		System.out.println("Lista clonada: " + clonaLista(lista));
    }
}
