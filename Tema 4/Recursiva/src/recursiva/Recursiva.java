/*
Recursiva: Es poco eficiente (aunque más elegante). Porque se va guardando
todos los procesos de funciones en memoria. Gasta mucha memoria. Con
un bucle se gasta mucho menos.

Aunque es una opción más elegante, y sirve para determinadas ocasiones.
 */
package recursiva;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Recursiva {
	
	public static double factorialR(double numero){
		double resultado;
		
		if (numero == 0) {
			resultado= 1;
		} else {
			resultado = numero * factorialR(numero - 1);
		}
		
		return resultado;
	}
	
	public static int fibonacci(int numero){
		int resultado;
		
		if (numero == 0)
			resultado = 0;
		else if (numero == 1)
			resultado = 1;
		else {
			resultado = fibonacci(numero-1) + fibonacci(numero-2);
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {		
		System.out.println("Factorial:");
		System.out.println(factorialR(100));
		
		System.out.println("Fibonacci:");
		System.out.println(fibonacci(10));
	}
}