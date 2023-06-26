package FundamentosIniciales;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class OperadoresCondicionales {
	public static void main(String args[]){
		var a = -1;
		var valorMinimo = 0;
		var valorMaximo = 10;
		
		//AND - Se utiliza "&&" para poner mas valores o condiciones a la variable en lugar de solo 1
		//Se tiene que cumplir todas las condiciones (AND), si no, será false
		var resultado = a >= 0 && a <= 10; //El rango es entre 0 y 10. Por lo que numeros negativos o que excedan mas de 10 serán false
		
		if(resultado){
			System.out.println("Dentro de rango");
		}
		else{
			System.out.println("Fuera de rango");
		}
		
		//OR - Se utiliza "||" para poner más valores o condiciones a la variable en lugar de solo 1
		//Solo se tiene que cumplir 1 condición o más (OR) para que sea true. Si no se cumple ninguna, será false
		var vacaciones = false;
		var diaDescanso = true;
		
		if(vacaciones || diaDescanso){	//Si tiene vacaciones o día de descanso
			System.out.println("El padre puede asistir al partido de su hijo");
		}
		else{
			System.out.println("El padre está ocupado");
		}
	}
}
