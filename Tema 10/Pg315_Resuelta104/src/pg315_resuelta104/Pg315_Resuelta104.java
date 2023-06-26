/*
Crear con un editor el fichero de texto NumerosReales.txt en la carpeta del proyecto de Net	
Beans actual y escribir en él una serie de números reales separados por espacios simples.	
Implementar un programa que acceda a NumerosReales.txt, lea los números y calcule la	
suma y la media aritmética, mostrando los resultados por pantalla.
*/

package pg315_resuelta104;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg315_Resuelta104 {

    public static void main(String[] args) throws IOException {
        //Todos los números están en una única línea
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("NumerosReales.txt"));
			String texto = in.readLine(); //leemos la cadena con los números
			String[] subcadenas = texto.split(" "); //separamos las subcadenas con el separador de espacio
			double suma = 0;
			for (int i = 0; i < subcadenas.length; i++) {
				suma += Double.valueOf(subcadenas[i]); //las convertimos y acumulamos
			}
			System.out.println("Suma: " + suma + "\tMedia: " + suma / subcadenas.length);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
    }
}