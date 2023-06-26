package base;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Gato extends Animal {
	private int edad;

	public Gato(String nombre, int edad) {
		super(nombre);
		if (edad > 0) {
			this.edad = edad;
		} else {
			this.edad = 0;
		}
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Especie: gato\n" + super.toString() + "\nEdad: " + edad + " años\n";
	}
	
}