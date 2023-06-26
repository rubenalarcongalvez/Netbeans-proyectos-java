/*
Escribe un programa que pida 20 números enteros. Estos números se deben	
introducir en un array de 4 filas por 5 columnas. El programa mostrará las	
sumas parciales de filas y columnas igual que si de una hoja de cálculo se	
tratara. La suma total debe aparecer en la esquina inferior derecha.
 */
package refuerzo_bidimensionales_ejercicio2;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Bidimensionales_Ejercicio2 {

	public static void main(String[] args) {
		int tabla[][] = new int[5][6];

		// Se introducen los datos
		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = 0; j < tabla[0].length - 1; j++) {
				tabla[i][j] = (int) (Math.random() * 10);
				// Aprovechamos para ir calculando los sumatorios
				tabla[i][5] += tabla[i][j]; //Total columnas
				tabla[4][j] += tabla[i][j]; //Total filas
				tabla[4][5] += tabla[i][j] * 2; //TOTAL
			}
		}

		// Se muestra la tabla
		for (int fila[] : tabla) {
			for (int columna : fila) {
				System.out.print(columna + "\t");
			}
			System.out.println();
		}
	}
}