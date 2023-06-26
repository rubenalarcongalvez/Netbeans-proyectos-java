/*
Escribe un programa que pida 10 números por teclado y que luego muestre los	
números introducidos junto con las palabras "máximo" y "mínimo" al lado del	
máximo y del mínimo respectivamente.	
*/

package ejerciciosrefuerzo5_5;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class EjerciciosRefuerzo5_5 {

	static int maximoArray (int tabla[]){
		for (int contador = 1; contador < tabla.length; contador++) {
			if (tabla[0] < tabla[contador]) {
				tabla[0] = tabla[contador];
			}
		}
		return tabla[0];
	}
	
	static int minimoArray (int tabla[]){
		for (int contador = 1; contador < tabla.length; contador++) {
			if (tabla[0] > tabla[contador]) {
				tabla[0] = tabla[contador];
			}
		}
		return tabla[0];
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int [] tabla = new int [10];
		
		System.out.println("Por favor, introduzca una serie de números:");
		for (int contador = 0; contador < tabla.length; contador++) {
			System.out.print("Número " + (contador+1) + ": ");
			tabla[contador] = sc.nextInt();
		}
		
		System.out.println("Te los muestro y te digo cuál es su máximo y cuál su mínimo:");
		for (int i : tabla) {
			if (i == maximoArray(tabla)) {
				System.out.println(i + " máximo");
			} else if (i == minimoArray(tabla)) {
				System.out.println(i + " mínimo");
			} else {
				System.out.println(i);
			}
		}
    }
}
