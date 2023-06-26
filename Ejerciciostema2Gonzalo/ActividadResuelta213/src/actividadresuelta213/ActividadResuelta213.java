/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta213;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadResuelta213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h , m , s; // Horas, minutos, segundos;
        
        System.out.println("Indique la hora:");
        h = sc.nextInt();
        System.out.println("Indique los minutos:");
        m = sc.nextInt();
        System.out.println("Indique los segundos:");
        s= sc.nextInt();
        
        s++;
        
        if(s>59){
            s=0;
            m++;
            if(m>59){
                m=0;
                h++;
                if(h>23){
                    h=0;
                }
            }
        }
        System.out.println("Hora+1:"+h+":"+m+":"+s);
    }
    
    
}
