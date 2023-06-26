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

 /*	Ejercicio 9
Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
llamada. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
decimales, puedes utilizar DecimalFormat.

Programa principal:
Movil m1 = new Movil("678 11 22 33", "rata");
Movil m2 = new Movil("644 74 44 69", "mono");
Movil m3 = new Movil("622 32 89 09", "bisonte");
System.out.println(m1);
System.out.println(m2);
m1.llama(m2, 320);
m1.llama(m3, 200);
m2.llama(m3, 550);
System.out.println(m1);
System.out.println(m2);
System.out.println(m3);

Salida:
No 678 11 22 33 - 0s de conversación - tarificados 0,00 euros
No 644 74 44 69 - 0s de conversación - tarificados 0,00 euros
No 678 11 22 33 - 520s de conversación - tarificados 0,52 euros
No 644 74 44 69 - 870s de conversación - tarificados 1,10 euros
No 622 32 89 09 - 750s de conversación - tarificados 0,00 euros
 */
package refuerzo9_movil;

import clases.Movil;
import clases.Terminal;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Refuerzo9_Movil {

	public static void main(String[] args) {
		System.out.println("=== Ejercicio 8 ===");
		Terminal t1 = new Terminal("678 11 22 33");
		Terminal t2 = new Terminal("644744469");
		Terminal t3 = new Terminal("622328909");
		Terminal t4 = new Terminal("664 73 98 18");

		System.out.println(t1);
		System.out.println(t2);
		t1.llama(t2, 320);
		t1.llama(t3, 200);

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);

		System.out.println("=== Ejercicio 9 ===");
		Movil m1 = new Movil("678 11 22 33", "rata");
		Movil m2 = new Movil("644 74 44 69", "mono");
		Movil m3 = new Movil("622 32 89 09", "bisonte");
		System.out.println(m1);
		System.out.println(m2);
		m1.llama(m2, 320);
		m1.llama(m3, 200);
		m2.llama(m3, 550);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
}