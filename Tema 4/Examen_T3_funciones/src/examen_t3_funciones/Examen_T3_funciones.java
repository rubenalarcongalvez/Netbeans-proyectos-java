package examen_t3_funciones;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Examen_T3_funciones {
	
	static int divisores(int n) {
		int divisoresN = 0, restoN;
		for (int contador = 1; contador < n; contador++) {
			restoN = n % contador;
			if (restoN == 0) {
				divisoresN += contador;
			}
		}
		return divisoresN;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m = 0;
		int divisoresN = 0, divisoresM = 0, restoN, restoM;

		System.out.print("Inserta número 1: ");
		n = sc.nextInt();

		//Comprobamos que no sean iguales los dos números
		do {
			System.out.print("Inserta número 2: ");
			m = sc.nextInt();
		} while (n == m);

		//Comprobamos los divisores
		divisoresN = divisores(n);
		divisoresM = divisores(m);

		//Comprobamos si son sociables
		if (divisoresN == m && divisoresM == n) {
			System.out.println(n + " y " + m + " son sociables");
		}

		//Ahora comprobamos cuántos números de 1000 a 1500 son sociables
		System.out.print("Son sociables los siguientes números entre 1000 y 1500:");
		n = 1000;
		m = 1001;

		while (m <= 1500) {

			//Calculamos los divisores de m
			divisoresM = divisores(m);

			while (n < m) {
				//Calculamos los divisores de n
				divisoresN = divisores(n);

				//Decimos si son sociables
				if (divisoresN == m && divisoresM == n) {
					System.out.println(" " + n + " y " + m);
				}
				n++;
			}
			n = 1000;
			m++;
		}
	}
}