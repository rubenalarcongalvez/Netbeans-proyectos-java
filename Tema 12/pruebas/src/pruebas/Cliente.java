package pruebas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Cliente implements Comparable<Cliente> {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;

	public Cliente(String dni, String nombre, String fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas);
	}
	
	public int edad() {
		return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}
	
	@Override
	public boolean equals(Object ob) {
		return dni.equals(((Cliente) ob).dni);
	}
	
	@Override
	public int compareTo(Cliente otro) {
		return dni.compareTo(otro.dni);
	}
	
	@Override
	public String toString() {
		return "DNI: " + dni + "  Nombre: " + nombre + "  Edad: " + edad() + "\n";
	}
}