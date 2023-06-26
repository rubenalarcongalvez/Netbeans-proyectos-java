/*
Enunciado
*/

package pkg1.pruebas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class OtraMas {
	public static void main(String[] args) throws ClassNotFoundException {
		
		int [] a = new int[0];
		String b = "";
		
		try (ObjectInputStream out = new ObjectInputStream(new FileInputStream("test.dat"))) {
			a = (int[]) out.readObject();
			b = (String) out.readObject() + (String) out.readObject();
		} catch (IOException ex) {
			System.out.println("Entrada o salida - problem bro");
		}
		
		System.out.println(Arrays.toString(a) + b);
		
	}
	
}
