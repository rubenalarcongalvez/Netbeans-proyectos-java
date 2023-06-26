//Realiza un programa que pinte una pirámide por pantalla. La altura se debe
//pedir por teclado. El carácter con el que se pinta la pirámide también se debe
//pedir por teclado.
//   *
//  ***
// *****
//*******

package refuerzo_ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime la altura que tiene que tener la pirámide: ");
		int altura = sc.nextInt();
		System.out.print("Dime el caracter que quieras usar para dibujarla: ");
		char caracter = sc.next().charAt(0);

		for(int fila = 1; fila <= altura; fila++){
            //Espacios en blanco
            for(int espacio = 1; espacio <= altura-fila; espacio++){
                System.out.print(" ");
            }
 
            //Caracteres
            for(int dibujo = 1; dibujo < fila*2; dibujo++){
                System.out.print(caracter);
            }
            System.out.println();
        }
	}
}