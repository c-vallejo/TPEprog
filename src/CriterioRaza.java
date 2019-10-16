
public class CriterioRaza implements Criterio {
	
	String raza;
	
	public CriterioRaza(String r) {
		raza = r;
	}
	
	public boolean cumple(AnimalAgro a) {
		return(a.getRaza().equals(raza));
	}
}


