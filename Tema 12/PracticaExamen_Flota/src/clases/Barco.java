package clases;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public abstract class Barco implements Comparable<Barco>, Serializable {
	private final String codigo;
	private final int longitud;

	public Barco(String tipoDeBarco, int contador, int longitud) {
		this.codigo = tipoDeBarco + "-" + contador;
		this.longitud = longitud;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 41 * hash + this.longitud;
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
		final Barco other = (Barco) obj;
		return this.longitud == other.longitud;
	}

	@Override
	public int compareTo(Barco o) {
		return o.longitud - this.longitud;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + "\nLongitud: " + longitud + "m";
	}
	
}