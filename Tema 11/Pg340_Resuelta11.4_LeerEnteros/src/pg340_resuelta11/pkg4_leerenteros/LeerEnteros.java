/*
Enunciado
 */
package pg340_resuelta11.pkg4_leerenteros;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class LeerEnteros {

	public static void main(String[] args) {
		//Leer de un archivo datos.dat 11 números enteros, guardándolos en una tabla de tipo int.
		//usaremos una estructura try-catch con recursos
		try ( ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("datos.dat"))) {
			int[] t = new int[11];

			for (int i = 0; i < 11; i++) { //Ya que solo cogemos los 11 primeros números porque nos lo pide, no todos
				try {
					t[i] = flujoEntrada.readInt();
				} catch (EOFException ex) {
					System.out.println("Hay menos de 11 números"); //Si tenemos menos números en datos.dat
				}
			}

			System.out.println(Arrays.toString(t));
		} catch (IOException ex) {
			System.out.println("error de lectura"); //Por ejemplo si sigue leyendo más allá del límite
		}
	}
}
