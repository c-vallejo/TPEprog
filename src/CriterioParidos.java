
public class CriterioParidos implements Criterio{
	
	private int paridos;
	
	private CriterioParidos(int p) {
		paridos = p;
	}

	@Override
	public boolean cumple(AnimalAgro animal) {
		return (animal.getParidos() <= paridos);
	}
	

}
