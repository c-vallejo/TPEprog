
public class CriterioPesoMayorA implements Criterio {
	
	double peso;
	
	public CriterioPesoMayorA(double p) {
		peso = p;
	}
	
	public boolean cumple(AnimalAgro a) {
		return(a.getPeso()>=peso);
	}

}
