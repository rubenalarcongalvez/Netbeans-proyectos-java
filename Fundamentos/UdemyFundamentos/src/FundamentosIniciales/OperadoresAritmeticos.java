package FundamentosIniciales;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class OperadoresAritmeticos {
	public static void main(String args[]){
		int a=3, b=2; //Para definir varias variables a la vez (NO SE PUEDE HACER CON var) puesto que no detectará bien
		
		//Suma
		var resultado = a + b;
		System.out.println("resultado de la suma = " + resultado);
		
		//Resta
		resultado = a - b;
		System.out.println("resultado de la resta = " + resultado);
		
		//Multiplicación
		resultado = a * b;
		System.out.println("resultado de la multiplicacion = " + resultado); //Multiplicación
		
		//División
		resultado = a / b;
		System.out.println("resultado de la division = " + resultado); //(no salen decimales porque la variable es de tipo entero)
																		//Habría que cambiar el tipo de variable
		var resultado2 = 3.0 / b; //Para cambiarla a tipo flotante double, o simplemente ponemos que es tipo double (admite decimales)
		System.out.println("resultado2 de la division = " + resultado2);
		
		//Modulo - Residuo de división (el resto que queda después de dividir) - Para saber si un número es divisible entre otro con resto 0
		resultado = a % b;
		System.out.println("resultado de la operacion de modulo = " + resultado);
		
		//Comprobar si un número es par
		if(a % 2 == 0){	//Si a es divisible entre 2, el resto será 0 - Será par
			System.out.println("Es numero par");
		}
		else{
			System.out.println("Es numero impar");
		}
	}
}
