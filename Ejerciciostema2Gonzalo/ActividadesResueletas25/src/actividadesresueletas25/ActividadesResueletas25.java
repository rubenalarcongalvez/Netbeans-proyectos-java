/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesresueletas25;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesResueletas25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2;
        int mayor , menor;
        
        System.out.println("Introduzca un número:");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro número:");
        num2=sc.nextInt();
        
        //usar operador ternario
        //mayor=ni>n2 ? n1: n2;
        //Pedir dos numeros y mostrarlos de forma decreciente
        
        mayor= num1>num2 ? num1 : num2;
        menor = num2>num1 ? num1 : num2;
        System.out.println(mayor + ", " +menor);
        }

    } 
  




