package util;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author n3buresp1997 <n3buresp1997@gmail.com>
 */
public class Entrada {

	private static final Scanner sc; //Estático para no crear un objeto de esta clase

	static {
		sc = new Scanner(System.in, "ISO_8859_1").useLocale(Locale.US); //Para recoger alfabeto latino (acentos, ISO) y sistema US
	}

	public static boolean pedirBoolean(String mensaje) {
		boolean resultado = false;
		boolean valido;

		do {
			System.out.print(mensaje);
			valido = true;
			try {
				resultado = sc.nextBoolean();
			} catch (InputMismatchException ex) {
				System.out.println("Introduzca true o false.");
				valido = false;
			}

		} while (valido == false);

		return resultado;
	}

	public static int pedirEntero(String mensaje) {
		int resultado = 0;
		boolean valido;

		do {
			System.out.print(mensaje);
			valido = true;
			try {
				resultado = sc.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Introduzca un número entero válido.");
				valido = false;
			} finally {
				sc.nextLine();
			}

		} while (valido == false);

		return resultado;
	}
	
	public static int pedirEnteroPositivo(String mensaje) {
		int resultado = 0;
		boolean valido;

		do {
			System.out.print(mensaje);
			valido = true;
			try {
				resultado = sc.nextInt();
				
				if (resultado < 0) {
					System.out.println("Introduzca un número entero positivo.");
					valido = false;
				}
				
			} catch (InputMismatchException ex) {
				System.out.println("Introduzca un número entero válido.");
				valido = false;
			} finally {
				sc.nextLine();
			}

		} while (valido == false);

		return resultado;
	}

	public static double pedirDouble(String mensaje) {
		double resultado = 0;
		boolean valido;

		do {
			System.out.print(mensaje);
			valido = true;
			try {
				resultado = sc.nextDouble();
			} catch (InputMismatchException ex) {
				System.out.println("Introduzca un número real válido.");
				valido = false;
			} finally {
				sc.nextLine();
			}

		} while (valido == false);

		return resultado;
	}
	
	public static double pedirDoublePositivo(String mensaje) {
		double resultado = 0;
		boolean valido;

		do {
			System.out.print(mensaje);
			valido = true;
			try {
				resultado = sc.nextDouble();
				
				if (resultado < 0) {
					System.out.println("Introduzca un número real positivo.");
					valido = false;
				}
				
			} catch (InputMismatchException ex) {
				System.out.println("Introduzca un número real válido.");
				valido = false;
			} finally {
				sc.nextLine();
			}

		} while (valido == false);

		return resultado;
	}

	public static long pedirLong(String mensaje) {
		long resultado = 0;
		boolean valido;

		do {
			System.out.print(mensaje);
			valido = true;
			try {
				resultado = sc.nextLong();
			} catch (InputMismatchException ex) {
				System.out.println("Introduzca un número long válido.");
				valido = false;
			} finally {
				sc.nextLine();
			}

		} while (valido == false);

		return resultado;
	}
	
	public static long pedirLongPositivo(String mensaje) {
		long resultado = 0;
		boolean valido;

		do {
			System.out.print(mensaje);
			valido = true;
			try {
				resultado = sc.nextLong();
				
				if (resultado < 0) {
					System.out.println("Introduzca un número real positivo.");
					valido = false;
				}
				
			} catch (InputMismatchException ex) {
				System.out.println("Introduzca un número long válido.");
				valido = false;
			} finally {
				sc.nextLine();
			}

		} while (valido == false);

		return resultado;
	}

	public static String pedirPalabraLimpiandoBuffer(String mensaje) {
		System.out.print(mensaje);
		String cadena = sc.next();
		sc.nextLine();

		return cadena;
	}

	public static String pedirPalabraSinLimpiarBuffer(String mensaje) {
		System.out.print(mensaje);
		return sc.next();
	}

	public static String pedirCadena(String mensaje) {
		System.out.print(mensaje);
		return sc.nextLine();
	}
}