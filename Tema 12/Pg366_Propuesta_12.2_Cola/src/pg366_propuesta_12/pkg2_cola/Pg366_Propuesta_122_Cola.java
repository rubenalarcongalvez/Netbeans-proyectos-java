/*
Definir la interfaz Pila con parámetros genéricos. A continuación, implementar la interfaz	
Pila genérica en la clase Contenedor. Por último, escribir un programa donde se utilice	
un objeto contenedor como pila. En ella apilamos números enteros positivos leídos del te-	
clado hasta que se introduzca un -1. Después, mediante un bucle, se desapilan todos los	
números hasta que la pila esté vacía y los mostramos por consola.
*/

/*
Define la interfaz cola con parámetros genéricos. A continuación, implementa la interfaz	
Cola genérica en la clase Contenedor (no hace falta suprimir la implementación de Pila	
de la Actividad resuelta 12.3). Por último, escribe un programa donde se utilice un objeto	
Contenedor como cola. En ella encolamos números enteros positivos leídos del teclado	
hasta que se introduzca un -1. Después, mediante un bucle, se desencolan todos los nú-	
meros hasta que la cola esté vacía y los mostramos por consola.	
*/

package pg366_propuesta_12.pkg2_cola;

import clasesEInterfaces.*;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg366_Propuesta_122_Cola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Contenedor
		Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
		
		for (int i = 0; i < 20; i++) {
			c.insertarAlFinal((int) (Math.random() * 20));
		}
		
		System.out.println("Sin ordenar: " + c);
		c.ordenar();
		System.out.println("Ordenado: " + c);
		Integer n = c.extraerDelPrincipio();
		System.out.println("Elemento extraído: " + n);
		System.out.println("Después de extraer: " + c);
		
		System.out.println();
		//Contendor que implementa Pila
		Pila<Integer> p = new Contenedor<>(new Integer[0]);
		System.out.print("Introducir entero positivo (-1 para terminar): ");
		n = sc.nextInt();
		
		while(n != -1) {
			p.apilar(n);
			System.out.print("Introducir entero positivo (-1 para terminar): ");
			n = sc.nextInt();
		}
		
		System.out.println(p);
		
		System.out.print("Desapilamos todo: ");
		n = p.desapilar();
		
		while (n != null) {
			System.out.print(n + " ");
			n = p.desapilar();
		}
		
		System.out.println();
		
		System.out.println(p);
		
		System.out.println();
		//Contenedor que implementa Cola
		Cola<Integer> col = new Contenedor<>(new Integer[0]);
		System.out.print("Introducir entero positivo (-1 para terminar): ");
		n = sc.nextInt();
		
		while(n != -1) {
			col.encolar(n);
			System.out.print("Introducir entero positivo (-1 para terminar): ");
			n = sc.nextInt();
		}
		
		System.out.println(p);
		
		System.out.print("Desapilamos todo: ");
		n = col.desencolar();
		
		while (n != null) {
			System.out.print(n + " ");
			n = col.desencolar();
		}
		
		System.out.println();
		
		System.out.println(p);
		
		System.out.println();
    }
}