/*
Utilizando colecciones, implementa la clase Supercola, que tiene como atributos dos	
colas para enteros, en las que se encola y desencola por separado. Sin embargo, si una	
de las colas queda vacía, al llamar a su método desencolar(), se desencola de la otra	
mientras tenga elementos. Solo cuando las dos colas estén vacías, cualquier llamada a	
desencolar devolverá null. Escribe un programa con el menú:	
1. Encolar en cola.	
2. Encolar en cola2.
3. Desencolar de cola.	
4. Desencolar de cola2.	
5. Salir.	
Después de cada operación se mostrará el estado de las dos colas para seguir su	
evolución.
 */
package pg409_aplicacion_12.pkg20_supercola;

import clases.*;
import java.util.ArrayList;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg409_Aplicacion_1220_SuperCola {

	public static void menu(Cola<Integer> cola, Cola<Integer> cola2) {
		int opcion;

		do {
			System.out.println("1. Encolar en cola");
			System.out.println("2. Encolar en cola2");
			System.out.println("3. Desencolar en cola");
			System.out.println("4. Desencolar en cola2");
			System.out.println("5. Salir");
			
			opcion = EntradaTeclado.pedirEntero("Elige una opción: ");
			
			switch(opcion) {
				case 1 -> {
					int numero = EntradaTeclado.pedirEntero("Número: ");
					cola.encolar(numero);
					System.out.println("cola: " + cola);
					System.out.println("cola2: " + cola2 + "\n");
				}
				case 2 -> {
					int numero = EntradaTeclado.pedirEntero("Número: ");
					cola2.encolar(numero);
					System.out.println("cola: " + cola);
					System.out.println("cola2: " + cola2 + "\n");
				}
				case 3 -> {
					System.out.println("Elemento desencolado: " + cola.desencolar(cola2));
					System.out.println("cola: " + cola);
					System.out.println("cola2: " + cola2 + "\n");
				}
				case 4 -> {
					System.out.println("Elemento desencolado: " + cola2.desencolar(cola));
					System.out.println("cola: " + cola);
					System.out.println("cola2: " + cola2 + "\n");
				}
				default -> System.out.println("Por favor, inserta un número entre el 1 y el 5.");
			}
		} while (opcion != 5);
	}

	public static void main(String[] args) {
		Cola<Integer> cola = new Cola<>(new ArrayList<>());
		Cola<Integer> cola2 = new Cola<>(new ArrayList<>());
		
		menu(cola, cola2);
	}
}