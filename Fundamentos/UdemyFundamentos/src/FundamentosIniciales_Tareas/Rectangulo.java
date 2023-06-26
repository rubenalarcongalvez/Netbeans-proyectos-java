package FundamentosIniciales_Tareas;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Rectangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Proporciona el alto: ");
		var alto = Integer.parseInt(sc.nextLine());
		System.out.print("Proporciona el ancho: ");
		var ancho = Integer.parseInt(sc.nextLine());
		var area = alto * ancho;
		System.out.println("Area = " + area);
		var perimetro = (alto + ancho) * 2;
		System.out.println("Perimetro = " + perimetro);
	}
}