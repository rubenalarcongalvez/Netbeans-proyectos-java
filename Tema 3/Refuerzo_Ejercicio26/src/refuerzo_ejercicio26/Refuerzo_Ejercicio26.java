//Realiza un programa que pida primero un número y a continuación un dígito.
//El programa nos debe dar la posición (o posiciones) contando de izquierda a
//derecha que ocupa ese dígito en el número introducido.
package refuerzo_ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio26 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = sc.nextInt();

		System.out.print("Introduce un dígito y te diré en la posición o posiciones en las que está dentro de " + numero + " (de izquierda a derecha): ");
		int digito = sc.nextInt();

		System.out.print("El " + digito + " está dentro de " + numero + " en las siguientes posiciones:");

		if (numero < 0) {
			numero *= -1;
		}
		
		//Le damos la vuelta y calculamos la longitud
		int volteado = 0;
		int longitud = 0;
		int posicion = 1;

		if (numero == 0) {
			longitud = 1;
		}

		while (numero > 0) {
			volteado = (volteado * 10) + (numero % 10); //Porque así se podría concatenar bien (40+4 = 44 por ejemplo)
			numero /= 10;
			longitud++;
		}

		//Posicion
		while (volteado > 0) {
			if ((volteado % 10) == digito) {
				System.out.print(" " + posicion);
			}
			volteado /= 10;
			posicion++;
		}
		System.out.println();
	}
}