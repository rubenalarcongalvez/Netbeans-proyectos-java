/*
Ordenar un array sin usar la clase sort con el método burbuja
 */
package tareaprofesor_ordenararray_burbuja;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class TareaProfesor_OrdenarArray_Burbuja {

	static int[] ordenarTabla(int[] tabla) {
		int elementoAuxiliar;
		boolean cambiado = false;

		for (int orden = 0; orden < tabla.length; orden++) {
			for (int contador = 0; contador < tabla.length - 1 - orden; contador++) {
				if (tabla[contador] > tabla[contador + 1]) {
					elementoAuxiliar = tabla[contador];
					tabla[contador] = tabla[contador + 1];
					tabla[contador + 1] = elementoAuxiliar;
					cambiado = true;
				}
			}
			if (cambiado == false) {
				orden = tabla.length;
			}
		}
		return tabla;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos números desea introducir?");
		int longitud = sc.nextInt();
		int tabla[] = new int[longitud];

		for (int contador = 0; contador < longitud; contador++) {
			System.out.print("Número " + (contador + 1) + ": ");
			tabla[contador] = sc.nextInt();
		}

		//Cómo se haría con la clase sort de Arrays
		//Arrays.sort(tabla);
		System.out.println("Resultado sin ordenar: " + Arrays.toString(tabla));

		//Podemos crear una variable nueva para la tabla ordenada si queremos
		ordenarTabla(tabla);

		//Comprobamos que funciona
		System.out.println("Resultado ordenado: " + Arrays.toString(tabla));
	}
}