/*
Implementa una función a la que se le pasen dos listas de enteros ordenadas en senti-	
do creciente y nos devuelva una única lista, también ordenada, fusión de las dos ante-	
riores. Desarrolla el algoritmo de forma no destructiva, es decir, que las listas utilizadas.
como parámetros de entrada se mantengan intactas.
*/

package pg409_aplicacion_12.pkg24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg409_Aplicacion_1224 {

	public static List<Integer> combinarOrdenadas(List<Integer> lista1, List<Integer> lista2) {
		ArrayList<Integer> listaCombinada = new ArrayList<>();
        
		listaCombinada.addAll(lista1); listaCombinada.addAll(lista2);
		
		Collections.sort(listaCombinada); //Ordenamos
		
		return listaCombinada;
	}
	
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new LinkedList<>();
		
		//Añadimos
		for (int i = 0; i < 10; i++) {
			lista1.add((int) (Math.random() * 100 + 1));
		}
		
		for (int i = 0; i < 10; i++) {
			lista2.add((int) (Math.random() * 100 + 1));
		}
		
		Collections.sort(lista1); Collections.sort(lista2); //Ordenamos
		
		System.out.println("Lista 1 (ArrayList): " + lista1.toString());
		System.out.println("Lista 2 (LinkedList): " + lista2.toString());
		
		ArrayList<Integer> listaCombinada = new ArrayList<>();
		
		listaCombinada = (ArrayList<Integer>) combinarOrdenadas(lista1, lista2);
		
		System.out.println("Lista combinada: " + listaCombinada);
    }
}