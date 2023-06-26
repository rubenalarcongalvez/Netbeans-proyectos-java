/*
Escribe un programa que pida 10 números por teclado y que luego muestre los	
números introducidos junto con las palabras "máximo" y "mínimo" al lado del	
máximo y del minimo respectivamente.	
 */
package ejerciciosrefuerzo5_5;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio5_foreach {

	static int maximo(int[] tabla) {
		int maximo = Integer.MIN_VALUE;
		
		for (int resultado : tabla) {
			if (resultado > maximo) maximo = resultado;
		} return maximo;
	}
	
	static int minimo(int[] tabla) {
		int minimo = Integer.MAX_VALUE;
		
		for (int resultado : tabla) {
			if (resultado < minimo) minimo = resultado;
		} return minimo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];

		System.out.println("Introduzca 10 números:");
		for (int contador = 1; contador <= 10; contador++) {
			System.out.print("Número " + contador + ": ");
			tabla[contador - 1] = sc.nextInt();
		}
		
		System.out.println("Tu tabla es la siguiente:");
		for (int contador = 0; contador < 10; contador++) {
			if (tabla[contador] == maximo(tabla)) {
				System.out.println(tabla[contador] + " máximo");
			} else if (tabla[contador] == minimo(tabla)){
				System.out.println(tabla[contador] + " mínimo");
			} else {
				System.out.println(tabla[contador]);
			}
		}
	}
}