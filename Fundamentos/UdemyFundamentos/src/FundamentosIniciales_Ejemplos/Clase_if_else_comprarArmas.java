package FundamentosIniciales_Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */

//Comprar armas con diferentes respuestas
public class Clase_if_else_comprarArmas {
	public static void main(String args[]){
		System.out.println("- Así que quieres comprar armas...");
		System.out.println("- ¿Qué edad tienes? Solo el numero");
		Scanner console = new Scanner(System.in);
		int edad = Integer.parseInt(console.nextLine());
		System.out.println("+ Tengo " + edad + " años");
		System.out.println("- Oh, ya veo...");
		boolean edadMinima = edad >= 21;
		boolean edadRidicula = edad < 18;
		
		if(edadMinima){
			System.out.println("- ¡Pues entonces no hay problema! Solo tienes que pasar los psicotécnicos y listo.");
		}
		else{
			if(edadRidicula){
				System.out.println("- Vete de aquí antes de que llame a tus padres");
			}
			else{
				System.out.println("- Lo siento, aunque seas mayor de edad, tienes que tener al menos 21 años para poder comprar armas.");
			}
		}
	}
}