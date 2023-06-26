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

package pg408_aplicacion_12.pkg11_contenedoraleatorio;

import clasesEInterfaces.*;
import java.util.Comparator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg408_Aplicacion_1211_ContenedorAleatorio {
	
	//Si no hubiera toString
	public static void mostrarPorPantalla(Contenedor<Integer> cont) {
		
		int contador = 0;
		
		while(cont.get(contador) != null) {
			System.out.print(cont.get(contador) + " ");
			contador++;
		}
	}
	
    public static void main(String[] args) {
		System.out.println("12.11");
		
		Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
		
		for (int i = 0; i < 30; i++) {
			c.insertarAlFinal((int) (Math.random() * 10 + 1));
		}
		
		System.out.println("Sin ordenar: " + c);
		
		c.ordenar();
		
		System.out.println("Ordenado de menor a mayor: " + c);
		
		System.out.println("\n12.12 - 12.13");
		
//		c.ordenar((Comparator.naturalOrder().reversed())); //Comparar pero al revés llamando a naturalOrder
		
		//O si lo queremos resumir
		c.ordenar((Comparator.reverseOrder())); //Comparar pero al revés llamando a reverseOrder
		//O si lo queremos resumir
//		c.ordenar((Comparator<Integer>) Comparator.reverseOrder()); //Comparar pero al revés llamando a reverseOrder
		
		//Otra forma (lambda)
//		c.ordenar((Integer o1, Integer o2) -> o2 - o1);
		
		//También podemos utilizar clases anónimas
//		c.ordenar(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//	});
		
		System.out.println("Ordenado de mayor a menor: " + c);
		
		System.out.println("\n12.14");
		
		System.out.println("Indice 40: " + c.get(40));
		System.out.println("Indice 4: " + c.get(4));
		
		mostrarPorPantalla(c); System.out.println(); //Para saltar de línea
		c.ordenar();
		mostrarPorPantalla(c);
    }
}