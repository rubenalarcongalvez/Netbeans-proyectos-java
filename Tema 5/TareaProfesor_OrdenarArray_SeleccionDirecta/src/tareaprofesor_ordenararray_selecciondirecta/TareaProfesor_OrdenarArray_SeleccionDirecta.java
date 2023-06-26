/*
Ordenar un array sin usar la clase sort con el método de selección directa
 */
package tareaprofesor_ordenararray_selecciondirecta;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class TareaProfesor_OrdenarArray_SeleccionDirecta {

	static int [] ordenarTabla(int [] tabla) {
		int orden = 0;
		int elementoAuxiliar;
		
		//Creamos una tabla extra para ir volcando los valores en orden
		for (int elemento : tabla) {
			for (int contador = orden; contador < tabla.length-1; contador++) { //En cada iteración, descartamos los anteriores que ya sabemos que serán menores gracias al bucle
				if (tabla[orden] > tabla[contador+1]) { //Si el siguiente es mayor que el actual, cambiamos sus valores unos por otros
					elementoAuxiliar = tabla[orden];
					tabla[orden] = tabla[contador+1];
					tabla[contador+1] = elementoAuxiliar;
				} 
			}
			orden++;
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

		System.out.println("Resultado sin ordenar: " + Arrays.toString(tabla));
		
		//Cómo se haría con la clase sort de Arrays
		//Arrays.sort(tabla);
		
		ordenarTabla(tabla);
		
		//Comprobamos que funciona
		System.out.println("Resultado ordenado: " + Arrays.toString(tabla));
	}
}