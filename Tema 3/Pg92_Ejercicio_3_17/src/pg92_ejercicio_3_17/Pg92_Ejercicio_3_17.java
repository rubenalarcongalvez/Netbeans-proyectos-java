package pg92_ejercicio_3_17;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */

/*
Para dos números dados, a y b, es posible buscar el máximo común divisor (el número	
más grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo: desde	
el menor de ayb, ir buscando, de forma decreciente, el primer número que divide a a am-	
bos simultáneamente. Realiza un programa que calcule el máximo común divisor de dos	
números.	
 */
public class Pg92_Ejercicio_3_17 {

	public static void main(String[] args) {
		/* Para dos números, a y b, es posible buscar el máximo común divisor
	(el número más grande que divide a ambos) mediante un algoritmo
	ineficiente pero sencillo: desde el menor de a y b, ir buscando de
	forma decreciente, el primer número que divide a ambos
	simultáneamente. Realiza un programa que calcule el máximo común
	divisor de dos números. */

		Scanner s;
		s = new Scanner(System.in);

		int a, b;
		System.out.println("Introduzca dos números para calcular su máximo común divisor:");
		a = s.nextInt();
		b = s.nextInt();

		int mcd = 0;

		for (int contador1 = 1; contador1 <= a; contador1++) {

			if (a % contador1 == 0) {

				for (int contador2 = 1; contador2 <= b; contador2++) {

					if (b % contador2 == 0) {

						if (contador1 == contador2) {

							mcd = contador2;

						}
					}

				}
			}
		}
	}
}