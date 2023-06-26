/*
Crear una tabla bidimensional de longitud 5x 5y rellenarla de la siguiente forma: el ele-	
mento de la posición [n][m] debe contener el valor 10 x n + m. Después se debe mos	
trar su contenido.
*/

package pg153_actividadresuelta_5_12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg153_ActividadResuelta_5_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int [][] tabla = new int [6][5]; //Para explicar mejor, pongo diferentes valores
		
		for (int n = 0; n < tabla.length; n++) {	//Longitud del primer array
			for (int m = 0; m < tabla[n].length; m++) {	//Longitud del valor del array (el anidado)
				System.out.print("Introduzca el valor de la fila " + n + " columna " + m + ": ");
				tabla[n][m] = sc.nextInt();
			}
		}
		
		//Imprimimos
		System.out.println("Con bucle for");
		for (int n = 0; n < tabla.length; n++) {
			for (int m = 0; m < tabla[n].length; m++) {
				System.out.print(tabla[n][m] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nCon for each");
		for (int[] fila : tabla) {
			for (int elemento : fila) {
				System.out.print(elemento + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nCon Arrays.toString");
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
		
		System.out.println("\nCon Arrays.deepToString");
		System.out.println(Arrays.deepToString(tabla));
    }
}