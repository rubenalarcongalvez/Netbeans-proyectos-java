//Realiza una programa que calcule las horas transcurridas entre dos horas de
//dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
//El día de la semana se puede pedir como un número (del 1 al 7) o como una
//cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
//los datos correctamente y que el segundo día es posterior al primero.
//Ejemplo:
//Por favor, introduzca la primera hora.
//Día: lunes
//Hora: 18
//Por favor, introduzca la segunda hora.
//Día: martes
//Hora: 20
//Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
package refuerzo_ejercicio30;

import java.util.Scanner;

public class Refuerzo_Ejercicio30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora1 = 0, hora2 = 0, diaNumerico1 = 0, diaNumerico2 = 0, horaTotal1 = 0, horaTotal2 = 0;
		
		System.out.println("Te diré las horas transcurridas entre dos horas de dos días de la semana:");

		//Primer día y primera hora
		System.out.print("Introduce el primer día (sin acentos): ");
		String dia1 = sc.next().toLowerCase();
		switch (dia1) {
			case "lunes" ->
				diaNumerico1 = 1;
			case "martes" ->
				diaNumerico1 = 2;
			case "miercoles" ->
				diaNumerico1 = 3;
			case "jueves" ->
				diaNumerico1 = 4;
			case "viernes" ->
				diaNumerico1 = 5;
			case "sabado" ->
				diaNumerico1 = 6;
			case "domingo" ->
				diaNumerico1 = 7;
		}
		
		//Definir la hora correctamente 1
		do {
		System.out.print("Introduce la primera hora: ");
		hora1 = sc.nextInt();	
		} while (hora1 > 23);

		//Horas total 1 -- Se puede hacer más simple con un if y multiplicando diaNumerico1 * 24, pero pide meter algún bucle
		for (int contador = diaNumerico1; contador >= 1; contador--) {
			horaTotal1 += 24;
		}
		horaTotal1 += hora1;
		
		//Segundo día y segunda hora
		System.out.print("Introduce el segundo día: ");
		String dia2 = sc.next().toLowerCase();
		switch (dia2) {
			case "lunes" ->
				diaNumerico2 = 1;
			case "martes" ->
				diaNumerico2 = 2;
			case "miercoles" ->
				diaNumerico2 = 3;
			case "jueves" ->
				diaNumerico2 = 4;
			case "viernes" ->
				diaNumerico2 = 5;
			case "sabado" ->
				diaNumerico2 = 6;
			case "domingo" ->
				diaNumerico2 = 7;
		}

		//Definir la hora correctamente 2
		do {
		System.out.print("Introduce la segunda hora: ");
		hora2 = sc.nextInt();	
		} while (hora2 > 23);
		
		//Horas total 2 -- Se puede hacer más simple con un if y multiplicando diaNumerico2 * 24, pero pide meter algún bucle
		for (int contador = diaNumerico2; contador >= 1; contador--) {
			horaTotal2 += 24;
		}
		horaTotal2 += hora2;
		
		if (diaNumerico1 > diaNumerico2) {
			horaTotal2 += (24*7); //1 semana más
		}
		
		int horas = horaTotal2 - horaTotal1;
		
		System.out.println("Entre las " + hora1 + ":00h del " + dia1 + " y las " + hora2 + ":00h del " + dia2 + " hay " + horas + " hora/s.");
	}
}