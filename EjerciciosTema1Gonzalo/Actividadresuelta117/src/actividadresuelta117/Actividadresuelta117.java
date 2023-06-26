/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta117;

import java.util.



/**
 *
 * @author Gonzalo Russo
 */
public class Actividadresuelta117 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double radio;
        double longitud;
        double area;
        
        System.out.println("Introduzca el radio de la circunferencia:");
        
        radio = sc.nextDouble();
        longitud = 2* Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud de la circunferencia es:"+longitud);
        System.out.println("El áea de la circunferencia es:"+area);
        
        
    }
    
}
