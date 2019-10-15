
public class Clasificador {
	
	private Criterio crit;
	private String etiqueta;
	
	public Clasificador (Criterio c,String etiq){
		crit = c;
		etiqueta = etiq;
	}
	
	public void CategorizarAnimal (AnimalAgro ani){
		if (crit.cumple(ani))
			ani.setCategoria(etiqueta);
	}

}
