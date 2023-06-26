/*
Implementar la interfaz Comparable en la clase Socio para que, por defecto, se ordene
según la fecha creciente.
*/

package clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Socio implements Comparable {
	int id; //número identificativo del socio
	String nombre;
	LocalDate fechaNacimiento;
	
	public Socio(int id, String nombre, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		//establecemos el formato español para las teclas:
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
	}
	
	public int edad() {
		return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	} /*el cast (int) es porque until() devuelve un valor long. Al ser de
	estrechamiento, en teoría podría suponer una pérdida de información
	para números muy grandes (de ahí un warning del compilador) pero, por
	desgracia, las edades de las personas son enteros muy pequeños.*/
	
	@Override
	//la implementación debe declararse public
	public int compareTo(Object ob) {
		int resultado;
		Socio otroSocio = (Socio) ob;
		
		if (fechaNacimiento.isBefore(otroSocio.fechaNacimiento)) { //this va antes que ob
			resultado = -1; //o cualquier número negativo
		} else if (fechaNacimiento.isAfter(otroSocio.fechaNacimiento)) { //this va después que ob
			resultado = 1; //o cualquier número positivo
		} else { //this es igual que ob
			resultado = 0;
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
	} //el '\n' del final es para que cada socio vaya en una línea distinta
}