package AplicacionExamen;

import Personajes.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 * @param <T>
 */
public class Ejercito<T extends Personaje> implements Serializable {
	private ArrayList<T> ejercito;

	public Ejercito() {
		this.ejercito = new ArrayList<>();
		int unidades = (int) (Math.random() * 4) + 3;
		
		for (int i = 0; i < unidades; i++) {
			if (i != unidades - 1) {  //Si no es el último slot, que está reservado al jefe, será guerrero
				ejercito.add((T) new Guerrero());
			} else {
				ejercito.add((T) new Jefe());
			}
		}
	}
	
	public void compararPorVida() {
		ArrayList<T> lista = new ArrayList<>(); //Para no alterar la principal
		lista.addAll(ejercito);
		lista.sort(Comparator.reverseOrder()); //Ordena por defecto por el compareTo de Personaje (descendiente)
		
		String resultado = "";
		
		for (int i = 0; i < lista.size(); i++) {
			resultado += lista.get(i).toString() + "\n\n";
		}
		
		System.out.println(resultado.stripTrailing());
	}
	
	public boolean quedanVivos() {
		boolean quedanVivos = false;
		
		for (int i = 0; i < ejercito.size() - 1 && quedanVivos == false; i++) { //-1 porque no contamos al jefe, que siempre va al final
			if (ejercito.get(i).getVida() > 0) {
				quedanVivos = true;
			}
		}
		
		return quedanVivos;
	}
	
	public boolean derrotados() {
		boolean derrotado = false;
		
		Jefe jefe = (Jefe) ejercito.get(ejercito.size() - 1); //Sabemos que es un jefe porque es el último
		
		if (jefe.getVida() <= 0 && jefe.getVidaExtra() <= 0) derrotado = true;
		
		return derrotado;
	}
	
	public void esAtacado() {
		int danio = (int) (Math.random() * 11); //De 0 a 10
		int posicionGuerrero = (int) (Math.random() * (ejercito.size() - 1)); //No contamos al jefe
		
		if (quedanVivos() == false) {
			Jefe jefe = (Jefe) ejercito.get(ejercito.size() - 1); //Sabemos que es un jefe porque es el último
			if (jefe.getVida() <= 0) {
				jefe.setVidaExtra(jefe.getVidaExtra() - danio);
			} else {
				jefe.setVida(jefe.getVida() - danio);
			}
		} else {
			ejercito.get(posicionGuerrero).setVida(ejercito.get(posicionGuerrero).getVida() - danio);
		}
	}
	
	@Override
	public String toString() {
		String resultado = "";
		
		for (int i = 0; i < ejercito.size(); i++) {
			resultado += ejercito.get(i).toString() + "\n\n";
		}
		
		return resultado.stripTrailing();
	}
	
}