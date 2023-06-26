//Escribe un programa que calcule la media de un conjunto de números positivos
//introducidos por teclado. A priori, el programa no sabe cuántos números se
//introducirán. El usuario indicará que ha terminado de introducir los datos
//cuando meta un número negativo.
package refuerzo_ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un número positivo (para realizar la media de todos, poner un número negativo): ");
		int numero = 0;
		int total = 0, veces = 0;

		while (numero >= 0) {
			int numero2 = total;
			numero = sc.nextInt();
			veces++;
			
			total = numero + numero2;
			
			if (numero <= 0) {
				total-=numero;
				veces--;
				
				int media = total / veces;
				System.out.println("Media = " + media);
			}
		}
	}
}
