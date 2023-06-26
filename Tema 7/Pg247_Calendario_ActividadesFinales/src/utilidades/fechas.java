package utilidades;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class fechas {

	public static boolean validarFecha(int ano, int mes, int dia) {
		boolean valida = true;

		//Definimos rangos
		if (ano > 0 && mes > 0 && mes <= 12 && dia > 0 && dia <= 31) {
			//Dependiendo del mes, verificamos el día
			switch (mes) {
				case 2 -> { //Si es bisiesto, febrero tiene que tener 29 días. Si no lo es, 28
					if (ano % 4 == 0 || ano % 400 == 0) {
						if (dia > 29) {
							valida = false;
						}
					} else {
						if (dia > 28) {
							valida = false;
						}
					}
				}
				case 4,6,9,11 -> { //Meses con 30 días
					if (dia > 30) {
						valida = false;
					}
				}
				//No hace falta poner los meses con 31 días (default) porque ya ajustamos el límite ahí
			}
		} else {
			valida = false;
		}
		return valida;
	}
}