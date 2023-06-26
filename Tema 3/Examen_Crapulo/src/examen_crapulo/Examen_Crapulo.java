package examen_crapulo;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Examen_Crapulo {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero, digito, resultado = 0;

        do {
            System.out.print("Dame un número natural cualquiera: ");
            numero = sc.nextInt();
        } while (numero < 0);

        while (numero > 0) {
            digito = numero % 10;
            resultado += digito;
            numero /= 10;
        }
        numero = resultado;
        resultado = 0;
        while (numero > 0) {
            digito = numero % 10;
            resultado += digito;
            numero /= 10;
        }
        System.out.println("resultado = " + resultado);
    }
}
