/*
Implementa una aplicación que mantenga un registro de las temperaturas máxima y mi-	
nima diarias medidas en una estación meteorológica. Los datos se guardarán en un ar-
chivo de texto con el siguiente formato:	

Fecha			Temperatura máxima	Temperatura minima	
2020-01-15				12					-1	
2020-01-16				15					 2
...

Al arrancar la aplicación aparecerá un menú con las opciones:	
1. Registrar nueva temperatura.	
2. Mostrar historial de registros.	
3. Salir.

El historial de registros mostrará todos los datos registrados junto con el máximo valor	
de las temperaturas máximas y el minimo de las temperaturas mínimas.	
 */
package clases;

import java.time.LocalDate;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Temperatura {

	private LocalDate fecha;
	private int maxima;
	private int minima;

	public Temperatura(String fecha, int maxima, int minima) {
		this.fecha = LocalDate.parse(fecha); //Formato por defecto el que pide el libro
		this.maxima = maxima;
		this.minima = minima;
	}

	@Override
	public String toString() {
		String resultado = fecha + "\t\t\t";

		if (maxima <= 0) {
			resultado += maxima;
		} else {
			resultado += " " + maxima;
		}
		
		resultado += "\t\t\t\t";
		
		if (minima > 0) {
			resultado += " " + minima;
		} else {
			resultado += minima;
		}

		return resultado;
	}

}
