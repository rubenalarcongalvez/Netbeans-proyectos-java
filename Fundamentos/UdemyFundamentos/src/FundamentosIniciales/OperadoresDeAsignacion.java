package FundamentosIniciales;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class OperadoresDeAsignacion {
	public static void main(String args[]){
		//Operadores de asignación
		
		int a=3;
		System.out.println("a = " + a);
		
		//Sumarle un valor a una variable
		a += 2; //a = a + 2
		System.out.println("a sumada = " + a);
		
		//Restarle un valor a una variable
		a -= 2; //a = a - 2
		System.out.println("a restada = " + a);
		
		//Multiplicar por un valor a una variable
		a *= 2; //a = a * 2
		System.out.println("a multiplicada = " + a);
		
		//Dividir por un valor a una variable
		a /= 2; //a = a / 2
		System.out.println("a dividida = " + a);
		
		//Obtener el resto de una variable dividida por un valor (modulo)
		a %= 2; //a = a % 2
		System.out.println("a resto = " + a);
	}
}
