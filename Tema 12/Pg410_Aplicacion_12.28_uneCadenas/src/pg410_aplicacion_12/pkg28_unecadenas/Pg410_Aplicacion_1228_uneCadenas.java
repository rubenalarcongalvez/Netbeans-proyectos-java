/*
Implementa la función uneCadenas(), con el siguiente prototipo:	
List<Character> uneCadenas(List<Character> cadl, List<Character> cad2)	
que devuelve una lista con la concatenación de cadl y cad2.	
*/

package pg410_aplicacion_12.pkg28_unecadenas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg410_Aplicacion_1228_uneCadenas {

	public static List<Character> uneCadenas(List<Character> cad1, List<Character> cad2) {
		List<Character> concatenada = new ArrayList<>();
		
		concatenada.addAll(cad1);
		concatenada.addAll(cad2);
		
		return concatenada;
	}
	
    public static void main(String[] args) {
        ArrayList<Character> lista1 = new ArrayList<>();
		lista1.add('H');
		lista1.add('o');
		lista1.add('l');
		
        ArrayList<Character> lista2 = new ArrayList<>();
		lista2.add('a');
		lista2.add(',');
		lista2.add(' ');
		
		System.out.println(uneCadenas(lista1, lista2));
    }
}