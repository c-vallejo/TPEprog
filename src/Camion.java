import java.util.ArrayList;

public class Camion {
	
	private int capacidad;
	private Criterio crit;
	private ArrayList<AnimalAgro> carga;
	
	public Camion(int cap, Criterio c) {
		capacidad = cap;
		crit = c;
		carga = new ArrayList<AnimalAgro>();
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @return the criterio
	 */
	public Criterio getCriterio() {
		return crit;
	}
	
	public void cargarCamion(AnimalAgro a) {
		carga.add(a);
	}
	
}
