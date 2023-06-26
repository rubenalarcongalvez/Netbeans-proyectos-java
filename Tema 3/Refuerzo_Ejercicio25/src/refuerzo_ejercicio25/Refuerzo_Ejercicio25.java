//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

package refuerzo_ejercicio25;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa un número y te mostraré el mismo número al revés: ");
		int numero = sc.nextInt();
		int resto;
		
		System.out.print("Tu número al revés es: ");
		do {
			resto = numero % 10;
			numero = numero / 10;
			
			System.out.print(resto);
		} while (numero > 0);
		System.out.println();
	}
}
