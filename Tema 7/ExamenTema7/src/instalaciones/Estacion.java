package instalaciones;

import personal.*;
import maquinaria.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Estacion {

	private JefeEstacion jefeEstacion;
	private int numeroMaximoTrenes;
	private int numTrenes;
	private Tren[] trenes;

	public Estacion(JefeEstacion jefeEstacion, int numeroMaximoTrenes) {
		//Mínimo de trenes = 5

		if (numeroMaximoTrenes < 5) {
			System.out.println("No puede haber menos de 5 trenes. Tienes que añadir más antes.");
		} else {
			this.numeroMaximoTrenes = numeroMaximoTrenes;
			this.trenes = new Tren[numeroMaximoTrenes];
			this.jefeEstacion = jefeEstacion;
		}
	}

	public Estacion(JefeEstacion jefeEstacion) {
		//Máximo de trenes = 5

		if (numTrenes > 5) {
			System.out.println("No puede haber más de 5 trenes. La operación no se realizará.");
		} else {
			this.numeroMaximoTrenes = 5;
			this.trenes = new Tren[numeroMaximoTrenes];
			this.jefeEstacion = jefeEstacion;
		}
	}

	public int numeroTrenes() {
		return this.numTrenes;
	}

	public boolean llegadaTren(Tren trenLlega) {
		boolean llega = true;
		
		if (this.numTrenes >= numeroMaximoTrenes) {
			llega = false;
		} else {
			this.trenes[numTrenes] = trenLlega;
			
			this.numTrenes++;
		}
		return llega;
	}
	
	public Tren salidaTren() {
		Tren sale = null;
		
		if (this.numTrenes > 0) {
			this.numTrenes--;
			
			sale = this.trenes[0];
			
			Tren [] nuevaEstacion = new Tren[this.numeroMaximoTrenes];
			
			System.arraycopy(this.trenes, 1, nuevaEstacion, 0, nuevaEstacion.length);
		}
		
		return sale;
	}
	
	public int potenciaTrenesEstacion() {
		int potencia = 0;
		
		for (int i = 0; i < this.numTrenes; i++) {
			potencia += this.trenes[i].getLocomotora().getPotencia(); //Para obtener la potencia de la locomotora
		}
		
		return potencia;
	}
	
	public int numeroVagonesEstacion() {
		int numVagones = 0;
		
		for (int i = 0; i < this.numTrenes; i++) {
			numVagones += this.trenes[i].getNumeroVagones(); //Para obtener el número de vagones del tren
		}
		return numVagones;
	}
	
	public String nombreMaquinistasEstacion() {
		String nombres = "";
		
		for (int i = 0; i < this.numTrenes; i++) {
			nombres += " - " + this.trenes[i].getResponsable().getNombre(); //Para obtener a el nombre del maquinista (responsable)
		}
		return nombres;
	}
}