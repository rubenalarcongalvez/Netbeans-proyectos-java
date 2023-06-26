package policias;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public abstract class Policia implements Comparable<Policia> {
	private final String codigo;
	private final String nombre;
	protected double sueldo; //protected porque vamos a usar setter y getter igualmente si lo ponemos privado, y es un double
	private static int contador;

	public Policia(char rango, String nombre) {
		this.codigo = rango + " - " + ++contador;
		this.nombre = nombre;
		this.sueldo = 1500;
	}

	@Override
	public int compareTo(Policia otro) {
		return this.codigo.compareTo(otro.codigo);
	}

	@Override
	public String toString() {
		return "\n-- " + this.getClass().getSimpleName() + "\nCódigo: " + codigo 
				+ "\nNombre: " + nombre + "\nSueldo: " + sueldo;
	}
	
}