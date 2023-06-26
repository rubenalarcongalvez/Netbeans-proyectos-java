/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesresueltas211;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesResueltas211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        String dia;
        
      Scanner sc= new Scanner(System.in);
      
        System.out.println("Indique un número entre 1 y 7:");
        num = sc.nextInt();
        
        switch (num){
            case 1:
                dia = "Lunes";
                break; 
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia= "Jueves";
            case 5:
                dia= "Viernes";
            case 6:
                dia="Sábado";
            case 7:
                dia="Domingo";
            default:
                dia="Incorrecto";
                
          } 
        
        if (dia.equals("Incorrecto"))
            System.out.println("Entrada inncorrecta");
        else
            System.out.println("El dia" + num + "de la  es el:" + dia);
           
        }
      
    }
    
