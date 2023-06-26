/*
Escribe una función que decida si dos números enteros positivos son amigos. Dos nú-	
meros a y b son amigos si la suma de los divisores propios (distintos de él mismo) de a	
es igual a b. Y viceversa.	
Para probar se pueden usar los numeros 220 y 284, que son amigos.
*/

package pg120_actividadaplicacion_4_17;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg120_ActividadAplicacion_4_17 {

    static int totalDivisores(int n) {
		int divisoresN = 0, restoN;
		for (int contador = 1; contador < n; contador++) {
			restoN = n % contador;
			if (restoN == 0) {
				divisoresN += contador;
			}
		}
		return divisoresN;
	}
	
	static boolean numerosAmigos (int a, int b) {
		boolean amigos = (totalDivisores(a) == b && totalDivisores(b) == a);
		
		return amigos;
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int b = 0;
		
		System.out.println("Dime dos números distintos y te diré si son amigos");
		
		System.out.print("Número 1: ");
		int a = sc.nextInt();
		
		do {
		System.out.print("Número 2: ");
		b = sc.nextInt();
		} while (a == b);
		
		System.out.println("¿Son amigos " + a + " y " + b + "?: " + numerosAmigos(a, b));
    }
}
