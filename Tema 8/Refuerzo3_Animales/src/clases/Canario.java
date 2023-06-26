/*
Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,	
al menos, tres métodos específicos de cada clase y redefine el/los método/s	
cuando sea necesario. Prueba las clases creadas en un programa en el que se	
instancien objetos y se les apliquen métodos.
*/

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Canario extends Ave {
	
	private boolean desaparecido;
	
	public Canario(String nombre, int edad, int periodoIncuvación) {
		super(nombre, "Piar", edad, periodoIncuvación);
	}
	
	public Canario(int edad, int periodoIncuvación) {
		super("Piar", edad, periodoIncuvación);
	}
	
	public void cantar() {
		System.out.println("*Suena melodía suave*");
	}
	
	public void agitarAlas() {
		System.out.println("El canario agitó sus alas");
	}
	
	public void irseALasIslasCanarias() {
		System.out.println("El canario se fue a su lugar de origen por instinto, a por los plátanos de Canarias");
		this.desaparecido = true;
	}

	@Override
	public String toString() {
		String resultado = "=== CANARIO ===\n";
		resultado += super.toString();
		if (this.esDomestico() == true) {
			resultado += "\nDesaparecido: " + desaparecido;
		}
		
		return resultado;
	}
	
}
