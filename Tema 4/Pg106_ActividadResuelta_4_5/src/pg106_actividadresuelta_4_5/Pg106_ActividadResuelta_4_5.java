/*
Crear una funcion que, mediante un booleano, indique si el caracter que se pasa como
parametro de entrada corresponde con una vocal
 */
package pg106_actividadresuelta_4_5;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg106_ActividadResuelta_4_5 {

	static boolean esVocal (char letra) {
		boolean resultado;
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'||
			letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime una letra cualquiera y te digo si es vocal o no: ");
		char letra = sc.next().charAt(0);
		
		System.out.println(esVocal(letra));
	}
}