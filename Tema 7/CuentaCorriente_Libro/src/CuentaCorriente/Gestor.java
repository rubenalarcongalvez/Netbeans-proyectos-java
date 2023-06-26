/*
Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.

Cada cuenta, en caso de tenerlo, cuenta con un único gestor. Diseñar la clase Gestor de	
la que interesa guardar su nombre, teléfono y el importe máximo autorizado con el que pue-	
den operar. Con respecto a los gestores, existen las siguientes restricciones:	

	- Un gestor tendrá siempre un nombre y un teléfono.	
	- Si no se asigna, el importe máximo autorizado por operación será de 10000 euros.	
	- Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el	
	mundo podrá consultarlo.	

El nombre será público y el importe máximo solo será visible por clases vecinas.	

Modificar la clase Cuent a Corriente para que pueda disponer de un objeto Gestor. Es-	
cribir los métodos necesarios.	
 */
package CuentaCorriente;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */

/* 
	Para cumplir los requisitos:	
	- Todos los constructores usarán el nombre y el teléfono.	
	- El importe máximo autorizado tendrá un valor por defecto de 10000 euros.	
	- El teléfono será privado con un método get (0 para que se pueda consultar).	
	- El nombre será público y el importe máximo usará visibilidad por defecto.	
 */
public class Gestor {

	public String nombre;
	private String tlf; //número con el que no se opera: es usual usar String
	double importeMax; //visibilidad de paquete (por defecto)

	public Gestor(String nombre, String tlf, double importeMax) {
		this.nombre = nombre;
		this.tlf = tlf;
		this.importeMax = importeMax;
	}

	public Gestor(String nombre, String tlf) {
		this(nombre, tlf, 10000.0); //asignamos el importe máximo por defecto: 10000 euros
	}

	String getTlf() {
		return tlf;
	}
	
	void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Teléfono: " + tlf);
		System.out.println("Importe máximo: " + importeMax + " euros");
	}
}