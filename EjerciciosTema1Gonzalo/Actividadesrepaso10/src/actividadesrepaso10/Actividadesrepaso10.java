/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesrepaso10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class Actividadesrepaso10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double mb,resultado ;
        Scanner sc= new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Indique la cantidad de MB que quiere convertir:");
        mb = sc.nextDouble();
        resultado = mb*1024;
        System.out.printf("Los %.2f MB son %.2f KB" , mb, resultado);
        
    }
    
}
