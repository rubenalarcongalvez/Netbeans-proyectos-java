/*
Escribir una función a la que se le pasen dos enteros y
muestre todos los números comprendidos entre ellos
 */
package pg103_actividadresuelta_4_2;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg103_ActividadResuelta_4_2 {

	static void entreNumeros(int n, int m) {
		if (m < n) {
			while (m < n-1) {
				m++;
				System.out.print(" " + m);
			}
		} else {
			while (n < m-1) {
				n++;
				System.out.print(" " + n);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, introduzca dos números y le diré los valores que hay entre ellos");
		System.out.print("Número 1: ");
		int n = sc.nextInt();
		System.out.print("Número 2: ");
		int m = sc.nextInt();
		System.out.print("Los números que hay entre " + n + " y " + m + " son:");
		entreNumeros(n, m);
	}
}
