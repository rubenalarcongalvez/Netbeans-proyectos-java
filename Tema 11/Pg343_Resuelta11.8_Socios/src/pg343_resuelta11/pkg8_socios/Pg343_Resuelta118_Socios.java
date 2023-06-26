/*
Implementar un programa que guarde en el fichero socios.dat una tabla de objetos Socio.	
Después se abrirá de nuevo el fichero en modo lectura para recuperar la tabla de socios,	
mostrándose por pantalla.
*/

package pg343_resuelta11.pkg8_socios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg343_Resuelta118_Socios {

    public static void main(String[] args) {
        Socio[] tablaSocios = new Socio[4];
		tablaSocios[0] = new Socio("1", "pepe");
		tablaSocios[1] = new Socio("11", "ana");
		tablaSocios[2] = new Socio("7", "pepa");
		tablaSocios[3] = new Socio("23", "cris");
		
		//mostramos la tabla socios antes de guardarla
		System.out.println(Arrays.deepToString(tablaSocios));
		
		//Creamos un flujo de salida binario y escribimos en él
		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
			salida.writeObject(tablaSocios);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		
		/* Creamos un flujo de entrada y leemos de él la tabla de socios, que asignaremos
		a la misma variable tablaSocios. El bloque catch recoge tanto la excepción
		IOException de la apertura del flujo como ClassNotFoundException ligado al cast
		(Socio[]) */
		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("socios.dat"))) {
			tablaSocios = (Socio[]) entrada.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
		
		//Volvemos a mostrar la tabla de socios:
		System.out.println(Arrays.deepToString(tablaSocios));
    }
}