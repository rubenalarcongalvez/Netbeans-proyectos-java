/*
Ordenar un array sin usar la clase sort con el método insercion directa
 */
package tareaprofesor_ordenararray_inserciondirecta;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class TareaProfesor_OrdenarArray_InsercionDirecta {

	static int[] ordenarTabla(int[] tabla) {
		int elementoAuxiliar;
		int ordenAuxiliar;
		
		for (int orden = 1; orden < tabla.length; orden++) {
			ordenAuxiliar = orden;
			for (int contador = orden - 1; contador >= 0; contador--) {
				if (tabla[orden] < tabla[contador]) {
					elementoAuxiliar = tabla[orden];
					tabla[orden] = tabla[contador];
					tabla[contador] = elementoAuxiliar;
					orden--;
				}
			}
			orden = ordenAuxiliar;
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
