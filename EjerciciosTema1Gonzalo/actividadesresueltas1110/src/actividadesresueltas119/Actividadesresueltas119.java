/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesresueltas119;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class Actividadesresueltas119 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
        System.out.println("Indique un número:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        boolean espar = (numero % 2) == 0;
        System.out.println("El número introducido es par:"+ espar);
        
    }
    
}
