/*
Escribir en un archivo datos.dat los nombres de una tabla de diez enteros.
*/

package pg337_resuelta11.pkg1_arrayenteros;

import java.io.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg337_Resuelta111_ArrayEnteros {

    public static void main(String[] args) {
        /*
		Inicializamos la tabla con los enteros del 0 al 9. Luego creamos el archivo
		y le asociamos un flujo de salida de la clase ObjectOutputStream. A continuación,
		recorremos la tabla escribiendo los enteros en él.
		*/
		
		int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		ObjectOutputStream flujoSalida = null;
		
		try {
			flujoSalida = new ObjectOutputStream(new FileOutputStream("datos.dat"));
			for (int n : t) {
				flujoSalida.writeInt(n);
			}
			
			System.out.println("Datos escritos con éxito");
		} catch (IOException ex) {
			System.out.println(ex);
		} finally {
			if (flujoSalida != null) {
				try {
					flujoSalida.close();
				} catch (IOException ex) {
					System.out.println(ex);
				}
			}
		}
    }
}