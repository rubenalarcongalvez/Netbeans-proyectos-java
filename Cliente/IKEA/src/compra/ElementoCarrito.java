package compra;

import java.io.Serializable;
import java.util.Objects;
import piezas.Pieza;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ElementoCarrito implements Serializable {
	private Pieza elemento;
	private int cantidad;

	public ElementoCarrito(Pieza pieza, int cantidad) {
		this.elemento = pieza;
		this.cantidad = cantidad;
	}

	public Pieza getElemento() {
		return elemento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 67 * hash + Objects.hashCode(this.elemento);
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
		final ElementoCarrito other = (ElementoCarrito) obj;
		if (!Objects.equals(this.elemento, other.elemento)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return elemento + "\nCantidad: " + cantidad;
	}
	
}