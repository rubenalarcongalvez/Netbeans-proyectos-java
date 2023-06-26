/*
Realiza el juego del ahorcado. Las reglas del juego son:	
a) El jugador A teclea una palabra, sin que el jugador B la vea.

b) Ahora se le muestra tantos guiones como letras tenga la palabra secreta. Por ejem-	
plo, para "hola" será "_ _ _ _".

c) El jugador B intentará acertar, letra a letra, la palabra secreta.	

d) Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán ocultas	
como guiones. Siguiendo con el ejemplo anterior, y suponiendo que se ha introduci-	
do: la 'o', la 'j' y la 'a', se mostrará: "_o_a".	

e) El jugador B solo tiene 7 intentos.	

f) La partida terminará al acertar todas las letras que forman la palabra secreta
(gana el jugador B) o cuando se agoten todos los intentos (gana el jugador A).	
 */
package pg195_actividadesaplicacion_6_12;

import java.util.Scanner;

/**
 *
 * @author Daniel Reguera Bazan
 */
public class Pg195_ActividadesAplicacion_6_12_Daniel_Reguera {

	//devuelve una cadena devuelve una segunda cadena del tamaño de la primera compuesta por simbolos
	public static String ocultar(String original) {
		String encriptado = "";

		for (char letra : original.toCharArray()) {
			encriptado += "_";
		}

		return encriptado;
	}

	//comprueba si la cadena contiene el caracter
	public static boolean contiene(String cadena, char caracter) {
		boolean contiene = false;

		for (char letra : cadena.toCharArray()) {
			if (letra == caracter) {
				return contiene = true;
			}
		}

		return contiene;
	}

	//comprueba si la cadena es de solo numeros
	public static boolean combrobarSoloLetras(String cadena) {
		boolean soloLetras = true;

		for (char letra : cadena.toCharArray()) {
			if (Character.isLetter(letra)) {
			} else {
				return soloLetras = false;
			}
		}
		return soloLetras;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String palabraSecreta = "", palabraEnJuego = "", fallos = "Fallos: ", auxiliar = "";
		char letra;
		int intentos = 7;

		//pide en bucle una palabra compuesta solo por letras
		do {
			System.out.println("Jugador 1, introduzca una palabra:");
			palabraSecreta = (teclado.next()).toUpperCase();
		} while (!combrobarSoloLetras(palabraSecreta));

		//crea cadena del mismo tamaño para in mostrando aciertos 
		palabraEnJuego = ocultar(palabraSecreta);

		//bucle hasta que se terminen los intentos o hasta que la palabra descubierta sea igual a la original
		do {

			//bucle que recoge el primer caracter si es una letra
			do {
				System.out.println("\n" + palabraEnJuego);
				System.out.println(fallos);
				System.out.println("Jugador 2, te quedan " + intentos + ". Introduzca una letra.");
				letra = teclado.next().toUpperCase().charAt(0);

			} while (!Character.isLetter(letra));

			if (contiene(palabraSecreta, letra)) {

				//revela la letra introducida en los espacios correctos
				for (int indice = 0; indice < palabraSecreta.length(); indice++) {

					if (palabraSecreta.charAt(indice) == letra) {
						auxiliar += letra;
					} else {
						auxiliar += palabraEnJuego.charAt(indice);
					}
				}
				palabraEnJuego = auxiliar;
				auxiliar = "";

				//si falla resta un intento y guarda la letra no contenida para mostrarla  
			} else {
				intentos--;
				fallos += letra + " ";
			}

		} while ((intentos > 0) && (!palabraSecreta.equals(palabraEnJuego)));

		//mensaje de resultado, muestra fallos si se pierde y en ambos casos la palabra oculta
		if (palabraSecreta.equals(palabraEnJuego)) {
			System.out.println("\n¡Enhorabuena, ha adivinado la palabra!");
		} else {
			System.out.println("\nLo sentimos, no ha adivinado la palabra :(");
			System.out.println(fallos);
		}
		System.out.println("\t\t" + palabraSecreta);
	}

}