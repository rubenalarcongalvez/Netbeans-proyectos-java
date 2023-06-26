//Escribe un programa que muestre los n primeros términos de la serie de
//Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
//el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
//términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
//introducir por teclado.
package refuerzo_ejercicio12;

import java.util.Scanner;

public class Refuerzo_Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos números quieres que tenga la serie de Fibonacci?");
		int n = sc.nextInt();
		int numero1 = 0, numero2 = 1, suma = 0;
		
		for (int inicio = 0; inicio < n; inicio++) {
			System.out.print(suma + " ");
			
			suma = numero1 + numero2;
			
			numero1 = numero2;
			numero2 = suma;
		}
	}
}