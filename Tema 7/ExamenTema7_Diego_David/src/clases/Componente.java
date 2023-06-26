package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Componente {

	private static int contador = 0;
	private String codigo = "CP-";
	private int longitud;
	private int altitud;

	//El valor por defecto de los int es 0, por lo que si no es válido, ese será el valor del constructor
	public Componente(int longitud, int altitud) {
		this.contador++;
		this.codigo += this.contador;

		if (longitud > 0) {
			this.longitud = longitud;
		}

		if (altitud > 0) {
			this.altitud = altitud;
		}
	}

	//Devuelve la superficie
	int superficie() {
		int totalPixeles = this.longitud * this.altitud;
		
		return totalPixeles;
	}
	
	@Override
	public String toString() {
		return "Codigo: " + codigo + "\nLongitud: " + longitud + "\nAltitud: " + altitud + "\nTotal Pixeles: " + superficie();
	}
}