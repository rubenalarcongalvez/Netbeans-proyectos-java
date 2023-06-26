package FundamentosIniciales;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class OperadorTernario {
	public static void main(String args[]){
		//Operador Ternario (if pero en modo variable - simplificado). Si se cumple x condición, es true, si no, es false
		//Solo recomendado para expresiones sencillas, si no, utilizar siempre if else
		var resultado = (1 > 2) ? "verdadero" : "falso" ; //1 > 2, ? si es true, imprime verdadero, : si no, imprime falso
		System.out.println("resultado = " + resultado);
		
		//Ejemplo
		var numero = 7;
		resultado = (numero % 2 == 0) ? "Es par" : "Es impar";
		System.out.println(numero + ": " + resultado);
	}
}
