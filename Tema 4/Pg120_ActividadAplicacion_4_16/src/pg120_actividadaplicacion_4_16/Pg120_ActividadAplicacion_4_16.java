/*
Implementa la función divisoresPrimos() que muestra, por consola, todos los diviso-	
res primos del número que se le pasa como parámetro.	
*/

package pg120_actividadaplicacion_4_16;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg120_ActividadAplicacion_4_16 {

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
	
	static void divisoresPrimos(int numero) {
		int primos = 0;
		
		System.out.print("Los divisores primos de " + numero + " son:");
		for (int contador = 1; contador < numero; contador++) {
			if (esPrimo(contador) && numero % contador == 0) System.out.print(" " + contador);
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número y te daré todos los divisores primos que tenga: ");
		int numero = sc.nextInt();
		
		divisoresPrimos(numero);
    }
}
