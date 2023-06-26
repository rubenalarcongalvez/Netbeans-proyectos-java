package FundamentosIniciales;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class InferenciaDeTipos {
	public static void main(String args[]){
		//Comprobar valores maximos y minimos de variables y FORZAR
		//Forzando el valor, si no es admitido por el tipo de variable, NO SERÁ PRECISO
		
		//Tipos primitivos de tipo entero
		byte numeroByte = (byte)129;
		System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
		System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
		System.out.println("Tamaño de byte: " + Byte.SIZE);
		
		short numeroShort = (short)32768;
		System.out.println("numeroShort = " + numeroShort);
		System.out.println("Valor minimo short = " + Short.MIN_VALUE);
		System.out.println("Valor minimo short = " + Short.MAX_VALUE);
		
		int numeroInt = (int)2147483648L;
		System.out.println("numeroInt = " + numeroInt);
		System.out.println("Valor minimo int = " + Integer.MIN_VALUE);
		System.out.println("Valor minimo int = " + Integer.MAX_VALUE);
		
		long numeroLong = 9223372036854775807L;
		System.out.println("numeroLong = " + numeroLong);
		System.out.println("Valor minimo long = " + Long.MIN_VALUE);
		System.out.println("Valor minimo long = " + Long.MAX_VALUE);
		
		//Tipos primitivos de tipo flotante
		float numeroFloat = (float)3.4028236E38D;
		System.out.println("numeroFloat = " + numeroFloat);
		System.out.println("Valor minimo float = " + Float.MIN_VALUE);
		System.out.println("Valor minimo float = " + Float.MAX_VALUE);
		
		double numeroDouble = 4.9E-324;
		System.out.println("numeroDouble = " + numeroDouble);
		System.out.println("Valor minimo double = " + Double.MIN_VALUE);
		System.out.println("Valor minimo double = " + Double.MAX_VALUE);
		
		
		//Pasar de char a numero entero sustituyendo char por int
		int variableEnteraCaracter = '!'; //Detecta el caracter y como lo pasamos a int, lo transforma a decimal -> 97 en este caso
		System.out.println("variableEnteraCaracter = " + variableEnteraCaracter);
	}
}
