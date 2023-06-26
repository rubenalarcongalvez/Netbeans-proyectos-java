/*
Escribir una aplicación que solicite al usuario cuántos números desea introducir. A conti-	
nuación, introducir por teclado esa cantidad de números enteros, y por último, mostrar en	
el orden inverso al introducido.
*/

package pg137_actividadresuelta_5_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg137_ActividadResuelta_5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos números desea introducir?");
		int longitud = sc.nextInt();
		int tabla[] = new int[longitud];
		
		for (int contador = longitud-1; contador >= 0; contador--) {
			System.out.print("Número " + (longitud-contador) + ": ");
			tabla[contador] = sc.nextInt();
		}
		
		System.out.println("Usted ha introducido los siguientes números los cuales mostraré en orden inverso: " + Arrays.toString(tabla));
    }
}