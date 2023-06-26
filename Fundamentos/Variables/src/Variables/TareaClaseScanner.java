package Variables;

import java.util.Scanner;

public class TareaClaseScanner {
    public static void main(String args []) {
        var encoding = "ISO_8859_1";
        Scanner consola = new Scanner(System.in, encoding);
        System.out.println("Proporciona el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        
        System.out.println("\n" + titulo + " fue escrito por " + autor);
    }
}