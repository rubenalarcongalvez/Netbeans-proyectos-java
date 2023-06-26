package Variables;

/*
Probar todos los tipos de variables (tanto var como String como byte, short, int, long, float y double). 
Con números, mensajes de cadenas, y concatenación de cadenas. E imprimir las concatenaciones y varias variables juntarlas en una impresión.
También usar los caracteres especiales para diferentes funciones: 
- Salto de línea
- Insertar tabulador
- Insertar un retroceso
- Insertar comillas simples
- Insertar comillas dobles
- Insertar barras invertidas
 */
public class PrácticaVariables {

	public static void main(String args[]) {
		var usuario = "Juan";
		var titulo = "Ingeniero";
		var union = titulo + " " + usuario;
		System.out.println("union = " + union);
		
		var i = 3;
		var j = 4;
		System.out.println(i + j);
		System.out.println("Por lo que:");
		System.out.println("i + j = " + (i + j));
		System.out.println(i + j + usuario);
		
	}
}
