/*
Implementa una aplicación que gestione los empleados de un banco. Para ello se defini-	
rá la clase Empleado con los atributos dni, nombre y sueldo. 

Los empleados se guardarán en un objeto de la clase Lista para objetos de la clase Object. La aplicación cargará
en la memoria, al arrancar, la lista de empleados desde el archivo binario empleados.dat	
y mostrará un menú con las siguientes opciones: 
1. Alta empleado; 2. Baja empleado;	3. Mostrar datos empleado; 4. Listar empleados, y 5. Salir.
Al pulsar 5, se grabará en el disco la lista actualizada y terminará el programa.
 */
package pg349_finales11.pkg22_empleado;

import clases.*;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg349_Finales1122_Empleado {

	public static void main(String[] args) throws ClassNotFoundException {
		Lista listaEmpleados = new Lista();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("listaEmpleados.dat"))) {
			listaEmpleados = (Lista) in.readObject();
		} catch (EOFException ex) {
			System.out.println("No hay nada más que importar");
		} catch (ClassNotFoundException | IOException ex) {
			System.out.println(ex);
		}

		Scanner sc = new Scanner(System.in, "ISO_8859_1"); //alfabeto latino
		int eleccion = -1;
		String confirmar = "n";
		String dni = "";
		String nombre = "";
		int sueldo = -1;

		String display = "1. Alta empleado"
				+ "\n2. Baja empleado"
				+ "\n3. Mostrar datos empleado"
				+ "\n4. Listar empleados"
				+ "\n5. Salir y guardar"
				+ "\n¿Qué desea hacer? (elija un número del 1 al 5): ";

		System.out.print(display);

		display = "\n" + display;
		do {
			try {
				eleccion = sc.nextInt();
			} catch (InputMismatchException ex) {
				eleccion = -1;
			} catch (Exception ex) {
				System.out.println(ex);
			} finally {
				sc.nextLine(); //Porque nextInt no consume salto de línea
			}

			switch (eleccion) {
				case 1 -> {
					System.out.print("Introduzca el DNI del empleado: ");
					dni = sc.next();
					sc.nextLine();
					System.out.print("Introduzca el nombre del empleado: ");
					nombre = sc.nextLine();

					do {
						try {
							System.out.print("Introduzca el sueldo del empleado: ");
							sueldo = sc.nextInt();
						} catch (InputMismatchException ex) {
							sueldo = -1;
						} catch (Exception ex) {
							System.out.println(ex);
						} finally {
							sc.nextLine();
						}
					} while (sueldo < 0);

					listaEmpleados.altaEmpleado(dni, nombre, sueldo);
					System.out.println("Empleado dado de alta con éxito");

					System.out.print(display);
				}
				case 2 -> {
					System.out.println("Inserte el DNI y/o el nombre del empleado (si no se sabe alguno, lo puede dejar en blanco): ");
					System.out.print("DNI: ");
					dni = sc.nextLine();
					System.out.print("Nombre: ");
					nombre = sc.nextLine();

					System.out.print("¿Está seguro que desea eliminar al empleado? [s/n]: ");
					confirmar = sc.nextLine();

					if (confirmar.isBlank() || confirmar.equalsIgnoreCase("s") || confirmar.equalsIgnoreCase("sí") || confirmar.equalsIgnoreCase("si")) {
						if (listaEmpleados.bajaEmpleado(dni, nombre)) {
							System.out.println("Empleado dado de baja con éxito");
						} else {
							System.out.println("No hay ningún empleado con esos datos");
						}
					} else {
						System.out.println("No se ha realizado la operación");
					}

					System.out.print(display);
				}
				case 3 -> {
					System.out.println("Inserte el DNI y/o el nombre del empleado (si no se sabe alguno, lo puede dejar en blanco): ");
					System.out.print("DNI: ");
					dni = sc.nextLine();
					System.out.print("Nombre: ");
					nombre = sc.nextLine();

					if (!listaEmpleados.mostrarDatos(dni, nombre)) {
						System.out.println("No hay ningún empleado con esos datos");
					}

					System.out.print(display);
				}
				case 4 -> {
					System.out.println(listaEmpleados);

					System.out.print(display);
				}
				case 5 -> {
					try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("listaEmpleados.dat"))) {
						out.writeObject(listaEmpleados);
					} catch (IOException ex) {
						System.out.println(ex);
					}
				}
				default -> {
					System.out.print("Por favor, introduzca un número entre el 1 y el 5: ");
				}
			}

		} while (eleccion != 5);
	}
}