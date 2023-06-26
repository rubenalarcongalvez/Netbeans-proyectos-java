/*
Escribe un programa que lea 10 números por teclado y que luego los muestre	
en orden inverso, es decir, el primero que se introduce es el último en mostrarse	
y viceversa.
*/

package ejerciciosrefuerzo5_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class EjerciciosRefuerzo5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 caracteres por teclado y te los muestro en orden inverso:");
		int [] tabla = new int [10];
		
		for (int contador = tabla.length; contador > 0; contador--) {
			System.out.print("Número " + (tabla.length - contador + 1) + ": ");
			tabla[contador-1] = sc.nextInt();
		}
		
		System.out.println("Su orden inverso es: " + Arrays.toString(tabla));
    }
}
