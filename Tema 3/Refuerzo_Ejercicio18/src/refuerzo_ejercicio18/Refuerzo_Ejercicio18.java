//Escribe un programa que obtenga los números enteros comprendidos entre dos
//números introducidos por teclado y validados como distintos, el programa debe
//empezar por el menor de los enteros introducidos e ir incrementando de 7 en
//7.
package refuerzo_ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime dos números cualquiera (que no sean decimales) y te diré de 7 en siete los números que hay entre ellos");

		System.out.print("Número 1: ");
		int numero1 = sc.nextInt();
		System.out.print("Número 2: ");
		int numero2 = sc.nextInt();
		
		if (numero1 >= numero2) {
			int maximo = numero1;
			int minimo = numero2;
			System.out.print("Los números comprendidos entre el " + minimo + " y el " + maximo + " son: ");
			for (minimo = minimo + 7; minimo < maximo; minimo += 7) {
				System.out.print(minimo + " ");
			}
		} else {
			int maximo = numero2;
			int minimo = numero1;
			System.out.print("Los números comprendidos entre el " + minimo + " y el " + maximo + " son: ");
			for (minimo = minimo + 7; minimo < maximo; minimo += 7) {
				System.out.print(minimo + " ");
			}
		}
	}
}