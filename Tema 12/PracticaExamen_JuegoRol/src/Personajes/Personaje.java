package Personajes;

import java.io.Serializable;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public abstract class Personaje implements Comparable<Personaje>, Serializable {
	private final int codigo;
	private int vida;
	private static int contador;
	
	public Personaje(int numeroDistintivo, int vida) {
		this.codigo = Integer.parseInt(String.valueOf(numeroDistintivo) + String.valueOf(contador++)); //Así siempre aparecerá primero el numeroDistintivo y se irá sumando a la derecha el contador
		if (vida >= 0) this.vida = vida;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	@Override
	public int compareTo(Personaje p2) {
		return this.vida - p2.vida;
	}

	@Override
	public String toString() {
		return "Personaje: " + this.getClass().getSimpleName() + "\nCódigo: " + codigo + "\nVida: " + vida;
	}
	
}