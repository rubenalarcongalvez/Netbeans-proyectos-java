/*
Las empresas de transporte, para evitar daños en los paquetes, embalan todas sus mer-	
cancías en cajas con el tamaño adecuado. Una caja se crea expresamente con un ancho,	
un alto y un fondo y, una vez creada, se mantiene inmutable. Cada caja lleva pegada una	
etiqueta, de un máximo de 30 caracteres, con información útil como el nombre del des-	
tinatario, dirección, etc. Implementa la clase Caja con los siguientes métodos:	

- Caja(int ancho, int alto, int fondo, Unidad unidad): que construye una caja	
con las dimensiones especificadas, que pueden encontrarse en «cm» (centimetros)o	
m(metros).	

- double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.	

- void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de la caja.

- String tostring(): que devuelve una cadena con la representación de la caja.	
 */
package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Caja { //Se pasa de final a abstract para que pueda heredar CajaCarton

	private static int contador = 0;
	private final double ancho, alto, fondo;
	double volumen;
	private final Unidad unidad;
	private String etiqueta;

	public Caja(int ancho, int alto, int fondo, Unidad unidad) {
		contador++;

		if (ancho >= 0) {
			this.ancho = ancho;
		} else {
			this.ancho = 0;
		}

		if (alto >= 0) {
			this.alto = alto;
		} else {
			this.alto = 0;
		}

		if (fondo >= 0) {
			this.fondo = fondo;
		} else {
			this.fondo = 0;
		}

		this.unidad = unidad;

		this.volumen = getVolumen();
	}

	public double getVolumen() {
		if (unidad == Unidad.CM) {
			return (ancho / (double) 100) * (alto / (double) 100) * (fondo / (double) 100);
		} else {
			return (double) alto * ancho * fondo;
		}
	}

	public void setEtiqueta(String etiqueta) {
		if (etiqueta.length() > 30) {
			this.etiqueta = etiqueta.substring(0, 29);
		} else {
			this.etiqueta = etiqueta;
		}
	}

	@Override
	public String toString() {
		String caja = "";

		caja += "Caja " + contador + ":\n";
		caja += "Ancho: " + ancho + unidad + "\n";
		caja += "Alto: " + alto + unidad + "\n";
		caja += "Fondo: " + fondo + unidad + "\n";
		caja += "Volumen: " + volumen + Unidad.M + "\n";
		caja += "Etiqueta: " + etiqueta;

		return caja;
	}
}