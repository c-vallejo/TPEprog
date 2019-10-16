
public class Camion {
	
	private int capacidad;
	private Criterio crit;
	
	public Camion(int cap, Criterio c) {
		capacidad = cap;
		crit = c;
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
}
