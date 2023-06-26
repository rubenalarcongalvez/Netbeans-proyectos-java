package FundamentosIniciales_Ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Clase_if_else_EstacionDelAno {

	public static void main(String[] args) {
		//Estacion del año dependiendo del mes del año
		System.out.print("Ingresa un mes del año (también puede ser numérico): ");
		Scanner sc = new Scanner(System.in);
		var mes = sc.nextLine();
		byte mesNumero = 0;
		var estacion = "una estacion desconocida";
		
		//Mes
		if(mes.equals("1") || mes.equals("2") || mes.equals("3") || mes.equals("4") || mes.equals("5") || mes.equals("6") || mes.equals("7") || mes.equals("8") || mes.equals("9") || mes.equals("10") || mes.equals("11") || mes.equals("12")){
		mesNumero = Byte.parseByte(mes);
		}
		if(mesNumero == 1){
			mes = "Enero";
		}
		else if(mesNumero == 2){
			mes = "Febrero";
		}
		else if(mesNumero == 3){
			mes = "Marzo";
		}
		else if(mesNumero == 4){
			mes = "Abril";
		}
		else if(mesNumero == 5){
			mes = "Mayo";
		}
		else if(mesNumero == 6){
			mes = "Junio";
		}
		else if(mesNumero == 7){
			mes = "Julio";
		}
		else if(mesNumero == 8){
			mes = "Agosto";
		}
		else if(mesNumero == 9){
			mes = "Septiembre";
		}
		else if(mesNumero == 10){
			mes = "Octubre";
		}
		else if(mesNumero == 11){
			mes = "Noviembre";
		}
		else if(mesNumero == 12){
			mes = "Diciembre";
		}
		
		//Estación
		if(mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") || mes.equalsIgnoreCase("Diciembre")){
			estacion = "invierno";
		}
		else if(mes.equalsIgnoreCase("Marzo") || mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo")){
			estacion = "primavera";
		}
		else if(mes.equalsIgnoreCase("Junio") || mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto")){
			estacion = "verano";
		}
		else if(mes.equalsIgnoreCase("Septiembre") || mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre")){
			estacion = "otoño";
		}
		
		System.out.println(mes + " está en " + estacion);
	}
}
