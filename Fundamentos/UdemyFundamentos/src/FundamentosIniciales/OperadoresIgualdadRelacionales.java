package FundamentosIniciales;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class OperadoresIgualdadRelacionales {
	public static void main(String args[]){
		var a = 3;
		var b = 2;
		
		//Igualdad NUMERICA (si dos variables son iguales). Es tipo boolean la respuesta
			//Si dos variables son iguales
			var c = (a == b); //Saldria false. Se pone parentesis OPCIONAL para especificar, pero en este caso no hace falta
			System.out.println("c = " + c);
			
			//Si dos variables son diferentes
			var d = a != b; //Saldria true
			System.out.println("d = " + d);
		
		//Igualdad String (si dos variables son iguales). Es tipo boolean la respuesta.
		var cadena = "Hola";
		var cadena2 = "hola";
		
		var e = cadena.equals(cadena2); //Saldria false. Tiene que ser exactamente igual.
		System.out.println("e = " + e);
		var f = cadena.equalsIgnoreCase(cadena2); //Saldria true. Tiene que ser igual, pero pueden variar las mayusculas
		System.out.println("f = " + f);
		
		//Operadores relacionales. Es tipo boolean la respuesta
		var g = a >= b; //Mayor que > ó mayor o igual que >=
		System.out.println("g = " + g);
		var h = a >= b; //Menor que > ó menor o igual que >=
		System.out.println("h = " + h);
	}
}