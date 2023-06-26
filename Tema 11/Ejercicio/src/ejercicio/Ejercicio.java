package ejercicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rubén Alarcón Gálvez
 */
public class Ejercicio {

	private static Lista<Jugador> lista = new Lista<>();

	private static int eleccion = 0;
	private static String nombre = "";
	private static int altura = 0;
	private static String id = "";
	private static Jugador codigo;

	private static final Scanner sc = new Scanner(System.in, "ISO_8859_1").useLocale(Locale.US); //Alfabeto latino (con acentos) y numeral como esto -> 2.1, aunque lo último no hace falta

	private static void mostrarMenu() {
		System.out.println("1. Insertar un jugador en el equipo."
				+ "\n2. Eliminar un jugador del equipo."
				+ "\n3. Cambiar el nombre y la altura de un jugador dado su código."
				+ "\n4. Listar por orden alfabético de los nombres de los jugadores."
				+ "\n5. Listar por la altura de los jugadores de mayor a menor."
				+ "\n6. Salir.");

		try {
			System.out.print("Elección: ");
			eleccion = sc.nextInt();
		} catch (InputMismatchException | ArithmeticException ex) {
			eleccion = 0; //Para que vuelva a como antes
			System.out.println("Introduzca un número válido (número entero entre el 1 y el 6).");
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			sc.nextLine(); //Para pasar a siguiente línea
		}
	}

	private static void pedirNombreYAltura() {
		do {
			System.out.print("Introduzca el nombre del jugador: ");
			nombre = sc.nextLine(); //No hace falta try-catch porque no puede dar error
		} while (nombre.length() > 35); //Ajustamos la longitud para que no sea excesiva

		do {
			try {
				System.out.print("Introduzca la altura del jugador (en cm): ");
				altura = sc.nextInt();
			} catch (InputMismatchException | ArithmeticException ex) {
				System.out.println("Introduzca una altura válida.");
				altura = 0;
			} finally {
				sc.nextLine();
			}
		} while (altura < 20 || altura > 300); //Mientras no esté entre 20cm y 300cm
	}

	private static void pedirID() {
		do {
			try {
				System.out.print("Introduzca el ID del jugador (J-x): ");
				id = sc.nextLine(); //No hace falta try-catch porque no puede dar error
				codigo = new Jugador(id);
			} catch (NumberFormatException ex) {
				System.out.println("Introduzca un ID válido (J-x).");
			}
		} while (!(id.contains("J-"))); //Mientras que no sea válido el ID
	}

	private static void eliminarAjustandoID() {
		pedirID();

		if (lista.buscar(codigo) >= 0) {
			lista.eliminar(lista.buscar(codigo));

			Jugador.setContador(Jugador.getContador() - 1); //Para ajustar los IDs

			for (int i = 0; i < Jugador.getContador(); i++) {
				//Si el ID introducido es menor a cada ID de la tabla
				if (Integer.parseInt(id.substring(2)) < Integer.parseInt(lista.get(i).getId().substring(2))) {
					lista.get(i).setId("J-" + (Integer.parseInt(lista.get(i).getId().substring(2)) - 1)); //Restamos uno
				}
			}

			System.out.println("Jugador eliminado con éxito");
		} else {
			System.out.println("Jugador no encontrado.");
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
			Jugador.setContador(in.readInt());
			lista = (Lista) in.readObject(); //Hay que castear porque se recibe como mero objeto

			System.out.println("Datos cargados con éxito.");
		} catch (FileNotFoundException ex) {
			System.out.println("Nuevo registro.");
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		do {
			mostrarMenu(); //Mostramos el menú

			switch (eleccion) {
				case 1:
					pedirNombreYAltura(); //Pedimos el nombre y la altura

					lista.insertarFinal(new Jugador(nombre, altura));
					
					System.out.println("Jugador insertado con éxito.");

					break;
				case 2:
					//Eliminamos al jugador de una manera más elegante (ajustando las IDs de cada uno para que no haya vacíos entre una ID y otra
					eliminarAjustandoID();

					break;
				case 3:
					//Pedimos ID
					pedirID();

					if (lista.buscar(codigo) < 0) {
						System.out.println("Jugador no encontrado.");
					} else {
						//Pedimos nombre y altura
						pedirNombreYAltura();

						//Buscamos el jugador al que pertenece el ID, y también la posición que ocupa, y le asignamos los datos
						lista.get(lista.buscar(codigo)).setNombre(nombre);
						lista.get(lista.buscar(codigo)).setAltura(altura);

						System.out.println("Datos actualizados con éxito");
					}

					break;
				case 4:
					lista.ordenar(new CompararNombres()); //Ordenamos por nombre alfabéticamente
					System.out.println(lista); //Mostramos

					break;
				case 5:
					lista.ordenar(new CompararAltura().reversed()); //Ordenamos por altura de mayor a menor
					System.out.println(lista); //Mostramos

					break;
				case 6:
                try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
					out.writeInt(Jugador.getContador()); //Para luego sumarlo cada vez que se crea un jugador
					out.writeObject(lista);
				} catch (Exception ex) { //Engloba a cualquier excepción
					System.out.println(ex);
				}
				break;

			}

		} while (eleccion != 6);

	}

}