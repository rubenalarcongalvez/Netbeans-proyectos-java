/*
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 */
package refuerzo_ejercicio2;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio2 {

	public static void main(String[] args) {
		System.out.print("Los múltiplos de 5 de 0 a 100 son: ");
		int n = 5;
		while (n <= 100){
			System.out.print(n + " ");
			n+=5;
		}		
	}
	
}
