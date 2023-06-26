/*
Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de O	
a 23) y los minutos. Dispone de los métodos:	

- Hora(hora, minuto), que construye un objeto con los datos pasados como pará-	
metros.	

- void inc(), que incrementa la hora en un minuto.	

- boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos.	
Devuelve true o false según haya sido posible modificar los minutos o no.	

- boolean setHora(valor), que asigna un valor, si está comprendido entre O y 23,	
a la hora. Devuelve true o false según haya sido posible cambiar la hora o no.	

- String toString(), que devuelve un string con la representación de la hora.
 */
package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Hora {

	protected int hora, minutos;

	public Hora(int hora, int minutos) {
		if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60) {
			this.hora = 0; //valores por defecto
			this.minutos = 0;

			if (!setHora(hora)) { //usamos métodos de asignación, que comprueban los valores
				System.out.println("La hora es incorrecta");
			}

			if (!setMinutos(minutos)) {
				System.out.println("Los minutos no son válidos");
			}
		}
	}

	public void inc() { //incrementa la hora +1 minuto
		minutos++;
		if (minutos < 59) { //comprobamos si los minutos sobrepasan 59
			minutos = 0; //reiniciamos los minutos a 0
			hora++; //e incrementamos la hora
			if (hora > 23) { //si la hora es mayor a 23 (algo que no tiene sentido)
				hora = 0; //reiniciamos la hora a 0
			}
		}
	}

	public boolean setMinutos(int minutos) {
		boolean correcto = false;
		if (0 <= minutos && minutos < 60) { //solo modificamos si valor está en 0..59
			this.minutos = minutos;
			correcto = true;
		}
		return correcto;
	}

	public boolean setHora(int hora) {
		boolean correcto = false;
		if (0 <= hora && hora < 24) { //solo modificamos si el valor está entre 0..23
			this.hora = hora;
			correcto = true;
		}
		return correcto;
	}
	
	@Override //indica que estamos sustituyendo (overriding) el método
	public String toString() {
		String result;
		result = hora + ":" + minutos;
		return result;
	}
}