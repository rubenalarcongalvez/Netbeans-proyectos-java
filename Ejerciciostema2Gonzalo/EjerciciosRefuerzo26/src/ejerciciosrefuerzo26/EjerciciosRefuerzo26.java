/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo26;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class EjerciciosRefuerzo26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double  numEntradas=0  ;
        double Total=0 ,totalDescuento=0 ,  TotalEntradas=0 ,precioEntrada=8, descuento= 0.10 , precioEntradasDobles=11 , entradasDobles=0 ;
        String diaSemana , tarjetaCine;
        
        System.out.println("Indique el número de entradas: ");
        numEntradas=sc.nextInt();
        sc.nextLine();
        System.out.println("Indique el día de la semana:");
        diaSemana=sc.nextLine();
        System.out.println("¿Tiene tarjeta CineCampa?:");
        tarjetaCine=sc.nextLine();
        
        
        switch (diaSemana){
            case("lunes"):
               precioEntrada=8;
               TotalEntradas=numEntradas*precioEntrada;
               entradasDobles=0;
               break;
            case ("martes"):
                precioEntrada=8;
                 TotalEntradas=numEntradas*precioEntrada;
                  entradasDobles=0;
                break;
            case("miercoles"):
                precioEntrada=5;
                 TotalEntradas=numEntradas*precioEntrada;
                  entradasDobles=0;
                break;
            case("jueves"):
               entradasDobles=(numEntradas/2.0)-(0.5);  //como restar el resto de la division, no el modulo
                numEntradas=(numEntradas%2.0); 
               
               
              TotalEntradas =(entradasDobles*precioEntradasDobles)+((numEntradas%2)*precioEntrada);
              break;
                
             case("viernes"):
                 TotalEntradas=numEntradas*precioEntrada;
                  entradasDobles=0;
                 break;
             case("sabado"):
                 TotalEntradas=numEntradas*precioEntrada;
                  entradasDobles=0;
                 break;
             case("domingo"):
                 TotalEntradas=numEntradas*precioEntrada;
                  entradasDobles=0;
                 break;
             default:
                 System.out.println("El día introducido es erróneo");
                
        }
        
            if(tarjetaCine.equalsIgnoreCase("si")){
                totalDescuento=TotalEntradas*descuento;
                Total=TotalEntradas-(TotalEntradas*descuento);
                
            }else if(tarjetaCine.equalsIgnoreCase("no")){
                Total=TotalEntradas;
                totalDescuento=0;
            }else{
                System.out.println("Palabra introducida errónea");
            }
            
            System.out.println("Venta de entradas CineCampa");
            System.out.println("Número de entradas individuales es: "+numEntradas);
            System.out.println("El número de entradas dobles es: "+entradasDobles);
            System.out.println("Precio por entrada individual:"+precioEntrada);
            System.out.println("Precio por entrada doble: "+precioEntradasDobles);
            System.out.println("Total: "+TotalEntradas);
            System.out.println("Descuento: "+totalDescuento);
            System.out.printf("Total %.2f : " ,Total);
            
            
            
        }
        
    }
