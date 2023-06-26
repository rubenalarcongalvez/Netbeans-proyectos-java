/* 12.17
Implementa la clase Cola genérica utilizando un objeto ArrayList para guardar los elementos.
*/

package pg408_aplicacion_12.pkg17_colaarraylist;

import clases.*;
import java.util.ArrayList;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg408_Aplicacion_1217_ColaArrayList {

    public static void main(String[] args) {
        System.out.println("12.17. Cola");
		
		Cola<Integer> c = new Cola<>(new ArrayList<>());
		
		System.out.println("Añadimos");
		
		c.encolar(46);
		
		System.out.println("Cola: " + c);
		
		System.out.println("Y otros 2 más");
		
		c.encolar(87); c.encolar(-3);
		
		System.out.println("Cola: " + c);
		
		System.out.println("Ahora quitamos un elemento");
		
		c.desencolar();
		
		System.out.println("Cola: " + c);
		
		System.out.println("\n12.18. Pila");
		
		Pila<Integer> p = new Pila<>(new ArrayList<>());
		
		System.out.println("Añadimos");
		
		p.apilar(46);
		
		System.out.println("Pila: " + p);
		
		System.out.println("Y otros 2 más");
		
		p.apilar(87); p.apilar(-3);
		
		System.out.println("Pila: " + p);
		
		System.out.println("Ahora quitamos todo (por mucho que desapilemos, no habrá fallo)");
		
		p.desapilar();p.desapilar();p.desapilar();p.desapilar();
		
		System.out.println("Pila: " + p);
    }
}