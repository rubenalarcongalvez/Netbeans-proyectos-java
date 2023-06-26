/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo19;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class EjerciciosRefuerzo19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Introduzca un Número:");
        num= sc.nextInt();
        num=Math.abs(num);  //asi ponemos valor absoluto
       
        
        if(num<=99999 && num >9999 ){
            System.out.println("El número tiene 5 cifras");
            }else if(num<=9999 && num>999  ){
            System.out.println("El número tiene 4 cifras");
            }else if (num<=999 && num>99 ){
            System.out.println("El número tiene 3 cifras");
            }else if(num<=99 && num> 9 ){
            System.out.println("El número tiene 2 cifras");
            }else if(num<=9 && num>0){
            System.out.println("El número tiene una cifra");
        }else{
            System.out.println("Número erróneo. Número máximo de 5 cifras");
        }
        
        
    }
    
}
