/*
Escribir una funcion a la que se le pase un numero entero y devuelva el numero de divisores primos que tiene
*/

package pg107_actividadresuelta_4_7;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg107_ActividadResuelta_4_7 {

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
	
	static int totalDivisoresPrimos (int n) {
		int m = 0, totalDivisoresPrimos = 0;
		
		if (n < 0) {
			m = n * -1;
		} else {
			m = n;
		}
		
		for (int contador = 1; contador < m; contador++) {
			if (m % contador == 0) {
				if (esPrimo(contador)) {
					totalDivisoresPrimos++;
				}
			}
		}
		
		return totalDivisoresPrimos;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, inserte un número entero y le diré sus divisores primos: ");
		int n = sc.nextInt();
		
		System.out.println("El número " + n + " tiene " + totalDivisoresPrimos(n) + " divisores primos");
    }
}
