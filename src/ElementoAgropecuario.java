import java.util.ArrayList;


public abstract class ElementoAgropecuario {
	
	public abstract ArrayList<AnimalAgro> buscar(Criterio c);
	public abstract ArrayList<AnimalAgro> getAnimales();
	public abstract boolean darDeBaja(Integer id);
}
