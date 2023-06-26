/*
Implementa una aplicación que mantenga un registro de las temperaturas máxima y mi-	
nima diarias medidas en una estación meteorológica. Los datos se guardarán en un ar-
chivo de texto con el siguiente formato:	

Fecha			Temperatura máxima	Temperatura minima	
2020-01-15				12					-1	
2020-01-16				15					 2
...

Al arrancar la aplicación aparecerá un menú con las opciones:	
1. Registrar nueva temperatura.	
2. Mostrar historial de registros.	
3. Salir.

El historial de registros mostrará todos los datos registrados junto con el máximo valor	
de las temperaturas máximas y el minimo de las temperaturas mínimas.	
 */
package pg333_finales10.pkg24_temperaturas;

import clases.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg333_Finales1024_Temperaturas {

	public static void main(String[] args) {
		Registro registroTemperaturas = new Registro();
		Scanner sc = new Scanner(System.in);

		String fecha = "";
		int maxima = 0;
		int minima;

		boolean valido; //por defecto es false

		int eleccion = 0;

		do {
			minima = Integer.MAX_VALUE;
			
			System.out.println("1. Registrar nueva temperatura."
					+ "\n2. Mostrar historial de registros."
					+ "\n3. Salir.");

			try {
				System.out.print("Elección: ");
				eleccion = sc.nextInt();
			} catch (InputMismatchException ex) {
				eleccion = 0;
			} catch (Exception ex) {
				System.out.println(ex);
			} finally {
				sc.nextLine();
			}

			switch (eleccion) {
				case 1 -> {
					try {
						do {
							System.out.print("Fecha: ");
							fecha = sc.next();
						} while (fecha.length() != 10); //yyyy-MM-dd
					} catch (InputMismatchException ex) { //Aunque no debería saltar
						System.out.print("Por favor, ponga una fecha correcta (yyyy-MM-dd): ");
						fecha = "no válida";
					} catch (Exception ex) {
						System.out.println(ex);
					}

					valido = false;
					
					do {
						System.out.print("Temperatura máxima: ");
						try {
							maxima = sc.nextInt();
							valido = true;
						} catch (InputMismatchException ex) {
							System.out.println("Introduzca un número entero correcto. ");
						} finally {
							sc.nextLine();
						}
					} while (valido == false);
					
					do {
						System.out.print("Temperatura mínima: ");
						try {
							minima = sc.nextInt();
						} catch (InputMismatchException ex) {
							System.out.println("Introduzca un número entero correcto. ");
						} finally {
							sc.nextLine();
						}
					} while (minima > maxima);
					
					registroTemperaturas.insertarTemperatura(fecha, maxima, minima);
					System.out.println("Registro insertado con éxito.\n");
				}
				case 2 -> {
					System.out.println(registroTemperaturas + "\n");
				}
				case 3 -> {
					try (BufferedWriter out = new BufferedWriter(new FileWriter("registro.txt"))) {
						out.write(registroTemperaturas.toString());
					} catch (IOException ex) {
						System.out.println(ex);
					} catch (Exception ex) {
						System.out.println(ex);
					}
				}
				default -> {
					System.out.println("Por favor, inserte un número entre el 1 y el 3");
				}
			}

		} while (eleccion != 3);
	}
}