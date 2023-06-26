/* 8.21
Implementa los siguientes métodos:	

- static boolean esNumero(Object ob), que nos dice si su parámetro de entrada es	
de tipo numérico (Integer, Double, Long, Float. ).

- boolean sumar(Object a, object b), que muestra por consola la concatenación de	
los parámetros de entrada, si ambos son cadenas, o muestra su suma convertida al tipo	
Double, si ambos son de tipo numérico. En cualquier otro caso, muestra el mensaje	
«No sumables	
*/

package utilidades;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Comparar {
	public static boolean esNumero(Object ob) {
		boolean loEs = false;
		
		if ("java.lang.Integer".equals(ob.getClass().getName())
				|| "java.lang.Double".equals(ob.getClass().getName())
				|| "java.lang.Long".equals(ob.getClass().getName())
				|| "java.lang.Float".equals(ob.getClass().getName())
				|| "java.lang.Short".equals(ob.getClass().getName())
				|| "java.lang.Byte".equals(ob.getClass().getName())) {
			loEs = true;
		}
		
		return loEs;
	}
}