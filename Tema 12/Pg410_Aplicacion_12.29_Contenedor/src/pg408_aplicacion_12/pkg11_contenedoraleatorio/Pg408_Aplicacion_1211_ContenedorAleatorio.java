/* 12.11
Utilizando la clase Contenedor definida en la Actividad resuelta 12.2, implementa unaa	
aplicación donde se guardan 30 enteros aleatorios entre 1 y 10 y luego se ordenan de	
menor a mayor. La aplicación debe mostrar el contenedor antes y después de ordenar.	
*/

/* 12.12
Añade a la clase Contenedor el método
	void ordenar(Comparator<T> c)
que ordena los elementos del contenedor según el criterio de c.
*/

/* 12.13
Repite la Actividad 12.11 ordenando los números de mayor a menor.
*/

/* 12.14
Añade a la clase Contenedor el método
	T get(int indice)
que devuelve el elemento que ocupa el lugar indice dentro del contenedor
*/

/* 12.29
Añade a la clase Contenedor para tipos genéricos los métodos:	
int ] buscarTodos (Object e): devuelve una tabla con los indices de todas las	
ocurrencias de e.	
boolean eliminarTodos (Object e): elimina todas las ocurrencias de e. Devuelve	
true si la lista queda alterada.	
*/

package pg408_aplicacion_12.pkg11_contenedoraleatorio;

import clasesEInterfaces.*;
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg408_Aplicacion_1211_ContenedorAleatorio {
	
    public static void main(String[] args) {
		System.out.println("Ejercicio: 12.29");
		
		Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
		
		for (int i = 0; i < 30; i++) {
			c.insertarAlFinal((int) (Math.random() * 10 + 1));
		}
		
		System.out.println("Cola: " + c);
		
		System.out.println("Buscar las posiciones de todos los Menganito: " + Arrays.toString(c.buscarTodos("Pepe")));
		System.out.println("Buscar las posiciones de todos los 2: " + Arrays.toString(c.buscarTodos(2)));
		
		System.out.println("Eliminar todos los Menganito: " + c.eliminarTodos("Menganito"));
		System.out.println("Eliminar todos los 2: " + c.eliminarTodos(2));
		
		System.out.println("Cola sin los elementos eliminados: " + c);
    }
}