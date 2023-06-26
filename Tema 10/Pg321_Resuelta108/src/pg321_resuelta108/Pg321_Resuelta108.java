/*
Escribir un programa que duplique el contenido de un fichero cuyo nombre se pide al 
usuario. El fichero copia tendrá el mismo nombre con el prefijo "copia_de_".
*/

package pg321_resuelta108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg321_Resuelta108 {

    public static void main(String[] args) throws IOException {
        System.out.print("Nombre del fichero: ");
		String fichOriginal = new Scanner(System.in).nextLine();
		String fichCopia = "copia_de_" + fichOriginal;
		//Abrimos los ficheros para la lectura y escritura en la misma sentencia del bloque try-catch-resources:
		try (BufferedReader in = new BufferedReader(new FileReader (fichOriginal));
				BufferedWriter out = new BufferedWriter(new FileWriter(fichCopia))) {
				int c = in.read(); //leemos del original
				while (c != -1) { //mientras que no lleguemos al final del fichero
					out.write(c); //escribimos en el fichero copia
					c = in.read(); //volvemos a leer
				}
				} catch (IOException ex) {
						System.out.println(ex.getMessage());
						}
    }
}