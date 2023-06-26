/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion212;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesAplicacion212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
              int dni, valorletra;
              char letra;
              // Hay abajo una explicacion de como realizarlo con if anidados
              
              System.out.println("Introduzca los números de su dni:");
              dni = sc.nextInt();
              
              
              switch (valorletra =  dni % 23){
                  case 0 ->
                      char letra = "T";
               
                  case 1 ->
                      System.out.println("La letra de su dni es la R");
                      
                  case 2 ->
                      System.out.println("La letra de su dni es la W");
                      
                  case 3 ->
                      System.out.println("La letra de su dni es la A");
                      
                  case 4 ->
                      System.out.println("La letra de su dni es la G"); 
                  case 5 ->
                      System.out.println("La letra de su dni es la M");
                  case 6 ->
                      System.out.println("La letra de su dni es la Y");
                  case 7 ->
                      System.out.println("La letra de su dni es la F");
                  case 8 ->
                      System.out.println("La letra de su dni es la P");
                  case 9 ->
                      System.out.println("La letra de su dni es la D");
                  case 10 ->
                      System.out.println("La letra de su dni es la X");
                  case 11 ->
                      System.out.println("La letra de su dni es la B");
                  case 12 ->
                      System.out.println("La letra de su dni es la N");
                  case 13 ->
                      System.out.println("La letra de su dni es la J");
                  case 14 ->
                      System.out.println("La letra de su dni es la Z");
                  case 15 ->
                      System.out.println("La letra de su dni es la S");
                  case 16 ->
                      System.out.println("La letra de su dni es la Q");
                  case 17 ->
                      System.out.println("La letra de su dni es la V");
                  case 18 ->
                      System.out.println("La letra de su dni es la H");
                  case 19 ->
                      System.out.println("La letra de su dni es la L");
                  case 20 ->
                      System.out.println("La letra de su dni es la C");
                  case 21 ->
                      System.out.println("La letra de su dni es la K");
                  case 22 -> 
                      System.out.println("La letra de su dni es la E");
                 }
                      
              System.out.println("Su letra es:" +letra);
              
              /*
              int numDni;
              char letra;
              final int num= 23; 
              
              if (numDni % num == 0){
              letra= T;
              } else if (numDni % num ==1);
              
              
             abajo del todo pondríamos sout("la letra es": + letra);
              */
              
              
              
      //intentar hacerlo con variable char en vez de con un systeam.out.println();
    
    
    }
}