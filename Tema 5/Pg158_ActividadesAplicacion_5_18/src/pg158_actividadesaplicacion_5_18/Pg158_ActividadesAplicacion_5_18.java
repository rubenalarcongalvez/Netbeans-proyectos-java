/*
Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. La aplica-	
ción debe decidir si la matriz introducida corresponde a una matriz mágica, que es aquella	
donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo.	
 */
package pg158_actividadesaplicacion_5_18;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg158_ActividadesAplicacion_5_18 {

	static boolean magico(int[][] tabla) {
		boolean magico = true;

		int referencia = 0;
		int sumaFilas = 0;
		int sumaColumnas = 0;

		for (int columna = 0; columna < tabla.length; columna++) {
			referencia += tabla[columna][0];
		}

		for (int contador = 0; contador < tabla.length; contador++) {

			for (int columna = 0; columna < tabla.length; columna++) {
				sumaFilas += tabla[columna][contador];
			}

			for (int filas = 0; filas < tabla.length; filas++) {
				sumaColumnas += tabla[contador][filas];
			}

			if (sumaFilas == referencia && sumaColumnas == referencia) {
				sumaFilas = 0;
				sumaColumnas = 0;
			} else {
				magico = false;
				contador = tabla.length;
			}
		}

		return magico;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] tabla = new int[4][4];

		for (int columna = 0; columna < tabla.length; columna++) {
			for (int fila = 0; fila < tabla[columna].length; fila++) {
				tabla[columna][fila] = 1;
				System.out.print(tabla[columna][fila]);
			}
			System.out.println();
		}

		System.out.println("¿Es mágico?");
		System.out.println(magico(tabla));
	}
}