/* 12.30. 
Implementa una función	
<T> List<T> eliminaRepetidos (List<T> lista)	
a la que se pase una lista de objetos y devuelva una copia sin elementos repetidos.	
*/

package pg410_aplicacion_12.pkg30_eliminarepetidos;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg410_Aplicacion_1230_eliminaRepetidos {

	public static <T> List<T> eliminaRepetidos (List<T> lista)	{
		LinkedHashSet<T> sinRepetidos = new LinkedHashSet<>();
		sinRepetidos.addAll(lista);
		
		lista.clear(); lista.addAll(sinRepetidos); //Vaciamos y simplemente metemos los no repetidos
		
		return lista;
	}
	
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
		
		lista.add("Test");
		lista.add("home");
		lista.add("neither");
		lista.add("5");
		lista.add("none");
		lista.add("Test");
		lista.add("fun");
		lista.add("fun");
		
		System.out.println("Lista: " + lista.toString());
		System.out.println("Lista sin repetidos: " + eliminaRepetidos(lista));
    }
}