package Policias;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public abstract class Policia implements Comparable<Policia> {
	private final String codigo;
	private final String nombre;
	protected double sueldo; //No hace falta poner getters ni setters aquí porque quiero ambos por lo que mejor ponerlo protected
	private static int contador;
	
	public Policia(String rango, String nombre) {
		this.codigo = rango + " - " + ++contador; //Cuando se pone antes el ++ es se suma antes de asignar, y no después
		this.nombre = nombre;
		this.sueldo = 1500;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public int compareTo(Policia otroPoli) {
		return this.codigo.compareTo(otroPoli.codigo);
	}

	@Override
	public String toString() {
		return "-- " + this.getClass().getSimpleName() + "\nCódigo: " + codigo 
				+ "\nNombre: " + nombre + "\nSueldo: " + sueldo;
	}
	
}