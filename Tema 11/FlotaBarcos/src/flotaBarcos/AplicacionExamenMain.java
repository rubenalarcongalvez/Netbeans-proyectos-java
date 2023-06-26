package flotaBarcos;

import java.io.*;
import java.util.Scanner;

public class AplicacionExamenMain {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String menu = "MENU PRINCIPAL DE OPCIONES\n\n"
				+ "1. Insertar un Barco\n"
				+ "2. Eliminar un Barco\n"
				+ "3. Muestra el numero de Barcos\n"
				+ "4. Mostrar todos los barcos de la flota por orden de insercion\n"
				+ "5. Guardar la flota en archivo\n"
				+ "6. Salir del programa\n"
				+ "Inserte la Opcion deseada";

		String miniMenu = "**** MINI MENU ****\n"
				+ "1. ¿Acorazado?\n"
				+ "2. ¿Submarino?\n"
				+ "\nEscoja una opcion";

		AplicacionExamenMain uso = new AplicacionExamenMain();  // variable para uso de la Clase Main
		int opcion = 0;
		int opcion2 = 0;
		Flota f1 = new Flota();

		//  verifica que no hay ningun fichero a abrir  y si no lo hay crea una nueva flota.
		try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("flota.dat"))) {
			f1 = (Flota) in.readObject();
			System.out.println("Se han cargado los datos guardados previamente");
		} catch (ClassNotFoundException | IOException ex) {
			System.out.println("No se ha encontrado ninguna flota previa");
			System.out.println("Cree una nueva flota mediante el siguiente MENU");
		}

		do {
			System.out.println(menu);
			opcion = in.nextInt();

			switch (opcion) {

				case 1: {   // inserta un barco

					do {
						System.out.println(miniMenu);
						opcion2 = in.nextInt();

						switch (opcion2) {
							case 1: {
								System.out.println("introduce la longitud del Acorazado ");
								int longi = in.nextInt();
								System.out.println("Introduce el numero de caniones");
								int can = in.nextInt();
								Acorazado A = new Acorazado(longi, can);
								f1.insertarBarco(A);
								break;
							}
							case 2: {
								System.out.println("introduce la longitud del Submarino ");
								int longi = in.nextInt();
								System.out.println("Introduce la longitud del periscopio");
								int per = in.nextInt();
								Submarino S = new Submarino(longi, per);
								f1.insertarBarco(S);
								break;
							}
							default:
								System.out.println("Opcion incorrecta, repita");

						}
					} while (opcion2 != 1 && opcion2 != 2);
					break;
				}

				case 2: {   // Elimina un barco 

					do {
						System.out.println(miniMenu);
						opcion2 = in.nextInt();

						switch (opcion2) {
							case 1: {
								System.out.println("introduce la longitud del Acorazado ");
								int longi = in.nextInt();
								Acorazado A = new Acorazado(longi, 0);   // hay que pasar dos parametros ya que el barco son dos atributos
								f1.eliminarBarco(A);
								break;
							}
							case 2: {
								System.out.println("introduce la longitud del Submarino ");
								int longi = in.nextInt();
								Submarino S = new Submarino(longi, 0);   // hay que pasar dos parametros ya que el barco son dos atributos
								f1.eliminarBarco(S);
								break;
							}
							default:
								System.out.println("Opcion incorrecta, repita");

						}
					} while (opcion2 != 1 && opcion2 != 2);
					break;
				}
				case 3: {   // Muestra numero de barcos                      

					System.out.println("El numero de barcos creados es: " + f1.numElementos());
					break;
				}
				case 4: { // Mostrar todos los barcos de la flota por orden de insercion

					System.out.println(f1.toString());

					break;

				}
				case 5: { // Guardar la flota en archivo\n"

					try ( ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("flota.dat"))) {

						flujoSalida.writeObject(f1); //AQUÍ FALLASTE también -> Un objeto puede ser una flota, no su array porque luego cuando quieras importarlo tiene que ser un objeto flota y no un array de objetos
					} catch (IOException ex) {
						System.out.println(ex.getMessage());
					}

					break;
				}
				case 6: { // Salir del programa\n"
					System.out.println("Ha salido del programa,  vuelva pronto");
					break;
				}
				default: {
					System.out.println("Opcion incorrecta, repita Introducir opcion");
				}
			}
		} while (opcion != 6);

	}

}
