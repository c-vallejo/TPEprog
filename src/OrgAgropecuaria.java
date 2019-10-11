import java.util.ArrayList;


public class OrgAgropecuaria extends ElementoAgropecuario {
	private String tipo;
	private ArrayList<ElementoAgropecuario> elementos;
	
	public OrgAgropecuaria (String tip){
		tipo = tip;
		elementos = new ArrayList<ElementoAgropecuario>();
	}
	
	public boolean esAnimal(){
		return false;
	}
	
	public void setTipo (String tip){
		tipo = tip;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public ArrayList<AnimalAgro> getAnimales(){
		ArrayList<AnimalAgro> animales = new ArrayList<AnimalAgro>() ;
		for (ElementoAgropecuario elem : elementos){
			if (elem.esAnimal())
				animales.add( (AnimalAgro) elem);
			else
				((OrgAgropecuaria)elem).getAnimales();
		}
		return animales;
	}
	public void addElementos(ElementoAgropecuario elemento){
		elementos.add(elemento);
	}
	
	public ArrayList<AnimalAgro> buscar(Criterio c){
		ArrayList<AnimalAgro> res = new ArrayList<AnimalAgro>();
		for (ElementoAgropecuario elem : elementos){
			if ((elem.esAnimal()) && (c.cumple((AnimalAgro)elem)))
				res.add((AnimalAgro) elem);
			else{
				res.addAll(((OrgAgropecuaria)elem).buscar(c));
				
			}
		}	
		return res;	
	}
	
	public int cantidadAnimales (ArrayList<AnimalAgro> animales){
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
