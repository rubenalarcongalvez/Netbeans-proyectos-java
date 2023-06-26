package FundamentosIniciales_Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Clase_if_else_clubElitista {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in, "ISO_8859_1");
		System.out.println("¿Cómo te llamas?");
		var nombre = sc.nextLine();
		System.out.println("¿Cuánto dinero tienes?, " + nombre + " (cifra numérica)");
		var dinero = Integer.parseInt(sc.nextLine());
		System.out.println("Buenas tardes. Este es un club exclusivo VIP. \n"
				+ "Por favor, pague su entrada al club elitista: \n"
				+ "Inscripción: 1800€");
		System.out.println("¿Tiene usted el dinero? (Sí/No)");
		var solvente = sc.nextLine();
		if(solvente.equalsIgnoreCase("Sí")){
			System.out.println("Perfecto. Deme el dinero");
			if(dinero < 1800){
				System.out.println("Oye, aquí solo hay " + dinero + "€. No puedes entrar, sinvergüenza. A mí no me la cuelas");
			}
			else{
				System.out.println("Muy bien, bienvenido, " + nombre);
				System.out.println("Ahora tienes " + (dinero-1800) + "€ en tu cuenta.");
			}
		}
		else{
			System.out.println("Pues entonces no puedes entrar, lo siento");
			var respuesta = sc.nextLine();
			if(respuesta.equalsIgnoreCase("Soy Rubén Alarcón")){
				System.out.println("Oh, perdóneme, no le había reconocido. Bienvenido, caballero.");
			}
		}
	}
}
