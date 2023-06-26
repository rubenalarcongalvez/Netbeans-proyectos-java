package pg344_resuelta11.pkg9_temperatura;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Registro implements Serializable {
	/*	Definimos la clase Registro con dos atributos, la temperatura (double) y el
	momento de la lectura (LocalDatetime) */
	double temperatura;
	LocalDateTime fechaYHora;
	
	Registro(double temperatura) {
		this.temperatura = temperatura;
		fechaYHora = LocalDateTime.now(); //lee del sistema
	}
	
	@Override
	public String toString() {
		//Mostramos la fecha y hora en el formato local (en España, el español) corto
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault()); //el del país local
		
		return "Registro{" + "temperatura=" + temperatura + ", fechaYHora=" + f.format(fechaYHora) + "}\n";
	}
}