/*
Diseña una función que calcule y muestre la superficie y el volumen de una esfera
*/

package pg119_actividadaplicacion_4_11;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg119_ActividadAplicacion_4_11 {

	static void esfera (double radio) {
		double superficie = 4*Math.PI * Math.pow(radio, 2);
		System.out.printf("Su superficie es: %.2f \n" , superficie);
		
		double volumen = (((4*Math.PI) / 3) * Math.pow(radio, 3));
		System.out.printf("Su volumen es: %.2f \n" , volumen);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame el radio de una esfera y te diré su superficie y su volumen: ");
		double radio = sc.nextDouble();
		
		esfera(radio);
    }
}
