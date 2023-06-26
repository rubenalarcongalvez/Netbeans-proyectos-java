/*
Escribe una función a la que se pase como parámetros de entrada una cantidad de días,	
horas y minutos. La función calculará y devolverá el número de segundos que existen en	
los datos de entrada.
*/

package pg119_actividadaplicacion_4_14;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg119_ActividadAplicacion_4_14 {

    static int totalSegundos (int horas, int minutos, int segundos) {
		segundos += (horas*3600) + (minutos*60);
		
		return segundos;
	}
	
	public static void main(String[] args) {
        System.out.println("Dime una cantidad de horas, minutos y segundos y te lo pasaré todo a segundos: ");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Horas: ");
		int horas = sc.nextInt();
		System.out.print("Minutos: ");
		int minutos = sc.nextInt();
		System.out.print("Segundos: ");
		int segundos = sc.nextInt();
		
		System.out.println("El total de segundos es: " + totalSegundos(horas, minutos, segundos));
    }
}
