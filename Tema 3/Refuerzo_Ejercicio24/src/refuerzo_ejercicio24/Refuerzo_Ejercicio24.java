/*
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
   1
  121
 12321
1234321
 */
package refuerzo_ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo_Ejercicio24 {

	public static void main(String[] args) {
		int numero;
        System.out.print("Inserte un número de filas: ");
        int fila = new Scanner(System.in).nextInt();

        for (int columna = 1; columna <= fila; columna++) {
            for (int hueco = fila - columna; hueco > 0; hueco--) {
                System.out.print(" ");
            }
            numero = 1;
            for (int dibujo = 0; dibujo < columna; dibujo++) {
                System.out.print(numero);
                numero++;
            }
            numero--;
                for(int i = 1; i < columna; i++){
                    numero--;
                    System.out.print(numero);
                }
                System.out.println("");
            }
        }
    }
