/*
Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while
 */
package refuerzo_ejercicio6;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio6 {

	public static void main(String[] args) {
		int n = 320;
		do {
			System.out.print(n + " ");
			n-=20;
		} while (n >= 160);
	}
	
}
