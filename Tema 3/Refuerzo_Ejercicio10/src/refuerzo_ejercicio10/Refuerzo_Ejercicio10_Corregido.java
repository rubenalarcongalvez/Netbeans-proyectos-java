//Escribe un programa que calcule la media de un conjunto de números positivos
//introducidos por teclado. A priori, el programa no sabe cuántos números se
//introducirán. El usuario indicará que ha terminado de introducir los datos
//cuando meta un número negativo.
package refuerzo_ejercicio10;

import java.util.Scanner;

public class Refuerzo_Ejercicio10_Corregido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número positivo (para realizar la media de todos, poner un número negativo): ");
		int numero = sc.nextInt();
		int veces = 0, total = 0;
		double media;
		
		while (numero >= 0){
			total+=numero;
			veces++;
			
			System.out.print("Introduzca otro número: ");
			numero = sc.nextInt();
			
			if (numero <= 0){
				media = total / veces;
				System.out.println("Media = " + media);
			}
		}
	}
}
