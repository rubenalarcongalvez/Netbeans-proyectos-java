/*
http://progra.usm.cl/apunte/ejercicios/2/polinomios.html
 */
package internet_polinomios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Internet_Polinomios {

	static int grado(int tabla[]) {
		return tabla.length - 1;
	}

	static double evaluar(int tabla[], double x) {
		double resultado = 0;

		for (int contador = 0; contador < tabla.length; contador++) {
			if (tabla[contador] != 0) {
				resultado += tabla[contador] * (Math.pow(x, contador));
			}
		}
		return resultado;
	}

	static int[] sumar_polinomios(int tabla[], int tabla2[]) {
		int[] tablaSuma = new int[tabla.length];
		int mayor = tabla.length;
		
		if (tabla.length < tabla2.length) mayor = tabla2.length;
		
		for (int contador = 0; contador < mayor; contador++) {
			tablaSuma[contador] = tabla[contador] + tabla2[contador];
		}
		return tablaSuma;
	}
	
	static int [] derivar_polinomio(int tabla[]) {		
		int derivada[] = new int[tabla.length-1];
		
		for (int contador = 1; contador < tabla.length; contador++) {			
			derivada[contador-1] = tabla[contador] * contador;
		}
		return derivada;
	}
	
	static int [] multiplicar_polinomios(int tabla[], int tabla2[]) {
		int[] tablaMultiplicacion = new int[tabla.length];
		int mayor = tabla.length;
		
		if (tabla.length < tabla2.length) mayor = tabla2.length;
		
		for (int contador = 0; contador < mayor; contador++) {
			tablaMultiplicacion[contador] = tabla[contador] * tabla2[contador];
		}
		return tablaMultiplicacion;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Inserte el tamaño del polinomio: ");
		int longitud = sc.nextInt();

		int[] tabla = new int[longitud];
		int[] tabla2 = new int[longitud];

		for (int contador = 0; contador < tabla.length; contador++) {
			tabla[contador] = (int) (Math.random() * 10);
		}

		System.out.println("Valores tabla 1: " + Arrays.toString(tabla));

		for (int contador = 0; contador < tabla.length; contador++) {
			tabla2[contador] = (int) (Math.random() * 10);
		}

		System.out.println("Valores tabla 2: " + Arrays.toString(tabla2));

		System.out.print("Inserte el valor de x: ");
		int x = sc.nextInt();

		System.out.println("Su grado es: " + grado(tabla));

		System.out.println("El resultado del polinomio es: " + evaluar(tabla, x));

		System.out.println("La suma de los dos polinomios es: " + Arrays.toString(sumar_polinomios(tabla, tabla2)));
		
		System.out.println("Los valores de la tabla 1 derivada es: " + Arrays.toString(derivar_polinomio(tabla)));
		
		System.out.println("La multiplicación de los dos polinomios es: " + Arrays.toString(multiplicar_polinomios(tabla, tabla2)));
	}
}