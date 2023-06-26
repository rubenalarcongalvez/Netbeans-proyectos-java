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

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class SuperCola<T> {
	private final Cola<T> cola1;
	private final Cola<T> cola2;

	public SuperCola() {
		this.cola1 = new Cola<>();
		this.cola2 = new Cola<>();
	}
	
	public static <T> void encolar(Cola<T> cola , T nuevo) {
		cola.encolar(nuevo);
	}
	
	public static <T> T desencolar(Cola<T> cola1, Cola<T> cola2) {
		T eliminado = null;

		if (cola1.getCola().isEmpty()) { //Si nuestra cola está vacía, mira en la otra cola
			if (!cola2.getCola().isEmpty()) { //Si no está vacía, desencola de ahí
				eliminado = cola2.getCola().get(cola2.getCola().size() - 1);

				cola2.getCola().remove(cola2.getCola().size() - 1); //Extrae del final de la otra cola
			}
		} else { //Si nuestra cola tiene elementos, desencolará uno
			eliminado = cola1.getCola().get(cola1.getCola().size() - 1);

			cola1.getCola().remove(cola1.getCola().size() - 1); //Extrae del final
		}

		return eliminado; //Dice cuál extrae
	}

	public Cola<T> getCola1() {
		return cola1;
	}

	public Cola<T> getCola2() {
		return cola2;
	}

	@Override
	public String toString() {
		return "Cola 1: " + this.cola1 + "\nCola 2: " + this.cola2;
	}
	
}