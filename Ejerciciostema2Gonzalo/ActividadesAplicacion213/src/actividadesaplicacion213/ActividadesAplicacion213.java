/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion213;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class ActividadesAplicacion213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAnimales;
        double comidaDiaria ;
        double kilosporAnimal , racionporAnimal;
        
        System.out.println("Indique la cantidad de comida diaria que se compra:");
        comidaDiaria = sc.nextDouble();
        System.out.println("Introduzca el numero de animales en la granja:");
        numAnimales = sc.nextInt();
        System.out.println("Introduzca el número de kilos que come cada animal al día:");
        kilosporAnimal= sc.nextDouble();
        
        if (comidaDiaria >= numAnimales * kilosporAnimal){
            System.out.println("Hay comida suficiente");
        }else
        {
            racionporAnimal = comidaDiaria/ numAnimales;
            
            System.out.printf("Cada animal comerá %.2f kilos de comida",racionporAnimal); //no me funciona %.2f
        }
        
    }
    
}

