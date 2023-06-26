package Personajes;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Jefe extends Personaje {
	private int vidaExtra;
	
	public Jefe() {
		super(1, 20);
		
		this.vidaExtra = this.getCodigo() / 2;
	}

	public int getVidaExtra() {
		return vidaExtra;
	}

	public void setVidaExtra(int vidaExtra) {
		this.vidaExtra = vidaExtra;
	}

	@Override
	public String toString() {
		return super.toString() + "\tVida extra: " + vidaExtra;
	}
	
}