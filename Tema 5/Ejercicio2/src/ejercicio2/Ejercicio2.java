package ejercicio2;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Ejercicio2 {

	static String lothar(int numero) {
		String sentencia = Integer.toString(numero);

		while (numero != 1) {
			if (numero % 2 == 0) {
				numero /= 2;
			} else {
				numero = numero * 3 + 1;
			}

			sentencia = sentencia + " " + Integer.toString(numero);
		}
		return sentencia;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		
		do {
		System.out.print("Dime cualquier número natural: ");
		valor = sc.nextInt();
		} while (valor < 0);

		System.out.println("La sucesión Lothar de " + valor + " es: " + (lothar(valor)));
	}
}