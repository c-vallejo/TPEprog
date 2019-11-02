
public class CriterioCapado implements Criterio {
	
	private boolean bool;

	public CriterioCapado(boolean b){
		bool = b;
	}
	
	public boolean cumple(AnimalAgro animal) {
		
		return (animal.isCapado() == bool);
	}
	
	

}
