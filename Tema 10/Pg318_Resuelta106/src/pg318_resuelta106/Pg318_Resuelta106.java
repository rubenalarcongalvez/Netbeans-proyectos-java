/*
Crear con un editor el fichero de texto Enteros.txt en la carpeta del proyecto actual de 
NetBeans y escribir en él una serie de enteros separados por secuencias de espacios y 
tabuladores, incluso en lineas distintas, tal como:	
2  3  45	73	
123		4  21	
Implementar un programa que acceda a Enteros.xt con un objeto Scanner través de un	
flujo de entrada, lea los números y calcule su suma y su media aritmética, mostrando los	
resultados por pantalla.
*/

package pg318_resuelta106;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg318_Resuelta106 {

    public static void main(String[] args) throws FileNotFoundException {
      /* 
		Primero creamos el flujo de texto a partir del nombre del archivo.
		Como dentro del bloque try solo se va a abrir el archivo y no se va a leer de él,
		basta con la excepción FileNotFoundException, que es una subclase de IOException
	  */
	  FileInputStream flujo = null;
	  try {
		  flujo = new FileInputStream("Enteros.txt");
	  } catch (FileNotFoundException ex) { //valdría su superclase IOException
		  System.out.println(ex);
	  }
	  Scanner sc = new Scanner(flujo);
	  int contador = 0;
	  int suma = 0;
	  while (sc.hasNext()) { //No sabemos cuántos números hay (de mientras sc tenga un siguiente...)
		  int n = sc.nextInt();
		  System.out.print(n + " "); //vamos mostrando los números leídos
		  suma += n;
		  contador++;
	  }
	  double media = (double) suma / contador; //la media es un número real
	  System.out.println("\nSuma: " + suma + "\tMedia: " + media);
    }
}