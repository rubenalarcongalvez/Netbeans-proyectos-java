/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion14;


import java.util.Scanner ;


/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesAplicacion14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base;
        double altura;
        double area;
        
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Indique la base:");
        base = sc.nextInt();
        System.out.println("Indique la altura:");
        altura = sc.nextInt();
        area = (base*altura)/2.0;
        System.out.println("El área del triángulo es:" + area);
        
    }
    
}
