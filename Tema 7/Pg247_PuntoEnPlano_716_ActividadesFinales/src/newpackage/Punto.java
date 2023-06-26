package newpackage;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Punto {

	private double componenteX;
	private double componenteY;

	public Punto(double componenteX, double componenteY) {
		if (componenteX < 0 || componenteY < 0) {
			System.out.println("Punto no válido. No puede ser negativo");
		} else {
			this.componenteX = componenteX;
			this.componenteY = componenteY;
		}
	}

	public double getComponenteX() {
		return componenteX;
	}

	public void setComponenteX(double componenteX) {
		if (componenteX < 0) {
			System.out.println("Componente no válido. No puede ser negativo");
		} else {
			this.componenteX = componenteX;
		}
	}

	public double getComponenteY() {
		return componenteY;
	}

	public void setComponenteY(double componenteY) {
		if (componenteY < 0) {
			System.out.println("Componente no válido. No puede ser negativo");
		} else {
			this.componenteY = componenteY;
		}
	}

	public void desplazaX(double cantidad) {
		this.componenteX += cantidad;
	}

	public void desplazaY(double cantidad) {
		this.componenteY += cantidad;
	}

	public void desplaza(double cantidadX, double cantidadY) {
		this.componenteX += cantidadX;
		this.componenteY += cantidadY;
	}

	public double distanciaEuclidea(Punto otro) {
		return (Math.sqrt(Math.pow((otro.componenteX - this.componenteX), 2) + Math.pow((otro.componenteY - this.componenteY), 2)));
	}

	public void muestra() {
		System.out.println("Punto: (" + getComponenteX() + ", " + getComponenteY() + ")");
	}
}
