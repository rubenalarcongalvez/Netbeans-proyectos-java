package PracticasFundamentosIniciales;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class _Practicas {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, veces;
		double suma = 0.0;
		double media;
		System.out.println("Introduzca la cantidad de números a introducir: ");
		veces = sc.nextInt();
		
		for (int i = 1; i <= veces; i++){
			System.out.println("Escriba un número ");
			
			n = sc.nextInt();
			suma += n;
		}
		media = suma / veces;
		System.out.println("La media es: " + media);
	}
}
