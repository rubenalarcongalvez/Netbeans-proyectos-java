/*
(4.18)
Crea una función que muestre por consola una serie de números aleatorios enteros. Los	
parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y los	
valores minimos y máximos que estos pueden tomar.

(4.19)
Sobrecarga la función realizada en la Actividad de aplicación 4.18 para que el único pa-	
rámetro sea la cantidad de números aleatorios que se muestra por consola. Los números	
aleatorios serán reales y estarán comprendidos entre 0 y 1.	
*/

package pg120_actividadaplicacion_4_19;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg120_ActividadAplicacion_4_19 {

    static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		System.out.println("Los números aleatorios son:");
		double aleatorio;
		
		while (cantidad > 0) {
			aleatorio = Math.random();
			
			System.out.printf("%.0f\n" , minimo * (1-aleatorio) + maximo * aleatorio);
			cantidad--;
		}
	}
	
	static void numerosAleatorios(int cantidad) {
		System.out.println("Los números aleatorios son:");
		
		while (cantidad > 0) {
			System.out.println(Math.random());
			cantidad--;
		}
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos números aleatorios quieres?");
		int cantidad = sc.nextInt();
		
		numerosAleatorios(cantidad);
    }
}