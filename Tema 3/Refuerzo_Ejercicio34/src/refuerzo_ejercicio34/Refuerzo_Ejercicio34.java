//Escribe un programa que pida dos números por teclado y que luego mezcle en
//dos números diferentes los dígitos pares y los impares. Se van comprobando los
//dígitos de la siguiente manera: primer dígito del primer número, primer dígito
//del segundo número, segundo dígito del primer número, segundo dígito del
//segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
//podemos suponer que el usuario introducirá dos números de la misma longitud
//y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
//int donde sea necesario para admitir números largos.
//Ejemplo 1:
//Por favor, introduzca un número: 9402
//Introduzca otro número: 6782
//El número formado por los dígitos pares es 640822
//El número formado por los dígitos impares es 97
//Ejemplo 2:
//Por favor, introduzca un número: 137
//Introduzca otro número: 909
//El número formado por los dígitos pares es 0
//El número formado por los dígitos impares es 19379
package refuerzo_ejercicio34;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numero1 = 0, numero2 = 0, pares = 0, impares = 0;
		int resto1 = 0, resto2 = 0, contadorPar = 0, contadorImpar = 0;
		
		do {
		System.out.print("Introduce el primer número entero positivo: ");
		numero1 = sc.nextInt();
		} while (numero1 < 0);
		
		do {
		System.out.print("Introduce el segundo número entero positivo: ");
		numero2 = sc.nextInt();
		} while (numero2 < 0);
		
		while (numero1 > 0) {
			resto1 = (int) numero1 % 10;
			resto2 = (int) numero2 % 10;
			
			//No puede ser if else porque si no, iría de dos en dos
			if (resto1 % 2 == 0) {
				pares += resto1 * (Math.pow(10, contadorPar));
				contadorPar++;
			} if (resto1 % 2 != 0) {
				impares += resto1 * (Math.pow(10, contadorImpar));
				contadorImpar++;
			}
			
			if (resto2 % 2 == 0) {
				pares += resto2 * (Math.pow(10, contadorPar));
				contadorPar++;
			} if (resto2 % 2 != 0) {
				impares += resto2 * (Math.pow(10, contadorImpar));
				contadorImpar++;
			}
			
			numero1 /= 10;
			numero2 /= 10;
		}
		System.out.println("Los números pares son: " + pares);
		System.out.println("Los números impares son: " + impares);
	}
}
