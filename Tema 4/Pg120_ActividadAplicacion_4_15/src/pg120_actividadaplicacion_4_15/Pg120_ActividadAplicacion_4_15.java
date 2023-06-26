/*
Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo,	
con el sigulente prototipo:	

static int diferenciaMin (int horal, int minutol, int hora2, int minuto2)	

La función devolverá la cantidad de minutos que existen de diferencia entre los dos ins-	
tantes utilizados.	
*/

package pg120_actividadaplicacion_4_15;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg120_ActividadAplicacion_4_15 {

	static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2) {
		int diferencia;
		
		//Pasamos todo a minutos
		minuto1 += hora1*60;
		minuto2 += hora2*60;
		
		//Hacemos la diferencia
		if (minuto1 < minuto2) {
			diferencia = minuto2 - minuto1;
		} else {
			diferencia = minuto1 - minuto2;
		}
		
		return diferencia;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime las horas y minutos de dos instantes de tiempo:");
		
		System.out.print("Hora 1: ");
		int hora1 = sc.nextInt();
		System.out.print("Minuto 1: ");
		int minuto1 = sc.nextInt();
		System.out.print("Hora 2: ");
		int hora2 = sc.nextInt();
		System.out.print("Minuto 2: ");
		int minuto2 = sc.nextInt();
		
		System.out.println("La diferencia de minutos es de " + diferenciaMin(hora1, minuto1, hora2, minuto2) + " minutos");
    }
}
