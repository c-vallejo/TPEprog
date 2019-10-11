
public class CriterioPesoMenorA implements Criterio{
	
	double peso;
	
	public CriterioPesoMenorA(double p) {
		peso = p;
	}
	
	public boolean cumple(AnimalAgro a) {
		return(a.getPeso()<=peso);
	}
}
