/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo23;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class EjerciciosRefuerzo23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double baseimponible , ivaTotal=0 , PrecioTotal=0 , promoTotal=0;
        String iva , codPromo;
        final double IVAG=0.21;
        final double IVAR=0.10;
        final double IVASR=0.04;
        double tipoIVA;
        
            System.out.println("Indique la base imponible: ");
            baseimponible=sc.nextDouble();
            sc.nextLine();
            System.out.println("Introduzca el iva(general,reducido,superreducido:");
            iva=sc.nextLine();  
            System.out.println("Introduzca el código promocional:");
            codPromo=sc.nextLine();
            
            //iva=iva.toLowerCase;  y codPromo=codPromo.toLowerCase
            
            if(iva.equalsIgnoreCase("general")){
                  tipoIVA=IVAG;
                
                }else if(iva.equalsIgnoreCase("reducido")){
                  tipoIVA=IVAR;
                }else if(iva.equalsIgnoreCase("superreducido")){
                  tipoIVA=IVASR;
                  
            }else tipoIVA=0;
            
            
            ivaTotal=baseimponible*tipoIVA;
        
          if(codPromo.equalsIgnoreCase("noPro")){
              promoTotal= 0;
              PrecioTotal=(baseimponible+ivaTotal);
            }else if(codPromo.equalsIgnoreCase("mitad")){
              promoTotal=(baseimponible+ivaTotal)*0.5;
              PrecioTotal=(baseimponible+ivaTotal)*0.5;
            }else if(codPromo.equalsIgnoreCase("meno5")){
              promoTotal= -5;
              PrecioTotal=(baseimponible+ivaTotal)-5;
            }else if(codPromo.equalsIgnoreCase("5porc")){
              promoTotal=(baseimponible+ivaTotal)*0.05;
              PrecioTotal=(baseimponible+ivaTotal)*1.05;
        }
        System.out.println("La base imponible es: "+baseimponible);
        System.out.println("El iva aplicado es: "+ivaTotal);
        System.out.printf("El descuento por código promocional es %.2f : " ,promoTotal);
        System.out.printf("El precio total es %.2f : ",PrecioTotal);
        
        
    }
     
}
