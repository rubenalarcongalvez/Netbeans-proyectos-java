package pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Pruebas {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new LinkedHashMap<>();
		mapa.put("Test", 3);
		mapa.put("Door", 3);
		mapa.put("Albanian", 5);
		ArrayList<Map.Entry<String, Integer>> cole = new ArrayList<>(mapa.entrySet());
		cole.sort(Entry.comparingByKey());
		
		System.out.println(mapa.entrySet());
		System.out.println(cole.toString());
		Collections.sort(cole, Entry.comparingByKey());
	}
}