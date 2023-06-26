/*
Implementa un programa que lea dos listas de números enteros no ordenados de dos
archivos con un número por linea, los reúna en una lista única y los guarde en or-	
den creciente en un tercer archivo, de nuevo uno por linea.	
*/

package pg331_aplicacion1013;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg331_Aplicacion1013 {

    public static void main(String[] args) {
		int[] tabla = new int[0];
		int longitud = 0;
		
		try (FileInputStream in = new FileInputStream("lista1.txt"); Scanner sc = new Scanner(in)) {
			
			//El Scanner es para que detecte directamente los int
			for (int i = 0; sc.hasNext(); i++) {
				longitud++;
				tabla = Arrays.copyOf(tabla, tabla.length + 1);
				tabla[i] = sc.nextInt();
			}
			
		} catch(IOException ex) {
			System.out.println(ex);
		} catch(Exception ex) {
			System.out.println(ex);
		}
		
		try (FileInputStream in = new FileInputStream("lista2.txt"); Scanner sc = new Scanner(in)) {
			
			//El Scanner es para que detecte directamente los int
			for (int i = longitud; sc.hasNext(); i++) {
				tabla = Arrays.copyOf(tabla, tabla.length + 1);
				tabla[i] = sc.nextInt();
			}
			
		} catch(IOException ex) {
			System.out.println(ex);
		} catch(Exception ex) {
			System.out.println(ex);
		}
		
		Arrays.sort(tabla); //ordenamos la tabla
		
		try (FileWriter out = new FileWriter("lista3.txt")) { //No necesitamos BufferedWriter porque va de 1 en 1
			for (int i = 0; i < tabla.length; i++) {
				if (i < tabla.length - 1) {
					out.write(String.valueOf(tabla[i]) + "\n"); //Asignamos el número y el retorno de carro
				} else {
					out.write(String.valueOf(tabla[i])); //Asignamos el último número sin retorno de carro
				}
			}
			
			System.out.println("Operación realizada con éxito: lista3.txt creada y ordenada");
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
    }
}