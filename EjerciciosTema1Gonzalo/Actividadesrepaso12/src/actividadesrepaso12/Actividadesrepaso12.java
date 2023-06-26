/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesrepaso12;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author Gonzalo Russo
 */
public class Actividadesrepaso12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double nota1 , nota2 , notam;
        System.out.println("Introduzca la nota del primer exámen:");
        nota1 = sc.nextDouble();
        System.out.println("Introduzca la nota que desea obtener en la evaluación:");
        notam = sc.nextDouble();
        nota2 = (notam - (nota1*0.4))/0.6;
        
        System.out.printf("Deberá sacar un %.2f en el exámen para obtener un %.2f en la evaluación", nota2 , notam);
        
        //Redondea pero el resultado es correcto
        
    }
    
}
