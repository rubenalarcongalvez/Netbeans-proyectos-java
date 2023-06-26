package FundamentosIniciales;
//Variables Java
public class VariablesPrimitivas {

	public static void main(String args[]) {
		
		//Inferencia de tipos - Detecta automaticamente el tipo de variable
		var nombreDeVariable_varNumeral = 10; // Pone automáticamente el tipo de variable
		System.out.println("nombreDeVariable_varNumeral = " + nombreDeVariable_varNumeral);
		var nombreDeVariable_varTexto = "Hola a todos"; // Pone automáticamente el tipo de variable
		System.out.println("nombreDeVariable_varTexto = " + nombreDeVariable_varTexto);

		//Tipos de variables enteras
		byte nombreDeVariable_byte = 10; // 8 bits. (Default = 0)
		System.out.println("nombreDeVariable_byte = " + nombreDeVariable_byte);
		short nombreDeVariable_short = 10; // 16 bits. (Default = 0)
		System.out.println("nombreDeVariable_short = " + nombreDeVariable_short);
		char nombreDeVariable_charDecimal = 65; // 16 bits UNICODE. (Default = \u0000) - Cada número corresponde a un caracter -> 65 = A
		System.out.println("nombreDeVariable_charDecimal = " + nombreDeVariable_charDecimal);
		char nombreDeVariable_charCaracter = 'A'; // 16 bits UNICODE. (Default = \u0000) - Se pone cualquier caracter (solo 1) entre '' y cualquier caracter, simbolo o numero del 1 al 9
		System.out.println("nombreDeVariable_charCaracter = " + nombreDeVariable_charCaracter);
		char nombreDeVariable_charUNICODE = '\u0021'; // 16 bits UNICODE. (Default = \u0000) -> Se pone cualquier caracter en formato UNICODE entre ''
		System.out.println("nombreDeVariable_charUNICODE = " + nombreDeVariable_charUNICODE);
		int nombreDeVariable_int = 10; // 32 bits. (Default = 0) *Es el más común*
		System.out.println("nombreDeVariable_int = " + nombreDeVariable_int);
		long nombreDeVariable_long = 10; // 64 bits. (Default = 0)
		System.out.println("nombreDeVariable_long = " + nombreDeVariable_long);

		//Tipos de variables flotantes
		float nombreDeVariable_float = 10; // 32 bits. (Default = 0.0) - Buena para números grandes y decimales *Es el más común*
		System.out.println("nombreDeVariable_float = " + nombreDeVariable_float);
		double nombreDeVariable_double = 10; // 64 bits. (Default = 0.0) - Buena para números muy grandes y decimales
		System.out.println("nombreDeVariable_double = " + nombreDeVariable_double);

		//Tipos de variables tipo boolean
		boolean nombreDeVariable_boolean = true; //Solo tiene 2 valores: true y false. (Default = false). Muy util, por ejemplo para if else
		System.out.println("nombreDeVariable_boolean = " + nombreDeVariable_boolean);
		
		//Tipos de variables referenciados (tipo object)
		//Variable tipo String
		String nombreDeVariable_String = "Hola a todos"; // Para escribir un texto - Tiene que estar entre ""
		System.out.println("nombreDeVariable_String = " + nombreDeVariable_String);
		
		//Para volver a definir una variable ya definida
		nombreDeVariable_int = 5; //Así le cambiamos el valor -> no se pone el tipo de variable
		System.out.println("nombreDeVariable_int = " + nombreDeVariable_int);
		
		//Concatenación de cadenas
		var usuario = "Juan";
		var titulo = "Ingeniero";

		var union = titulo + " " + usuario; //Se concatena para dar lugar a la expresión
		System.out.println("union = " + union);

		var i = 4; //es de tipo entero
		var j = 2; //es de tipo entero

		System.out.println(i + j); //se realiza la suma de numeros
		System.out.println(i - j); //se realiza la resta de numeros
		System.out.println(i * j); //se realiza la multiplicacion de numeros
		System.out.println(i / j); //se realiza la division de numeros
		System.out.println(i^2 - j^4); //se realiza el exponencial de numeros
		System.out.println(i + j + usuario); //se realiza primero la suma, y luego la concatenación de cadenas
		System.out.println(usuario + i + j); /*se realiza la concatenación, ya que empezó uniendo cadenas,
		 y no realiza la operación de suma de números si no empieza la cadena con una suma de números, por lo que sería Juan34*/
		System.out.println(usuario + (i + j)); /*se pueden usar paréntesis para sumar variables numéricas
		(como en matemáticas, los paréntesis da prioridad)*/
		
		//Valores permitidos en el nombre de variables
		var miVariable = 1;
		var _miVariable = 2;
		var $miVariable = 3;
		//var áVariable = 10; No se recomienda utilizar
		//var #miVariable = 2; No se permite utilizar caracteres especiales
	}
}
