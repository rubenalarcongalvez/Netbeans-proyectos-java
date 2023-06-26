package FundamentosIniciales;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ConversionesDeTipos {
	public static void main(String args[]){
	//Se pone directamente el tipo de variable a la que se va a transformar o también se puede poner var		
		
		//Convertir un tipo String a un tipo int
		//String edadString = "20"; //SIN TRANSFORMAR, por lo que sería una palabra, no un número
		int edad = Integer.parseInt("20");
		System.out.println("edad = " + (edad + 1)); /*Se puede ver que se puede sumar correctamente y da 21, porque es tipo int ahora
														si no, se concatenaria, es decir: 20 + 1 = 201*/
		
		//Convertir un tipo String a un tipo double
		var valorPI = Double.parseDouble("3.1416");
		System.out.println("valorPI = " + valorPI);
		
		//Pedir un valor numerico con clase Scanner
		var console = new Scanner(System.in);
		System.out.print("Dime tu edad solo en numeros: ");
		int miEdad = Integer.parseInt(console.nextLine()); //Se tiene que volver a transformar puesto que ya contaba como int
		System.out.println("edad = " + miEdad);
		
		//Convertir un tipo int/char/boolean/long/float/double a un tipo String
		var edadTexto = String.valueOf(23);
		System.out.println("edadTexto = " + edadTexto);
		
		//Para transformar de String a char
		var caracter = "Cadena que solo almacena un caracter".charAt(11); //charAt es un indice donde el numero que le pongas
																		//es la posicion en la que está el caracter empezando por 0
																		//en este caso, ese caracter seria = s (de solo)
		System.out.println("caracter = " + caracter);
		
		//Pedir un caracter con clase Scanner (el primer caracter)
		System.out.print("Proporciona un caracter cualquiera: ");
		caracter = console.nextLine().charAt(0);
		System.out.println("caracter = " + caracter);
	}
}
