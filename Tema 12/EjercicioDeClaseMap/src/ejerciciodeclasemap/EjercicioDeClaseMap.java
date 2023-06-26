package ejerciciodeclasemap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class EjercicioDeClaseMap {

	public static void main(String[] args) {
		Map<String, Double> m = new HashMap<>();

		m.put("Marisa", 1.73);
		m.put("Marta", 1.60);
		m.put("Luis", 1.73);
		m.put("Ana", 1.65);
		m.put("Pedro", 1.69);

		System.out.println("HashMap: " + m);

		//Podemos machacar el valor
		m.put("Pedro", 1.71); //Devuelve el valor machacado

		System.out.println("HashMap: " + m);

		System.out.println("Ana mide: " + m.get("Ana") + "m");

		System.out.println("El mapa contiene a Ana: " + m.containsKey("Ana"));
		System.out.println("El mapa contiene a Pepe: " + m.containsKey("Pepe"));

		System.out.println("Hay alguien que mida 1.72: " + m.containsValue(1.72));
		System.out.println("Hay alguien que mida 1.73: " + m.containsValue(1.73));

		Set<String> nombres = m.keySet();
		System.out.println("Lista de nombres: " + nombres);

		String aux;

		for (Iterator<String> it = nombres.iterator(); it.hasNext();) {
			aux = it.next();
			if (m.get(aux) > 1.65) {
				System.out.println(aux + " - " + m.get(aux));
			}
		}

//		System.out.println("Eliminamos los que tengan más de 1.65 de estatura");
//		
//		for (Iterator<String> it = nombres.iterator(); it.hasNext();) {
//			aux = it.next();
//			if (m.get(aux) > 1.65) it.remove(); //Elimina el elemento DEL MAPA TAMBIÉN porque el set accede a los elementos que hay en el mapa
//		}
//		
//		System.out.println("Mapa sin los eliminados: " + m);

		Collection<Double> estaturas = m.values();
		System.out.println("Lista de estaturas: " + estaturas);

		
		
		
		Set<Map.Entry<String, Double>> conjuntoEntradas = m.entrySet();

		Iterator<Map.Entry<String, Double>> iterador = conjuntoEntradas.iterator();

		Map.Entry<String, Double> elemento; //Creamos el elemento de cada paso del iterador

		while (iterador.hasNext()) {
			elemento = iterador.next();
			if (elemento.getValue() > 1.65) {
				System.out.println(elemento.getKey() + " - " + elemento.getValue());
			}
			//Si queremos borrar -> it.remove();
		}

		//PARA BUSCAR POR VALOR
		System.out.println("\n\nPara buscar por valor");

		//Creamos el entrySet
		conjuntoEntradas = m.entrySet();

		//Creamos un ArrayList para almacenar las alturas
		ArrayList<Double> alturas = new ArrayList<>();

		//Añadimos las alturas
		alturas.addAll(estaturas);

		System.out.println("Lista inicial: " + conjuntoEntradas);

		Iterator<Map.Entry<String, Double>> it = conjuntoEntradas.iterator();
		while (it.hasNext()) {
			elemento = it.next();
			if (1.73 == elemento.getValue()) {
				System.out.println(elemento.getKey() + " - " + 1.73);
			}
		}
		
		//PARA ORDENAR POR VALOR Y MOSTRAR TODO
		System.out.println("\n\nPara ordenar por valor y mostrar todo");

		//Creamos el entrySet
		conjuntoEntradas = m.entrySet();

		//Creamos un ArrayList para almacenar las alturas
		alturas = new ArrayList<>();

		//Añadimos las alturas
		alturas.addAll(estaturas);

		//Las ordenamos
		Collections.sort(alturas);

		System.out.println("Lista inicial: " + conjuntoEntradas);

		Double altura;

		Iterator<Double> itAltura = alturas.iterator();
		
		Map<String, Double> mAux = new HashMap<>(); //Es el que se va a borrar para que no afecte al principal
		mAux.putAll(m); //Añadimos todo
		
		Set<Map.Entry<String, Double>> conjuntoEntradasAux = mAux.entrySet(); //Es el que se va a borrar
		
		while (itAltura.hasNext()) {
			altura = itAltura.next();
			it = conjuntoEntradasAux.iterator(); //Para reiniciar el iterador y que vuelva a comparar
			while (it.hasNext()) {
				elemento = it.next();
				if (altura.equals(elemento.getValue())) {
					System.out.println(elemento.getKey() + " - " + altura);
					
					it.remove(); //Para que una vez compare, pase al siguiente y no lo duplique en el siguiente registro
				}
			}
		}
		
		System.out.println("Como vemos, el mapa quedó intacto: " + m);

		System.out.println("\n");
		
		//Para ordenar por la clave directamente podemos usar un TreeMap
		TreeMap<String, Double> treeMap = new TreeMap<>();
		treeMap.putAll(m);
		System.out.println("Mapa ordenado por nombre: " + treeMap);
		
	}
}