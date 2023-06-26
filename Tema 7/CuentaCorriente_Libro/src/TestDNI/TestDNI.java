/*
Validar DNI
*/

package TestDNI;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class TestDNI {
	public static String validarDNI(String dni) {
		String CuentaCorrienteDNI = "";

		//Creamos la1 tabla con la que vamos a comparar
		char [] relacionesDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', };
		
		int numeroDNI = Integer.parseInt(dni.substring(0, 8)); //Obtenemos solo el número de DNI
		
		int letraNumerica = numeroDNI % 23; //Obtenemos la posición de la tabla en la que estará la letra correcta
		
		String letraReal = String.valueOf(relacionesDNI[letraNumerica]); //Ahora lo transformamos a letra y a String
		
		//Podemos poner incluso el mismo formato para todo (45751268-F, por ejemplo)
		if (dni.substring(8).equalsIgnoreCase(letraReal)) { //Si no tiene guión y la letra coincide
			CuentaCorrienteDNI = dni.toUpperCase() + "\b-" + letraReal; //Borramos la letra para añadirle antes un guión
		} else if ((dni.substring(8)).equalsIgnoreCase("-" + letraReal)) { //Si tiene guión y la letra coincide
			if (dni.substring(9).equalsIgnoreCase(letraReal)) {
				CuentaCorrienteDNI = dni.toUpperCase();
			}
		}
		return CuentaCorrienteDNI;
	}
}