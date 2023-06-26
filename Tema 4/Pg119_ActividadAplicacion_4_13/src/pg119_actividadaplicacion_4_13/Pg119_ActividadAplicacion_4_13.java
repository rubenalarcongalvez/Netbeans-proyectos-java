/*
Crea la función muestraPares(int n) que muestre por consola
los primeros n números pares
*/

package pg119_actividadaplicacion_4_13;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg119_ActividadAplicacion_4_13 {

	static void muestraPares(int n) {
		int par = 2;
		System.out.print("Los " + n + " primeros números pares son:");
		
		while (par <= n*2) { //Porque va de dos en dos los pares
			System.out.print(" " + par);
			par+=2;
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
        System.out.print("Dime cuántos números pares quieres que te muestre: ");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do {
		n = sc.nextInt();
		} while (n < 0);
		
		muestraPares(n);
    }
}
