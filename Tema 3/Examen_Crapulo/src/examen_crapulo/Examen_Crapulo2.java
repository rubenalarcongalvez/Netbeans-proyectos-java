package examen_crapulo;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Examen_Crapulo2 {
	public static void main(String[] args) {
		int num, res=0, pos=1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num=sc.nextInt();
        
        while(num <= 0){ /*Comprobar que el número es positivo*/
            System.out.print("El número que has introducido NO es positivo, introduzca otro número: ");
            num=sc.nextInt();
        }
        
        while(num > 0){ /*Vamos deshaciendo el número y sumando*/
            res+=(num%10);
            num/=10;
            while(res>10){/*Compruebo que el resultado sea menos que 10 y si no es así sumo sus cifras (nunca vamos a tener un número de 3 digítos por, lo tanto solo tenemos que descompones una vez)*/
                res=(res/10)+(res%10);
            }
        }
        System.out.println("Su crápulo es: " + res);
    }
}