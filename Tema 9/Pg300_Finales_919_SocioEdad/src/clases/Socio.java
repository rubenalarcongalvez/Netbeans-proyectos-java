/*
Implementar la interfaz Comparable en la clase Socio para que, por defecto, se ordene
según la edad de forma ascendiente (de menor a mayor).
*/

/* 9.20
Repetir Actividad de Aplicación 9.19 para que se ordene por edades y, si dos
socios tienen la misma edad, vaya antes el que tenga un número de socio menor
*/

/* 9.21
Repetir Actividad de aplicación 9.20 con un criterio que ordene las fechas
de nacimiento
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
	
	//Primeros 9.19 - 9.20
//	@Override
//	//la implementación debe declararse public
//	public int compareTo(Object ob) {
//		int resultado = 0;
//		Socio otroSocio = (Socio) ob;
//		
//		if (this.edad() < otroSocio.edad()) { //this va antes que ob
//			resultado = -1; //o cualquier número negativo
//		} else if (this.edad() > otroSocio.edad()) { //this va después que ob
//			resultado = 1; //o cualquier número positivo
//		} else { //this es igual que ob
//			if (this.id < otroSocio.id)	resultado = -1; else if (this.id > otroSocio.id) resultado = 1;
//		}
//		return resultado;
//	}
	
	@Override
	public int compareTo(Object ob) {
		int resultado = 0;
		Socio otroSocio = (Socio) ob;
		
		if (this.fechaNacimiento.isAfter(otroSocio.fechaNacimiento)) { //this va antes que ob
			resultado = -1; //o cualquier número negativo
		} else if (this.fechaNacimiento.isBefore(otroSocio.fechaNacimiento)) { //this va después que ob
			resultado = 1; //o cualquier número positivo
		} else { //this es igual que ob
			if (this.id < otroSocio.id)	resultado = -1; else if (this.id > otroSocio.id) resultado = 1;
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
	} //el '\n' del final es para que cada socio vaya en una línea distinta
}