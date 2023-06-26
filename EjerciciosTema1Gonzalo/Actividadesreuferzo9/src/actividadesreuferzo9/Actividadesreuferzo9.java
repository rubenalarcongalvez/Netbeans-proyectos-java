/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesreuferzo9;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class Actividadesreuferzo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double radio , altura , volumen;
       
        
        System.out.println("Introduzca el radio del cono:");
        radio = sc.nextDouble();
        System.out.println("Introduzca la altura del cono:");
        altura = sc.nextDouble();
        
        
        volumen = (1/3.0)*(Math.PI)*(Math.pow(radio, 2))*altura;
        System.out.printf("El Volumen del cono es %.2f :", volumen);
        
    }
    
}
