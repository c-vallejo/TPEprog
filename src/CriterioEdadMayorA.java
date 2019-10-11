
public class CriterioEdadMayorA implements Criterio {
	
	int edad;
	
	public CriterioEdadMayorA(int e) {
		edad = e;
	}
	
	public boolean cumple(AnimalAgro a) {
		return(a.getEdad()>=edad);
	}

}
