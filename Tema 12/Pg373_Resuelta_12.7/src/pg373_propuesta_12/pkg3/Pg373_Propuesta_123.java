/* Resuelta 12.6
Implementar una aplicación donde se insertan 100 números enteros aleatorios entre 1	
y 10 (incluidos), que pueden estar repetidos, en una colección. Después se eliminan 
todos los elementos que valen 5. Mostrar la colección antes y después de la eliminación.
*/

/* Resuelta 12.7
Repite la Actividad resuelta 12.6 usando métodos globales
*/

package pg373_propuesta_12.pkg3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg373_Propuesta_123 {

	@SuppressWarnings("empty-statement") //Podemos quitar los warnings para que no notifique que podría estar mal el while vacío (no recomendable salvo ciertos casos)
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>(); //Admite repetidos, pero como
		//lo declaramos como Collection, solo podemos acceder a los métodos de Collection
		
		for (int i = 0; i < 100; i++) {
			lista.add((int) (Math.random() * 10 + 1));
		}
		
		System.out.println("Lista completa: " + lista);
		
		Collection<Integer> c = new ArrayList<>();
		c.add(5); //colección con un único elemento
		lista.removeAll(c); //elimina todas las ocurrencias de 5
		
		System.out.println("Lista sin ningún 5: " + lista);
    }
}