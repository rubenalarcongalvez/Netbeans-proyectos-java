package ejercicio1;

//Se puede llamar a Math.sin o Math.cos para comprobar

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Ejercicio1 {

	//Hacemos nosotros mismos la clase Math.pow porque necesitaremos usarla, y la podemos hacer nosotros
	static double potencia(double base, double exponente) {
		double resultado;

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

	static double factorial_reciproco(double n) {
		double factorial = 1;

		//Sacamos el factorial
		while (n > 0) {
			factorial *= n;
			n--;
		}

		//Lo ponemos recíproco
		factorial = 1 / factorial;

		//Devolvemos 1/factorial de n
		return factorial;
	}

	static int signo(int n) {
		//Para saber si es par, necesitamos su módulo, si lo es, su módulo es 0
		if (n % 2 == 0) {
			n = 1;
		} else {
			n = -1;
		}

		//Devolvemos el signo
		return n;
	}

	static double coseno_aprox(double x, double m) {
		double coseno = 0;

		//Va sumando de 2 en 2 el contador, y una vez tenemos un número, lo sumamos al otro con el signo cambiado
		for (int contador = 0; contador < m; contador += 2) {
			coseno = coseno + ((potencia(x, contador)) * factorial_reciproco(contador)) * signo(contador);
		}
		return coseno;
	}

	public static void main(String[] args) {
		System.out.println("Comprobación:");

		System.out.println("Factorial recíproco de 4: " + factorial_reciproco(4));
		System.out.println("¿4 es par (1) o impar (-1)?: " + signo(4));
		System.out.println("Coseno aproximado de 30 con límite 4: " + coseno_aprox(30, 4));
	}
}