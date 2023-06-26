/*
Añadirle a la 7.1 y 7.2 dos constructores (con this.)
 */
package pg215_resuelta_7_1_cuentacorriente;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
class CuentaCorriente {

	String dni; //del titular
	String nombre; //del titular	
	double saldo; //efectivo disponible en la cuenta	
	//Los parámetros de entrada: nombre y dni , ocultan a los atributos de la clase
	//con el mismo identificador. Para acceder a ellos hay que utilizar this.

	CuentaCorriente(String dni, String nombre) { //constructor
		this.dni = dni; //DNI pasado como parámetro
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

	void mostrarInformacion() { //muestra el estado de la cuenta corriente
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Saldo: " + saldo + " euros");
	}

	//Sobrecargamos los constructores
	CuentaCorriente(String dni, double saldo) { //constructor
		this.dni = dni; //DNI pasado como parámetro
		this.saldo = saldo; //saldo pasado como parámetro
		this.nombre = "Sin asignar"; //Indicamos que no disponemos del nombre
	}

	CuentaCorriente(String dni, String nombre, double saldo) { //constructor
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}
}

public class Pg215_Resuelta_7_1_CuentaCorriente {

	public static void main(String[] args) {
		//Creamos un objeto CuentaCorriente para probar la clase y realizar algunas operaciones.
		CuentaCorriente c;
		c = new CuentaCorriente("12345678A", "Pepe"); //Objeto con nombre Pepe con DNI 12345678A
		c.ingreso(1000); //ingresamos 1000 euros
		c.egreso(300); //sacamos 300 euros. Quedarán 700 euros
		c.mostrarInformacion(); //mostramos
		System.out.println("Puedo sacar 700 euros: " + c.egreso(700)); //quedan 0 euros
		System.out.println("Puedo sacar 500 euros: " + c.egreso(500)); //no es posible
		
		//vamos a probar el constructor que utiliza el dni y el saldo:
		c = new CuentaCorriente("98765432Z", 2000); //c referencia al nuevo objeto
		//el anterior queda sin referencia a merced del recolector de basura
		c.mostrarInformacion();
	}
}