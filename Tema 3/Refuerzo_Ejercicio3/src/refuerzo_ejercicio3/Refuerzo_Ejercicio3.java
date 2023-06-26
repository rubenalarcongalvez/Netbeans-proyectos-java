/*
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */
package refuerzo_ejercicio3;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio3 {

	public static void main(String[] args) {
		System.out.print("Los múltiplos de 5 (de 0 a 100) son: ");
		int n = 5;
		do{
			System.out.print(n + " ");
			n+=5;
		} while (n <= 100);
	}
	
}
