/*
Implementa una aplicación donde se insertan 20 números enteros aleatorios distintos,	
menores que 100, en una colección. Deberán guardarse por orden decreciente a medida
que se vayan generando, y se mostrará la colección resultante por pantalla.
*/

package pg409_aplicacion_12.pkg21_numeroscoleccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg409_Aplicacion_1221_NumerosColeccion {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
		int contador = 0;
		
		while(contador < 20) {
			int numero = (int) (Math.random() * 100);
			if (!listaNumeros.contains(numero)) { //menores que 100, no menores o iguales
				listaNumeros.add(numero);
				Collections.sort(listaNumeros, Comparator.reverseOrder()); //Ordenamos en orden inverso a medida que se va generando
				contador++;
			}
		}
		
		System.out.println("Lista de números: " + listaNumeros.toString());
		
		//Si queremos hacerlo con TreeSet, es más funcional -> Sirve como un ArrayList SIN duplicados y ordenado
		TreeSet<Integer> listaNumerosTreeSet = new TreeSet<>(Comparator.reverseOrder()); //Entre los paréntesis, se puede cambiar el formato de ordenación
		contador = 0;
		
		while(contador < 20) {
			int numero = (int) (Math.random() * 100);
			if (listaNumerosTreeSet.add(numero)) { //menores que 100, no menores o iguales
				contador++;
			}
		}
		
		System.out.println("Lista de números: " + listaNumerosTreeSet.toString());
    }
}