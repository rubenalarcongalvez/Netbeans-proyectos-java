import clases.Caja;
import clases.Unidad;

/* 8.12
Las empresas de transporte, para evitar daños en los paquetes, embalan todas sus mer-	
cancías en cajas con el tamaño adecuado. Una caja se crea expresamente con un ancho,	
un alto y un fondo y, una vez creada, se mantiene inmutable. Cada caja lleva pegada una	
etiqueta, de un máximo de 30 caracteres, con información útil como el nombre del des-	
tinatario, dirección, etc. Implementa la clase Caja con los siguientes métodos:	

- Caja(int ancho, int alto, int fondo, Unidad unidad): que construye una caja	
con las dimensiones especificadas, que pueden encontrarse en «cm» (centimetros)o	
m(metros).	

- double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.	

- void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de la caja.	

- String tostring(): que devuelve una cadena con la representación de la caja.	
*/

/* 8.13
La empresa de mensajeria BiciExpress, que reparte en bicicleta, para disminuir el peso	
que transportan sus empleados solo utiliza cajas de cartón. El volumen de estas se calcu-	
la como el 80% del volumen real, con el fin de evitar que se deformen y se rompan. Otra	
caracteristica de las cajas de cartón es que sus medidas siempre están en centimetros.	
Por último, la empresa, para controlar costes, necesita saber cuál es la superficie total de	
cartón utilizado para construir todas las cajas.	
Escribe la clase CajaCarton heredando de la clase Caja.	
*/

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pg274_Aplicacion812_Caja {

    public static void main(String[] args) {
        Caja c1 = new Caja(800,500,400,Unidad.CM);
		
		c1.setEtiqueta("Está defectuosa. Los bordes están deteriorados");
		
		System.out.println(c1.toString());
    }
}