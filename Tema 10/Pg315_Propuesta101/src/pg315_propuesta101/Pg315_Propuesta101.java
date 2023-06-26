/*
Crea un fichero de texto con un editor e implementa un programa que lo abra y lo lea, mos	
trando su contenido por pantalla.
Nota: No olvides escribir la ruta de acceso al fichero completa si este no se encuentra en	
la carpeta del proyecto actual.
*/

package pg315_propuesta101;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg315_Propuesta101 {

    public static void main(String[] args) throws IOException {
        //Creamos el recipiente para verter el texto
		String texto = "";
		FileReader in = null; //Lo declaramos fuera de trycatch para que sea accesible fuera
		//Si vamos a utilizar BufferedReader lo sustituimos por FileReader
		
		try {
			in = new FileReader("Pg315_Propuesta101.txt"); //Creamos uno y le asignamos la ruta
			int c = in.read();
			while (c != -1) { //mientras no lleguemos al final del archivo
				texto = texto + (char) c; //convertimos c a char
				c = in.read(); //Lee el siguiente carácter
			} /* Con BufferedReader y readLine(), sería más rápido y con String en vez de int o char (leería línea a línea)
					EL SALTO DE LÍNEA HAY QUE INSERTARLO MANUALMENTE */ 
//			try {
//			in = new BufferedReader(new FileReader("C:\\Google Drive (Rubén)\\Estudios\\Estudiar programación\\1º DAW\\Programación\\Tareas\\Pg315_Propuesta101.txt")); //Creamos uno y le asignamos la ruta
//			String c = in.readLine();
//			while (c != null) { //mientras no lleguemos al final del archivo
//				texto += c + "\n"; //Tenamos que poner manualmente los saltos de línea después de cada una.
//				c = in.readLine(); //Lee la siguiente línea
//			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally { //cerramos el flujo pase lo que pase
			if (in != null) { //si el flujo está abierto
				try {
					in.close(); //cerramos el flujo
				} catch(IOException ex) {
					System.out.println(ex); //si hay algún error
				}
			}
		}
		System.out.println(texto); //mostramos el texto leído
    }
}