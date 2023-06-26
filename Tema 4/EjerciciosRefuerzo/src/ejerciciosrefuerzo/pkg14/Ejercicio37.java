/*
Crea una función con la siguiente cabecera:	

public String convierteEnMorse (int n)	

Esta función convierte el número n al sistema Morse y lo devuelve en una	
cadena de caracteres. Por ejemplo, el 213 es el	en	
Morse. Utiliza esta	unción en un programa para comprobar que funciona bien.	
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print	
desde el programa principal.	
*/

package ejerciciosrefuerzo.pkg14;

/**
 *
 * @author rafaelnf
 */

import java.util.Scanner;

public class Ejercicio37 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        System.out.println("El número en morse es " + convierteEnMorse(num));
    }
    
    static String convierteEnMorse(int num) {
        
        int dig;
        String morse = "";
        do {
            dig = num % 10;
            num /= 10;
            if (dig >= 0 && dig <= 5) {
                for (int i = 1; i <= 5; i++) {
                    if (dig >= 5)
                        morse = "." + morse;
                    else
                        morse = "-" + morse;
                    dig++;
                }
            } else {
                for (int i = 1; i <= 5; i++) {
                    if (dig >= 10)
                        morse = "-" + morse;
                    else
                        morse = "." + morse;
                    dig++;
                }
            }
        } while (num > 0);
        return morse;
    } 
}