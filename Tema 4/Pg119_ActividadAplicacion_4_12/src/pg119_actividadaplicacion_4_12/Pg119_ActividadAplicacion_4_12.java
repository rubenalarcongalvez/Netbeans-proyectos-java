/*
Implementa la función

static double distancia (double x1, double y1, double x2, double y2)

que calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y (x2, y2).
*/

package pg119_actividadaplicacion_4_12;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg119_ActividadAplicacion_4_12 {

	static double distancia (double x1, double x2, double y1, double y2) {
		double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		
		return distancia;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime los puntos y te diré la distancia euclídea: ");
		System.out.print("x1: ");
		int x1 = sc.nextInt();
		System.out.print("x2: ");
		int x2 = sc.nextInt();
		System.out.print("y1: ");
		int y1 = sc.nextInt();
		System.out.print("y2: ");
		int y2 = sc.nextInt();
		
		System.out.println("Su distancia eucídea es " + distancia(x1, x2, y1, y2));
    }
}
