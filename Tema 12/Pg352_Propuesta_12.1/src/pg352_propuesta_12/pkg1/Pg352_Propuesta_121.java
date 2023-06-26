/*
Implementa un método genérico estático al que se le pasan como parámetro dos tablas	
con elementos del mismo tipo genérico y devuelve una nueva tabla con los elementos de	
ambas concatenados (los de la segunda después de los de la primera).	
*/

package pg352_propuesta_12.pkg1;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg352_Propuesta_121 {

	static <U> U[] concatenarTablas(U[] tabla1, U[] tabla2) {
		//Estamos diciendo que solo aceptamos un tipo de objeto (de tipo cualquiera), por ejemplo los dos de tipo Integer, si no, nos salta el fallo
		//antes de ejecutar el método
		U[] tablaNueva = Arrays.copyOf(tabla1, tabla1.length + tabla2.length);
		
		System.arraycopy(tabla2, 0, tablaNueva, tabla1.length, tabla2.length);
		
		return tablaNueva;
	}
	
	static Object[] concatenarObjetos (Object[] tabla1, Object[] tabla2) {
		//Estamos diciendo que aceptamos cualquier tipo de objeto, por ejemplo, uno de tipo Integer y otro String, y si hay fallo,
		//nos notifica después de la ejecución del método
		Object[] tablaNueva = Arrays.copyOf(tabla1, tabla1.length + tabla2.length);
		
		System.arraycopy(tabla2, 0, tablaNueva, tabla1.length, tabla2.length);
		
		return tablaNueva;
	}
	
    public static void main(String[] args) {
        Integer[] tabla1 = {3,1,5,8};
        String[] tabla2 = {"test", "test2", "copy"};
		Integer[] tablaMedia;
		
//		tablaMedia = concatenarTablas(tabla1, tabla2);
		
//		System.out.println(Arrays.toString(tablaMedia));
		
		tablaMedia = (Integer[]) concatenarObjetos(tabla1, tabla2);
		
		System.out.println(Arrays.toString(tablaMedia));
		
		//De esta forma, nos salta el error de manera correcta
    }
}