package FundamentosIniciales_Tareas;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class MayorDeDosNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Proporciona el numero 1: ");
		int numero1 = Integer.parseInt(sc.nextLine());
		System.out.print("Proporciona el numero 2: ");
		int numero2 = Integer.parseInt(sc.nextLine());
		System.out.println(numero1 > numero2 ? "El numero mayor es: " + numero1 : "El numero mayor es: " + numero2);
	}
}
