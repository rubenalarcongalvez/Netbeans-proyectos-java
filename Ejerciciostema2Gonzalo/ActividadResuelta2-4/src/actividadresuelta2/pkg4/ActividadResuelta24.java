/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta2.pkg4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadResuelta24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        sc.useLocale(Locale.US); 

       
        double numero;
        numero = sc.nextDouble();
        
        if (numero > -1 && numero < 1 && numero !=0){
            System.out.println(numero + "es un número casi cero");
        }else{
            System.out.println(numero + " no es un número casi cero");
        }

       
    
    
    }   
    
}
