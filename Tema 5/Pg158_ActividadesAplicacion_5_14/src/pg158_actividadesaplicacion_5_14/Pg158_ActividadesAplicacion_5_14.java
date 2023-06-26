/*
El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar en-	
cuestas estadisticas para conocer el nivel adquisitivo de los habitantes del municipio. Para	
ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el	
número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con va-	
lor -1.	

Una vez terminada la entrada de datos, muestra la siguiente información:	
- Todos los sueldos introducidos ordenados de forma decreciente.	
- El sueldo máximo y minimo.	
- La media de los sueldos.	
 */
package pg158_actividadesaplicacion_5_14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg158_ActividadesAplicacion_5_14 {

	static int[] acotarTabla(int tabla[]) {
		int longitud = tabla.length;

		//Comprobamos los valores que queremos quitar
		for (int contador = 0; contador < tabla.length; contador++) {
			if (tabla[contador] == -1) {
				longitud -= (tabla.length - (contador));
				contador = tabla.length - 1;
			}
		}

		//Creamos la tabla nueva
		int[] tablaAcotada = new int[longitud];

		for (int contador = 0; contador < longitud; contador++) {
			tablaAcotada[contador] = tabla[contador];
		}
		return tablaAcotada;
	}

	static int[] ordenarTabla(int tabla[]) {
		int elementoAuxiliar;

		for (int orden = 0; orden < tabla.length - 1; orden++) {
			for (int contador = orden+1; contador < tabla.length; contador++) {
				if (tabla[orden] < tabla[contador]) {
					elementoAuxiliar = tabla[orden];
					tabla[orden] = tabla[contador];
					tabla[contador] = elementoAuxiliar;
				}
			}
		}
		return tabla;
	}
	
	static int maximo(int tabla[]) {
		int maximo = tabla[0];
		
		for (int contador = 1; contador < tabla.length; contador++) {
			if (maximo < tabla[contador]) maximo = tabla[contador];
		}
		return maximo;
	}
	
	static int minimo(int tabla[]) {
		int minimo = tabla[0];
		
		for (int contador = 1; contador < tabla.length; contador++) {
			if (minimo > tabla[contador]) minimo = tabla[contador];
		}
		return minimo;
	}
	
	static int media(int tabla[]) {
		int sumaTotal = 0;
		
		for (int i : tabla) {
			sumaTotal += i;
		}
		
		int media = sumaTotal / tabla.length;
		
		return media;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Necesitamos saber los sueldos de todos los habitantes");
		int[] sueldos = new int[1000];

		for (int contador = 0; contador < sueldos.length; contador++) {
			do {
				System.out.print("Sueldo de habitante nº" + (contador + 1) + ": ");
				sueldos[contador] = sc.nextInt();
			} while (sueldos[contador] < -1);

			if (sueldos[contador] == -1) {
				contador = sueldos.length - 1;
			}
		}

		//Acotamos la tabla
		int[] sueldosAcotados = acotarTabla(sueldos);
		System.out.println("Sueldos de todos los habitantes: " + Arrays.toString(sueldosAcotados));

		//Ordenamos la tabla acotada
		ordenarTabla(sueldosAcotados);
		System.out.println("Sueldos de todos los habitantes ordenados de forma decreciente: " + Arrays.toString(sueldosAcotados));
		
		//Sueldos máximos y mínimos
		System.out.println("El sueldo máximo es: " + maximo(sueldosAcotados) + "€");
		System.out.println("El sueldo mínimo es: " + minimo(sueldosAcotados) + "€");
		
		//Media de los sueldos
		System.out.println("La media de los sueldos es: " + media(sueldosAcotados) + "€");
	}
}