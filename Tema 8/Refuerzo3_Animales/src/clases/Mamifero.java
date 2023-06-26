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
public abstract class Mamifero extends Animal {
	private final int periodoGestacion;
	private boolean lactante = true;
	private int hijos;

	public Mamifero(String nombre, int patas, String sonido, int edad, int periodoGestacion) {
		super(nombre, patas, sonido, edad);
		this.periodoGestacion = periodoGestacion;
		if (edad >= 1) {
			lactante = false;
		}
	}
	
	public Mamifero(int patas, String sonido, int edad, int periodoGestacion) {
		super(patas, sonido, edad);
		this.periodoGestacion = periodoGestacion;
	}
	
	public void destetar() {
		this.lactante = false;
	}
	
	public boolean esLactante() {
		return lactante;
	}
	
	public void amamantar() {
		if (hijos > 0) {
			System.out.println("Chup chup");
		}
		System.out.println("No tiene hijos a los que amamantar");
	}
	
	public void tenerHijo() {
		if (this.getEdad() > 3) {
			this.hijos++;
		} else {
			System.out.println("Todavía es muy joven para tener hijos");
		}
	}
	
	public void tenerHijo(int numHijos) {
		if (this.getEdad() > 3) {
			for (int i = 0; i < numHijos; i++) {
				this.tenerHijo();
			}
		} else {
			System.out.println("Todavía es muy joven para tener hijos");
		}
	}
	
	@Override
	public abstract void comunicarse();

	@Override
	public String toString() {
		String resultado = super.toString();
		resultado += "\nPeriodo de gestación: " + periodoGestacion + " meses";
		resultado += "\nLactante: " + lactante;
		resultado += "\nHijos: " + hijos;
		
		return resultado;
	}
}