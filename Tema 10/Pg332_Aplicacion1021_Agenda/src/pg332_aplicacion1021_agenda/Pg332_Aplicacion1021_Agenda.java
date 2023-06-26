/*
Diseña una pequeña agenda, que muestre el siguiente menú:	
1. Nuevo contacto.	
2. Buscar por nombre.	
3. Mostrar todos.	
4. Salir.

En ella, guardaremos el nombre y el teléfono de un máximo de 20 personas.
La opción 1 nos permitirá introducir un nuevo contacto siempre y cuando la agenda no	
esté llena, comprobando que el nombre no se encuentra insertado ya.

La opción 2 muestra todos los teléfonos que coinciden con la cadena que se busca. Por	
ejemplo, si tecleamos "Pe", mostrará el teléfono de Pedro, de Pepe y de Petunia.

La opción 3 mostrará un listado con toda la información (nombres y teléfonos) ordena-	
dos alfabéticamente por el nombre.

Por último, la opción 4 guarda todos los datos de la agenda en el archivo agenda. txt.	
La próxima vez que se ejecute la aplicación, si hay datos guardados, se cargarán en me-	
moria.
 */
package pg332_aplicacion1021_agenda;

import clases.Agenda;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg332_Aplicacion1021_Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "ISO_8859_1"); //Alfabeto latino
		Agenda agenda = new Agenda();
		String nombre;
		String telefono;
		int eleccion = 0;

		//Para que se cargue todo lo que había antes en agenda.txt
		try (BufferedReader in = new BufferedReader(new FileReader("agenda.txt"))) {
			String texto = in.readLine();
			while (texto != null) {
				if (texto.contains("Nombre: ")) { //Para rellenar los campos e insertarlos
					nombre = texto.substring(8); //A partir de después del nombre, coge lo demás
					texto = in.readLine(); //Para saltar a la línea siguiente
					telefono = texto.substring(10); //A partir de después del teléfono, coge lo demás

					agenda.insertarContacto(nombre, telefono, false); //Ahora que los tenemos, los insertamos
				}
				texto = in.readLine(); //Para saltar a la línea siguiente
			}
			
			System.out.println("Contactos de su agenda previa cargados correctamente.");
		} catch (FileNotFoundException ex) {
			System.out.println("No tiene usted registros en la agenda.");
		} catch (Exception ex) {
			System.out.println(ex);
		}

		do {
			System.out.println("Agenda:"
					+ "\n1. Nuevo contacto."
					+ "\n2. Buscar por nombre."
					+ "\n3. Mostrar todos."
					+ "\n4. Salir.");
			System.out.print("Elección: ");

			try {
				eleccion = sc.nextInt();
			} catch (InputMismatchException ex) {
				eleccion = 0; //Para que no arroje error y salte el default del switch explicándolo
			} finally {
				sc.nextLine(); //Porque nextInt no consume salto de línea
			}

			switch (eleccion) {
				case 1 -> {
					try {
						System.out.print("Nombre del contacto: ");
						nombre = sc.nextLine();
						System.out.print("Teléfono del contacto: ");
						telefono = sc.next();

						agenda.insertarContacto(nombre, telefono, true); //Si no falla, insertamos
					} catch (Exception ex) {
						System.out.println(ex); //Si falla, lo decimos
					} finally {
						sc.nextLine(); //Para que salte a la siguiente línea
					}
				}
				case 2 -> {
					System.out.print("Nombre o parte del nombre: ");
					nombre = sc.nextLine();
					agenda.mostrarCoincidencias(nombre);
				}
				case 3 -> {
					System.out.println(agenda);
				}
				case 4 -> {
					try (BufferedWriter out = new BufferedWriter(new FileWriter("agenda.txt"))) { //Para que se cierre solo
						out.write(agenda.toString()); //Aprovechamos el código e imprimimos
						System.out.println("Sus contactos se han guardado correctamente.");
					} catch (IOException ex) {
						System.out.println(ex);
					} catch (Exception ex) {
						System.out.println(ex);
					}
				}
				default -> {
					System.out.println("Introduzca una opción correcta numérica (1-4)");
				}
			}

			System.out.println();
		} while (eleccion != 4);
	}
}