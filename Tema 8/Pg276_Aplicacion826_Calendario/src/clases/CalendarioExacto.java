/*
A partir de la clase Calendario, implementada en la Actividad de aplicación 7.15, es-	
cribe la clase CalendarioExacto, que determina un instante de tiempo exacto forma-	
do por un año, un mes, un dia, una hora y un minuto. Implementa los métodos toString(),
equals() y aquellos necesarios para manejar la clase.	
 */
package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class CalendarioExacto extends Calendario {

	private int hora;
	private int minuto;

	public CalendarioExacto(int ano, int mes, int dia, int hora, int minuto) {
		super(ano, mes, dia);

		if (hora <= 23 && hora >= 0) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}

		if (minuto <= 59 && minuto >= 0) {
			this.minuto = minuto;
		} else {
			this.minuto = 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " " + hora + ":" + minuto;
	}

	@Override
	public boolean equals(Object otraFecha) {
		boolean sonIguales = false;

		if (super.equals(otraFecha) == true) {
			String fecha = hora + ":" + minuto;

			CalendarioExacto otroCalendario = (CalendarioExacto) otraFecha;
			String fechaDistinta = otroCalendario.hora + ":" + otroCalendario.minuto;

			if (fecha.equals(fechaDistinta)) {
				sonIguales = true;
			}
		}

		return sonIguales;
	}
}
