/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso11;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class Ejerciciosrepaso11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kb , resultado;
        Scanner sc= new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Introduzca los KB que quiera convertir:");
        kb = sc.nextDouble();
        resultado = kb/1024;
       
        System.out.printf("Los %.2f KB son %.4f Mb", kb,resultado);
        
       
    }
    
}
