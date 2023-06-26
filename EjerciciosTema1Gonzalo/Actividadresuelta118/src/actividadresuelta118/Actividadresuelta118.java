/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta118;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class Actividadresuelta118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad;
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su edad:");
        edad = sc.nextInt();
        boolean mayoredad = edad>= 18;
        System.out.println("Mayoría de edad:"+mayoredad);
        
        
    }
    
}
