/*
Como ejemplo, vamos a guardar en un fichero el texto,	
"En un lugar de La Mancha,	
de cuyo nombre no quiero acordarme"	
La primera línea, carácter a carácter, y la segunda, en una sola sentencia.	
*/

package pg319_resuelta107;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg319_Resuelta107 {

    public static void main(String[] args) throws IOException {
        BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter("quijote.txt"));
			String cad = "En un lugar de La Mancha,"; //primera línea
			for (int i = 0; i < cad.length(); i++) {
				out.write(cad.charAt(i)); //escribimos carácter a carácter
			}
			cad = "de cuyo nombre no quiero acordarme."; //segunda línea
			out.newLine(); //cambio de línea en el archivo
			out.write(cad); //escribimos con una única sentencia
			
			System.out.println("El archivo se modificó con éxito (si no había, se creó)");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (out != null) {
				try {
					out.close(); //hacemos que se vacíe el búfer y se escriba en el archivo
				} catch (IOException ex) {
					System.out.println(ex);
				}
			}
		}
    }
}