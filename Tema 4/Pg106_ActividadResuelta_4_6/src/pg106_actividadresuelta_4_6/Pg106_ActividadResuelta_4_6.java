/*
Diseñar una funcion con el siguiente prototipo:

boolean esPrimo(int n)

que devolverá true si n es primo y false en caso contrario

*/

package pg106_actividadresuelta_4_6;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg106_ActividadResuelta_4_6 {

	static boolean esPrimo(int n) {
		boolean primo = true;
		for(int contador = 2; contador <= Math.sqrt(n); contador++) {	//Si un numero no es divisible por ningun numero hasta su raiz
																		//cuadrada, será primo, sin necesidad de probar los demas
			if (n % contador == 0) {
				primo = false;
			}
		}
		return primo;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime cualquier número y te diré si es primo o no: ");
		int n = sc.nextInt();
		
		System.out.println(esPrimo(n));
    }
}