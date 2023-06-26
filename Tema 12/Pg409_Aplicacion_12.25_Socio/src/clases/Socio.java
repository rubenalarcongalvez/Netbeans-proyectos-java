/*
Implementa una aplicación que gestione un club donde se identifica a los socios por un	
apodo personal y único. De cada socio, además del apodo, se guarda el nombre y su	
fecha de ingreso en el club. Utiliza un mapa donde las claves serán los apodos y los va	
lores, objetos de la clase Socio. Los datos se guardarán en un fichero Ilamado «club.	
dat, de donde se leerá el mapa al arrancar y donde se volverá a guardar actualizado al	
salir. Las operaciones se mostrarán en un menú que tendrá las siguientes opciones:	
1. Alta socio.	
2. Baja socio.	
3. Modificación socio.	
4. Listar socios por apodo.	
5. Listar socios por antigüedad.	
6. Listar los socios con alta anterior a un año determinado.	
7. Salir.	
*/

package clases;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Socio implements Comparable<Socio>, Serializable {
	private String nombre;
	private LocalDate fechaIngreso;

	public Socio(String nombre, LocalDate fechaIngreso) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
	}

	public int getAnioIngreso() {
		return fechaIngreso.getYear();
	}
	
	@Override
	public int compareTo(Socio otro) {
		return fechaIngreso.compareTo(otro.fechaIngreso);
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\tFecha ingreso: " + fechaIngreso;
	}
}