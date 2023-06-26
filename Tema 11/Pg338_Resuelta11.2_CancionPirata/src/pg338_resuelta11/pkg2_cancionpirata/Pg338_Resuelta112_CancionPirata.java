/*
Escribe como una cadena, en el fichero binario cancionPirata.dat, la siguiente estrofa:	
Con diez cañones por banda,	
viento en popa a toda vela,	
no corta el mar, sino vuela	
un velero, bergantín.

Luego, escribe el array directamente como objeto
 */
package pg338_resuelta11.pkg2_cancionpirata;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg338_Resuelta112_CancionPirata {

	public static void main(String[] args) {
/*
Como no se trata de un archivo de texto, convertimos la estrofa en una cadena,
incluyendo los cambios de línea, y luego 1a escribimos en el flujo como un objeto
String
*/

		String estrofa = "Con diez cañones por banda,	\n"
				+ "viento en popa a toda vela,	\n"
				+ "no corta el mar, sino vuela	\n"
				+ "un velero, bergantín.";
		
		int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cancionPirata.dat"))) {
			out.writeObject(estrofa);
			out.writeObject(t);
			
			System.out.println("Archivo escrito con éxito");
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}

/*
La estrofa se guardará con la codificacidn especifíca de los objetos de la clase	
String y no podremos leerla directamente del archivo con un editor de texto. Si	
queremos guardar texto legible con un editor de texto, deberemos usar archivos de	
texto
*/