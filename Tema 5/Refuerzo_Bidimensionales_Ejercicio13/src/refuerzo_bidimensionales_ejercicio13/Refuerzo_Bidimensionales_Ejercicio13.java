/*
Realiza un programa que calcule la estatura media, minima y máxima en	
centímetros de personas de diferentes países. El array que contiene los	
nombres de los paises es el siguiente: pais = {"España", "Rusia", "Japón",	
"Australia"}. Los datos sobre las estaturas se deben simular mediante un	
array de 4 filas por 10 columnas con números aleatorios generados al azar entre	
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de	
los países se deben mostrar utilizando el array de países (no se pueden escribir	
directamente).	

Ejemplo:
													  MED MIN MAX	
España:		178	165 148 185 155 141 165 149 155 201	| 164 141 201	
Rusia:		179 189 208 167 186 174 152 192 173 179 | 179 152 179	
Japón:		173 182 168 170 181 197 146 168 166 177	| 172 146 177	
Australia:	172	170 187 186 197 143 19e 199 187 191	| 182 143 191	
 */
package refuerzo_bidimensionales_ejercicio13;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Bidimensionales_Ejercicio13 {

	public static void main(String[] args) {
		int[][] estatura = new int[4][10];
		String[] pais = {"España", "Rusia", "Japón", "Australia"};

		//Cargamos las tablas
		//filas
		for (int i = 0; i < estatura.length; i++) {
			//columnas
			for (int j = 0; j < estatura[0].length; j++) {
				estatura[i][j] = (int) ((Math.random() * (210 - 140) + 140));
			}
		}

		//Variables necesarias
		int minimo = 210;
		int maximo = 140;
		int media = 0;

		//Pintamos las tablas
		//Indicadores MED MIN MAX
		for (int contador = 0; contador < 8; contador++) {
			System.out.print("\t");
		}
		System.out.println("     MED  MIN  MAX");
		//filas
		for (int i = 0; i < estatura.length; i++) {
			//columnas
			System.out.print(pais[i] + ":  \t");
			for (int j = 0; j < estatura[0].length + 4; j++) { //Es + 4 para añadir las columnas de | MED MIN MAX
				if (j < estatura[0].length) {
					System.out.print(estatura[i][j] + "  ");
					if (minimo > estatura[i][j]) {
						minimo = estatura[i][j];
					}
					if (maximo < estatura[i][j]) {
						maximo = estatura[i][j];
					}
					media += estatura[i][j];
				} else {
					switch (j) {
						case (10) -> {
							System.out.print("|  ");
						}
						case (11) -> {
							media /= estatura[0].length;
							System.out.print(media + "  ");
						}
						case (12) -> {
							System.out.print(minimo + "  ");
						}
						case (13) -> {
							System.out.print(maximo);
						}
					}
				}
			}
			//Reseteamos valores
			minimo = 210;
			maximo = 140;
			media = 0;
			System.out.println();
		}
	}
}