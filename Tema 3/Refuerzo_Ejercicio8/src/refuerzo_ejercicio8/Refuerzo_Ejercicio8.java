//Muestra la tabla de multiplicar de un número introducido por teclado.

package refuerzo_ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio8 {

	public static void main(String[] args) {
		System.out.println("Dime cualquier número y te digo su tabla de multiplicar: ");
		
		int numero = new Scanner (System.in).nextInt();
		System.out.println("Tabla de multiplicar del " + numero + ":");
		
		int multiplicar = 1; 
		
		while(multiplicar <= 10){
			System.out.println(numero + " x " + multiplicar + " = " + numero*multiplicar);
			multiplicar++;
		}
	}
	
}
