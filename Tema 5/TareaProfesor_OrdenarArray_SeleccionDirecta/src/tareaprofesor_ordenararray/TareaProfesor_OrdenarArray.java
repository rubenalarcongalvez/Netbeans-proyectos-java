/*
Ordenar un array sin usar la clase sort
 */
package tareaprofesor_ordenararray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class TareaProfesor_OrdenarArray {

	static int [] ordenarTabla(int [] tabla) {
		int tablaOrdenada[] = new int[tabla.length];
		int orden = 0;
		
		//Creamos una tabla extra para ir volcando los valores en orden
		for (int i : tabla) {
			tablaOrdenada[orden] = i; //Le damos los mismos valores que cada elemento de tabla
			for (int contador = orden; contador < tabla.length; contador++) { //En cada iteración, descartamos los anteriores que ya sabemos que serán menores gracias al bucle
				if (tablaOrdenada[orden] > tabla[contador]) { //Si el siguiente es mayor que el actual, cambiamos sus valores unos por otros
					i = tablaOrdenada[orden];
					tablaOrdenada[orden] = tabla[contador];
					tabla[contador] = i;
				} 
			}
			orden++;
		}
		return tablaOrdenada;
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
		int tablaOrdenada[] = ordenarTabla(tabla);
		
		//Comprobamos que funciona
		System.out.println("Resultado ordenado: " + Arrays.toString(tablaOrdenada));
	}
}