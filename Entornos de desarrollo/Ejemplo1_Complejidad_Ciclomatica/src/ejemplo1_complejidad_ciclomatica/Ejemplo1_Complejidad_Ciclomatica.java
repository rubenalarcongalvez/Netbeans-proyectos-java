package ejemplo1_complejidad_ciclomatica;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Ejemplo1_Complejidad_Ciclomatica {

	public static void main(String[] args) {
		int c = 0, par = 0, impar = 0; //1

		while (c != 10) { //2
			c++; //3
			
			//4
			System.out.print("Inserta un número entero: ");
			int n = new Scanner(System.in).nextInt();

			if (n % 2 != 0) { //5
				impar++; //6
			} else {
				par++; //7
			}
		} //8

		//9
		System.out.println("Pares: " + par);
		System.out.println("Impares: " + impar);
	}
}