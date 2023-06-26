/*
Escriba un programa que simule una calculadora básica, este puede realizar operación de suma, resta, multiplicación y división.

El programa debe recibir como entrada 2 números reales y un operador, que puede ser +, -, * o /.

La salida del programa debe ser el resultado de la operación.
*/

package calculadora;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Calculadora {

	static double calculadora(int numero1, int numero2, char operacion) {
		double resultado = 0;
		
		switch(operacion) {
			case '+' -> 
				resultado = numero1 + numero2;
			case '-' -> 
				resultado = numero1 - numero2;
			case 'x' -> 
				resultado = numero1 * numero2;
			case '/' -> 
				resultado = (double) numero1 / numero2;
		}
		
		return resultado;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char operacion = 'a';
		boolean pasa = false;
		
		System.out.println("Dime dos números con los que quieras operar:");
		System.out.print("Número 1: ");
		int numero1 = sc.nextInt();
		
		do {
		System.out.print("Operación (+, -, x, /): ");
		operacion = sc.next().charAt(0);
		
		if (operacion == '+' || operacion == '-' || operacion == 'x' || operacion == '/') pasa = true;
		} while (pasa == false);
		
		System.out.print("Número 2: ");
		int numero2 = sc.nextInt();
		
		System.out.println(numero1 + " " + operacion + " " + numero2 + " = " + calculadora(numero1, numero2, operacion));
    }
}