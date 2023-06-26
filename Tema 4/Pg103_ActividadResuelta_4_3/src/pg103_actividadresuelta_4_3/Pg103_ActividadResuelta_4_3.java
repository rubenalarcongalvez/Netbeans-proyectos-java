/*
Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se	
especifique. 

Para distinguir un caso de otro se le pasará como opción un número: 1 (para	
el área) o 2 (para el volumen). Además, hay que pasarle a la función el radio de la base	
y la altura.	
 */
package pg103_actividadresuelta_4_3;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg103_ActividadResuelta_4_3 {

	static void cilindro(int eleccion, double radio, double altura) {
		switch(eleccion) {
			case 1 -> {
				System.out.println("Su área es: " + (2 * Math.PI * radio * (altura + radio)));
			}
			case 2 -> {
				System.out.println("Su volumen es: " + (Math.PI * Math.pow(radio, 2) * altura));
			}
			case 3 -> {
				System.out.println("Su área es: " + (2 * Math.PI * radio * (altura + radio)));
				System.out.println("Su volumen es: " + (Math.PI * Math.pow(radio, 2) * altura));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion = 0;
		
		do {
		System.out.println("Por favor, elige si quieres saber el área del cilindro (poniendo un '1') o su volumen (poniendo un 2). Si quiere saber ambos, ponga el número 3: ");
		eleccion = sc.nextInt();
		} while (eleccion != 1 && eleccion != 2 && eleccion != 3);
		
		System.out.print("Elija un radio: ");
		double radio = sc.nextInt();
		System.out.print("Elija una altura: ");
		double altura = sc.nextInt();
		
		cilindro(eleccion, radio, altura);
	}
}
