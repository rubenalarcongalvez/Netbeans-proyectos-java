package practicaexamen_flota;

import clases.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import utilidades.EntradaTeclado;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class PracticaExamen_Flota {

	public static int menu(int eleccion) {
		if (eleccion >= 0 && eleccion <= 6) {
			System.out.println("1. Insertar barco.");
			System.out.println("2. Eliminar barco.");
			System.out.println("3. Mostrar número de barcos.");
			System.out.println("4. Mostrar barcos en orden de inserción en la flota.");
			System.out.println("5. Mostrar barcos por longitud de menor a mayor.");
			System.out.println("6. Guardar flota.");
			System.out.println("0. Salir del programa.");
		}

		return EntradaTeclado.pedirNatural("\nElección: ");
	}

	public static <T extends Barco> T crearBarco() {
		String respuesta = "";
		T barco = null;
		int longitud, canones;

		do {
			respuesta = EntradaTeclado.pedirPalabraLimpiandoBuffer("Tipo de barco (acorazado o submarino): ");
		} while (!respuesta.equalsIgnoreCase("acorazado") && !respuesta.equalsIgnoreCase("submarino"));

		longitud = EntradaTeclado.pedirNatural("Longitud: ");

		if (respuesta.equalsIgnoreCase("acorazado")) {
			canones = EntradaTeclado.pedirNatural("Número de cañones: ");

			barco = (T) new Acorazado(longitud, canones);
		} else if (respuesta.equalsIgnoreCase("submarino")) {
			barco = (T) new Submarino(longitud);
		}

		return barco;
	}

	public static <T extends Barco> T buscarBarco() {
		String respuesta = "";
		T barco = null;
		int longitud;

		do {
			respuesta = EntradaTeclado.pedirPalabraLimpiandoBuffer("Tipo de barco (acorazado o submarino): ");
		} while (!respuesta.equalsIgnoreCase("acorazado") && !respuesta.equalsIgnoreCase("submarino"));

		longitud = EntradaTeclado.pedirNatural("Longitud: ");

		if (respuesta.equalsIgnoreCase("acorazado")) {
			barco = (T) new Acorazado(longitud);
		} else if (respuesta.equalsIgnoreCase("submarino")) {
			barco = (T) new Submarino(longitud);
		}

		return barco;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Flota<Barco> flota = new Flota();
		int eleccion = 0;
		Barco barco;

		try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
			flota = (Flota) in.readObject();
			System.out.println("_____Flota cargada_____\n");
		} catch (FileNotFoundException ex) {
			System.out.println("_____Forma tu propia flota_____\n");
		} catch (ClassNotFoundException | IOException ex) {
			System.out.println(ex);
		}

		do {
			eleccion = menu(eleccion);

			switch (eleccion) {
				case 1 -> {
					barco = crearBarco();
					if (flota.insertarBarco(barco) == true) {
						System.out.println("\nBarco insertado.\n");
					} else {
						System.out.println("\nYa hay un barco con esa longitud.\n");
					}
				}
				case 2 -> {
					barco = buscarBarco();
					if (flota.eliminarBarco(barco) == true) {
						System.out.println("\nBarco eliminado.\n");
					} else {
						System.out.println("\nNo hay ningún barco con esas características.\n");
					}
				}
				case 3 -> {
					System.out.println("\nNúmero de barcos en la flota: " + flota.numeroElementos() + "\n");
				}
				case 4 -> {
					System.out.println("\n--- BARCOS ---");
					for (Iterator<Barco> it = flota.iterador(); it.hasNext();) {
						System.out.println(it.next() + "\n");
					}
					System.out.println();
				}
				case 5 -> {
					System.out.println();
					flota.ordenada();
					System.out.println();
				}
				case 6 -> {
					try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
						out.writeObject(flota);
					} catch (IOException ex) {
						System.out.println(ex);
					}
				}
			}
		} while (eleccion != 0);
	}
}