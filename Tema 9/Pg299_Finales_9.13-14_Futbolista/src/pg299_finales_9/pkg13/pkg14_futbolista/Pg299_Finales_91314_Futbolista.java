/*
9.13
Diseñar la clase Futbolista con los siguientes atributos: dni, nombre, edad y número de	
goles. Implementar:	
Un constructor y los métodos toString () y equals () (este último basado en el DNI).	
La interfaz Comparable con un criterio de ordenación basado también en el DNI.	
Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la	
edad.
Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.	

9.14
Añadir a la Actividad de aplicación 9.13 un comparador que ordene los futbolistas por	
edades y, para aquellos que tienen la misma edad, por nombres.	
 */
package pg299_finales_9.pkg13.pkg14_futbolista;

import clases.*;
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg299_Finales_91314_Futbolista {

	public static void main(String[] args) {
		Futbolista [] futbolistas = new Futbolista[] {
			new Futbolista("79451278E", "Sergio Ramos", 31, 12),
			new Futbolista("79451278E", "Sargio Ramos", 31, 12),
			new Futbolista("79451278E", "Carles Puyol", 36, 8),
			new Futbolista("79793078E", "Gerard Piqué", 30, 5),
			new Futbolista("45975421K", "Iker Casillas", 33, 0)
		};
		
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
		
		System.out.println("\nOrdenamos por compareTo (DNI):");
		Arrays.sort(futbolistas);
		
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
		
		System.out.println("\nOrdenamos por nombre:");
		Arrays.sort(futbolistas, new CompararNombres());
		
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
		
		System.out.println("\nOrdenamos por edad:");
		Arrays.sort(futbolistas, new CompararEdades());
		
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
		
		System.out.println("\nOrdenamos por DNI, nombre y edad:");
		Arrays.sort(futbolistas, new CompararEdades());
		Arrays.sort(futbolistas, new CompararNombres());
		Arrays.sort(futbolistas);
		
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
	}
}