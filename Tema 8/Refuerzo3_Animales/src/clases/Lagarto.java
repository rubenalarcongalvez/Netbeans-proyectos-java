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
public class Lagarto extends Animal {

	private boolean tieneCola = true;
	
	public Lagarto(String nombre, int edad) {
		super(nombre, 4, "Gruñido agudo", edad);
	}
	
	public Lagarto(int edad) {
		super(4, "Gruñido agudo", edad);
	}
	
	public void cazarMoscas() {
		if ((int) (Math.random() * 10 + 1) >= 3) {
			System.out.println("El lagarto tuvo éxito al cazar");
			this.comer();
		} else {
			System.out.println("El lagarto falló al intentar cazar la mosca");
		}
	}
	
	public void desprenderCola() {
		System.out.println("El lagarto se desprendió de su cola para salvarse");
		tieneCola = false;
	}
	
	public void recuperarCola() {
		System.out.println("El lagarto ya ha regenerado su cola completamente");
		tieneCola = true;
	}

	@Override
	public void comunicarse() {
		System.out.println("fiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
	}

	@Override
	public String toString() {
		String resultado = "=== LAGARTO ===\n";
		resultado += super.toString();
		resultado += "\nTiene cola: " + tieneCola;
		
		return resultado;
	}
}
