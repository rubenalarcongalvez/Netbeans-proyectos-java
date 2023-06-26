/*
Enunciado
 */
package pkg1.pruebas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pruebas {

	static void metodo1(int a, int b) throws ArithmeticException {
		int c = a / b;
		System.out.println("a/b = " + c);
	}

	static void metodo2() {
		int x = 6, y = 2;
		try {
			metodo1(x, y);
		} catch (ArithmeticException e) {
			System.out.println("División por cero");
		}
	}

	static int metodo3() {
		try {
			int c = 3 / 0;
			return c;
		} catch (ArithmeticException ex) {
			System.out.println("Excepción: No se puede dividir entre 0 en int");
		} finally {
			System.out.println("Ya sé que no se puede");
		}
		return 0;
	}

	/*
	Establecemos un bucle infinito del que solo nos puede sacar el break que, por otra
	parte, solo se ejecutará si se produce la lectura de Scanner sin que salte una
	excepción InputMismatchException por una entrada de tipo erróneo.
	 */
	static Integer leerEntero() {
		Integer resultado;
		while (true) { //SIEMPRE
			try {
				System.out.print("Introducir entero: ");
				resultado = new Scanner(System.in).nextInt();
				break; //aquí se llega solo si la lectura del Scanner fue correcta
			} catch (InputMismatchException ex) {
				System.out.println("Tipo erróneo");
			}
		}
		return resultado;
	}

	public static void main(String[] args) throws ExcepcionEdadNegativa {
		try {
			System.out.print("Introducir edad: ");
			int edad = new Scanner(System.in).nextInt();
			if (edad < 0) {
				throw new ExcepcionEdadNegativa(); //Se crea la excepción para ejecutarla en el catch
			} else {
				//cualquier código donde se use edad, por ejemplo:
				System.out.println("edad correcta: " + edad);
			}
		} catch(ExcepcionEdadNegativa ex) {
			System.out.println(ex);
		}
	}
}