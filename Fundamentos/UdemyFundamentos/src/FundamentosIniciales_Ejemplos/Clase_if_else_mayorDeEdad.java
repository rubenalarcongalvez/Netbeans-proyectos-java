package FundamentosIniciales_Ejemplos;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */

//Saber si una persona es mayor de edad
public class Clase_if_else_mayorDeEdad {
	public static void main(String args[]){
		var edad = 18;
		boolean esAdulto = edad >= 18; //Se tomaría como true SI la variable edad es mayor o igual a 18
		//Sirve para tenerlo todo mas organizado y limpio, y se puede reutilizar
		
		if(esAdulto){	//También se puede utilizar -> if(edad >=18 == true) pero es mas limpio de la otra forma
			System.out.println("Es adulto");
		}
		else{
			System.out.println("No es adulto");
		}
	}
}
