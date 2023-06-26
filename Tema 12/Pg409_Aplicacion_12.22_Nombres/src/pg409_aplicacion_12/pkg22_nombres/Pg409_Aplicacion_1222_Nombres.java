/* 12.22
Introduce por teclado, hasta que se introduzca «fin», una serie de nombres, que se insertarán
en una colección, de forma que se conserve el orden de inserción y que no puedan repetirse.
Al final. la colección se mostrará por pantalla.	
*/

/* 12.23
Repite la Actividad de aplicación 12.22 de forma que se inserten los nombres manteniendo
el orden alfabético
*/

package pg409_aplicacion_12.pkg22_nombres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg409_Aplicacion_1222_Nombres {

    public static void main(String[] args) {
		//SE PUEDE HACCER MEJOR CON UN LinkedHashSet
		
		String nombre = EntradaTeclado.pedirPalabraLimpiandoBuffer("Introduce un nombre: ");
//		ArrayList lista = new ArrayList();
		TreeSet<String> lista = new TreeSet<>(); //Si queremos añadir valores y que se ordenen de forma ascendente cambiamos el ArrayList por el TreeSet
		//También podemos poner un Collections.sort() y dejar el ArrayList

		while (!nombre.equalsIgnoreCase("fin")) {
			if (!lista.contains(nombre)) {
				lista.add(nombre);
			}
			nombre = EntradaTeclado.pedirPalabraLimpiandoBuffer(lista.toString() + ", ");
//			Collections.sort(lista); //Si es ArrayList, para ordenarlo
		}

		System.out.println("Resultado: " + lista);
    }
}