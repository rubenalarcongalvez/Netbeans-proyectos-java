/*
Implementa la función leeCadena(), con el siguiente prototipo:	
List<Character> lee Cadena()
que lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada	
elemento.
*/

package pg410_aplicacion_12.pkg27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg410_Aplicacion_1227 {

	public static List<Character> leeCadena() {
		System.out.print("Introduzca una frase: ");
		String cadena = new Scanner(System.in, "ISO_8859_1").nextLine();
		
		char[] tabla = cadena.toCharArray();
		
		ArrayList<Character> lista = new ArrayList<>();
		
		for (int i = 0; i < tabla.length; i++) {
			lista.add(tabla[i]);
		}
		
		return lista;
	}
	
    public static void main(String[] args) {
        ArrayList lista = (ArrayList) leeCadena();
		System.out.println("Aquí está la lista carácter a carácter: " + lista.toString());
    }
}