/*
Multiplicacion rusa
*/

package examen_t3_funciones;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Examen_T3_funciones_MultiplicacionRusa {

	static int multiplicacionRusa(int multiplicador, int multiplicando) {
		int resultado = 0, acumulador = 0;
		boolean negativo1 = false;
		
		//ExOR (OR exclusivo)
		if (((multiplicador <= 0) || (multiplicando <= 0)) &&
				!((multiplicador <= 0) && (multiplicando <= 0))) negativo1 = true;
		
		multiplicando = Math.abs(multiplicando);
		multiplicador = Math.abs(multiplicador);
		
		while ((multiplicador > 0) || (multiplicando == 0)) {
			if (multiplicador % 2 != 0) {
				resultado += multiplicando;	//resultado = resultado + multiplicando
			}
			multiplicador /= 2; //multiplicador = multiplicador / 2
			multiplicando *= 2; //multiplicando = multiplicando / 2
		}
		if (negativo1) acumulador *= -1;
		
		return acumulador;
	}
	
    public static void main(String[] args) {
		int multiplicador, multiplicando;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el multiplicador: ");
		multiplicador = sc.nextInt();
		System.out.print("Introduzca el multiplicando: ");
		multiplicando = sc.nextInt();
		
		System.out.println("El resultado de la multiplicación es: " + multiplicacionRusa(multiplicador, multiplicando));
	}
}
