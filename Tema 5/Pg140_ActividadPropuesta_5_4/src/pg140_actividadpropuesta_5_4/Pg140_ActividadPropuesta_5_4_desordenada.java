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
public class Pg140_ActividadPropuesta_5_4_desordenada {

	//Si está o no el elemento en el array y la posición y -1 si no está
	static int busqueda(int array[], int elemento) {
		int posicion = -1;

		for (int contador = 0; contador < array.length && (posicion == -1); contador++) {
			if (array[contador] == elemento) {
				posicion = contador;
			}
		}
		return posicion;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos números desea introducir?");
		int longitud = sc.nextInt();
		int tabla[] = new int[longitud];
		
		for (int contador = 0; contador < longitud; contador++) {
			System.out.print("Número " + (contador) + ": ");
			tabla[contador] = sc.nextInt();
		}
		
		System.out.print("Introduce un número y te diré en qué posición está: ");
		int numero = sc.nextInt();
		
		System.out.println("Tu número está en la posición: " + busqueda(tabla, numero));
		
		//Si lo queremos obtener por la clase Array ya hecha
		System.out.println("Tu número está en la posición: " + Arrays.binarySearch(tabla, numero));
	}
}