package FundamentosIniciales;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Clase_if_else {
	public static void main(String args []){
		
		//if else
		boolean varBoolean = false;
		System.out.println("varBoolean = " + varBoolean);
		
		if(varBoolean == true){		//Se puede poner if(varBoolean) solamente y ya lo tomaria como que si es true, si no, hay que especificar == false
			System.out.println("La bandera es verdadera"); /*Quiere decir que si varBoolean es true, se realiza esta accion.
															En este caso imprimir "La bandera es verdadera"*/
		} 
		else{
			System.out.println("La bandera es falsa"); /*Quiere decir que si varBoolean es true, se realiza esta accion.
														En este caso imprimir "La bandera es verdadera"*/
		}	//Imprimira el valor de else puesto que la variable varBoolean es false
		
		//else if
		var numero = 2;
		var numeroTexto = "Numero desconocido";
		
		//Para concatenar y acotar if, se pone "else if", y sería: "Si se cumple esta condición, pasa esto, si no, si se cumple la otra,
		//pasa lo otro, pero si no, pasa lo de más allá
		if(numero == 1){
			numeroTexto = "Numero uno";
		}
		else if(numero == 2){
			numeroTexto = "Numero dos";
		}
		else if(numero == 3){
			numeroTexto = "Numero tres";
		}
		else if(numero == 4){
			numeroTexto = "Numero cuatro";
		}
		else{
		numeroTexto = "Otro numero"; //Si no estuviera el else, la variable numeroTexto, tendria valor por defecto (Numero desconocido)
		}
		
		System.out.println("numeroTexto = " + numeroTexto);
	}
}
