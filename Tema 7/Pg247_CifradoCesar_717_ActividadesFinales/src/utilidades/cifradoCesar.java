package utilidades;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class cifradoCesar {

	public static String cifrarTexto(String texto, byte distanciaCifrado) {
		//Creamos un array de caracteres con toda la frase String
		char[] caracteres = texto.toCharArray();

		//Para cada caracter, se le aumenta n numeros
		for (int i = 0; i < caracteres.length; i++) {

			if (caracteres[i] >= 65 && caracteres[i] <= 90) {
				caracteres[i] += distanciaCifrado;
				while (caracteres[i] > 90) { //Para evitar números muy grandes que puedan descuadrar se usa while
					caracteres[i] = (char) ((caracteres[i] - 90) + 64); //Para que pueda empezar en A
				}
			}

			if (caracteres[i] >= 97 && caracteres[i] <= 122) {
				caracteres[i] += distanciaCifrado;
				while (caracteres[i] > 122) { //Para evitar números muy grandes que puedan descuadrar se usa while
					caracteres[i] = (char) ((caracteres[i] - 122) + 96); //Para que pueda empezar en a
				}
			}

		}
		
		return (texto = String.valueOf(caracteres));
	}
	
	public static String descifrarTexto(String texto, byte distanciaCifrado) {
		//Creamos un array de caracteres con toda la frase String
		char[] caracteres = texto.toCharArray();

		//Para cada caracter, se le aumenta n numeros
		for (int i = 0; i < caracteres.length; i++) {

			if (caracteres[i] >= 65 && caracteres[i] <= 90) {
				caracteres[i] -= distanciaCifrado;
				while (caracteres[i] < 65) { //Para evitar números muy chicos que puedan descuadrar se usa while
					caracteres[i] = (char) ((90 - (64 - caracteres[i]))); //Para que pueda empezar en Z
				}
			}

			if (caracteres[i] >= 97 && caracteres[i] <= 122) {
				caracteres[i] -= distanciaCifrado;
				while (caracteres[i] < 97) { //Para evitar números muy chicos que puedan descuadrar se usa while
					caracteres[i] = (char) ((122 - (96 - caracteres[i]))); //Para que pueda empezar en z
				}
			}

		}
		
		return (texto = String.valueOf(caracteres));
	}
}