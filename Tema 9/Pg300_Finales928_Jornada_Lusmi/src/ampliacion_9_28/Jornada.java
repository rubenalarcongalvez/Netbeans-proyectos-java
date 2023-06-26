/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion_9_28;

import java.util.Date;

/**
 *
 * @author Luis
 */
public class Jornada implements Comparable<Jornada> {

    private String DNI;
    private String fecha;
    private Date horaEntrada;
    private Date horaSalida;

    public Jornada(String DNI, String fecha, String horaEntrada, String horaSalida) {
        this.DNI = DNI;
        this.fecha = fecha;

        this.horaEntrada = new Date(fecha + " " + horaEntrada);
        this.horaSalida = new Date(fecha + " " + horaSalida);
    }

    public String getDNI() {
        return DNI;
    }

    public String getFecha() {
        return fecha;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public long numeroMinutoJornada() {

        long diferencia = this.horaSalida.getTime() - this.horaEntrada.getTime() / 1000 / 60; //Para convertirlo en segundos -> / 1000 y en minutos / 60
//     System.out.println(diferenciaMili);
//     long diferenciaSecs =  Math.abs(diferenciaMili/1000);
//     System.out.println(diferenciaSecs);
//     long diferenciaMins = Math.abs(diferenciaSecs/60);
//     System.out.println(diferenciaMins);

        return diferencia;

    }

    @Override
    public int compareTo(Jornada jor) {
		//Mejor guardar la salida en una variable para no usar tanto código
		int resultado = this.DNI.compareTo(jor.DNI);
		
        if (resultado == 0) {
            resultado = this.fecha.compareTo(jor.fecha);
        }
		
		return resultado;
    }

    @Override
    public String toString() {

        String cadena = "Empleado";

        cadena += "DNI :" + this.DNI + "\n";
        cadena += "Fecha :" + this.fecha + "\n";
        cadena += "Minutos trabajados" + this.numeroMinutoJornada();

        return cadena;
    }

}
