/*
Escribir un programa que lea por teclado una hora cualquiera y un número n que represen	
ta una cantidad en segundos. El programa mostrará la hora introducida y las n siguien	
tes, que se diferencian en un segundo. Para ello hemos de diseñar previamente la clase	
Hora que dispone de los atributos hora, minuto y segundo. Los valores de los atributos se	
controlarán mediante métodos set/get.
 */
package pg228_hora_resuelta76;

import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg228_Hora_Resuelta76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Hora h = new Hora(); //creamos un objeto Hora

		System.out.print("Hora: ");
		int valor = sc.nextInt(); //leemos un valor para la hora
		h.setHora(valor); //asignamos un valor para la hora

		System.out.print("Minuto: ");
		valor = sc.nextInt(); //leemos un valor para los minutos
		h.setMinuto(valor); //asignamos un valor para los minutos

		System.out.print("Segundo: ");
		valor = sc.nextInt(); //leemos un valor para los segundos
		h.setSegundo(valor); //asignamos un valor para los segundos

		System.out.print("¿Cuántos segundos quiere mostrar: ");
		int numSegundos = sc.nextInt();
		//mostramos la hora
		h.mostrarHora(numSegundos);
	}
}