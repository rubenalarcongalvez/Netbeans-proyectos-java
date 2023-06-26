/*
Implementar un programa que registra la evolución temporal de la temperatura en una ciu-	
dad. La aplicación mostrará un menú que permite añadir nuevos registros de temperatura	
y mostrar el listado de todos los registros históricos. Cada registro constará de la tempe-
ratura en grados centigrados, introducida por teclado, y la fecha y hora, que se leerá del	
sistema en el momento de la creación del registro.
 */
package pg344_resuelta11.pkg9_temperatura;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg344_Resuelta119_Temperatura {

	public static void main(String[] args) {
		//En el programa principal, empezaremos creando la tabla de registros vacía
		Registro[] reg = new Registro[0];

		/* La primera vez que se ejecute el programa, el archivo no existe y se trabaja
		con la tabla vacía para insertar el primer registro. Si había registros previos,
		ya existirá el fichero y se lee de él la tabla de registros, sustituyendo la
		tabla vacía */
		try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("temperaturas.dat"))) {
			reg = (Registro[]) in.readObject();
		} catch (FileNotFoundException ex) {
			System.out.println("Registro vacío");
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}

		int opcion;
		boolean incorrecto; //para controlar la excepción de que no pone el formato correcto
		double temperatura = 0; //para que admita fuera del try-catch

		do {
			System.out.println("1. Nuevo registro");
			System.out.println("2. Mostrar historial de registros");
			System.out.println("3. Salir");
			System.out.print("Introducir opción: ");
			opcion = new Scanner(System.in).nextInt();

			switch (opcion) {
				case 1 -> {
					do {
						try {
							System.out.print("Introducir temperatura: ");
							temperatura = new Scanner(System.in).useLocale(Locale.US).nextDouble();
							
							incorrecto = false;
						} catch (InputMismatchException ex) {
							System.out.println("Formato incorrecto. Ponga una temperatura válida");
							
							incorrecto = true;
						}
					} while (incorrecto == true);

					Registro nuevo = new Registro(temperatura);

					reg = Arrays.copyOf(reg, reg.length + 1);
					reg[reg.length - 1] = nuevo;
				}
				case 2 ->
					System.out.println(Arrays.deepToString(reg));
			}
		} while (opcion != 3);

		//Al salir, guardamos la tabla de registros actualizada
		try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("temperaturas.dat"))) {
			out.writeObject(reg);
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}