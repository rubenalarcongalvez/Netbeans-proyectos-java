package Variables;

//Explicación
public class Variables {

    public static void main(String args[]) {
        //Definimos la variable
        int nombreDeVariableEntera = 10;
        System.out.println(nombreDeVariableEntera);
        //Modificamos el valor de la variable
        nombreDeVariableEntera = 5;
        System.out.println(nombreDeVariableEntera);
        //Definimos el valor de la cadena
        String nombreDeVariableCadena = "Saludos";
        System.out.println(nombreDeVariableCadena);
        //Modificamos el valor de la cadena
        nombreDeVariableCadena = "Adios";
        System.out.println(nombreDeVariableCadena);

        // var - Inferencia de tipos en Java
        var nombreDeVariableEntera2 = 15;
        System.out.println(nombreDeVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $mivariable = 3;
        //var áVariable = 10; No se recomienda utilizar por posibles problemas con el juego de caracteres utilizado
        //var #miVariable = 2; NO SE PERMITE utilizar caracteres especiales

        //CONCATENACIÓN DE CADENAS
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3; //es de tipo entero
        var j = 4; //es de tipo entero
        System.out.println(i + j); //se realiza la suma de numeros
        System.out.println(i + j + usuario); //Evaluación de izquierda a derecha, realiza suma
        System.out.println(usuario + i + j); //Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j)); //Uso de paréntesis modifican la prioridad
        
        //Caracteres especiales
        var nombre = "Karla";
        
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);        
        System.out.println("Retroceso: \b \b" + nombre + "\b");
        System.out.println("Comilla simple: \'" + nombre + "'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        System.out.println("Barra invertida: \\" + nombre);
    }
}
