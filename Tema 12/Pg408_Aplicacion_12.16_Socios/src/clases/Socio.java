package clases;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* Resuelta 12.11
Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que deberá 
incluir el método equals (), la interfaz Comparable basada en el dni y el método
antiguedad().
Implementar un programa que gestione los socios de un club guardando los datos en el
fichero socios.dat. Al arrancar la aplicación, se leen los datos del fichero y se abre
un menú con las opciones: 1. Alta; 2. Baja; 3. Modificación; 4. Listado por	DNI;
5. Listado por antigüedad, y 6. Salir.	

Salir de la aplicación se guardan en el fichero los datos actualizados.	
*/

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Socio implements Comparable<Socio>, Serializable {
	private final String dni;
	private String nombre;
	private LocalDate fechaAlta;
	
	public Socio(String dni, String nombre, LocalDate alta) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaAlta = alta;
	}
	
	//Constructor de búsquedas
	public Socio(String dni) {
		this.dni = dni;
	}
	
	public int antiguedad() {
		return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	public String getNombre() {
		return nombre;
	}
	
	//Ordenación natural por DNI
	@Override
	public int compareTo(Socio o) {
		return dni.compareTo(o.dni);
	}
	/*
	Definimos un criterio de igualdad basado en el DNI, que no se puede repetir (porque estamos en un Set),
	e identifica a los socios de forma única. Además es consistente con el
	criterio de comparación de compareTo()
	*/
	
	@Override
	public String toString() {
		return "\n" + "DNI: " + dni + ",   Nombre: " + nombre + ",   Antigüedad: " + antiguedad() + " años\n";
	}
}