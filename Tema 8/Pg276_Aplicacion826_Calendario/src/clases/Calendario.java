package clases;

import utilidades.fechas;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Calendario {

	protected int ano;
	protected int mes;
	protected int dia;

	//Constructor
	public Calendario(int ano, int mes, int dia) {
		if (fechas.validarFecha(ano, mes, dia)) { //Si es true
			this.ano = ano;
			this.mes = mes;
			this.dia = dia;
		} else {
			System.out.println("Fecha no válida");
		}
	}

	public void setAno(int ano) {
		if (ano > 0) {
			this.ano = ano;
		} else {
			System.out.println("Año no válido. No se asignará");
		}
	}

	public void setMes(int mes) {
		if (mes > 0 && mes <= 12) {
			this.mes = mes;
		} else {
			System.out.println("Mes no válido. No se asignará");
		}
	}

	public void setDia(int dia) {
		//Dependiendo del mes, verificamos el día
		switch (mes) {
			case 2 -> { //Si es bisiesto, febrero tiene que tener 29 días. Si no lo es, 28
				if (ano % 4 == 0 || ano % 400 == 0) {
					if (dia <= 29) {
						this.dia = dia;
					} else {
						System.out.println("Día no válido. No se asignará");
					}
				} else {
					if (dia <= 28) {
						this.dia = dia;
					} else {
						System.out.println("Día no válido. No se asignará");
					}
				}
			}
			case 4,6,9,11 -> { //Meses con 30 días
				if (dia <= 30) {
					this.dia = dia;
				} else {
					System.out.println("Día no válido. No se asignará");
				}
			}
			default -> { //Los meses restantes con 31 días
				if (dia <= 31) {
					this.dia = dia;
				} else {
					System.out.println("Día no válido. No se asignará");
				}
			}
		}
	}

	public int getAno() {
		return ano;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	@Override
	public String toString() {
		return "Fecha: " + ano + "-" + mes + "-" + dia;
	}

	public void incrementarDia() {
		//Definimos rangos
		if (ano > 0 && mes > 0 && mes <= 12 && dia > 0 && dia <= 31) {
			//Dependiendo del mes, verificamos el día
			switch (mes) {
				case 2 -> { //Si es bisiesto, febrero tiene que tener 29 días. Si no lo es, 28
					if (ano % 4 == 0 || ano % 400 == 0) {
						if (dia == 29) {
							dia = 1;
							mes++;
						} else {
							dia++;
						}
					} else {
						if (dia == 28) {
							dia = 1;
							mes++;
						} else {
							dia++;
						}
					}
				}
				case 4,6,9,11 -> { //Meses con 30 días
					if (dia == 30) {
						dia = 1;
						mes++;
					} else {
						dia++;
					}
				}
				case 12 -> { //Último mes
					if (dia == 31) {
						dia = 1;
						mes = 1;
						ano++;
					} else {
						dia++;
					}
				}
				default -> { //Los meses restantes con 31 días
					if (dia == 31) {
						dia = 1;
						mes++;
					} else {
						dia++;
					}
				}
			}
		}
	}

	public void incrementarMes() {
		//Hacemos una tabla para comparar los días que tiene el mes base con el mes siguiente
		int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		//Si es bisiesto, tiene 29 días, si no, 28
		if (ano % 4 == 0 || ano % 400 == 0) {
			diasMes[1] = 29;
		}

		if (mes == 12) {
			//No ponemos ningún if dentro porque diciembre y enero tienen ambos 31 días
			mes = 1;
			ano++;
		} else {
			if (dia > diasMes[mes]) { //Si el día del mes en el que estamos es mayor al mes siguiente
				dia -= diasMes[mes];
				mes++;
			}
			mes++;
		}
	}

	public void incrementarAno() {
		if (ano > 0) {
			ano++;

			//Si es bisiesto y le sumamos 1 año, estaremos en el 1 de marzo del año siguiente
			if (mes == 2 && dia == 29) {
				dia = 1;
				mes = 3;
			}
		}
	}

	@Override
	public boolean equals(Object otraFecha) {
		boolean sonIguales = false;

		String fecha = ano + "-" + mes + "-" + dia;
		
		Calendario otroCalendario = (Calendario) otraFecha;
		String fechaDistinta = otroCalendario.ano + "-" + otroCalendario.mes + "-" + otroCalendario.dia;

		if (fecha.equals(fechaDistinta)) {
			sonIguales = true;
		}

		return sonIguales;
	}

	//Averiguar el número de días en un calendario
	public long diasTotales() {
		//Hacemos una tabla para comparar los días que tiene el mes base con el mes siguiente
		long[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		//Si es bisiesto, tiene 29 días, si no, 28
		if (ano % 4 == 0 || ano % 400 == 0) {
			diasMes[1] = 29;
		}

		long numDias = (ano * 365) + dia;

		for (int i = mes - 2; i >= 0; i--) { //mes - 2 porque el array empieza en 0 y el mes actual solo tiene los días de "dia"
			numDias += diasMes[i];
		}

		return numDias;
	}

	//Comparar quién es el mayor y quién el menor. Y aprovechar la función diasTotales para hacer la diferencia entre ambas
	public void compararCalendarios(Calendario otroCal) {
		long diferenciaDias = 0;

		if (!(equals(otroCal))) {
			if (diasTotales() > otroCal.diasTotales()) {
				System.out.println(this.ano + "-" + this.mes + "-" + this.dia + " es mayor que " + otroCal.ano + "-" + otroCal.mes + "-" + otroCal.dia);
				diferenciaDias = diasTotales() - otroCal.diasTotales();
				System.out.println("Diferencia de días entre ellos: " + diferenciaDias);
			} else {
				System.out.println(otroCal.ano + "-" + otroCal.mes + "-" + otroCal.dia + " es mayor que " + this.ano + "-" + this.mes + "-" + this.dia);
				diferenciaDias = otroCal.diasTotales() - diasTotales();
				System.out.println("Diferencia de días entre ellos: " + diferenciaDias);
			}
		}
	}
}