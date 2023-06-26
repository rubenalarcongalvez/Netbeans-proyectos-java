package piezas;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pieza implements Serializable {
	final String codigo;
	String nombre;
	String descripcion;
	String dimensiones;
	double precio;
	int stock;

	public Pieza (String codigo) {
		this.codigo = codigo;
	}
	
	public Pieza(String codigo, String nombre, String descripcion, String dimensiones, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dimensiones = dimensiones;
		this.precio = precio;
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.codigo);
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
		final Pieza other = (Pieza) obj;
		if (!Objects.equals(this.codigo, other.codigo)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + "\nNombre: " + nombre + "\nDescripción: " + descripcion
				+ "\nDimensiones: " + dimensiones + " cm" + "\nPrecio: " + precio + "€\nStock: " + stock;
	}
	
}