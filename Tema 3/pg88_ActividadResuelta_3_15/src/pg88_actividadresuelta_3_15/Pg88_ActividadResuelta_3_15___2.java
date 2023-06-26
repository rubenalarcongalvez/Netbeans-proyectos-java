/*

Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
utilizando para ello asteriscos (*). Por ejemplo, para n = 4 

* * * *
* * *
* *
*

/*

*/
package pg88_actividadresuelta_3_15;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg88_ActividadResuelta_3_15___2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuántos asteriscos tiene que tener la base del triángulo: ");
		int asteriscos = sc.nextInt();
		for (int fila = asteriscos; fila >= asteriscos; fila--){
			for (int columna = fila; columna >= asteriscos; columna++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}