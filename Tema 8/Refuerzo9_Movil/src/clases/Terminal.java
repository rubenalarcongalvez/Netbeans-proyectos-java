/*	Ejercicio 8
Implementa la clase Terminal. Un terminal tiene asociado un número. Los
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla.

Programa principal:
Terminal t1 = new Terminal("678 11 22 33");
Terminal t2 = new Terminal("644 74 44 69");
Terminal t3 = new Terminal("622 32 89 09");
Terminal t4 = new Terminal("664 73 98 18");
System.out.println(t1);
System.out.println(t2);
t1.llama(t2, 320);
t1.llama(t3, 200);
System.out.println(t1);
System.out.println(t2);
System.out.println(t3);
System.out.println(t4);

Salida:
No 678 11 22 33 - 0s de conversación
No 644 74 44 69 - 0s de conversación
No 678 11 22 33 - 520s de conversación
No 644 74 44 69 - 320s de conversación
No 622 32 89 09 - 200s de conversación
No 664 73 98 18 - 0s de conversación
 */
package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Terminal {

	private String numero;
	private int tiempoConver;

	//usar el trim para quitar espacios del número si es necesario, y luego darle formato si quiero
	public Terminal(String numero) {
		if (numero.replaceAll("\\s", "").length() == 9) {
			this.numero = numero.replaceAll("\\s", "");
			this.numero = this.numero.substring(0, 3) + " " + this.numero.substring(3, 5)
					+ " " + this.numero.substring(5, 7) + " " + this.numero.substring(7, 9);
		}
	}

	public void llama(Terminal terminal, int segundosConversacion) {
		this.tiempoConver += segundosConversacion; terminal.tiempoConver += segundosConversacion;
	}
	
	@Override
	public String toString() {
		return "Nº " + numero + " - " + tiempoConver + "s de conversación";
	}
}