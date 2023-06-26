/*
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package refuerzo_ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio7 {

	public static void main(String[] args) {
		final int CONTRASENA = 4812;
		boolean acierto = false;
		Scanner sc = new Scanner(System.in);
		int numero;
		
		for (int intento = 1; ((!acierto) && (intento <= 4)); intento++){
		
			System.out.println("Dime la combinación para abrir la caja fuerte:");
			numero = sc.nextInt();
			
			if(numero == CONTRASENA) {
				acierto = true;
			} else {
				System.out.println("Lo siento, esa no es la combinación");
			}
		}
		
		if (acierto){
			System.out.println("La caja fuerte se ha abierto satisfactoriamente");
		}
		else{
			System.out.println("Ha sobrepasado el número máximo de intentos");
		}
	}
}