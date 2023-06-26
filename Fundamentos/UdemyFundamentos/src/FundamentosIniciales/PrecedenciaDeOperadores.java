package FundamentosIniciales;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class PrecedenciaDeOperadores {
	public static void main(String[] args) {
		//Ejemplo 1
		var x = 5;
		var y = 10;
		var z = ++x + y--; //Primero se hace el incremento de ++x, luego el decremento de y-- y por último se suma
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		//Ejemplo 2
		var resultado = 4 + 5 * 6 / 3; //Se entiende así la prioridad -> 4 + ((5*6)/3) = 14
		System.out.println("resultado = " + resultado);
		
		resultado = (4 + 5) * 6 / 3; //Se entiende como ((4 + 5) * 6) / 3 = 18 - Con paréntesis se puede modificar la prioridad (como en mates)
		System.out.println("resultado = " + resultado);
	}
}
