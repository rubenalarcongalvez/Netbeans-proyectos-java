/*
Enunciado
*/

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Persona {
	String nombre;
	int edad;
	boolean mayorEdad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		
		if (edad < 0) {
			System.out.println("Edad no válida. No se establecerá");
		} else {
			this.edad = edad;
			this.mayorEdad = edad >= 18;
		}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		if (edad < 0) {
			System.out.println("Edad no válida. No se establecerá");
		} else {
			this.edad = edad;
			this.mayorEdad = edad >= 18;
		}
	}
	
	public void mostrar() {
		System.out.println(this.nombre + " tiene " + this.edad + " años. ¿Es mayor de edad? " + this.mayorEdad);
	}
}
