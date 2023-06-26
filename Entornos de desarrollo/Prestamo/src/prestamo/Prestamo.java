package prestamo;

/**
 *
 * @author Javier Bustamante Toledo
 * 
 * Situación: Supongamos que tenemos una aplicación que autoriza el prestamo de una 
 * cantidad de dinero (valor numérico) si en importe se encuentra entre 1000 y 15000. 
 * Por lo tanto, 
 *  Todo préstamo por debajo de 1000 carece de interes y 
 *  Por encima de 15000 es una operación con demasiado riesgo.
 * 
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String estudio (int cantidad) {
        String sRespuesta;
        
            if (cantidad >= 1000 && cantidad <=15000) {
                sRespuesta = "Felicidades, préstamo concedido";
            } else if (cantidad < 1000) {
                sRespuesta = "Préstamo no concedido carece de interes";
            } else {
                sRespuesta= "Préstamo no concedido es una operación con demasiado riesgo";
            }
        return sRespuesta;
    }
}


/*
Pruebas valores de equivalencia:
1.Probamos con un valor menor al rango para comprobrar que como resultado no nos debe dejar realizar la operación.
2.Probamos con un valor que se encuentra dentro del rango para comprobar que la operación se puede realizar.
3.Probamos con un valor mayor al rango para comprobar que al igual que con uno menor al mismo no nos dejará realizar la operación.
4.Probamos con el valor borde menor(1000), para comprobar que aunque sea este el límite , este valor está incluido y por lo tanto nos debe dejar efectuar la operación.
5.Probamos con el valor borde mayor(15000), para comprobar que al igual que el valor borde menor, al encontrarse incluido nos dejará realizar la operación.


*/