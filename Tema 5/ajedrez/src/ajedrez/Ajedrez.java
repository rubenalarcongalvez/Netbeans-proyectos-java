/*
Dado el siguiente código que pide una posición por teclado de una pieza "Reina" de ajedrez,
completa el código para pintar por pantalla el tablero de ajedrez y los posibles que puede realizar la pieza.
 */
package ajedrez;

import java.util.Scanner;

public class Ajedrez {

	private static final int REINA = 1;
	private static final int POSIBLE_MOVIMIENTO = -1;
	private static final int TAMANO_TABLERO = 8;

	public static void pintarTablero(int[][] tab) {

		int numFila = 1;

		for (int numCol = 1; numCol <= tab[0].length; numCol++) {
			System.out.print("\t" + numCol);
		}
		System.out.println();

		for (int[] fila : tab) {
			System.out.print(numFila++);
			for (int ind = 0; ind < fila.length; ind++) {
				System.out.print("\t");
				switch (fila[ind]) {
					case Ajedrez.REINA:
						System.out.print("R");
						break;
					case Ajedrez.POSIBLE_MOVIMIENTO:
						System.out.print("*");
						break;
					default:
						System.out.print("O");
						break;
				}
			}
			System.out.println();
		}
	}

	public static void pintarReina(int fila, int col) {
		int[][] tablero = new int[8][8]; //Declaramos el array (siguiendo con los parámetros del otro usuario)
		
		//Da igual la lenght de referencia que le pongamos porque es 8x8
		//Pintamos las posiciones posibles
		//Fila
		for (int j = 0; j < tablero.length; j++) { //columna
				tablero[fila][j] = Ajedrez.POSIBLE_MOVIMIENTO;
		}

		//Columnna
		for (int i = 0; i < tablero.length; i++) { //fila
				tablero[i][col] = Ajedrez.POSIBLE_MOVIMIENTO;
		}

		//Diagonales
		int ejeX = fila;	
		int ejeY = col;
		
		//Diagonal 1
		while (ejeX != 0 && ejeY != 0) {
			ejeX--;
			ejeY--;
		}
		
		while (ejeX != tablero.length && ejeY != tablero.length) {
			tablero[ejeX][ejeY] = Ajedrez.POSIBLE_MOVIMIENTO;
			ejeX++;
			ejeY++;
		}
		
		//Reseteamos variables
		ejeX = fila;
		ejeY = col;
		
		//Diagonal 2
		while (ejeX != 0 && ejeY != tablero.length - 1) {
			ejeX--;
			ejeY++;
		}
		
		while (ejeX != tablero.length && ejeY != 0) {
			tablero[ejeX][ejeY] = Ajedrez.POSIBLE_MOVIMIENTO;
			ejeX++;
			ejeY--;
		}
		
		tablero[fila][col] = Ajedrez.REINA; //Pintamos la reina

		pintarTablero(tablero); //Pintamos el tablero alrededor

	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int fila = 0, columna = 0;
		int pieza = 0;

		// LECTURA DE LA POSICION A COLOCAR LA PIEZA
		System.out.print("Introduzca la fila en la que colocar la pieza: ");
		fila = teclado.nextInt() - 1;
		System.out.print("Introduzca la columna en la que colocar la pieza: ");
		columna = teclado.nextInt() - 1;
		while ((fila < 0) || (fila >= Ajedrez.TAMANO_TABLERO) || (columna < 0) || (columna > Ajedrez.TAMANO_TABLERO)) {
			System.out.println("Valor de fila y/o columna incorrecto. Fuera de Rango");
			System.out.print("Introduzca la fila en la que colocar la pieza: ");
			fila = teclado.nextInt() - 1;
			System.out.print("Introduzca la columna en la que colocar la pieza: ");
			columna = teclado.nextInt() - 1;
		}

		pintarReina(fila, columna);
	}
}
