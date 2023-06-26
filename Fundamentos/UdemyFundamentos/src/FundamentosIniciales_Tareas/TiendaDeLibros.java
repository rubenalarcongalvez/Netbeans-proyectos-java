package FundamentosIniciales_Tareas;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */

public class TiendaDeLibros {
	public static void main(String args[]){
		//Tienda de libros
		Scanner console = new Scanner(System.in, "ISO_8859_1");
		System.out.print("Proporciona el nombre del libro: ");
		String nombre = console.nextLine();
		System.out.print("Proporciona el id: ");
		int id = Integer.parseInt(console.nextLine());
		System.out.print("Proporciona el precio: ");
		double precio = Double.parseDouble(console.nextLine());
		System.out.print("¿El envío es gratuito?: ");
		boolean envio = Boolean.parseBoolean(console.nextLine());
		
		System.out.println("\nLibro:");
		System.out.println("Título = " + nombre + " (ID: #" + id + ")");
		System.out.println("Precio = $" + precio);
		if(envio){
			System.out.println("Envío = Gratis");
		}
		else{
			System.out.println("Envío = $4.99");
		}
	}
}