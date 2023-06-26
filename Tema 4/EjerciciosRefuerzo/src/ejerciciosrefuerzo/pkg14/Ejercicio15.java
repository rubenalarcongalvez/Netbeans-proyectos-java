/*
Muestra los números primos que hay entre 1 y 1000
*/
		
package ejerciciosrefuerzo.pkg14;

import static ejerciciosrefuerzo.pkg14.Biblioteca.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Ejercicio15 {
	
	public static void main(String[] args) {
		System.out.println("Los números primos que hay entre 1 y 1000 son:");
		int numero = 2;

		while (numero > 1 && numero < 1000) {
			if (esPrimo(numero)) System.out.println(numero);
			
			numero++;
		}
	}
}