/*
Implementa las clases Cola y Pila genéricas heredando de ArrayList
*/

package pg410_aplicacion_12.pkg31_colapila;

import clases.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg410_Aplicacion_1231_ColaPila {

    public static void main(String[] args) {
		LinkedHashSet<Integer> conjCola = new LinkedHashSet<>();
		conjCola.add(2);
		conjCola.add(6);
		conjCola.add(1);
		conjCola.add(2);
		conjCola.add(9);
		
		ArrayList<String> conjPila = new ArrayList<>();
		conjPila.add("Test");
		conjPila.add("Test");
		conjPila.add("dj");
		conjPila.add("Ventilador");
		conjPila.add("Calor");
		conjPila.add("Frío");
		
		Cola cola = new Cola(conjCola);  
		Pila pila = new Pila(conjPila);
		
		System.out.println("Cola inicial: " + cola);
		
		System.out.println("Encolamos 2 elementos");
		
		cola.encolar(3);
		cola.encolar(1000);
		
		System.out.println("Cola final: " + cola);
		
		System.out.println("Pila inicial: " + pila);
		
		System.out.println("Desapilamos 2 elementos");
		
		pila.desapilar(); pila.desapilar();
		
		System.out.println("Pila final: " + pila);
    }
}