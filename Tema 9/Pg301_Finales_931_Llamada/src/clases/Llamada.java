/*
En una compañía de telecomunicaciones se desean registrar los datos de todas las lla-	
madas de sus clientes. 

Implementar la clase Llamada, que guardará los siguientes datos:	
Número de teléfono del cliente, número del interlocutor, atributo booleano que indique si	
la llamada es saliente, fecha y hora del inicio de la llamada y del fin, atributo enumerado	
que indique la zona del interlocutor (suponer cinco zonas con tarifas distintas) y tabla de	
constantes con las tarifas de las zonas en céntimos de euro/minuto.

En la clase se establecerá un orden natural compuesto basado en el número
del teléfono del cliente como primer criterio y en la fecha y hora de inicio como segundo criterio.
Asimismo, se implementará un método que devuelva la duración en minutos de la llamada y otro
que calcule su coste, si es saliente. Por último, implementar el método tostring(), que muestre	
los dos números de teléfono, la fecha y hora del inicio, la duración y el coste.	
*/

package clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Llamada implements Comparable<Llamada> {
	private int numTlf;
	private int numInterlocutor;
	private boolean saliente;
	private LocalDateTime FechaHoraInicio;
	private LocalDateTime FechaHoraFin;
	//El enum directamente lo ponemos como array de posiciones
	private static final int [] tablaTarifasMinuto = {23, 10, 90, 50, 45};

	public Llamada(int numTlf, int numInterlocutor, boolean saliente, String FechaHoraInicio, String FechaHoraFin) {
		this.numTlf = Math.abs(numTlf);
		this.numInterlocutor = Math.abs(numInterlocutor);
		this.saliente = saliente;
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm");
		
		this.FechaHoraInicio = LocalDateTime.parse(FechaHoraInicio, dtf);
		this.FechaHoraFin = LocalDateTime.parse(FechaHoraFin, dtf);
	}
	
	public int duracionMinutos() {
		return (int) this.FechaHoraInicio.until(FechaHoraFin, ChronoUnit.MINUTES);
	}
	
	public double costeLlamada() {
		double coste = 0;
		
		if (this.saliente == true) {
			
		}
		
		return coste;
	}

	@Override
	public int compareTo(Llamada call) {
		int resultado = this.numTlf - call.numTlf;
		
        if(resultado == 0) {
            resultado = this.FechaHoraInicio.compareTo(call.FechaHoraInicio);
        }
		
        return resultado;
	}
	
}