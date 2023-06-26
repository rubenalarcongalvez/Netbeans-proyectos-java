/*
Crea un coche con programación orientada a objetos
*/

package ende_poo_coche;

import ende_poo.*;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class ENDE_POO_Coche {

    public static void main(String[] args) {
        
		Coche Renault = new Coche();
		Coche Toyota = new Coche();
		
		System.out.println("El número de ruedas del Renault es " + Renault.ruedas);
		System.out.println("El número de ruedas del Toyota es " + Toyota.ruedas);
    }
}