package pkg1.pruebas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pruebas2 {
	public static void main(String[] args) {
		int[] tabla = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Introducir serie de 5 números enteros: ");
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			tabla[i] = n;
		}
		System.out.println("Comprobamos: " + Arrays.toString(tabla));
	}
}