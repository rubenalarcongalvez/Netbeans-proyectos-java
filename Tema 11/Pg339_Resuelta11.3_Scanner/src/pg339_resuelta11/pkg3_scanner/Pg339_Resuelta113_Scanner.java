/*
Pedir un entero n por consola y, a continuación, pedir n números de tipo double,
que ire	mosinsertando en una tabla. Guardar la tabla en un archivo binario.
*/

package pg339_resuelta11.pkg3_scanner;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg339_Resuelta113_Scanner {

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
			System.out.print("Número de elementos: ");
			int n = new Scanner(System.in).nextInt(); //cantidad de valores a leer
			double tabla[] = new double[n]; //tabla con el tamaño adecuado
			
			for (int i = 0; i < tabla.length; i++) {
				System.out.print("Introduzca un número real: ");
				tabla[i] = new Scanner(System.in).useLocale(Locale.US).nextDouble();
			}
			out.writeObject(tabla); //las tablas son objetos
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
    }
}