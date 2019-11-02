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
	
	public ArrayList<AnimalAgro> getCarga(){
		return carga;
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
		System.out.println("ADD CAMION");
		System.out.println("El animal : "+a.getId()+"-raza : "+a.getRaza()+" - pesa : "+a.getPeso());
	}
	
	public void cargarCamion(OrgAgropecuaria org) {
		ArrayList<AnimalAgro> animalesVenta = new ArrayList<AnimalAgro>();
		animalesVenta = org.getAnimales();
		int indice = 1;
		int capacidad = 0;
		
		
		while (capacidad<this.getCapacidad() && indice<animalesVenta.size()) {
			if (crit.cumple(animalesVenta.get(indice))) {
				this.cargarCamion(animalesVenta.get(indice));
				
				//System.out.println("-----------------------------------------------------------------------------------");
				
				org.darDeBaja(animalesVenta.get(indice).getId());
				indice++;
				capacidad++;
			}else{
				indice++;
			}
		}

	}
}
