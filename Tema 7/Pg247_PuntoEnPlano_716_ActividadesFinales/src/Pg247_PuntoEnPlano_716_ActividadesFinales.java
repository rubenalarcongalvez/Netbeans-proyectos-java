/*
Escribe la clase Punto que representa un punto en el plano (con un componente x y un	
componente y), con los métodos:	

- Punto(double x, double y): construye un objeto con los datos pasados como pa-	
rámetros.

- void desplazaX(double dx): incrementa el componente x en la cantidad dx.	

- void desplazaY(double dy): incrementa el componente y en la cantidad dy.	

- void desplaza(double dx, double dy): desplaza ambos componentes según las	
cantidades dx (en el eje x) y dy (en el componente y).	

- double distanciaEuclidea(Punto otro): calcula y devuelve la distancia euclídea	
entre el punto invocante y el punto otro.	

- void muestra(): muestra por consola la información relativa al punto.	
*/

import newpackage.Punto;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg247_PuntoEnPlano_716_ActividadesFinales {

    public static void main(String[] args) {
        Punto p1 = new Punto(3,4);
		Punto p2 = new Punto(8,5);
		
		p1.muestra();
		p2.muestra();
		System.out.println(p1.distanciaEuclidea(p2));
    }
}
