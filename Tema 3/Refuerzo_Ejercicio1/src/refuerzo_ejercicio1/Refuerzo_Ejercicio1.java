/*
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 */
package refuerzo_ejercicio1;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.print("Los múltiplos de 5 (del 0 al 100) son: ");
		for (int n = 0; n <= 100; n = (n + 5)) {
			System.out.print(n + " ");
		}
	}
}
