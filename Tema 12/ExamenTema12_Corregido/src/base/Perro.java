package base;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Perro extends Animal {
	private int longitud;

	public Perro(String nombre, int longitud) {
		super(nombre);
		if (longitud > 0) {
			this.longitud = longitud;
		} else {
			this.longitud = 0;
		}
	}

	public int getLongitud() {
		return longitud;
	}

	@Override
	public String toString() {
		return "Especie: perro\n" + super.toString() + "\nLongitud: " + longitud + "cm\n";
	}
	
}