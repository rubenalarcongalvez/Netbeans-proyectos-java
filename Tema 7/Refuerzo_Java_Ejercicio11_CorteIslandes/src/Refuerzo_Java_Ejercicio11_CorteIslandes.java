
import clases.TarjetaRegalo;

/*
La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
las tarjetas regalo. Como primer paso para implementar la aplicación, es
necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando
se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática
un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta,
se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar
creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas
originales se quedarían con 0 € de saldo.


-------------------- Salida --------------------
Tarjeta no 67324 – Saldo 100.00€
Tarjeta no 02788 – Saldo 120.00€
No tiene suficiente saldo para gastar 200.00€
Tarjeta no 67324 – Saldo 50.55€
Tarjeta no 02788 – Saldo 115.00€
Tarjeta no 67324 – Saldo 0.00€
Tarjeta no 02788 – Saldo 0.00€
Tarjeta no 59032 – Saldo 165.55€
 */

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Java_Ejercicio11_CorteIslandes {

	public static void main(String[] args) {
		TarjetaRegalo t1 = new TarjetaRegalo(100);
		TarjetaRegalo t2 = new TarjetaRegalo(120);
		System.out.println(t1.toString());
		System.out.println(t2);
		t1.gasta(45.90);
		t2.gasta(5);
		t2.gasta(200);
		t1.gasta(3.55);
		System.out.println(t1);
		System.out.println(t2);
		TarjetaRegalo t3 = t1.fusionaCon(t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}