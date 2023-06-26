/*
Crea tres tablas de cinco elementos: la primera de enteros, la segunda de double y la ter	
cera de booleanos. Muestra las referencias en las que se encuentra cada una de las ta-	
blas anteriores.	
*/

package pg127_actividadpropuesta_5_1;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg127_ActividadPropuesta_5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int enteros[] = new int[5];
        double dobles[] = new double[5];
        boolean booleanos[] = new boolean[5];
		
		System.out.println("Inserta los valores que quieras a enteros: ");
		for(int contador = 0; contador < 5; contador++) {
			System.out.print("Valor " + (contador+1) + " = ");
			enteros[contador] = sc.nextInt();
		}
		
		System.out.println();
		
		for (int contador = 0; contador < 5; contador++) {
			System.out.println("Valor " + (contador+1) + " entero = " + enteros[contador]);
		}
		
		System.out.println();
		
		dobles[0] = 2;
		dobles[1] = 8;
		dobles[2] = 3.4;
		dobles[4] = 9.10;
		//dobles[5] = 11; //Aquí daría error porque el limite es 4
		
		System.out.println("Valor 5 doble = " + dobles[4]);
		//System.out.println("Dobles posición 6 error: " + dobles[5]); //Da error porque el limite es 4
		
		System.out.println("Valor 3 doble por defecto = " + dobles[3]);
		
		System.out.println();
		
		booleanos[0] = true;
		booleanos[1] = false;
		booleanos[3] = (double) enteros[3] - dobles[1] == -8;
		
		System.out.println("Valor booleano 0 = " + booleanos[0]);
		System.out.println("Valor booleano 1 = " + booleanos[1]);
		System.out.println("Valor booleano 2 por defecto = " + booleanos[2]);
		System.out.println("Valor booleano 3 = " + booleanos[3]);
		
		System.out.println();
		
		System.out.println("Referencia de enteros: " + enteros);
		System.out.println("Referencia de dobles: " + dobles);
		System.out.println("Referencia de booleanos: " + booleanos);
    }
}
