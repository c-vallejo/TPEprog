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
	
	public void cargarCamion(OrgAgropecuaria org) {
		ArrayList<AnimalAgro> animalesVenta = new ArrayList<AnimalAgro>();
		animalesVenta = org.getAnimales();
		int indice = 0;
		int capacidad = 0;
		while (capacidad<this.getCapacidad() && indice<animalesVenta.size()) {
			if (crit.cumple(animalesVenta.get(indice))) {
				this.cargarCamion(animalesVenta.get(indice));
				org.darDeBaja(animalesVenta.get(indice).getId());
				indice++;
				capacidad++;
			}else{
				indice++;
			}
		}

	}
}
