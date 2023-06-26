/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo21;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class EjerciciosRefuerzo21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       double nota1 , nota2 , media;
       String recuperacion = "";
       
        System.out.println("Introduzca la nota del primer exámen:");
        nota1= sc.nextDouble();
        System.out.println("Introduzca la nota del segundo exámen:");
        nota2= sc.nextDouble();
        sc.nextLine(); // Limpieza de buffer de teclado
        
        media = (nota1+nota2)/2.0;
        
        if (media>=5){
            System.out.printf("Ha aprobado la asignatura.Su media es %.2f: ",media);
             }else if(media<5){
            System.out.printf("Ha suspendido.Su media es %.2f: ",media);
            System.out.println("Indique si está aprobado en su exámen de recuperación(apto/no apto):");
            recuperacion = sc.nextLine();
        }
            
       /*
        if(recuperacion.equalsIgnoreCase("apto")){ //Ignore case para quitar mayusculas
            media=5;
            System.out.println("Su nota es un: "+media);
        }else if(recuperacion.equalsIgnoreCase("no apto")) {
            System.out.println("Ha suspendido. Su nota se mantiene en: "+media);
        }
        */
       switch(recuperacion){
                case("apto"):
                     media=5;
                    System.out.println("Su media es un : "+media);
                    break;
                case ("no apto"):
                    System.out.println("Ha suspendido. Su nota se mantiene en un "+media);
    }
       
            
     }
    
    }

            
 

  
    
  
