/* 8.2
A partir de la clase Hora implementar la clase HoraExacta, que incluye en la hora los se-	
gundos. Además de los métodos heredados de Hora, dispondrá de:

- HoraExacta(hora, minuto, segundo), que construye un objeto con los datos	
pasados como parámetros.	

- setSegundo(valor), que asigna, si está comprendido entre 0 y 59, el valor indicado	
a los segundos.	

- inc(), que incrementa la hora en un segundo.
 */

 /* 8.3
Añadir a la clase HoraExacta un método que compare si dos horas (la invocante y otra pa-	
sada como parámetro de entrada al método) son iguales o distintas.	
 */

/* Propuesto por el profesor
Ocultar el atributo Hora para que se muestre como AM o PM
Desde el programa principal podemos imprimir la HoraExacta en formato AM/PM y otro en formato 24h
*/

package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class HoraExacta extends Hora { //heredamos de la clase Hora

	protected String hora;
	protected int segundos; //añadimos un atributo para los segundos

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos); //aprovechamos el constructor de la superclase (siempre hay que llamar a un constructor que hereda)
		//this.segundos = segundos; //permitiría asignar cualquier valor a los segundos
		if (!setSegundos(segundos)) { //mejor usar el método para asignar valores
			System.out.println("Segundos incorrectos");
		}
	}
	
	public HoraExacta(String sHora, int minutos, int segundos) {
		this(0, minutos, segundos); //Hay que crear el constructor para ello, que llama al constructor de esta clase, que a su vez llama al super
		int auxHora = Integer.parseInt(sHora.substring(0, 2));
		
		if((sHora.substring(2).compareToIgnoreCase("AM")) == 0) {
			if ((auxHora) == 12) auxHora = 0;
		} else if((sHora.substring(2).compareToIgnoreCase("PM")) == 0) {
			if ((auxHora) != 12) auxHora = 12;
		}
		
		this.hora = sHora;
		if (!super.setHora(auxHora)) System.out.println("Horas incorrectas ");
		if (!setSegundos(segundos)) System.out.println("Segundos incorresctos ");
	}

	//añadimos un método que asigna los segundos
	public boolean setSegundos(int segundos) {
		boolean correcto = false;
		if (0 <= segundos && segundos < 60) { //si está en un rango válido
			this.segundos = segundos; //modificamos segundos
			correcto = true;
		}
		return correcto;
	}

	@Override //sustituimos el método para incrementar segundos en lugar de minutos
	public void inc() {
		segundos++;
		if (segundos > 59) { //si los segundos son mayores que 59
			segundos = 0; //inicializamos los segundos
			super.inc(); //+1 con el método inc() de la superclase, que incrementa minutos
		}
	}

	@Override //sustituimos toString() para mostrar los segundos
	public String toString() {
		String result = super.toString(); //utilizamos toString() de la superclase
		result += ":" + segundos; //añadimos los segundos
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;

		HoraExacta he = (HoraExacta) obj;

		if (this.hora == he.hora && this.minutos == he.minutos && this.segundos == he.segundos) {
			iguales = true;
		}

		return iguales;
	}
}