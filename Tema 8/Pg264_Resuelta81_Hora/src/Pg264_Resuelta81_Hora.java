
import clases.Hora;
import clases.HoraExacta;
import java.util.Scanner;

/* 8.1
Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de O	
a 23) y los minutos. Dispone de los métodos:	

- Hora(hora, minuto), que construye un objeto con los datos pasados como pará-	
metros.	

- void inc(), que incrementa la hora en un minuto.	

- boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos.	
Devuelve true o false según haya sido posible modificar los minutos o no.	

- boolean setHora(valor), que asigna un valor, si está comprendido entre O y 23,	
a la hora. Devuelve true o false según haya sido posible cambiar la hora o no.	

- String toString(), que devuelve un string con la representación de la hora.
*/

/* 8.2
A partir de la clase Hora implementar la clase HoraExacta, que incluye en la hora los se-	
gundos. Además de los métodos heredados de Hora, dispondrá de:

- HoraExacta(hora, minuto, segundo), que construye un objeto con los datos	
pasados como parámetros.	

- setSegundo(valor), que asigna, si está comprendido entre 0 y 59, el valor indicado	
a los segundos.	

- inc(), que incrementa la hora en un segundo.
*/

/* 8.3
Añadir a la clase HoraExacta un método que compare si dos horas (la invocante y otra pa-	
sada como parámetro de entrada al método) son iguales o distintas.	
*/

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg264_Resuelta81_Hora {
    public static void main(String[] args) {
        //8.1 - Hora
		Hora r = new Hora(11, 30); //las 11:30
		System.out.println(r);
		
		for (int i = 1; i <= 61; i++) { //incrementamos 61 minutos
			r.inc();
		}
		System.out.println(r); //mostramos
		
		System.out.print("Escriba una hora: ");
		int hora = new Scanner(System.in).nextInt();
		boolean cambio = r.setHora(hora); //cambiamos la hora
		if (cambio) {
			System.out.println(r);
		} else {
			System.out.println("La hora no se pudo cambiar");
		}
		
		//8.2 - HoraExacta
		HoraExacta re = new HoraExacta(11, 15, 23); //hora del descanso
		System.out.println(re);
		
		for (int i = 1; i < 61; i++) { //incrementamos 61 minutos
			re.inc();
		}
		System.out.println(re);
		
		System.out.print("Escriba los segundos: ");
		int segundos = new Scanner(System.in).nextInt();
		if (re.setSegundos(segundos)) {
			System.out.println(re);
		} else {
			System.out.println("No es posible cambiar los segundos");
		}
		
		//8.3 - HoraExacta iguales
		Hora r2 = new Hora(11, 30); //las 11:30
		System.out.println(r2);
		
		for (int i = 1; i <= 61; i++) { //incrementamos 61 minutos
			r2.inc();
		}
		System.out.println(r2); //mostramos
		
		System.out.print("Escriba una hora: ");
		hora = new Scanner(System.in).nextInt();
		cambio = r2.setHora(hora); //cambiamos la hora
		if (cambio) {
			System.out.println(r2);
		} else {
			System.out.println("La hora no se pudo cambiar");
		}
		
		HoraExacta re2 = new HoraExacta(11, 15, 23); //hora del descanso
		System.out.println(re2);
		
		for (int i = 1; i < 61; i++) { //incrementamos 61 minutos
			re2.inc();
		}
		System.out.println(re2);
		
		System.out.print("Escriba los segundos: ");
		segundos = new Scanner(System.in).nextInt();
		if (re2.setSegundos(segundos)) {
			System.out.println(re2);
		} else {
			System.out.println("No es posible cambiar los segundos");
		}
		
		System.out.println("Son iguales: " + re.equals(re2));
    }
}