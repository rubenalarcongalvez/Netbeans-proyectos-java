package ejercicio;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author usuario2
 */
public class Jugador implements Serializable {

	private static int contador;
	private String id;
	private String nombre;
	private int altura;

	public static int getContador() {
		return contador;
	}

	public static void setContador(int cuenta) {
		contador = cuenta;
	}

	public Jugador(String nombre, int altura) {
		contador++;
		this.id = "J-" + contador; //Cada vez que se crea un jugador, se aumenta su código
		this.nombre = nombre;
		this.altura = altura;
	}
	
	public Jugador(String id) {	//Para saber dónde está el jugador con esta ID con el método buscar()
		this.id = id;
	}

	//GETTERS Y SETTERS
	public String getId() {
		return id;
	}
	
	public void setId(String id) { //Para ajustar el id
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		boolean iguales = false;
//
//		Jugador jug = (Jugador) obj; //Ponemos el formato adecuado
//
//		if (this.id.equals(jug.id)) {
//			iguales = true;
//		}
//
//		return iguales;
//	}
	
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
		final Jugador other = (Jugador) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return id + "\tNombre: " + nombre + "          Altura: " + altura + "\n"; //El salto de línea del final es méramente estético
	}

}
