/*
Crea una función que muestre por consola una serie de números aleatorios enteros. Los	
parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y los	
valores minimos y máximos que estos pueden tomar.
*/

package pg120_actividadaplicacion_4_18;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg120_ActividadAplicacion_4_18 {

	static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		System.out.println("Los números aleatorios son:");
		double aleatorio;
		
		while (cantidad > 0) {
			aleatorio = Math.random();
			
			System.out.println(Math.round(minimo * (1-aleatorio) + maximo * aleatorio));
			cantidad--;
		}
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos números aleatorios quieres?");
		int cantidad = sc.nextInt();
        System.out.println("¿Cuál es el número mínimo de que puede imprimirse?");
		int minimo = sc.nextInt();
        System.out.println("¿Cuál es el número máximo de que puede imprimirse?");
		int maximo = sc.nextInt();
		
		numerosAleatorios(cantidad, minimo, maximo);
    }
}