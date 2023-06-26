/*
Enunciado
 */
package pkg1.pruebas;

import clases.*;
import java.text.DecimalFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pruebas {

	public static void main(String[] args) {
		Sonido son = new Sonido() {
			@Override
			public void voz() {
				System.out.println("¡Jajejijojuuuu!");
			}
		}; //Termina en ;
		son.voz(); //Muestra "¡Jajejijojuuuu!"

		double redondeaAMilesima = .2;

		DecimalFormat formateador = new DecimalFormat("#0.000");

		System.out.println(formateador.format(redondeaAMilesima));

		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).localizedBy(Locale.getDefault());

		System.out.println("fechaLocal = " + LocalDate.now());

		Clock timezone = Clock.systemDefaultZone();
		System.out.println("timezone = " + timezone);
		
		Scanner sc = new Scanner(System.in, "ISO_8859_1").useLocale(Locale.US);
		
		double test = sc.nextDouble();
		
		System.out.println(test);
		
		int[] tabla = new int[5];
		System.out.print("Introducir serie de 5 números enteros: ");
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			tabla[i] = n;
		}
		System.out.println("Comprobamos: " + Arrays.toString(tabla));
	}
}
