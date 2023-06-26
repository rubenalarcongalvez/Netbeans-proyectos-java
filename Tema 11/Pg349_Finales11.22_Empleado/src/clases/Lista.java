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
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Lista implements Serializable {

	private Empleado[] empleados;

	public Lista() {
		this.empleados = new Empleado[0];
	}

	public void altaEmpleado(String dni, String nombre, int sueldo) {
		empleados = Arrays.copyOf(empleados, empleados.length + 1);
		empleados[empleados.length - 1] = new Empleado(dni, nombre, sueldo);
	}

	public boolean bajaEmpleado(String dni, String nombre) { //Puede ser por dni, por nombre o por ambos
		boolean resultado = false;
		
		Empleado[] nuevaTabla = new Empleado[empleados.length - 1];

		int posicionQuitar = -1;

		if (dni.isBlank() && !(nombre.isBlank())) { //Si dni está vacío pero el nombre no
			for (int i = 0; i < empleados.length && posicionQuitar != i; i++) {
				if (empleados[i].getNombre().equalsIgnoreCase(nombre)) {
					posicionQuitar = i;
				}
			}
		}

		if (nombre.isBlank() && !(dni.isBlank())) { //Si nombre está vacío pero el dni no
			for (int i = 0; i < empleados.length && posicionQuitar != i; i++) {
				if (empleados[i].getDni().equalsIgnoreCase(dni)) {
					posicionQuitar = i;
				}
			}
		}

		if (!(dni.isBlank()) && !(nombre.isBlank())) { //Si el usuario rellenó todos los campos
			for (int i = 0; i < empleados.length && posicionQuitar != i; i++) {
				if (empleados[i].getDni().equalsIgnoreCase(dni) && empleados[i].getNombre().equalsIgnoreCase(nombre)) {
					posicionQuitar = i;
				}
			}
		}

		if (posicionQuitar != -1) {
			System.arraycopy(empleados, 0, nuevaTabla, 0, posicionQuitar);
			System.arraycopy(empleados, posicionQuitar + 1, nuevaTabla, posicionQuitar, nuevaTabla.length - posicionQuitar);

			empleados = nuevaTabla;
			resultado = true;
		}
		
		return resultado;
	}

	public boolean mostrarDatos(String dni, String nombre) {
		boolean coincide = false;

		if (dni.isBlank() && !(nombre.isBlank())) { //Si dni está vacío pero el nombre no
			for (int i = 0; i < empleados.length && coincide == false; i++) {
				if (empleados[i].getNombre().equalsIgnoreCase(nombre)) {
					System.out.println(empleados[i]);
					coincide = true;
				}
			}
		}

		if (nombre.isBlank() && !(dni.isBlank())) { //Si nombre está vacío pero el dni no
			for (int i = 0; i < empleados.length && coincide == false; i++) {
				if (empleados[i].getDni().equalsIgnoreCase(dni)) {
					System.out.println(empleados[i]);
					coincide = true;
				}
			}
		}

		if (!(dni.isBlank()) && !(nombre.isBlank())) { //Si el usuario rellenó todos los campos
			for (int i = 0; i < empleados.length && coincide == false; i++) {
				if (empleados[i].getDni().equalsIgnoreCase(dni) && empleados[i].getNombre().equalsIgnoreCase(nombre)) {
					System.out.println(empleados[i]);
					coincide = true;
				}
			}
		}
		
		return coincide;
	}

	@Override
	public String toString() {
		String resultado = "";
		
		for (Empleado empleado : empleados) {
			resultado += empleado + "\n";
		}
		
		return resultado;
	}

}
