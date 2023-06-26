package trabajofinal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */

//No sirve para nada realmente, simplemente es que esto es lo que se haría normalmente
//si solo hiciésemos las pruebas pertinentes y no repetimos puesto que estamos aprendiendo
//Si creamos una nueva Suite, debería ser automático
//@RunWith(Suite.class)
//@Suite.SuiteClasses({trabajofinal.validacionFormularioEquivalenciaBATest.class, trabajofinal.validacionFormularioEquivalenciaBACTest.class, trabajofinal.validacionFormularioValoresBordeBasicoTest.class, trabajofinal.validacionFormularioValoresBordeBATest.class, trabajofinal.validacionFormularioParametrizadasTest.class, trabajofinal.validacionFormularioEquivalenciaBasicaTest.class, trabajofinal.validacionFormularioValoresBordeBACTest.class})

//En el ejemplo pone de valores borde, sin embargo, hace las pruebas de todo
//Será que ha puesto el nombre solo de la primera clase referenciada (que es de valores borde)
@RunWith(Suite.class)
@Suite.SuiteClasses({trabajofinal.validacionFormularioValoresBordeBACTest.class, trabajofinal.validacionFormularioEquivalenciaBATest.class})
//Podemos elegir cuál mostrar, no hay ningún problema. Si queremos en vez de BAC, BA, podemos

public class SuiteCompleta {
	
}