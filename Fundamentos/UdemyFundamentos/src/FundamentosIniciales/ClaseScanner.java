package FundamentosIniciales;
//Clase Scanner

import java.util.Scanner;

public class ClaseScanner {
	public static void main(String args[]){
	//OPCIONAL: Si queremos poner el juego de caracteres latino (ESP)
	//String encoding = "ISO_8859_1"; //Y luego añadirlo a la clase Scanner

	//Hay que importar clases desde otros paquetes. Por ejemplo desde java.util: import java.util.Scanner - Al principio del proyecto
	System.out.print("Escribe algo, en varias palabras si quieres: "); //Para imprimir que escriba algo
	Scanner console = new Scanner(System.in); //También se puede añadir (System.in, "ISO_8859_1") para cambiarlo al alfabeto latino
	//Scanner console = new Scanner(System.in, encoding); //Si queremos poner el juego de caracteres latino (ESP)
	String escribir = console.nextLine(); //La variable tendrá el valor que el usuario escriba
	//Si quiero detectar una sola palabra, será: consola.next()
	System.out.println("Ha escrito: " + escribir); //Para mostrar lo que se ha escrito en la variable escribir
	}
}
