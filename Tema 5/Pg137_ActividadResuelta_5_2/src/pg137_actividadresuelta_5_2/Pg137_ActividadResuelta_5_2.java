/*
Diseñar un programa que solicite al usuario que introduzca por teclado 5 números deci-	
males. A continuación, mostrar los números en el mismo orden que se han introducido.
*/

package pg137_actividadresuelta_5_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg137_ActividadResuelta_5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, inserte 5 números cualesquiera con decimales: ");
		double decimales[] = new double[5];
		
		for (int contador = 0; contador < 5; contador++) {
			decimales[contador] = sc.nextDouble();
		}
		
		System.out.println("La lista de números introucidos es: " + Arrays.toString(decimales));
    }
}
