/*
Diseñar la función calculadora (), a la que se le pasan dos números reales (operandos)	
y qué operación se desea realizar con ellos. Las operaciones disponibles son: sumar, res-	
tar, multiplicar o dividir. Estas se especifican mediante un número: 1 para la suma, 2 para	
la resta, 3 para la multiplicación y 4 para la división. La función devolverá el resultado de la	
operación mediante un número real.
*/

package pg108_actividadresuelta_4_8;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg108_ActividadResuelta_4_8 {

	static double calculadora (int numero1, int numero2, int operacion) {
		double resultado = 0;
		
		switch (operacion) {
			case 1 -> {		//Suma
				resultado = numero1 + numero2;
			}
			case 2 -> {		//Resta
				resultado = numero1 - numero2;
			}
			case 3 -> {		//Multiplicacion
				resultado = numero1 * numero2;
			}
			case 4 -> {		//Division
				resultado = (double) numero1 / numero2;
			}
		}
		return resultado;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int operacion = 0;
		
		System.out.println("Dime dos números y el número de operación que quieres que realice \n");
		
		System.out.println("Operaciones:");
		System.out.println("Suma: 1");
		System.out.println("Resta: 2");
		System.out.println("Multiplicación: 3");
		System.out.println("División: 4 \n");
		
		System.out.print("Número 1: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Número 2: ");
		int numero2 = sc.nextInt();
		
		do {
		System.out.print("Operación (1 al 4): ");
		operacion = sc.nextInt();
		} while (operacion <= 0 && operacion > 4);
		
		System.out.println("Resultado = " + calculadora(numero1, numero2, operacion));
    }
}