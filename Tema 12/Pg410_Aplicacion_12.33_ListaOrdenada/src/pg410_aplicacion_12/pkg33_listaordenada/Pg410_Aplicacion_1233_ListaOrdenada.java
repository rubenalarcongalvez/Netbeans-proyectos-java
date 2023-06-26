/*
Define la clase Lista0rdenada, que almacena una serie de objetos de tipo genérico E,	
de forma ordenada, pudiéndose repetir. Los elementos se ordenarán según el orden na-	
tural de E o bien con el criterio de orden definido en un comparador que se le pasa al	
constructor.	
*/

package pg410_aplicacion_12.pkg33_listaordenada;

import java.util.LinkedList;
import clases.*;
import java.util.Comparator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg410_Aplicacion_1233_ListaOrdenada {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
		lista.add("Test");
		lista.add("Test");
		lista.add("dj");
		lista.add("Ventilador");
		lista.add("Calor");
		lista.add("Frío");
		
		ListaOrdenada<String> listaOrdenada = new ListaOrdenada<>(lista);
		
		System.out.println("Lista: " + lista);
		System.out.println("Lista ordenada: " + listaOrdenada);
		
		ListaOrdenada<String> listaOrdenadaAlReves = new ListaOrdenada<>(lista, Comparator.reverseOrder());
		
		System.out.println("Lista: " + lista);
		System.out.println("Lista ordenada al revés: " + listaOrdenadaAlReves);
    }
}