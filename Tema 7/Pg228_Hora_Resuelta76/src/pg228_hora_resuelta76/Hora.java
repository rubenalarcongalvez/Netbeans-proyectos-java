/*La clase Hora es muy simple y dispone de los atributos: hora, minuto y segundo.	
Estos serán privados y, para acceder a ellos, usaremos métodos set/get.	
Internamente vamos a utilizar el tipo byte para almacenar los atributos, pero desde	
fuera de la clase nos interesa dar la sensación de que los atributos son int:	
estamos ocultando la verdadera implementación.	
No escribimos ningún constructor, */
package pg228_hora_resuelta76;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Hora {

	private byte hora; //atributos de tipo byte: más que suficiente para los valores
	private byte minuto; //que tenemos que guardar
	private byte segundo;

	public int getHora() {
		return hora; //devuelve la hora	
	}

	public void setHora(int hora) {
		if (0 <= hora && hora <= 23) { //la hora está comprendida en el rango 0..23
			this.hora = (byte) hora;
		} else {
			this.hora = 0; //si el valor está fuera de rango, lo ponemos a 0
		}
	}

	public int getMinuto() {
		return minuto; //devuelve los minutos
	}

	public void setMinuto(int minuto) { //los minutos están comprendidos de 0..59
		if (0 <= minuto && minuto <= 59) {
			this.minuto = (byte) minuto;
		} else {
			this.minuto = 0; //si el valor está fuera de rango lo ponemos a 0
		}
	}

	public byte getSegundo() {
		return segundo; //devuelve los segundos
	}

	public void setSegundo(int segundo) { //los segundos están comprendidos de 0..59
		if (0 <= segundo && segundo <= 59) {
			this.segundo = (byte) segundo;
		} else {
			this.segundo = 0; //si el valor está fuera de rango lo ponemos a 0
		}
	}

	public void incrementaSegundo() {
		segundo++; //incrementamos los segundos

		if (segundo == 60) { //si los segundos alcanzan un valor de 60
			segundo = 0; //reiniciamos los segundos
			minuto++; //e incrementamos los segundos
			
			if (minuto == 60) { //si los minutos alcanzan un valor de 60
				minuto = 0; //reiniciamos los minutos
				hora++; //e incrementamos las horas
				
				if(hora == 24) { //si la hora alcanza un valor de 24
					hora = 0; //reiniciamos las horas
				}
			}
		}
	}
	
	public void mostrarHora(int numSegundos) {
		for (int i = 0; i < numSegundos; i++) {
			//mostramos la hora
			System.out.println(this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo());
			this.incrementaSegundo(); //incrementamos la hora actual en un segundo
		}
	}
}
