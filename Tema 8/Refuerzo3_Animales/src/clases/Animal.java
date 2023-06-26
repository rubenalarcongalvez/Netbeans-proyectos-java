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
public abstract class Animal {
	private int patas;
	private String sonido;
	private int edad;
	private boolean vive = true;
	private boolean domestico;
	private String nombre;

	public Animal(String nombre, int patas, String sonido, int edad) {
		this.patas = patas;
		this.sonido = sonido;
		this.edad = edad;
		this.domestico = true;
		this.nombre = nombre;
	}
	
	public Animal(int patas, String sonido, int edad) {
		this.patas = patas;
		this.sonido = sonido;
		this.edad = edad;
	}
	
	public boolean estaVivo() {
		return this.vive;
	}
	
	public void comer() {
		System.out.println("Ñam ñam");
	}
	
	public void beber() {
		System.out.println("Glu glu");
	}
	
	public void cumplirAnios() {
		this.edad++;
	}
	
	public void matar() {
		if (domestico == true) {
			System.out.println(nombre + " ha muerto :(");
		} else {
			System.out.println("Este animal ha muerto");
		}
		
		this.vive = false;
	}
	
	public abstract void comunicarse();
	
	public int getEdad() {
		return edad;
	}
	
	public boolean esDomestico() {
		return domestico;
	}

	@Override
	public String toString() {
		String resultado = "";
		
		if (domestico == true) {
			resultado = "Nombre: " + nombre + "\n";
		}
		
		resultado += "Patas: " + patas;
		resultado += "\nSonido: " + sonido;
		resultado += "\nEdad: " + edad + " años";
		resultado += "\nVive: " + vive;
		
		return resultado;
	}
}
