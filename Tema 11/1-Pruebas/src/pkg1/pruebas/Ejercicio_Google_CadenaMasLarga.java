/*
Tamaño del substring más largo:
Ej: de "aaabcccsfekl" -> csfekl

Puesto que abc es la cadena más larga que no contiene letras repetidas
 */
package pkg1.pruebas;

import java.util.Scanner;

/**
 * @author n3buresp1997
 */
public class Ejercicio_Google_CadenaMasLarga {

	static void substringMasLargo(String cadena) {	//Coge la primera coincidencia
		int inicio = 0;
		int fin = 1;
		String subCadena = "";
		String subCadenaMayor = cadena.substring(inicio, fin);

		while (fin < cadena.length()) {	//Puesto que el fin realmente es fin + 1
			if (!(cadena.substring(inicio, fin).equals(cadena.substring(fin, fin + 1)))) {	//Si NO se repiten letras (tiene que ser exacta la coincidencia, NO IgnoreCase)
				subCadena += cadena.substring(inicio, fin);	//vamos concatenando
			} else {	//Si se repiten letras
				subCadena += cadena.substring(inicio, fin);	//concatenamos la última

				if (subCadena.length() > subCadenaMayor.length()) {	//sustituimos si es mayor nuestra cadena actual que la que teníamos
					subCadenaMayor = subCadena;
				}

				subCadena = "";	//reseteamos nuestra cadena actual
			}
			inicio = fin;
			fin = inicio + 1;
		}

		subCadena += cadena.substring(inicio, fin);	//concatenamos la última
		
		if (subCadena.length() > subCadenaMayor.length()) {	//Por si se ha quedado la última cadena sin comparar
			subCadenaMayor = subCadena;
		}

		System.out.println(subCadenaMayor);	//Imprimimos el resultado ya que es void y no String, por lo que no tenemos que retornar nada
	}

	static boolean esTodoLetras(String cadena) {
		//Método para comprobar que son todo letras
		char caracter;
		int valorASCII;
		boolean resultado = true;

		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.toUpperCase().charAt(i); //Lo ponemos todo en mayúsculas para no repetir el proceso 2 veces
			valorASCII = (int) caracter;
			if (valorASCII != (int) 'Ñ' && (valorASCII < 65 || valorASCII > 90)) {	//Rangos de la tabla ASCII para letras (Ñ incluida)
				resultado = false; //Se ha encontrado un caracter que no es letra
			}
		}

		return resultado;
	}

	public static void main(String[] args) {
		//Como el enunciado especifica que tiene que ser una cadena de LETRAS, solo admito letras, no números ni caracteres
		//También interpreté que se admiten espacios, y no es solo una palabra, si no, sería con next()

		Scanner sc = new Scanner(System.in, "ISO_8859_1"); //Ponemos el Scanner para que admita caracteres con acentos (alfabeto latino)
		String cadena = "";

		do {
			System.out.print("Por favor, introduzca una cadena de letras: ");
			cadena = sc.nextLine();
		} while (!(esTodoLetras(cadena))); //Mientras no sea todo letras

		substringMasLargo(cadena);
	}
}