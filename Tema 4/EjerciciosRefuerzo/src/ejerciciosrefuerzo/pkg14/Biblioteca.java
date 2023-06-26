/*
Crea una biblioteca de funciones matemáticas que contenga las siguientes	
funciones. Recuerda que puedes usar unas dentro de otras si es necesario.	
Observa bien lo que hace cada función ya que, si las implementas en el orden	
adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua	
resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de	
implementar teniendo esPrimo.
 */
package ejerciciosrefuerzo.pkg14;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Biblioteca {

	//1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
	static boolean esCapicua(int n) {
		boolean capicua = n == voltea(n);
		return capicua;
	}

	//2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.	
	static boolean esPrimo(int n) {
		boolean primo = true;
		for (int contador = 2; contador <= Math.sqrt(n); contador++) {	//Si un numero no es divisible por ningun numero hasta su raiz
			//cuadrada, será primo, sin necesidad de probar los demas
			if (n % contador == 0) {
				primo = false;
			}
		}
		return primo;
	}

	//3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.	
	static int siguientePrimo(int n) {
		//Si n = 8, el siguiente primo será 11
		while (!esPrimo(n)) {
			n++;
		}
		return n;
	}

	//4. potencia: Dada una base y un exponente devuelve la potencia.	
	static int potencia(int base, int exponente) {
		int resultado;

		if (exponente == 0) {
			resultado = 1;
		} else {
			resultado = base;
			while (exponente > 1) {
				resultado = resultado * base;
				exponente--;
			}
		}
		return resultado;
	}

	//5. digitos: Cuenta el número de digitos de un número entero.
	static int digitos(int n) {
		int numero = n, cantidad = 0;

		while (numero > 0) {
			numero /= 10;
			cantidad++;
		}
		return cantidad;
	}

	//6. voltea: Le da la vuelta a un número.
	static int voltea(int n) {
		int volteado = 0;
		int cantidad = digitos(n);

		while (n > 0) {
			cantidad--;
			volteado += potencia(10, cantidad) * (n % 10);
			n /= 10;
		}

		return volteado;
	}

	//7. digitoN: Devuelve el dígito que está en la posición n de un número entero. 
	//Se empieza contando por el 0 y de izquierda a derecha.	
	static int digitoN(int numero, int posicion) {
		int digito = 0;
		int volteado = voltea(numero);

		for (int contador = 0; contador < posicion; contador++) {
			digito = volteado % 10;
			volteado /= 10;
		}

		return digito;
	}

	//8. posicion DeDigito: Da la posición de la primera ocurrencia de un dígito	
	//dentro de un número entero. Si no se encuentra, devuelve -1.	
	static int posicionDeDigito(int numero, int digito) {
		int posicion = digitos(numero);

		while (numero > 0 && (numero % 10 != digito)) {
			posicion--;
			numero /= 10;
		}

		return (numero == 0) ? -1 : posicion; //Devuelve -1 si numero es 0, si no, devuelve la posición
		//sería como un if, pero es una ternaria
	}

	//9. quitaPorDetras: Le quita a un número n digitos por detrás (por la derecha).	
	static int quitaPorDetras(int numero, int cantidad) {
		while (cantidad > 0) {
			numero /= 10;
			cantidad--;
		}

		return numero;
	}

	//10. quitaPorDelante: Le quita a un número n digitos por delante (por la izquierda).	
	static int quitaPorDelante(int numero, int cantidad) {
		int volteado = voltea(numero);

		while (cantidad > 0) {
			volteado /= 10;
			cantidad--;
		}

		volteado = voltea(volteado);

		if (digitos(volteado) < digitos(numero)) {
			volteado *= potencia(10, digitos(numero) - (digitos(volteado) + 1));
		}

		return volteado;
	}

	//11. pegaPorDetras: Añade un dígito a un número por detrás (por la derecha).
	static int pegaPorDetras(int numero, int digito) {
		numero = numero * 10 + digito;

		return numero;
	}

	//12. pegaPorDelante: Añade un dígito a un número por delante (por la izquierda).
	static int pegaPorDelante(int numero, int digito) {
		numero = numero + (int) potencia(10, digitos(numero)) * digito;

		return numero;
	}

	//13. trozoDeNumero: Toma como parámetros las posiciones inicial y final	
	//dentro de un número y devuelve el trozo correspondiente.	
	//Por ejemplo, de 345, devuelve 35
	static int trozoDeNumero(int numero) {
		int digitos = digitos(numero);
		int posicionFinal = digitos(numero);
		int resultado = 0;
		int volteado = voltea(numero);

		while (digitos > 0) {
			if (digitos == posicionFinal) {
				resultado = (volteado % 10) * 10;
			}
			if (digitos == 1) {
				resultado = resultado + volteado % 10;
			}

			volteado /= 10;
			digitos--;
		}

		return resultado;
	}

	//14. juntaNumeros: Pega dos números para formar uno.
	static int juntaNumeros(int numero1, int numero2) {
		int digitos2 = digitos(numero2);
		int voltea2 = voltea(numero2);

		while (digitos2 > 0) {
			numero1 = numero1 * 10 + (voltea2 % 10);
			voltea2 /= 10;
			digitos2--;
		}

		return numero1;
	}
}