/*
Implementar la interfaz Comparable en la clase Socio para que, por defecto, se ordene
según la edad de forma ascendiente (de menor a mayor).
*/

/* 9.20
Repetir Actividad de Aplicación 9.19 para que se ordene por edades y, si dos
socios tienen la misma edad, vaya antes el que tenga un número de socio menor
*/

/* 9.21
Repetir Actividad de aplicación 9.20 con un criterio que ordene las fechas
de nacimiento
*/

/* 9.22
Definir una clase comparadora que ordene los socios por orden alfabético de nombres
*/

/* 9.23
Repetir Actividad de aplicación 9.22 con un orden alfabético de nombres invertido (que	
empieza por la letra z)
*/

package pg289_resuelta97_compararporfecha;

import clases.*;
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg289_Resuelta97_CompararPorFecha {

	public static void main(String[] args) {
		//Creamos 2 socios
		Socio socio1 = new Socio(1, "Pepe", "20-02-2001");
		Socio socio2 = new Socio(2, "Josefa", "02-12-2000");

		//Comprobamos si socio1 es mayor que socio2 (porque lo que hicimos fue comparar sus fechas de nacimiento en la sobreescritura
		System.out.println(socio1.compareTo(socio2)); //Sí lo es porque sale 1

		//Creamos una tabla de números primitivos
		int[] tabla = {5, 3, 6, 9, 3, 4, 1, 0, 10};
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla)); //Vemos la tabla ordenada

		//Creamos una tabla de Socios
		Socio[] t = new Socio[]{
			new Socio(2, "Ana", "07-12-1995"),
			new Socio(5, "Jorge", "20-01-2002"),
			new Socio(8, "Juan", "06-05-2004"),
			new Socio(1, "Dolores", "06-05-2004")
		};
		Arrays.sort(t);
		System.out.println(Arrays.deepToString(t)); //Vemos la tabla ordenada por edades puesto que usa el método compareTo(Object ob), y lo hemos sobreescrito, si no, no podría

		//Comparator
		//Creamos una tabla de Socios
		Socio[] ts = new Socio[]{
			new Socio(2, "Ana", "07-12-1995"),
			new Socio(5, "Jorge", "20-01-2002"),
			new Socio(8, "Juan", "06-05-2004"),
			new Socio(1, "Dolores", "06-05-2004")
		};
		
		//Empezamos con el Comparator
		//Creamos un objeto comparador de la clase ComparaEdades
		ComparaNombres c = new ComparaNombres();
		//Ordenamos la tabla de socios por criterio de comparación de tipo ComparaEdades
		Arrays.sort(ts, c);
		//Imprimimos la tabla ordenada por edades
		System.out.println(Arrays.deepToString(ts));
		
		//Orden alfabético invertido
		Arrays.sort(ts, c.reversed());
		//Imprimimos la tabla ordenada por edades
		System.out.println(Arrays.deepToString(ts));
	}
}