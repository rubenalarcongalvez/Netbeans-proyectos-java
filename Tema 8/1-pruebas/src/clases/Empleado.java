/*
Enunciado
*/

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Empleado extends Persona {
	double salario;

	public Empleado(String nombre, byte edad, double estatura, double salario) {
		super.nombre = nombre;
		super.edad = edad;
		super.estatura = estatura;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getSalario() {
		return salario;
	}
	
}