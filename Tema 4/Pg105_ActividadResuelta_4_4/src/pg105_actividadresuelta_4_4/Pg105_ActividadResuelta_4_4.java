/*
Diseñar una funcion que recibe como parametros dos numeros enteros
y devuelve el maximo de ambos
 */
package pg105_actividadresuelta_4_4;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg105_ActividadResuelta_4_4 {

	static int mayor(int n, int m) {
		int mayor = 0;
		if (n < m) {
			mayor = m;
		} else {
			mayor = n;
		}
		return mayor;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame 2 números y te diré cuál de ellos es el mayor:");
		System.out.print("Número 1: ");
		int n = sc.nextInt();
		System.out.print("Número 2: ");
		int m = sc.nextInt();
		
		System.out.println("El mayor entre " + n + " y " + m + " es: " + mayor(n, m));
	}	
}