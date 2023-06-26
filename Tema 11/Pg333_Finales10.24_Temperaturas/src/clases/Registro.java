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

import java.util.Arrays;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Registro {
	private Temperatura[] registro;
	private int maximoAbsoluto;
	private int minimoAbsoluto;

	public Registro() {
		this.registro = new Temperatura[0];
		//Ponemos los valores para que cualquiera pueda reemplazarlo porque por defecto está puesto el 0
		maximoAbsoluto = Integer.MIN_VALUE;
		minimoAbsoluto = Integer.MAX_VALUE;
	}
	
	public void insertarTemperatura(String fecha, int maxima, int minima) {
		registro = Arrays.copyOf(registro, registro.length + 1);
		registro[registro.length -1] = new Temperatura(fecha, maxima, minima); //Creamos una nueva temperatura
		
		//Asignamos valores máximos y mínimos absolutos
		if (maxima > maximoAbsoluto) maximoAbsoluto = maxima;
		if (minima < minimoAbsoluto) minimoAbsoluto = minima;
	}

	@Override
	public String toString() {
		String resultado = "Fecha\t\t\tTemperatura máxima\t\tTemperatura mínima\n";
		
		for (Temperatura temperatura : registro) {
			resultado += temperatura + "\n";
		}
		
		if (maximoAbsoluto != Integer.MIN_VALUE) resultado += "\nTemperatura máxima: " + maximoAbsoluto + "\n";
		if (minimoAbsoluto != Integer.MAX_VALUE) resultado += "Temperatura mínima: " + minimoAbsoluto;
		
		return resultado;
	}
	
}