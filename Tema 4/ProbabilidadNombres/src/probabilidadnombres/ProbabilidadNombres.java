/*
Desarrollar un algoritmo que dependiendo de la nota que saque, esa es la probabilidad de obtener
un nombre más atractivo. Si no, se quedará con su nombre actual.

En el caso de suspender (sacar menos de un 5), su nombre tendrá la probabilidad (del 1 al 5, dependiendo de la nota)
de pasar a ser uno poco atractivo, peor que el actual.

Si saca un 9 o más, tendrá la probabilidad de 1/2 de ponerse ella misma el nombre que quiera.

Si saca un 10, tendrá la probabilidad del 100% de ponerse el nombre que ella quiera.
 */
package probabilidadnombres;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ProbabilidadNombres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "ISO-8859-1");
		String nombre = "Nis (icono de la espada)";
		String nombreMejorado = "Nys (icono de la espada)";
		String nombreEmpeorado = "Nysrym (icono de la payasa)";

		System.out.print("Dime la nota de tu examen: ");
		double nota = sc.nextDouble();

		//Hacemos las probabilidades
		double probabilidad = Math.random() * 10;
		double resultado = probabilidad - nota;

		//Condiciones normales
		if (resultado <= 0 && nota >= 5 && nota < 9) {
			nombre = nombreMejorado;
			System.out.println("Enhorabuena, tu nombre pasará a ser a partir de ahora: " + nombre);
		} else if (resultado >= 0 && nota >= 5 && nota < 9) {
			System.out.println("Lo siento, tu nombre seguirá siendo: " + nombre);
		}
		
		
		
		//Si saca un 9 o más
		if (nota >= 9 && nota < 10) {
			System.out.println("¡Muchísimas felicidades por esta notaza!");
			System.out.println("Ahora tienes una probabilidad del 50% de que puedas CAMBIAR TU NOMBRE AL QUE TÚ QUIERAS.");

			if (Math.random() * 10 >= 5) {
				System.out.println("¡¡¡ENHORABUENA!!! Ahora podrás cambiar tu nombre al que tú quieras.");
				System.out.println("¿Qué nombre te gustaría ponerte?");
				sc.nextLine();
				nombre = sc.nextLine();

				System.out.println("Genial, tu nombre será '" + nombre + "' a partir de ahora");
			} else {
				nombre = nombreMejorado;
				System.out.println("Joooo casi pero NO. Tu nombre simplemente ascenderá a: " + nombre + ". Enhorabuena");
			}
		}
		
		//Si saca un 10
		if (nota == 10) {
			System.out.println("¡Muchísimas felicidades por esta notaza! ¡¡¡Eres increíble!!!");
			System.out.println("¡¡¡ENHORABUENA!!! Ahora podrás cambiar tu nombre al que tú quieras.");
			System.out.println("¿Qué nombre te gustaría ponerte?");
			sc.nextLine();
			nombre = sc.nextLine();

			System.out.println("Genial, tu nombre será '" + nombre + "' a partir de ahora");
		}
		
		//Si saca menos de un 5 (si suspende)
		if (nota < 5) {
			probabilidad = Math.random() * 5;
			resultado = probabilidad - nota;
			
			if (resultado <= 0) {
				System.out.println("Uyy, te has salvado... Tu nombre seguirá siendo: " + nombre);
			} else {
				nombre = nombreEmpeorado;
				System.out.println("Joe, lo siento, pero tu nombre será a partir de ahora: " + nombre);
			}
		}
	}
}