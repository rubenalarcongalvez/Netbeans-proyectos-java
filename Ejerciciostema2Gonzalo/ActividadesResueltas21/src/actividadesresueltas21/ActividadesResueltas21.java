/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesresueltas21;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesResueltas21 {

    
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
       int numero;
       
        System.out.println("Indique un número:");
       numero = sc.nextInt();
       
       if (numero % 2 == 0){
           System.out.println("El número " + numero + " es Par");
       }else {
           System.out.println("El número " + numero+ " es impar");
       }
       
       
    }
    
}
