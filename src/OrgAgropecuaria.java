import java.util.ArrayList;


public class OrgAgropecuaria extends ElementoAgropecuario {
	private String tipo;
	private ArrayList<AnimalAgro> animales;
	
	public OrgAgropecuaria (String tip){
		tipo = tip;
		animales = new ArrayList<AnimalAgro>();
	}
	
	public void setTipo (String tip){
		tipo = tip;
	}
	public String getTipo(){
		return tipo;
	}
	public ArrayList<AnimalAgro> getAnimales(){
		return animales;
	}
	public void addAnimales(AnimalAgro animal){
		animales.add(animal);
	}
	
	public ArrayList<AnimalAgro> buscar(Criterio c){
		ArrayList<AnimalAgro> res = new ArrayList<AnimalAgro>();
		for (AnimalAgro a : animales){
			if (c.cumple(a)){
				res.add(a);
			}
		}	
		return res;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
