
public class CriterioEdadMenorA {

	int edad;
	
	public CriterioEdadMenorA(int e) {
		edad = e;
	}
	
	public boolean cumple(AnimalAgro a) {
		return(a.getEdad()<=edad);
	}
	
}
