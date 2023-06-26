/* 8.13
La empresa de mensajeria BiciExpress, que reparte en bicicleta, para disminuir el peso	
que transportan sus empleados solo utiliza cajas de cartón. El volumen de estas se calcu-	
la como el 80% del volumen real, con el fin de evitar que se deformen y se rompan. Otra	
caracteristica de las cajas de cartón es que sus medidas siempre están en centimetros.	
Por último, la empresa, para controlar costes, necesita saber cuál es la superficie total de	
cartón utilizado para construir todas las cajas.	
Escribe la clase Cajacarton heredando de la clase Caja.	
 */
package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CajaCarton extends Caja {

	private final int superficie;

	public CajaCarton(int ancho, int alto, int fondo) {
		super(ancho, alto, fondo, Unidad.CM);

		superficie = 2 * (ancho * alto + ancho * fondo + alto * fondo);
	}

	@Override
	public double getVolumen() {
		return volumen = (super.getVolumen() * 80) / 100;
	}
	
	@Override
	public String toString() {
		String caja = super.toString();

		caja += "\nSuperficie: " + superficie + Unidad.CM;
		
		return caja;
	}
}