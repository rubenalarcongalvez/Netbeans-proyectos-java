/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta212;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadResuelta212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int dia , mes , año;
        boolean fechacorrecta=false;
        
        System.out.println("Indique el día:");
        dia = sc.nextInt();
        System.out.println("Indique el mes:");
        mes = sc.nextInt();
        System.out.println("Indique el año:");
        año = sc.nextInt();
        
        if(mes==2 && 1<=dia && dia <=28){
            fechacorrecta = true;
           
           }else if(mes==4 || mes == 6 || mes==9 || mes ==11 && (1<= dia && dia<=30)){
               fechacorrecta = true;
           
           }else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes== 12 && (1<=dia && dia<=31)){
               fechacorrecta=true;
           }
       
        if(fechacorrecta){
            System.out.println("La fecha es correcta: " +dia+ "/" + mes+ "/"+año);
        }else{
            System.out.println("La fecha es incorrecta");
        }
    }
}
