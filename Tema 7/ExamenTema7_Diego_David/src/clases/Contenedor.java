package clases;

/**
 * @author Ruben Alarcon Galvez <rubenalarcongalvez@gmail.com>
 */
public class Contenedor {

	private static Componente[] componentes;
	private static int SlotsOcupados = 0;

	//El número no puede ser negativo, si lo es, nos devuelve 0
	public Contenedor(int numMaxComponentes) {
		if (numMaxComponentes > 0) {
			componentes = new Componente[numMaxComponentes];
		} else {
			componentes = new Componente[5];
		}
		SlotsOcupados++;
	}

	//Si es posible, lo hace, si no, no
	public boolean add(Componente componente) {
		boolean hecho = true;
		
		if (SlotsOcupados == componentes.length) {
			hecho = false;
		} else {
			for (int i = 0; i < SlotsOcupados; i++) {
				if (componentes[i].superficie() == componente.superficie()) {
					hecho = false;
				}
			}
		}
		componentes[SlotsOcupados++] = componente;
		return hecho;
	}

	public int numComponentes() {
		return SlotsOcupados;
	}

	public Componente eliminar() {
		Componente c1 = null;

		if (SlotsOcupados > 0) {
			c1 = componentes[0];
			for (int i = 0; i < SlotsOcupados - 1; i++) {
				componentes[i] = componentes[i + 1];
			}
			
			componentes[--SlotsOcupados] = null;
			
			return c1;
		}

		return c1;
	}

	@Override
	public String toString() {
		return (componentes[0].toString() + "\n" + "Total Pixeles en Contenedor: " + "\n");
	}
}