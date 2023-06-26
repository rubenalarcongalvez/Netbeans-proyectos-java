/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion15;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesAplicacion15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a , b ,c , x , y;
        
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("Indique el valor de a;");
        a = sc.nextDouble();
        System.out.println("Indique el valor de b:");
        b = sc.nextDouble();
        System.out.println("Indique el valor de c:");
        c = sc.nextDouble();
        System.out.println("Indique el valor de x:");
        x = sc.nextDouble();
        
        y = (a*(math.pow)(x,2)+ b*x+ c );
        System.out.println("El resultado es:"+y);
        
        
        
        
       
    }
    
}
