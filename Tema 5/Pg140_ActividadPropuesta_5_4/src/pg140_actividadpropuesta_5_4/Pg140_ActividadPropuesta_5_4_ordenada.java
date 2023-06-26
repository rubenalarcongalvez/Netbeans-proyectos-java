/*
Escribe la función: int buscar (int tl, int clave), que busca
de forma secuencial en la tabla t el valor clave.
En caso de encontrarlo, devuelve en qué posición lo encuentra;
y en caso contrario, devolverá -1.
 */
package pg140_actividadpropuesta_5_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg140_ActividadPropuesta_5_4_ordenada {

	//Si está o no el elemento en el array y la posición y -1 si no está
	static int busquedaBinaria(int array[], int elemento) {
		int posicion = -1;
		int inicio = 0;
		int fin = array.length -1;
		int centro;
		
		while ((posicion == -1) && (inicio <= fin)) {
			centro = (inicio + fin) / 2;
			
			if (array[centro] == elemento)
				posicion = centro;
			else if (array[centro] > elemento)
				fin = centro - 1;
			else
				inicio = centro + 1;
		}
		
		return posicion;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos números desea introducir?");
		int longitud = sc.nextInt();
		int tabla[] = new int[longitud];
		
		for (int contador = 0; contador < longitud; contador++) {
			System.out.print("Número " + (contador+1) + ": ");
			tabla[contador] = sc.nextInt();
		}
		
		Arrays.sort(tabla);
		
		System.out.print("Introduce un número y te diré en qué posición está (la tabla está ordenada ya, no tiene porqué ser la posición que pusiste): ");
		int numero = sc.nextInt();
		
		System.out.println("Tu número está en la posición: " + busquedaBinaria(tabla, numero));
		
		//Si lo queremos obtener por la clase Array ya hecha
		System.out.println("Tu número está en la posición: " + Arrays.binarySearch(tabla, numero));
	}
}