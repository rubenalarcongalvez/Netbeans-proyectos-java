/*
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
 */
package refuerzo_ejercicio5;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio5 {

	public static void main(String[] args) {
		int n = 320;
		while (n >= 160){
			System.out.print(n + " ");
			n-=20;
		}
	}
	
}
