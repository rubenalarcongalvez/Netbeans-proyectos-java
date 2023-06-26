/*
Implementar la interfaz Comparable en la clase Socio para que, por defecto, se ordene
según los números de identificación -id- crecientes.
 */

 /* 9.9
A partir del comparador de Socios basado en las edades crecientes, obtener otro
que los ordene según edades decrecientes.
 */
package pg289_resuelta97_compararporfecha;

import clases.*;
import java.util.Arrays;
import java.util.Comparator;

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
			new Socio(1, "Juan", "06-05-2004")
		};
		Arrays.sort(t);
		System.out.println(Arrays.deepToString(t)); //Vemos la tabla ordenada por edades puesto que usa el método compareTo(Object ob), y lo hemos sobreescrito, si no, no podría

		//Empezamos con el Comparator
		//Creamos un objeto comparador de la clase ComparaEdades
		ComparaEdades c = new ComparaEdades();
		//Ordenamos la tabla de socios por criterio de comparación de tipo ComparaEdades
		Arrays.sort(t, c);
		//Imprimimos la tabla ordenada por edades
		System.out.println(Arrays.deepToString(t));

		Arrays.sort(t, (Object ob1, Object ob2)
				-> ((Socio) ob1).edad() - ((Socio) ob2).edad());

		System.out.println(Arrays.deepToString(t));
	}
}
