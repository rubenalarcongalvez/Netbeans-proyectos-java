//Ampliación del profesor
/*
Crear un método de clase que compruebe que un dni es válido (9 dígitos numéricos y una letra).

Meter en una tabla del 0 al 23 los cálculos que corresponden a cada número. Sacar los 8 primeros números y convertirlos (parsearlos) a long. Sacar el resto y dividirlo entre 23 y lo comparas con el caracter charAt(9). Si coinciden, true.

Lo meto dentro de un package (compruebaDNI).
E implementar si DNI es correcto, lo admite, si no, lo pide otra vez en la clase.
*/

package CuentaCorriente;

import TestDNI.TestDNI;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CuentaCorriente {

	String dni; //del titular
	public String nombre; //del titular	
	private double saldo; //efectivo disponible en la cuenta	
	//Los parámetros de entrada: nombre y dni , ocultan a los atributos de la clase
	//con el mismo identificador. Para acceder a ellos hay que utilizar this.
	
	CuentaCorriente(String dni, String nombre) { //constructor
		this.dni = TestDNI.validarDNI(dni); //DNI pasado como parámetro
		this.nombre = nombre; //nombre pasado como parámetro
		saldo = 0; //asignamos el saldo por defecto
	}

	boolean egreso(double cantidad) { //sacar dinero de la cuenta corriente
		boolean operacionPosible;
		if (saldo >= cantidad) { //si disponemos de saldo suficiente
			saldo -= cantidad;
			operacionPosible = true;
		} else { //no hay saldo disponible
			operacionPosible = false;
		}
		return (operacionPosible); //Indica si ha sido posible realizar la operación
	}

	void ingreso(double cantidad) { //añadimos dinero a la cuenta corriente
		saldo += cantidad;
	}

	//Sobrecargamos los constructores
	CuentaCorriente(String dni, double saldo) { //constructor
		this.dni = TestDNI.validarDNI(dni); //DNI pasado como parámetro
		this.saldo = saldo; //saldo pasado como parámetro
		this.nombre = "Sin asignar"; //Indicamos que no disponemos del nombre
	}
	
	CuentaCorriente(String dni, String nombre, double saldo) { //constructor
		this.dni = TestDNI.validarDNI(dni);
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	static private String nombreBanco = "International Java Bank"; //valor por defecto
	//este valor se asigna antes de crear ningún objeto
	static void setBanco(String nuevoNombre) {
		nombreBanco = nuevoNombre;
	}
	static String getBanco() {
		return nombreBanco;
	}
	
	Gestor gestor; //gestor que administra la cuenta
	
	CuentaCorriente(String dni, String nombre, Gestor gestor) { //sobrecargamos
		this(dni, nombre);
		this.gestor = gestor;
	}
	
	//permite asignar un nuevo objeto Gestor a la cuenta
	void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}
	
	void mostrarInformacion() {
		/* muestra el estado de la cuenta, incluido el gestor.
		No podemos usar directamente gestor.mostrarInformacion(), ya que puede
		que el gestor sea null. Al intentar acceder a los miembros de un objeto
		nulo se produce una excepción
		*/
		if (gestor == null) { //si la cuenta no está administrada por un gestor
			System.out.println("Cuenta sin gestor");
		} else {
			System.out.println("Información del gestor");
			gestor.mostrarInformacion(); //llama a la clase gestor para aplicar el método mostrarInformacion() DE AHÍ
			//no es posible mostrar directamente sus
			//atributos, ya que algunos no son visibles
		}
		
		System.out.println("Información de la cuenta");
		System.out.println("Nombre: " + nombre);
		System.out.println("Dni: " + dni);
		System.out.println("Saldo: " + saldo);
	}
}