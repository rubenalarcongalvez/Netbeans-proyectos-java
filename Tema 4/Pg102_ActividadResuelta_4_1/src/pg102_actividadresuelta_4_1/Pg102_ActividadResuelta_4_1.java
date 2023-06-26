//Diseñar la función eco() a la que se le pasa como parámetro un número n
//y muestra por pantalla n veces el mensaje "Eco..."

package pg102_actividadresuelta_4_1;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg102_ActividadResuelta_4_1 {

	/**
	 * @param args the command line arguments
	 */
	
	static void eco(int n) {
		for (int contador = 0; contador < n; contador++) {
			System.out.println("Eco...");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime cuántos ecos quieres: ");
		eco(sc.nextInt());
	}
}