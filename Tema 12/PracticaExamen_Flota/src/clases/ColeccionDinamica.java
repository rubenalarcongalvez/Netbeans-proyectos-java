package clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class ColeccionDinamica<T> implements Serializable {
	private ArrayList<T> coleccion;

	public ColeccionDinamica() {
		this.coleccion = new ArrayList<>();
	}
	
	ArrayList<T> getColeccion() {
		return coleccion;
	}
	
	public int numeroElementos() {
		return this.coleccion.size();
	}
	
	public int estaEnColeccion(T elemento) {
		return this.coleccion.indexOf(elemento);
	}
	
	public boolean insertar(T elemento) {
		boolean insertado = false;
		
		if (!this.coleccion.contains(elemento)) {
			this.coleccion.add(elemento);
			insertado = true;
		} else {
			this.coleccion.remove(elemento);
		}
		
		return insertado;
	}
	
	public T sacarElemento() {
		T elemento = null;
		
		if (!this.coleccion.isEmpty()) {
			elemento = this.coleccion.get(0);
			this.coleccion.remove(0);
		}
		
		return elemento;
	}
	
}