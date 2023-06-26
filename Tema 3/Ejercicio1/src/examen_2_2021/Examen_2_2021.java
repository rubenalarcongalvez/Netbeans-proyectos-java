//Números sociables

package examen_2_2021;

import java.util.Scanner;

/**
 *
 * @author usuario2
 */
public class Examen_2_2021 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m = 0, divisoresN = 0, divisoresM = 0, restoN, restoM;

		System.out.print("Inserta número 1: ");
		n = sc.nextInt();

		//Comprobamos que no sean iguales los dos números
		do {
			System.out.print("Inserta número 2: ");
			m = sc.nextInt();
		} while (n == m);

		//Calculamos los divisores de n
		for (int contador = 1; contador < n; contador++) {
			restoN = n % contador;
			if (restoN == 0) {
				divisoresN += contador;
			}
		}

		//Calculamos los divisores de m
		for (int contador = 1; contador < m; contador++) {
			restoM = m % contador;
			if (restoM == 0) {
				divisoresM += contador;
			}
		}

		//Decimos si es sociable o no
		if (divisoresN == m && divisoresM == n) {
			System.out.println(n + " y " + m + " son sociables");
		} else {
			System.out.println(n + " y " + m + " no son sociables");
		}

		//Ahora comprobamos cuántos números de 1000 a 1500 son sociables
		System.out.println("Son sociables los siguientes números entre 1000 y 1500:");
		n = 1000;
		m = 1001;
		restoN = 0;
		restoM = 0;
		divisoresN = 0;
		divisoresM = 0;

		while (m <= 1500) {
			restoM = 0;
			divisoresM = 0;

			//Calculamos los divisores de m
			for (int contador = 1; contador < m; contador++) {
				restoM = m % contador;
				if (restoM == 0) {
					divisoresM += contador;
				}
			}

			while (n < m) {
				restoN = 0;
				divisoresN = 0;
				
				//Calculamos los divisores de n
				for (int contador = 1; contador < n; contador++) {
					restoN = n % contador;
					if (restoN == 0) {
						divisoresN += contador;
					}
				}

				//Decimos si es sociable o no
				if (divisoresN == m && divisoresM == n) {
					System.out.println(n + " y " + m);
				}
				n++;
			}
			n = 1000;
			m++;
		}
	}
}