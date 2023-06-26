/*
El cifrado César es una forma sencilla de modificar un texto para que no sea entendible	
a quienes no conocen el código. Este cifrado consiste en modificar cada letra de un tex-	
to por otra que se encuentra en el alfabeto n posiciones detrás.
Por ejemplo, para un valor de n igual a 3, la letra a se codifica con la d, y la letra q se co-	
difica con la x. En el caso de que una letra exceda a la z, seguiremos de forma circular	
utilizando la a. Solo se cifrarán las letras, mayúsculas o minúsculas.	
Realiza una clase que, mediante un método estático, devuelva cifrado el texto que se le	
pasa con un paso den letras.	
 */

import java.util.Scanner;
import utilidades.cifradoCesar;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg247_CifradoCesar_717_ActividadesFinales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime cualquier texto y yo te lo codifico: ");
		String texto = sc.nextLine();
		
		System.out.print("Dime la distancia de cifrado que quieras (recuérdala luego para poder descifrarla): ");
		int distanciaCifrado = sc.nextByte();
		
		texto = cifradoCesar.cifrarTexto(texto, (byte) distanciaCifrado);

		System.out.println("Texto cifrado: " + texto);
		
		texto = cifradoCesar.descifrarTexto(texto, (byte) distanciaCifrado);
		
		System.out.println("Texto descifrado: " + texto);
	}
}