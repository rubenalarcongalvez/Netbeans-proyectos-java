package examen_base_triangulo;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Examen_Base_Triangulo {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		double lado1, lado2, lado3, base, altura, per, area;/*Considero que las medidas pueden ser decimales por lo tanto el perímetro y area también podría serlo*/
        boolean equilatero=false;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Introduzca valor de los lados: ");
            lado1=sc.nextDouble();
            lado2=sc.nextDouble();
            lado3=sc.nextDouble();
            
        }while(lado1<=0||lado2<=0||lado3<=0); /*Comprobamos que los lados son positivos, se podría mejorar introduciendo 2 "do while" para mantener el valor de los lados positivos*/
        
        if((lado1==lado2)&&(lado2==lado3)){ /*Comprobamos que es equilátero*/
            equilatero=true;
            area=(Math.pow(lado1,2)*Math.sqrt(3)/4);
            per=3*lado1;
        }
        else{
            do{
                System.out.print("Introduzca valor de la base: ");
                base=sc.nextDouble();
            }while(base<=0);
            
            do{
                System.out.print("Introduzca valor de la altura: ");
                altura=sc.nextDouble();
            }while(altura<=0); /*En este caso si he contemplado lo mencionado anteriormente, de esta manera valua cada valor por separado evitando pedir al valor introducido correctamente*/
            
            area=(base*altura/2);
            per=lado1+lado2+lado3;
        }
        
        System.out.println("RESULTADO:");
        
        if(equilatero)
            System.out.println("TRIÁNGULO EQUILÁTERO:");
        else
            System.out.println("TRIÁNGULO NO EQUILÁTERO:");
        
        
        System.out.printf("ÁREA: %.2f PERÍMETRO: %.2f \n", area, per);
        
    }
    
}
