/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion211;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesAplicacion211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Pedir numero (Scanner)
        tiene que ser entre 0 y 9999
        eso se hace con int
        y con condcionales para meterlo en ese rango.
        para saber si es capicuo, N>=10 && N <= 99)
        if (N/10)==(N%10); ----> es capicuo
       */
        /*
        if anidados:
        Despues de hacer operaciones y guardarlas en a b c d, hago los if
        if (a!=0)&& (a==d)&&(b==c){
           println(es capicuo);
        */
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Introduzca un número:");
        num= sc.nextInt();
        
       boolean capicua = false;
               
               int u = num%10; // el num/=10 va quitando los decimales y va achicando el numero
               num /=10;
               int d = num%10;
               num /= 10;
               int c = num %10;
               num /=10;
               int um =num; //por que solo num si num es el que introducimos
               
               
               if (u== um && d==c){
                   capicua = true;  
               }else if (um ==0 && c==u){
                   capicua = true;
                   
               }else if (um==0 && c==0 && d==u){
                   capicua = true;
               }else if (um==0 && c==0 && d==0){
                   capicua = true;
                   
               }
              
               if (capicua){
                   System.out.println("Es capicua");
               }else{
                   System.out.println("No es capicua");
               }
               
                       
    }
}


