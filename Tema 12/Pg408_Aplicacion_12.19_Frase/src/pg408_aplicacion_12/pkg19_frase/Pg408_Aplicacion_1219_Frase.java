/*
Escribe un programa donde se introduzca por consola una frase que conste 
exclusivamente de palabras separadas por espacios. Las palabras de la frase se almacenarán	
en una lista. Finalmente, se mostrarán por pantalla las palabras que estén repetidas y, a
continuación, las que no lo estén.	
 */
package pg408_aplicacion_12.pkg19_frase;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg408_Aplicacion_1219_Frase {
	
	public static void main(String[] args) {
		String frase = EntradaTeclado.pedirCadena("Introduzca una frase: ");

		//Creamos las listas de repetidas y no repetidas
		ArrayList<String> repetidas = new ArrayList<>();
		ArrayList<String> noRepetidas = new ArrayList<>();

		//Si la lista auxiliar se repite, lo mandamos a nuestra lista de repetidos
		//pero nos aseguramos de que no se repita en nuestra lista de repetidos
		for (String palabra : Arrays.asList(frase.trim().split(" "))) { //Pasamos la cadena a array y luego a lista
			if (!repetidas.contains(palabra)) {
				if (!noRepetidas.contains(palabra)) {
					noRepetidas.add(palabra);
				} else {
					noRepetidas.remove(palabra);
					repetidas.add(palabra);
				}
			}
		}

		System.out.println("Lista de palabras repetidas: " + repetidas.toString());
		System.out.println("Lista de palabras no repetidas: " + noRepetidas.toString());
	}
}