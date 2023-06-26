/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo24;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Russo
 */
public class EjerciciosRefuerzo24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in) ;  
        String cargo ="", estadoCivil="";
        int diasViaje;
        final int sueldoJunior = 950 , sueldoSenior=1200 , sueldoJefe=1600, pagoViaje=30;
        final int IRPFsoltero=25,IRPFcasado=20;
        double sueldoBase=0 , sueldoBruto,sueldoViajes, sueldoNeto, retencionIRPF=0, infoIRPF=0;
        
        System.out.println("Introduzca su cargo(Junior,Senior,Jefe): ");
        cargo=sc.nextLine();
        System.out.println("Introduzca los días que ha realizado viajes: ");
        diasViaje=sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca su estado civil: ");
        estadoCivil=sc.nextLine();
        
        if(cargo.equalsIgnoreCase("junior")){
            sueldoBase=sueldoJunior;
        }else if(cargo.equalsIgnoreCase("senior")){
            sueldoBase=sueldoSenior;
        }else if(cargo.equalsIgnoreCase("jefe")){
            sueldoBase=sueldoJefe;
        }else{
            System.out.println("Cargo introducido incorrecto");
        }
    
        sueldoViajes=diasViaje*pagoViaje; //calculamos el total cobrado por los viajes realizados
        sueldoBruto=sueldoBase+sueldoViajes;
        
        if(estadoCivil.equalsIgnoreCase("soltero")){
            infoIRPF=IRPFsoltero;
            retencionIRPF=(sueldoBruto*IRPFsoltero)/100;
            
        }else if(estadoCivil.equalsIgnoreCase("casado")){
            infoIRPF=IRPFcasado;
            retencionIRPF=(sueldoBruto*IRPFcasado)/100;
        }
    
        sueldoNeto=sueldoBruto-retencionIRPF;
        
        System.out.println("El salario base es: "+sueldoBase);
        System.out.println("Los dias viajados son "+diasViaje+" y el pago por esos viajes es de "+sueldoViajes+" euros");
        System.out.println("El sueldo bruto es de :"+sueldoBruto);
        System.out.println("La retención del IRPF es de "+infoIRPF+"% que es un total de " +retencionIRPF );
        System.out.println("El sueldo neto es de: "+sueldoNeto);
        
        }
    } 
  
