/*
Diseñar la función: int maximo(int t[]), que devuelva el máximo valor
contenido en la tabla t
*/

package pg138_actividadresuelta_5_4;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg138_ActividadResuelta_5_4 {

	static int maximo(int t[]) {
		int max = t[0];
		
		//Forma del profesor
		for (int contador = 1; contador < t.length; contador++) {
			if (t[contador] > max) {
				max = t[contador];
			}
		}
		
		//Forma del libro y mía
//		for (int indice : t)
//			if (indice > max) {
//				max = indice;
//			}
		return max;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos números desea introducir?");
		int longitud = sc.nextInt();
		int tabla[] = new int[longitud];
		
		for (int contador = longitud-1; contador >= 0; contador--) {
			System.out.print("Número " + (longitud-contador) + ": ");
			tabla[contador] = sc.nextInt();
		}
		
		System.out.println("El máximo número de los introducidos es: " + maximo(tabla));
    }
}