/* 9.22
Definir una clase comparadora que ordene los socios por orden alfabético de nombres
*/

package clases;

import java.util.Comparator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ComparaNombres implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		//Creamos los objetos
		Socio s1 = (Socio) o1;
		Socio s2 = (Socio) o2;
		
		//No hace falta ni compararlo nosotros mismos ya que podemos
		//aprovechar el compareTo por default de Strings
		return -(s1.nombre.compareTo(s2.nombre)); //Porque es de menor a mayor (hay que cambiar el signo)
	}
	
}
