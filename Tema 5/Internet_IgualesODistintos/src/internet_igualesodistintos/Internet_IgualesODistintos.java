/*
Escriba la función todos_iguales (1ista) que indique si todos los	
elementos de una lista son iguales.
>>> todos_iguales([6, 6, 6])
True
>>> todos_iguales([6, 6, 1])
False
>>> todos_iguales([0, 90, 1])
False


A continuación, escriba una función todos_distintos(lista) que indique si todos los elementos de una lista son distintos:
>>> todos_distintos([6, 6, 6])
False
>>> todos_distintos([6, 6, 1])
False
>>> todos_distintos([0, 90, 1])
True

Sus funciones deben ser capaces de aceptar listas de cualquier tamaño y con cualquier tipo de datos:
>>> todos_iguales([7, 7, 7, 7, 7, 7, 7, 7, 7])
True
>>> todos_distintos(list(range(1000)))
True
>>> todos_iguales([12])
True
>>> todos_distintos(list('hiperblanduzcos'))
True
 */
package internet_igualesodistintos;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Internet_IgualesODistintos {

	static boolean todos_iguales(int tabla[]) {
		boolean iguales = true;

		for (int contador = 1; contador < tabla.length && iguales == true; contador++) {
				if (tabla[contador] != tabla[contador - 1]) {
					iguales = false;
				}
		}
		return iguales;
	}
	
	static boolean todos_distintos(int tabla[]) {
		boolean distintos = true;

		for (int contador = 1; contador < tabla.length && distintos == true; contador++) {
				if (tabla[contador] == tabla[contador - 1]) {
					distintos = false;
				}
		}
		return distintos;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos números desea introducir?");
		int longitud = sc.nextInt();
		int tabla[] = new int[longitud];

		for (int contador = 0; contador < longitud; contador++) {
			System.out.print("Número " + (contador + 1) + ": ");
			tabla[contador] = sc.nextInt();
		}

		System.out.println("Son todos iguales: " + todos_iguales(tabla));
		System.out.println("Son todos distintos: " + todos_distintos(tabla));
	}
}