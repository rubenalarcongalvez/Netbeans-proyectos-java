package trabajofinal;

import java.text.ParseException;

/**
 *
 * @author javie
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        String sRespuesta;
        
        validacionFormulario miFormulario = new validacionFormulario ("usuario","12345678", "07/04/2012", 25.50);
        
        sRespuesta = miFormulario.validacionRegistro();
        
        System.out.println(sRespuesta);
        
        
        //(String usuario, String password, Date fechaNacimiento, double saldoInicial )
        
    }
    
}