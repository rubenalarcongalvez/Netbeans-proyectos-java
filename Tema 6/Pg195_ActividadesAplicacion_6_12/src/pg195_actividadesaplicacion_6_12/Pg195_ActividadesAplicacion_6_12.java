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
 * @author Ruben Alarcon Galvez rubenalarcongalvez@gmail.com
 */
public class Pg195_ActividadesAplicacion_6_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ahorcado");

		System.out.print("Por favor, jugador A, introduzca la palabra: ");
		String palabra = sc.next().toUpperCase();
		
		//Para que el jugador B no vea la palabra (quitarlo si no interesa puesto que igualmente no lo vería en una ejecución normal)
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		System.out.println("Jugador B, tendrás que averiguar la palabra:");
		String oculto = "";

		for (int contador = 0; contador < palabra.length(); contador++) {
			oculto += "_";
		}

		char adivinar[] = oculto.toCharArray();
		System.out.print("Palabra:");
		for (int contador = 0; contador < adivinar.length; contador++) {
			System.out.print(" " + adivinar[contador]);
		}
		System.out.println();

		//Declaramos las variables necesarias
		int indice = 0; //Para saber qué celdas sustituir
		char letra;
		int intentos = 7;
		String fallos = "";

		do {
			System.out.print("Dime una letra: ");
			letra = sc.next().toUpperCase().charAt(0);

			if (palabra.indexOf(letra, indice) != -1) {

				while (palabra.indexOf(letra, indice) != -1) {
					adivinar[palabra.indexOf(letra, indice)] = letra;
					indice = palabra.indexOf(letra, indice) + 1;
				}
				indice = 0;
				System.out.println("\n¡Acertaste!\n");

			} else {
				System.out.println("\n¡Fallaste!\n");
				fallos += " " + String.valueOf(letra);
				intentos--;
			}

			System.out.print("Letras falladas:");
			System.out.print(fallos);
			System.out.println("\tIntentos restantes: " + intentos);

			System.out.print("Palabra:");
			for (int contador = 0; contador < adivinar.length; contador++) {
				System.out.print(" " + adivinar[contador]);
			}
			System.out.println();

			oculto = String.valueOf(adivinar);

			if (intentos == 0) {
				System.out.println("Lo siento, has perdido, ya no te quedan intentos. Suerte la próxima vez.");
			}
			if (oculto.equals(palabra)) {
				System.out.println("¡FELICIDADES! Has ganado el juego y has salvado a esa pobre persona de ser ahorcada.");
			}

		} while (intentos != 0 && !oculto.equals(palabra));
	}
}