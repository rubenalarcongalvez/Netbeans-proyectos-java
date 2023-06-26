/*
Implementa una aplicación que gestione un club donde se identifica a los socios por un	
apodo personal y único. De cada socio, además del apodo, se guarda el nombre y su	
fecha de ingreso en el club. Utiliza un mapa donde las claves serán los apodos y los va	
lores, objetos de la clase Socio. Los datos se guardarán en un fichero Ilamado «club.	
dat, de donde se leerá el mapa al arrancar y donde se volverá a guardar actualizado al	
salir. Las operaciones se mostrarán en un menú que tendrá las siguientes opciones:	
1. Alta socio.	
2. Baja socio.	
3. Modificación socio.	
4. Listar socios por apodo.	
5. Listar socios por antigüedad.	
6. Listar los socios con alta anterior a un año determinado.	
7. Salir.	
 */
package pg409_aplicacion_12.pkg25_socio;

import utilidades.*;
import clases.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg409_Aplicacion_1225_Socio {

	public static int menu(int eleccion) {
		if (eleccion >= 1 && eleccion <= 7) {
			System.out.println("====== MENÚ ======");
			System.out.println("1. Alta socio.");
			System.out.println("2. Baja socio.");
			System.out.println("3. Modificación socio.");
			System.out.println("4. Listar socios por apodo.");
			System.out.println("5. Listar socios por antigüedad.");
			System.out.println("6. Listar los socios con alta anterior a un año determinado.");
			System.out.println("7. Salir.");
		}

		eleccion = EntradaTeclado.pedirEntero("Elige una opción: ");
		return eleccion;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		TreeMap<String, Socio> club = new TreeMap<>();
		Iterator<Map.Entry<String, Socio>> it;
		Map.Entry<String, Socio> elemento;

		int eleccion = 7;

		String apodo = "";
		String nombre = "";
		LocalDate fechaIngreso = null;
		int anioAlta = 0;

		//CARGAR LOS DATOS
		try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
			club = (TreeMap<String, Socio>) in.readObject();
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
			System.out.println(ex);
		}

		Set<Map.Entry<String, Socio>> conjuntoClub = club.entrySet();

		do {
			eleccion = menu(eleccion);

			switch (eleccion) {
				case 1 -> {
					apodo = EntradaTeclado.pedirPalabraLimpiandoBuffer("Introduzca su apodo: ");

					while (club.containsKey(apodo)) {
						apodo = EntradaTeclado.pedirPalabraLimpiandoBuffer("Su apodo ya existe, introduzca otro: ");
					}

					nombre = EntradaTeclado.pedirPalabraLimpiandoBuffer("Introduzca su nombre: ");
					fechaIngreso = EntradaTeclado.pedirFecha("Introduzca su fecha de ingreso: ");

					club.put(apodo, new Socio(nombre, fechaIngreso));

					System.out.println("\nSocio admitido.\n");
				}
				case 2 -> {
					apodo = EntradaTeclado.pedirPalabraLimpiandoBuffer("Introduzca su apodo para darle de baja: ");

					while (!club.containsKey(apodo)) {
						apodo = EntradaTeclado.pedirPalabraLimpiandoBuffer("Ese apodo no existe, introduzca uno existente: ");
					}

					club.remove(apodo);

					System.out.println("\nSocio eliminado correctamente.\n");

				}
				case 3 -> {
					apodo = EntradaTeclado.pedirPalabraLimpiandoBuffer("Introduzca el apodo para modificar sus datos: ");

					while (!club.containsKey(apodo)) {
						apodo = EntradaTeclado.pedirPalabraLimpiandoBuffer("Ese apodo no existe, introduzca uno existente: ");
					}

					club.remove(apodo);

					apodo = EntradaTeclado.pedirPalabraLimpiandoBuffer("Introduzca su nuevo apodo: ");

					while (club.containsKey(apodo)) {
						apodo = EntradaTeclado.pedirPalabraLimpiandoBuffer("Ese apodo ya existe, introduzca uno nuevo: ");
					}

					nombre = EntradaTeclado.pedirPalabraLimpiandoBuffer("Introduzca su nombre: ");
					fechaIngreso = EntradaTeclado.pedirFecha("Introduzca su fecha de ingreso: ");

					club.put(apodo, new Socio(nombre, fechaIngreso));

					System.out.println("\nSocio modificado correctamente.\n");
				}
				case 4 -> {
					System.out.println();

					it = conjuntoClub.iterator(); //Creamos un iterador para cada vez
					while (it.hasNext()) {
						elemento = it.next();
						System.out.println("Apodo: " + elemento.getKey() + "\n" + elemento.getValue());
					}

					System.out.println();
				}
				case 5 -> {
					System.out.println();

					ArrayList<Map.Entry<String, Socio>> lista = new ArrayList(club.entrySet());
					lista.sort(Entry.comparingByValue());

					it = lista.iterator(); //Creamos un iterador para cada vez
					while (it.hasNext()) {
						elemento = it.next();
						System.out.println("Apodo: " + elemento.getKey() + "\n" + elemento.getValue());
					}

					System.out.println();
				}
				case 6 -> {
					int anioIngreso = EntradaTeclado.pedirEntero("Introduzca el año de alta que prefiera: ");

					System.out.println();

					it = conjuntoClub.iterator(); //Creamos un iterador para cada vez
					while (it.hasNext()) {
						elemento = it.next();
						if (elemento.getValue().getAnioIngreso() < (anioIngreso)) {
							System.out.println("Apodo: " + elemento.getKey() + "\n" + elemento.getValue() + "\n");
						}
					}

				}
				case 7 -> {
					try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
						out.writeObject(club);
					} catch (IOException ex) {
						System.out.println(ex);
					}
				}
			}
		} while (eleccion != 7);
	}
}