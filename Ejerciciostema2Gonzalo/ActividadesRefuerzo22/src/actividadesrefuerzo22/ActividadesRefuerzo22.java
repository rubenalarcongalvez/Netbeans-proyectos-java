/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesrefuerzo22;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesRefuerzo22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
            int hora , minutos , diaSemana , minutosFinde , minutosTotales , minutosDias=0;
            String dia;
            // Por qué si pongo esto no funciona? sc.nextLine();

        
        System.out.println("Introduce el dia:");
        dia=sc.nextLine();
        System.out.println("Introduce la hora:");
        hora= sc.nextInt();
        System.out.println("Introduce los minutos:");
        minutos=sc.nextInt();
        
        minutosTotales=((4*24)+15)*60; //Calculamos los minutos totales desde el lunes 00 hasta el viernes 15h
        
            if (dia.equalsIgnoreCase("lunes")){
                diaSemana=0;
                minutosDias= (diaSemana*24)+(hora*60)+minutos;
               }else if(dia.equalsIgnoreCase("martes")){
                   diaSemana=1;
                   minutosDias=(diaSemana*24)+(hora*60)+minutos;
               }else if(dia.equalsIgnoreCase("miercoles")){
                   diaSemana=2;
                   minutosDias=(diaSemana*24)+(hora*60)+minutos;
               }else if(dia.equalsIgnoreCase("jueves")){
                   diaSemana=3;
                   minutosDias=(diaSemana*24)+(hora*60)+minutos;
               }else if(dia.equalsIgnoreCase("viernes")){
                   diaSemana=4;
                   minutosDias=(diaSemana*24)+(hora*60)+minutos;
               }
              
        minutosFinde=minutosTotales-minutosDias;
        
        System.out.println("Faltan "+minutosFinde+" para el fin de Semana");
        
       }
        
    }
        
        
 
    

    
        /*Intentar definir string y luego hacer el switch para cada caso. preguntar L
        npro,mitad... (El String debe ir entre comas
        */
     

/* Scanner sc= new Scanner(System.in);
        double baseimponible , Total;
        double ivaTotal;
        String codPromo="";
        String iva="";
        String numPromo;
        
        //Como hago para pedir un String y pasarlo a entero o double para reconocer que mitad es 0.5
        //Como hacer el programa si no sé si el usuario va a introducir iva= 21 o iva=0.21
        System.out.println("Introduzca la base imponible:");
        baseimponible = sc.nextDouble();
        System.out.println("Introduzca el iva:");
        iva= sc.nextLine();
        System.out.println("Introduzca el código promocional:");
        numPromo=sc.nextInt();
        
        switch(iva){
            case ("")
        }
        System.out.println("La base imponible es: "+baseimponible);
        ivaTotal=baseimponible*iva;
        System.out.println("El iva aplicado es de: "+ivaTotal);
        
        switch (numPromo) {
            case ("noPro") -> {
                Total=baseimponible*(1+iva);
                System.out.println("El total es de: "+Total);
            }
            case 50 -> {
                Total=(baseimponible*(1+iva))*0.5;
                System.out.println("El total es de: "+Total);
            }   
            case 5 -> {
                Total=(baseimponible*(1+iva))*0.95;
                System.out.println("El total es de: "+Total);
            }
            case -5 ->{
                Total=(baseimponible*(1+iva))-5;
                System.out.println("El total es de: "+Total);
            }
            default -> { 
*/
