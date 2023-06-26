/*
Enunciado
 */
package pg342_ejemplopropio_whiletrue_eof;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class EjemploPropio_WhileTrue {

	public static void main(String[] args) {
		try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
			while (true) {
				System.out.print(in.readInt());
			}
		} catch (EOFException ex) {
			System.out.println("\nFin de fichero");
		} catch (IOException ex) {
			System.out.println();
		}
	}
}