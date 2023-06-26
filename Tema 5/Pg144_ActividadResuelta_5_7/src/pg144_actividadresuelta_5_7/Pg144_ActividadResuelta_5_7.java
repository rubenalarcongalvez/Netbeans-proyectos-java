/*
Implementar la función: int [] sinRepetidos (int t[]),que construye y devuelve una	
tabla de la longitud apropiada, con los elementos de t, donde se han eliminado los da-	
tos repetidos. HACERLO SIN USAR Arrays.copyOf
 */
package pg144_actividadresuelta_5_7;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg144_ActividadResuelta_5_7 {

	public static int[] sinRepetidos(int t[]) {
		int longitud = t.length;

		//Para saber los repetidos y si están repetidos, quitarle campos a la tabla
		for (int orden = 0; orden < t.length; orden++) {
			for (int contador = orden + 1; contador < t.length; contador++) {
				if (t[orden] != Integer.MIN_VALUE) {
					if (t[orden] == t[contador]) {
						longitud--;
						t[contador] = Integer.MIN_VALUE;
					}
				}
			}
		}

		//Para crear la nueva tabla
		int[] tablaAuxiliar = new int[longitud];
		int orden = 0;

		for (int contador = 0; contador < t.length; contador++) {
			if (t[contador] != Integer.MIN_VALUE) {
				tablaAuxiliar[orden] = t[contador];
				orden++;
			}
		}
		return tablaAuxiliar;
	}

	public static void main(String[] args) {
		int[] tabla = new int[10];

		for (int contador = 0; contador < tabla.length; contador++) {
			tabla[contador] = (int) (Math.random() * 10);
		}

		System.out.println("Tabla: " + Arrays.toString(tabla));
		System.out.println("Tabla sin repetidos: " + Arrays.toString(sinRepetidos(tabla)));
	}
}