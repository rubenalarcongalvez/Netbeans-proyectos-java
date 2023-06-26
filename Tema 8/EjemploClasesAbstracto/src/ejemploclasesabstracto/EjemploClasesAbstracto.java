/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclasesabstracto;

/**
 *
 * @author richi
 */
public class EjemploClasesAbstracto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguraGeometrica[] coleccion = new FiguraGeometrica[4];
        
        coleccion[0] = new Rectangulo(3,5.6,"Verde");
        coleccion[1] = new Triangulo(6,7.8,"Azul");
        coleccion[2] = new Cuadrado(5,"Amarillo");
        coleccion[3] = new Circulo(2.2,"Marrón");
        
        //tri.setColor("Naranja"); //SÍ SE PODRÍA
		//tri.setBase(5); //NO SE PODRÍA, porque no está definido en la clase FiguraGeometrica,
		//que es abstracta, sino en sus subclases
        
        for (FiguraGeometrica tri: coleccion) {
            System.out.println(tri.toString());
            if (tri instanceof Cuadrado){
                ((Cuadrado)tri).pintar();
            }
        }
    }
 
}