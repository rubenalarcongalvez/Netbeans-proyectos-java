package Variables;

//Explicación
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String args[]) {
        System.out.println("Escribe el título de un libro:");
        String encoding = "ISO_8859_1";
        Scanner consola = new Scanner(System.in, encoding);
        var titulo = consola.nextLine();
        System.out.println("título = " + titulo);
        System.out.println("Escribe el nombre de su autor:");
        var autor = consola.nextLine();
        System.out.println(titulo + ", fue escrito por " + autor + ".");
    }
}
