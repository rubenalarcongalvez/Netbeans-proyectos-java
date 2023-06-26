//Multiplicación rusa

package examen_2_2021_2;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Examen_2_2021_2 {

	public static void main(String[] args) {
		int multiplicador, multiplicando, resultado = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el multiplicador: ");
		multiplicador = sc.nextInt();
		System.out.print("Introduzca el multiplicando: ");
		multiplicando = sc.nextInt();
		
		while ((multiplicador > 0) || (multiplicando == 0)) {
			if (multiplicador % 2 != 0) {
				resultado += multiplicando;	//resultado = resultado + multiplicando
			}
			multiplicador /= 2; //multiplicador = multiplicador / 2
			multiplicando *= 2; //multiplicando = multiplicando / 2
		}
		System.out.println("El resultado de la multiplicación es: " + resultado);
	}
}