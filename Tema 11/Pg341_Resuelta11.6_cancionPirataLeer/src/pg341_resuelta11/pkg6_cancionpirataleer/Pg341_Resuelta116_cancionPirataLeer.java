/*
Enunciado
*/

package pg341_resuelta11.pkg6_cancionpirataleer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg341_Resuelta116_cancionPirataLeer {

    public static void main(String[] args) {
        //Recuperar la estrofa del archivo cancionPirata.dat y mostrar por consola
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("cancionPirata.dat"))) {
			String cancion = (String) in.readObject(); //Especificamos que es un objeto de tipo String
			System.out.println(cancion);
		} catch (IOException | ClassNotFoundException ex) { //Podemos hacer un multicatch si vamos a poner lo mismo
			System.out.println(ex);
		}
    }
}