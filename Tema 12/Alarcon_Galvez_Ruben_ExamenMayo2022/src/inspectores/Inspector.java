package inspectores;

import java.util.Objects;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public abstract class Inspector implements Comparable<Inspector> {
	private final String codigo;
	private final String nombre;
	protected double sueldo; //protected porque voy a utilizar igualmente getters y setters, y solo lo quiero en clases relacionadas o de paquete
	private static int contador;

	public Inspector(char rango, String nombre) {
		this.codigo = rango + " - " + ++contador; //Se pone antes el ++ para sumar ANTES y empezar en 1 y no 0 y luego sumar
		this.nombre = nombre;
		this.sueldo = 2000;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 59 * hash + Objects.hashCode(this.codigo);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Inspector other = (Inspector) obj;
		return Objects.equals(this.codigo, other.codigo);
	}

	@Override
	public int compareTo(Inspector o) {
		return this.codigo.compareToIgnoreCase(o.codigo);
	}

	@Override
	public String toString() {
		return "-- " + this.getClass().getSimpleName() + "\nCódigo: " + codigo + "\nNombre: " + nombre + "\nSueldo: " + sueldo;
	}
	
}