package pg343_resuelta11.pkg8_socios;

import java.io.Serializable;

/*
Implementamos una clase Socio simplificada, suficiente para ilustrar lo que
nos interesa. Para que se pueda guardar en un fichero binario,m deberá implementar
la interfaz Seriarizable
 */
class Socio implements Serializable {

	String dni;
	String nombre;

	public Socio(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Socio{" + "dni=" + dni + ", nombre=" + nombre + '}';
	}

}