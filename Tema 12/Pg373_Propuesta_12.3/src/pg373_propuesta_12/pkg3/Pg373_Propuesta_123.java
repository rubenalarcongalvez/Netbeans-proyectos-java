/* Resuelta 12.6
Implementar una aplicación donde se insertan 100 números enteros aleatorios entre 1	
y 10 (incluidos), que pueden estar repetidos, en una colección. Después se eliminan 
todos los elementos que valen 5. Mostrar la colección antes y después de la eliminación.
*/

/* Propuesta 12.3
Repite la Actividad resuelta 12.6 usando un iterador para eliminar los elementos
cuyo valor es 5
*/

package pg373_propuesta_12.pkg3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg373_Propuesta_123 {

	@SuppressWarnings("empty-statement") //Podemos quitar los warnings para que no notifique que podría estar mal el while vacío (no recomendable salvo ciertos casos)
    public static void main(String[] args) {
        System.out.println("Actividad resuelta 12.6");
		
		Collection<Integer> lista = new ArrayList<>(); //Admite repetidos, pero como
		//lo declaramos como Collection, solo podemos acceder a los métodos de Collection
		
		for (int i = 0; i < 100; i++) {
			lista.add((int) (Math.random() * 10 + 1));
		}
		
		System.out.println("Lista completa: " + lista);
		
		//Hacemos un while porque el método de Collection .remove, solo elimina el
		//primero, y queremos que elimine todos los 5
		while(lista.remove(5)); //Mientras lista.remove(5) sea verdadero, elimina el 5
		/*También podemos crear variable eliminado arriba y decir: 
		while(eliminado){
			eliminado = lista.remove(5);
		}
		
		O también, directamente while(lista.remove(5) == true);*/
		
		System.out.println("Lista sin números 5: " + lista);
		
		System.out.println("\nActividad Propuesta 12.3");
		
		Collection<Integer> conjunto = new HashSet<>();
		
		for (int i = 0; i < 100; i++) { //Aunque pongamos 100 números, como no pueden estar repetidos, solo cogerá 10 números (1-10)
			conjunto.add((int) (Math.random() * 10 + 1));
		}
		
		System.out.println("Conjunto completo: " + conjunto);
		
//		Iterator<Integer> it = conjunto.iterator(); //Podemos crearlo aquí y hacerlo con un bucle while
		//Pero lo hacemos con un for para que no prevalezca la variable fuera del bucle
		for(Iterator<Integer> it = conjunto.iterator(); it.hasNext();) { //Mientras haya un siguiente
			Integer n = it.next(); //Creamos una variable para que no haga más next de lo necesario en el if
			if (n == 5) { //si el número es igual a 5
				it.remove();  //lo eliminamos
			}
		}
		
		System.out.println("Conjunto sin números 5: " + conjunto);
    }
}