/*
Diseñar una funcion que recibe como parametros dos numeros enteros
y devuelve el maximo de ambos

Hacer una version que calcule el maximo de tres numeros
 */
package pg110_actividadresuelta_4_9;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg110_ActividadResuelta_4_9 {

	static int mayor(int n, int m) {
		int mayor;
		if (n < m) {
			mayor = m;
		} else {
			mayor = n;
		}
		return mayor;
	}
	
	static int mayor(int n, int m, int o) {
		int mayor2 = mayor(n, m);
		
		return (mayor(mayor2, o));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame 2 o 3 números y te diré cuál de ellos es el mayor:");
		System.out.print("Número 1: ");
		int n = sc.nextInt();
		System.out.print("Número 2: ");
		int m = sc.nextInt();
		System.out.print("Número 3: ");
		int o = sc.nextInt();
		
		System.out.println("El mayor entre " + n + ", " + m + " y " + o + " es: " + mayor(n, m, o));
	}	
}