/*
Leer una tabla de enteros de un archivo datos.dat
*/

package pg340_resuelta11.pkg5_leerenterosobjeto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg340_Resuelta115_LeerEnterosObjeto {

    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
			double[] tabla = (double[]) in.readObject(); //Hay que castearlo porque estamos leyendo un Objeto y debemos especificar
			System.out.println(Arrays.toString(tabla));
		} catch (IOException ex) {
			System.out.println("Error de entrada/salida");
		} catch (ClassNotFoundException ex) { //Si no encuentra la clase a la que queremos hacer referencia (en este caso un objeto tabla)
			System.out.println("El fichero no almacena un objeto tabla");
		}
    }
}