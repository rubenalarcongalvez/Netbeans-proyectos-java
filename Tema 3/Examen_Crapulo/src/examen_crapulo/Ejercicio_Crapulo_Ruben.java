//Un numero crapulo es la suma de los digitos que lo conforman,
//si la suma exede 10… se vuelven a sumar los digitos de la primera suma resultante y asi sucesivamente….
package examen_crapulo;

import java.util.Scanner;

public class Ejercicio_Crapulo_Ruben {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.print("Dame un número entero cualquiera: ");
		numero = sc.nextInt();

		if (numero < 0) {
			numero *= -1;
		}

		int suma = 0, resto = 0;

		while (numero > 0 || suma > 10) {
			resto = numero % 10;
			numero = numero / 10;

			suma = suma + resto;
			if (suma > 10 && numero <= 0) {
				numero = suma;
				suma = 0;
			}
		}
		System.out.println("Su crápulo es: " + suma);
	}
}
