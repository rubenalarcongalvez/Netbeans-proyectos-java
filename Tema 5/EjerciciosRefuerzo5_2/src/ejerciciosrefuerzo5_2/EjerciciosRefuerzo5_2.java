/*
Define un array de 10 caracteres con nombre simbolo y asigna valores a los	
elementos según la tabla que se muestra a continuación. Muestra el contenido	
de todos los elementos del array. Qué sucede con los valores de los elementos	
que no han sido inicializados?	
*/

package ejerciciosrefuerzo5_2;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class EjerciciosRefuerzo5_2 {

    public static void main(String[] args) {		
		System.out.println("Introduce 10 caracteres por teclado y te los muestro en orden inverso:");
		char [] simbolo = new char [10];
		
		simbolo [0] = 'a';
		simbolo [1] = 'x';
		simbolo [4] = '@';
		simbolo [6] = ' ';
		simbolo [7] = '+';
		simbolo [8] = 'Q';
		
		System.out.println("Los valores no asignados tienen valor por defecto (0): " + Arrays.toString(simbolo));
		
		//Otro caso:
		//Si queremos que todos los valores que seleccionemos de la tabla num sean 100
//		Arrays.fill(num, 100);
//		
//		simbolo[0] = 39;
//		
//		System.out.println("Los valores no asignados tienen valor por defecto (' '): " + Arrays.toString(simbolo));
    }
}
