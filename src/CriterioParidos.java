
public class CriterioParidos implements Criterio{
	
	private int paridos;
	
	public CriterioParidos(int p) {
		paridos = p;
	}

	@Override
	public boolean cumple(AnimalAgro animal) {
		return (animal.getParidos() >= paridos);
	}
	

}
