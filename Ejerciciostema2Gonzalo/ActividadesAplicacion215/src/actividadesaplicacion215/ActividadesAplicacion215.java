/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion215;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesAplicacion215 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double base , altura , area; 
        
        System.out.println("Indique la base del triángulo:");
        base = sc.nextDouble();
        System.out.println("Indique la altura del triángulo:");
        altura = sc.nextDouble();
        
        if (base <=0 || altura <= 0){
            System.out.println("Los números no pueden ser negativos");
        } else{
            area = ((base * altura)/2.0);
            System.out.println("El área del triángulo es:" +area+ "cm cuadrados");
        }
                        
    }
    
    
}
