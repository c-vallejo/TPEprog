
public class Clasificador {
	
	private Criterio crit;
	private String etiqueta;
	
	public Clasificador (Criterio c,String etiq){
		crit = c;
		etiqueta = etiq;
	}

	/**
	 * @return the etiqueta
	 */
	public String getEtiqueta() {
		return etiqueta;
	}

	/**
	 * @param etiqueta the etiqueta to set
	 */
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	/**
	 * @return the crit
	 */
	public Criterio getCrit() {
		return crit;
	}
	
}
