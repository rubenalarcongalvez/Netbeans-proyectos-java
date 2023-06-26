//Escribe un programa que permita ir introduciendo una serie indeterminada
//de números mientras su suma no supere el valor 10000. Cuando esto último
//ocurra, se debe mostrar el total acumulado, el contador de los números
//introducidos y la media.

package refuerzo_ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero, suma = 0, cantidad = 0;
		double media;
		
		System.out.println("Introduce cualquier serie de números y te daré la suma total de todos ellos, la cantidad de números introducidos y su media.");
		
		do{
			System.out.print("Introduce un número: ");
			numero = sc.nextInt();
			cantidad++;
			
			suma = suma + numero;
		} while (suma <= 1000);
		media = (suma / (double)cantidad);
		
		System.out.println("Ha introducido " + cantidad + " números.");
		System.out.println("La suma total de todos ellos es de " + suma);
		System.out.println("Su media es de " + media);
	}
}
