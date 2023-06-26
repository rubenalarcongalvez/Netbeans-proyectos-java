/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion12;

import java.util.Scanner;



/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesAplicacion12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        int resultado;
        int Numsuma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el número que quiera calcular:");
        num = sc.nextInt();
        
        resultado = num % 7;
        Numsuma = 7- resultado;
        System.out.println("Para que sea múltiplo de 7 habría que sumarle:"+ Numsuma);
        
    }
    
}
