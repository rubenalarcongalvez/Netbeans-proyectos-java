package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Ejercicio1 {

	//Función A
	static int[] medias_moviles(int[] serie, int p) {
		int[] media_serie = new int[serie.length - p + 1];

		for (int orden = 0; orden < media_serie.length; orden++) {
			for (int contador = orden; contador < (orden + p); contador++) {
				media_serie[orden] += serie[contador];
			}
			media_serie[orden] /= p;
		}
		return media_serie;
	}

	//Función B
	static int[] diferencias_finitas(int[] serie) {
		int diferencias_serie[] = new int[serie.length - 1];

		for (int orden = 0; orden < serie.length - 1; orden++) {
			diferencias_serie[orden] = serie[orden + 1] - serie[orden];
		}
		return diferencias_serie;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int longitud;

		do {
			System.out.println("¿Cuántos valores desea introducir?");
			longitud = sc.nextInt();
		} while (longitud < 0);

		int[] tabla = new int[longitud];

		for (int contador = 0; contador < tabla.length; contador++) {
			System.out.print("Valor " + (contador + 1) + ": ");
			tabla[contador] = sc.nextInt();
		}

		int retardo;

		do {
			System.out.println("¿Cuál es el retardo que le quieres asignar?");
			retardo = sc.nextInt();
		} while (retardo < 0);

		System.out.println("Medias móviles: " + Arrays.toString(medias_moviles(tabla, retardo)));

		System.out.println("Diferencias finitas: " + Arrays.toString(diferencias_finitas(tabla)));
	}
}