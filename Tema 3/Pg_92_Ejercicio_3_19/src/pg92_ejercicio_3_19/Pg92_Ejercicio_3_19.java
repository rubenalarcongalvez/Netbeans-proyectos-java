/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/

/*
Calcula la raíz cuadrada de un número natural mediante aproximaciones. En el caso de	
que no sea exacta, muestra el resto. Por ejemplo, para calcular la raíz cuadrada de 23,	
probamos 1^2 =1, 2^2 = 4, 3^2 = 9, 4^2 = 16, 5^2 = 25 (nos pasamos), resultando 4 la raíz cua-	
drada de 23 con un resto (23-16) de 7.	
*/

package pg92_ejercicio_3_19;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg92_Ejercicio_3_19 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.print("Dame un número natural y te daré su raíz cuadrada y su resto: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		int n = 1;
		int raiz = n*n;
		
		do{
			n++;
			raiz = n*n;
		}
		while (raiz < numero);
		n--;
		raiz = n*n;
		
		//Otra forma de hacerlo
//		int n = 1;
//		
//		do{
//			n++;
//		}
//		while (n*n < numero);
//		n--;
		
		if(raiz < numero){
			n++;
		}
		else{
			n--;
		}
		raiz = n*n;
		
		System.out.println("Raiz cuadrada de " + numero + ": " + n);
		System.out.println("Resto: " + (numero-raiz));
	}
}
