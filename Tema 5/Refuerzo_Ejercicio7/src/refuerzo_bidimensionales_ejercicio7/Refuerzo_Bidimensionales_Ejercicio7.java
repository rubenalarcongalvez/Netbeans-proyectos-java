/*
Hacer un buscaminas, en el que el usuario pueda decir qué nivel de dificultad quiere y 
qué tamaño del tablero quiere.
Tamaños:
1- Pequeño
2- Mediano
3- Grande

Niveles de dificultad:
1- Muy fácil
2- Fácil
3- Medio
4- Difícil
5- Muy difícil
6- Imposible

Mejora el juego "Buscaminas" de tal forma que si hay una mina a una casilla	
de distancia, el programa avise diciendo iCuidado! iHay una mina cerca!	
 */
package refuerzo_bidimensionales_ejercicio7;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Bidimensionales_Ejercicio7 {

	static String averiguarTamano(int tamano) {
		String definicionTamano = "";

		switch (tamano) {
			case 1 ->
				definicionTamano = "pequeño";
			case 2 ->
				definicionTamano = "mediano";
			case 3 ->
				definicionTamano = "grande";
		}
		return definicionTamano;
	}

	static String averiguarDificultad(int dificultad) {
		String definicionDificultad = "";

		switch (dificultad) {
			case 1 -> {
				definicionDificultad = "muy fácil";
			}
			case 2 -> {
				definicionDificultad = "fácil";
			}
			case 3 -> {
				definicionDificultad = "media";
			}
			case 4 -> {
				definicionDificultad = "difícil";
			}
			case 5 -> {
				definicionDificultad = "muy difícil";
			}
			default -> {
				definicionDificultad = "imposible";
			}
		}
		return definicionDificultad;
	}

	static int averiguarNumBombas(int tamano, int dificultad) {
		int numBombas = 0; //Definimos el número de bombas dependiendo de la dificultad

		switch (dificultad) {
			case 1 -> {
				numBombas = (int) ((tamano - 1) * 0.1428571428571429 * 3); //El porcentaje de bombas que queramos. Empezamos por 3 bombas
			}
			case 2 -> {
				numBombas = (int) ((tamano - 1) * 0.1428571428571429 * 3 * 2);
			}
			case 3 -> {
				numBombas = (int) ((tamano - 1) * 0.1428571428571429 * 3 * 3);
			}
			case 4 -> {
				numBombas = (int) ((tamano - 1) * 0.1428571428571429 * 3 * 5);
			}
			case 5 -> {
				numBombas = (int) ((tamano - 1) * 0.1428571428571429 * 3 * 6);
			}
			default -> {
				numBombas = (tamano - 1) * (tamano - 1) - 1; //Todas bombas menos el tesoro
			}
		}
		return numBombas;
	}

	static String[][] cargarTableroDescubierto(int tamano, int dificultad, int numBombas) {
		String[][] tablero = new String[tamano][tamano];

		String bomba = "***";
		String tesoro = "€€€";

		//Cargar tablero vacío
		for (int i = 0; i < tablero.length; i++) {
			if (i > 0) {
				for (int j = 0; j < tablero[i].length; j++) {
					if (j > 0) {
						tablero[i][j] = "-";
					} else {
						tablero[i][j] = String.valueOf(i);
					}
				}
			} else {
				for (int j = 0; j < tablero[i].length; j++) {
					tablero[i][j] = String.valueOf(j);
				}
			}
		}

		//Colocamos el tesoro
		tablero[1 + (int) (Math.random() * (tamano - 1))][1 + (int) (Math.random() * (tamano - 1))] = tesoro;

		int posicionX = 0;
		int posicionY = 0;

		//Colocamos las bombas
		int contador = 0;
		while (contador < numBombas) {
			posicionX = 1 + (int) (Math.random() * (tamano - 1));
			posicionY = 1 + (int) (Math.random() * (tamano - 1));
			if ("-".equals(tablero[posicionX][posicionY])) {
				tablero[posicionX][posicionY] = bomba;
				contador++;
			}
		}
		return tablero;
	}

	static String[][] cargarTablero(int tamano, int dificultad, int numBombas) {
		String[][] tablero = new String[tamano][tamano];

		//Cargar tablero vacío
		for (int i = 0; i < tablero.length; i++) {
			if (i > 0) {
				for (int j = 0; j < tablero[i].length; j++) {
					if (j > 0) {
						tablero[i][j] = "-";
					} else {
						tablero[i][j] = String.valueOf(i);
					}
				}
			} else {
				for (int j = 0; j < tablero[i].length; j++) {
					tablero[i][j] = String.valueOf(j);
				}
			}
		}
		return tablero;
	}

	static void pintarTablero(String tablero[][], String definicionTamano, String definicionDificultad) {
		//Pintar tablero
		System.out.println("Tablero " + definicionTamano + " - Dificultad " + definicionDificultad);
		for (int i = 0; i < tablero.length; i++) {
			if (i > 0) {
				for (int j = 0; j < tablero[i].length; j++) {
					if (j > 0) {
						System.out.print(tablero[i][j] + "\t");
					} else {
						System.out.print(tablero[i][j] + "\t");
					}
				}
				System.out.println();
			} else {
				for (String item : tablero[i]) {
					System.out.print(item + "\t");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tamano, dificultad;

		System.out.println("Buscaminas");

		do {
			System.out.println("¿Qué tamaño quieres que tenga el tablero?");
			System.out.println("1- Pequeño");
			System.out.println("2- Mediano");
			System.out.println("3- Grande");
			System.out.print("Tamaño número: ");
			tamano = sc.nextInt();
		} while (tamano < 1 || tamano > 3);

		//Ponemos los niveles dependiendo de lo que haya elegido el usuario (el tamaño irá de 7x7 y se multiplicará)
		tamano = tamano * 7 + 1;

		do {
			System.out.println("¿En qué dificultad quieres jugar?");
			System.out.println("1- Muy fácil");
			System.out.println("2- Fácil");
			System.out.println("3- Media");
			System.out.println("4- Difícil");
			System.out.println("5- Muy difícil");
			System.out.println("666- Imposible");
			System.out.print("Dificultad número: ");
			dificultad = sc.nextInt();
		} while (dificultad < 1 || dificultad > 6 && dificultad != 666);

		//Asignamos variables
		String definicionTamano = averiguarTamano((tamano - 1) / 7);
		String definicionDificultad = averiguarDificultad(dificultad);
		int numBombas = averiguarNumBombas(tamano, dificultad);

		String tableroDescubierto[][] = cargarTableroDescubierto(tamano, dificultad, numBombas);
		String tablero[][] = cargarTablero(tamano, dificultad, numBombas);
		pintarTablero(tablero, definicionTamano, definicionDificultad);

		/**
		 ***** Juego *****
		 */
		//Declaramos las opciones posibles para que ya no siga el bucle
		boolean ganar = false, perder = false;

		//Declaramos los ejes
		int ejeX = 0;
		int ejeY = 0;

		//Declaramos bombasCercanas
		int bombasCercanas = 0;

		do {
			do {
				System.out.println("Ingresa las coordenadas a las que apuntar");
				System.out.print("Eje X: ");
				ejeX = sc.nextInt();
				System.out.print("Eje Y: ");
				ejeY = sc.nextInt();
			} while (ejeX < 1 || ejeY < 1 || ejeX > tamano - 1 || ejeY > tamano - 1);

			if ("€€€".equals(tableroDescubierto[ejeX][ejeY])) {
				ganar = true;
				tablero[ejeX][ejeY] = "€€€";
				pintarTablero(tablero, definicionTamano, definicionDificultad);
				System.out.println("¡Muchísimas felicidades! Has encontrado el tesoro. Aquí tienes tu recompensa:");
				System.out.println("€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€");
			} else if ("***".equals(tableroDescubierto[ejeX][ejeY])) {
				perder = true;
				tablero[ejeX][ejeY] = "¡BOOM!";
				tableroDescubierto[ejeX][ejeY] = "¡BOOM!";
				pintarTablero(tableroDescubierto, definicionTamano, definicionDificultad);
				System.out.println("Lo siento, has perdido. Otra vez será.");
			} else {
				tablero[ejeX][ejeY] = "X";

				if ("***".equals(tableroDescubierto[ejeX - 1][ejeY - 1])) {
					bombasCercanas++;
				}

				if ("***".equals(tableroDescubierto[ejeX - 1][ejeY])) {
					bombasCercanas++;
				}

				if ("***".equals(tableroDescubierto[ejeX][ejeY - 1])) {
					bombasCercanas++;
				}

				if (ejeX != tamano - 1) {
					if ("***".equals(tableroDescubierto[ejeX + 1][ejeY - 1])) {
						bombasCercanas++;
					}

					if ("***".equals(tableroDescubierto[ejeX + 1][ejeY])) {
						bombasCercanas++;
					}
				}

				if (ejeY != tamano - 1) {
					if ("***".equals(tableroDescubierto[ejeX - 1][ejeY + 1])) {
						bombasCercanas++;
					}

					if ("***".equals(tableroDescubierto[ejeX][ejeY + 1])) {
						bombasCercanas++;
					}
				}

				if (ejeX != tamano - 1 && ejeY != tamano - 1) {
					if ("***".equals(tableroDescubierto[ejeX + 1][ejeY + 1])) {
						bombasCercanas++;
					}
				}

				if (bombasCercanas > 0) {
					tablero[ejeX][ejeY] = String.valueOf(bombasCercanas);
					pintarTablero(tablero, definicionTamano, definicionDificultad);
					System.out.println("--> ¡Cuidado! Hay bombas cerca <--");
				} else {
					pintarTablero(tablero, definicionTamano, definicionDificultad);
				}
				bombasCercanas = 0; //Reiniciamos el contador
			}
			System.out.println();
		} while (!ganar && !perder); //De mientras no gane ni pierda
	}
}