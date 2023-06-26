/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadampliacion9_31;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author guillermoag
 */
public class Llamada implements Comparable<Llamada>{
    //ATRIBUTOS
    private int numero_cliente;
    private int numero_interlocutor;
    private boolean saliente;
    private LocalDateTime fecha_inicio;
    private LocalDateTime fecha_fin;
    private double precio;

    
    //CONSTRUCTOR
    public Llamada(int cliente, int interlocutor, boolean saliente, String fecha_inicio, String fecha_fin, String tarifa) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        this.numero_cliente = cliente;
        this.numero_interlocutor = interlocutor;
        this.saliente = saliente;
        this.fecha_inicio = LocalDateTime.parse(fecha_inicio, f);
        this.fecha_fin = LocalDateTime.parse(fecha_fin, f);
        
        tarifa = tarifa.toLowerCase();
        switch(tarifa){
            case "esp":
                this.precio = 10;
                break;
            case "por":
                this.precio = 12;
                break;
            case "ing":
                this.precio = 11;
                break;
            case "fra":
                this.precio = 13;
                break;
            case "ale":
                this.precio = 14;
                break;
            default:
                this.precio = 10;
        }
        
    }
    //METODOS
    @Override
    public int compareTo(Llamada otraLlamada) {
        
        int resultado = this.numero_cliente - otraLlamada.numero_cliente;
        if(resultado == 0) {
            resultado = this.fecha_inicio.compareTo(otraLlamada.fecha_inicio);
        }
        return resultado;
    }
    
    public int duracion() {
        
        return (this.fecha_fin.getHour()*60 + this.fecha_fin.getMinute()) - (this.fecha_inicio.getHour()*60 + this.fecha_inicio.getMinute());
    }
    
    public double coste() {
        double coste = 0;
        
        if (saliente)
            coste = (this.duracion() * precio)/100;
        
        return coste;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return "Numero del cliente: " + this.numero_cliente + ""
                + "\nNúmero del interlocutor: " + this.numero_interlocutor + ""
                + "\nFecha y hora de inicio: " + this.fecha_inicio.format(f) + ""
                + "\nDuración: " + this.duracion() + " minutos"
                + "\nCoste: " + this.coste() + " €";
    }
}