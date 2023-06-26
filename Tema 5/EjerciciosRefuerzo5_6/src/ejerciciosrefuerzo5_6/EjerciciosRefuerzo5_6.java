/*
Escribe un programa que lea 15 números por teclado y que los almacene en un	
array. Rota los elementos de ese array, es decir, el elemento de la posición 00	
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en	
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido	
del array.
 */
package ejerciciosrefuerzo5_6;

import java.util.Arrays;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class EjerciciosRefuerzo5_6 {

	static int[] rotar(int[] tabla) {
		int elementoAuxiliar;

		for (int contador = 1; contador < tabla.length; contador++) {
			elementoAuxiliar = tabla[contador];
			tabla[contador] = tabla[0];
			tabla[0] = elementoAuxiliar;
		}
		return tabla;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] tabla = new int[15];

		System.out.println("Introduce 15 dígitos a continuación:");

		for (int contador = 0; contador < tabla.length; contador++) {
			System.out.print("Número " + (contador + 1 + ": "));
			tabla[contador] = sc.nextInt();
		}

		System.out.println("Tabla sin rotar: " + Arrays.toString(tabla));

		System.out.println("Tabla rotada: " + Arrays.toString(rotar(tabla)));
	}
}