/*
Define un array de 12 números enteros con nombre num y asigna los valores	
según la tabla que se muestra a continuación. Muestra el contenido de todos	
los elementos del array. Qué sucede con los valores de los elementos que no	
han sido inicializados?	
*/

package ejerciciosrefuerzo5_1;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class EjerciciosRefuerzo5_1 {
	
    public static void main(String[] args) {
        int [] num = new int[12];
		
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		System.out.println("Los valores no asignados tienen valor por defecto (0): " + Arrays.toString(num));
		
		//Otro caso:
		//Si queremos que todos los valores que seleccionemos de la tabla num sean 100
//		Arrays.fill(num, 100);
//		
//		num[0] = 39;
//		num[1] = -2;
//		num[4] = 0;
//		num[6] = 14;
//		num[8] = 5;
//		num[9] = 120;
//		
//		System.out.println("Los valores no asignados tienen valor por defecto (100): " + Arrays.toString(num));
    }
}
