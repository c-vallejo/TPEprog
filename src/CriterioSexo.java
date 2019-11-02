
public class CriterioSexo implements Criterio{
	
	private Character sexo;
	
	public CriterioSexo(Character s) {
		sexo = s;
	}

	@Override
	public boolean cumple(AnimalAgro animal) {
		// TODO Auto-generated method stub
		return (animal.getSexo().equals(sexo));
	}

}
