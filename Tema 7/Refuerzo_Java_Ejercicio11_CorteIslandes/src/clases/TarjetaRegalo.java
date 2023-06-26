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
package clases;

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class TarjetaRegalo {

	double saldo;
	static int[] numTarjetas = new int[0];
	int numTarjeta;

	public TarjetaRegalo(double saldo) {
		int nuevoNumero;

		if (saldo < 0) {
			System.out.println("El saldo no puede ser menor que 0. No se realizará la operación.");
		} else {
			this.saldo = saldo;

			do {
				nuevoNumero = (int) (Math.random() * 10000 + 1);
			} while (Arrays.binarySearch(numTarjetas, numTarjeta) > -1);

			numTarjeta = nuevoNumero;

			numTarjetas = Arrays.copyOf(numTarjetas, numTarjetas.length + 1);
			numTarjetas[numTarjetas.length - 1] = nuevoNumero;
		}
	}

	public void gasta(double dinero) {
		if (dinero < this.saldo) {
			this.saldo -= dinero;
		} else {
			System.out.println("No puedes gastar más dinero de lo que tienes. No se realizará la operación.");
		}
	}

	public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta) {
		TarjetaRegalo tarjetaNueva = new TarjetaRegalo(0);

		tarjetaNueva.saldo = this.saldo + otraTarjeta.saldo;

		this.saldo = 0;
		otraTarjeta.saldo = 0;

		return tarjetaNueva;
	}

	@Override
	public String toString() {
		return "Saldo: " + saldo + ", Número tarjeta: " + numTarjeta;
	}
}