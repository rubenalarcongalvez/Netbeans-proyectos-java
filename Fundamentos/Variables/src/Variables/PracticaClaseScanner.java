package Variables;

import java.util.Scanner;

/*
Hacer una clase Scanner, en la que haya 2 diálogos y 1 conclusión. 
También poner el encoding en teclado latino. (Se puede separar con comandos como \n)

Por ejemplo: Cuál es tu nombre, y cuáles son tus apellidos. Y decir: "Tu nombre es (nombre) y tus apellidos son (apellidos).
*/



public class PracticaClaseScanner {
		/*
    public static void main(String args[]) {
        System.out.println("Escribe un nuevo PIN:");
        String encoding = "ISO_8859_1";
        Scanner sc = new Scanner(System.in, encoding);
        var PIN = ("PIN: " + sc.nextLine());
        System.out.println(PIN);
        System.out.println("Ahora, escribe tu contraseña de correo electrónico:");
        var pass = ("Contraseña: " + sc.nextLine());
        System.out.println(pass);
		*/
		
		//Práctica de una situación cualquiera (BORRAR LUEGO)
		
	public static void main(String args[]) {
		System.out.println("Espere un momento, por favor...");
		double ms = 1.656591515D;
		System.out.println("ms = " + ms);
		System.out.println("¡Hola! Por favor, inserte su nombre de usuario y su contraseña.");
		var encoding = "ISO_8859_1";
		Scanner sc = new Scanner(System.in, encoding);
		System.out.println("Nombre de usuario:");
		var user = (sc.nextLine());
		System.out.println("Contraseña:");
		var password = (sc.nextLine());
		System.out.println("\nPerfecto, bienvenido, " + user + ". \n¿Quiere usted que le llamemos por otro nombre? De ser así, escriba su nuevo tratamiento, de lo contrario, "
				+ "escriba su nombre de usuario:");
		var name = (sc.nextLine());
		System.out.println("\nDe acuerdo, " + name + ", continuaremos con el proceso...");
		System.out.println("Por favor, indique la cantidad de dinero que desea sacar de nuestro servicio web: ");
		var quantity = (sc.nextLine());
		System.out.println(name + " vas a sacar " + quantity + "€ de nuestro servicio web, pero antes, nos tienes que dar tu número de tarjeta InfinityCard y tu PIN: ");
		System.out.println("Nº de tarjeta: ");
		var tarjeta = ("Nº de tarjeta: " + sc.nextLine());
		System.out.println("Nº PIN: ");
		String codigoPIN = ("PIN: " + sc.nextLine());
		System.out.println("De acuerdo " + name + ", hemos procesado su solicitud. El dinero se ha depositado ya en su cuenta.");
		float operacion = 20018746L;
		System.out.println("Muchas gracias por confiar en nosotros");
		System.out.println("Nº de operación: " + operacion);
		    }
}