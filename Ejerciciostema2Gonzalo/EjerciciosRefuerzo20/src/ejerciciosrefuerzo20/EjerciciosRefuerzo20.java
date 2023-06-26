/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo20;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class EjerciciosRefuerzo20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, u , d , c , um , dm; // siendo "u"= unidades, "d" = decenas,"c"=centenas,"um"=unidad de millar ,"dm"=decena de millar
        boolean capicua=false;
        boolean valido=true;
        //boolean=valido= true;
       
        System.out.println("Introduzca un número:"); //Por qué si inicializo capicua como false, si salgo de rango sale capicua
        num = sc.nextInt();
        
        u=(num%10);
        num /=10;
        d=(num%10);
        num/=10;
        c=(num%10);
        num/=10;
        um=(num%10);
        num/=10;
        dm = (num%10);
        
        /*if(num>99999 || num<0){
        valido=false;
        else if(dm==u && um==d){
            capicua=true
        */
        
        if(num<0 || num>99999){
            valido=false;
            }else if(dm==u && um==d){
                capicua=true;
            }else if(dm==0 && um==u && c==d){
                capicua=true;
            }else if(dm==0 && um== 0 && c==u){
                capicua=true;
            }else if (dm==0 && um==0 && c==0 && d==u){
                capicua=true;
            }else if(num>0 && num<10){
              capicua=true;
            
          }
        
        if(capicua && valido){
            System.out.println("Es capicúa");
        
        }else if (valido==false){
            System.out.println("Número inválido");
            
        }else{
            System.out.println("No es capicúa");
        }
        
     }
}