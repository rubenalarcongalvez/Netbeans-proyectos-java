/* Resuelta 12.11
Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que deberá 
incluir el método equals (), la interfaz Comparable basada en el dni y el método
antiguedad().
Implementar un programa que gestione los socios de un club guardando los datos en el
fichero socios.dat. Al arrancar la aplicación, se leen los datos del fichero y se abre
un menú con las opciones: 1. Alta; 2. Baja; 3. Modificación; 4. Listado por	DNI;
5. Listado por antigüedad, y 6. Salir.	

Salir de la aplicación se guardan en el fichero los datos actualizados.	
 */

 /* 12.6
Implementa una aplicación que gestione los socios de un club usando la clase Socio	
implementada en la Actividad resuelta 12.11. En particular, se deberán ofrecer las
opciones de alta, baja y modificación de los datos de un socio. Además, se listarán
los socios por nombre o por antigüedad en el club.
 */
package pg408_aplicacion_12.pkg6_socios;

import clases.Socio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg408_Aplicacion_126_Socios {

	//Ya estaba hecha en el libro, solo la puse más funcional
	public static boolean alta(Set<Socio> socios, String dni) {
		String nombre = EntradaTeclado.pedirPalabraLimpiandoBuffer("Nombre: ");

		LocalDate alta = null;
		String fechaAlta = "";

		do {
			try {
				fechaAlta = EntradaTeclado.pedirPalabraLimpiandoBuffer("Fecha de alta: ");
				DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				alta = LocalDate.parse(fechaAlta, f);
			} catch (Exception ex) {
				fechaAlta = "";
				System.out.print("Introduzca una fecha válida (dd/MM/yyyy): ");
			}
		} while (fechaAlta.equals(""));

		Socio nuevo = new Socio(dni, nombre, alta);

		return socios.add(nuevo);
	}

	public static void menuSocios(Set<Socio> socios) {
		int opcion;

		do {
			System.out.println("0.Listado por DNI");
			System.out.println("1.Alta");
			System.out.println("2.Baja");
			System.out.println("3.Modificación");
			System.out.println("4.Listado por nombre");
			System.out.println("5.Listado por antigüedad");
			System.out.println("6.Salir");
			System.out.print("\nIntroducir opción: ");
			opcion = EntradaTeclado.pedirEntero("");

			switch (opcion) {
				case 0 -> {
					System.out.println(socios);
				}
				case 1 -> {
					String dni = EntradaTeclado.pedirPalabraLimpiandoBuffer("DNI: ");

					alta(socios, dni);
				}
				case 2 -> {
					String dni = EntradaTeclado.pedirPalabraLimpiandoBuffer("DNI socio: ");

					socios.remove(new Socio(dni));
				}
				case 3 -> {
					String dni = EntradaTeclado.pedirPalabraLimpiandoBuffer("DNI: ");
					
					socios.remove(new Socio(dni));
					alta(socios, dni);
				}
				case 4 -> {
					Set<Socio> s = new TreeSet<>((Socio o1, Socio o2) -> o1.getNombre().compareTo(o2.getNombre()));
					s.addAll(socios);
					System.out.println(s);
				}
				case 5 -> {
					Set<Socio> s = new TreeSet<>((Socio o1, Socio o2) -> o2.antiguedad() - o1.antiguedad());
					s.addAll(socios);
					System.out.println(s);
				}
			}

		} while (opcion != 6);
	}

	public static void main(String[] args) {
		/*
		Como los socios no pueden repetirse, usamos un conjunto para guardarlos.
		Además, con un TreeSet se mantendrán ordenados por DNI, que es su clave
		única de identificación
		 */
		Set<Socio> club = new TreeSet<>();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
			club = (TreeSet<Socio>) in.readObject();
		} catch (IOException ex) {
			System.out.println("Lista de socios vacía");
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}

		menuSocios(club);

		try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
			out.writeObject(club);
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}
}