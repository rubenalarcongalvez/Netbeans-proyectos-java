/*
Implementa una aplicación que gestione los empleados de un banco. Para ello se defini-	
rá la clase Empleado con los atributos dni, nombre y sueldo. 

Los empleados se guardarán en un objeto de la clase Lista para objetos de la clase Object. La aplicación cargará
en la memoria, al arrancar, la lista de empleados desde el archivo binario empleados.dat	
y mostrará un menú con las siguientes opciones: 
1. Alta empleado; 2. Baja empleado;	3. Mostrar datos empleado; 4. Listar empleados, y 5. Salir.
Al pulsar 5, se grabará en el disco la lista actualizada y terminará el programa.
*/

package clases;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Empleado implements Serializable {
	private String dni;
	private String nombre;
	private int sueldo; //No es long porque nadie cobra tanto (9 dígitos)

	public Empleado(String dni, String nombre, int sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = Math.abs(sueldo);
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "DNI: " + dni + "\tNombre: " + nombre + "\tSueldo: " + sueldo + "€";
	}
	
}
