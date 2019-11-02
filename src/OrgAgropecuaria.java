import java.util.ArrayList;


public class OrgAgropecuaria extends ElementoAgropecuario {
	private String tipo;
	private ArrayList<ElementoAgropecuario> elementos;
	private ArrayList<Clasificador> clasificacion;
	
	public OrgAgropecuaria (String tip){
		tipo = tip;
		elementos = new ArrayList<ElementoAgropecuario>();
		clasificacion = new ArrayList<Clasificador>();
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
			animales.addAll(elem.getAnimales());
		}
		return animales;
		}
	
	
	public void addElementos(ElementoAgropecuario elemento){
		elementos.add(elemento);
	}
	
	public ArrayList<AnimalAgro> buscar(Criterio c){
		ArrayList<AnimalAgro> res = new ArrayList<AnimalAgro>();
		for (ElementoAgropecuario elem : elementos){
			res.addAll(elem.buscar(c));
		}	
		return res;	
	}
	
	public void addClasificador(Clasificador cla) {
		clasificacion.add(cla);
	}
	
	public String clasificar(AnimalAgro ani){
	
		Integer a = ani.getId();
		String categoria = a.toString() ;
		
		for (Clasificador cla : clasificacion) {
			String aux =cla.clasificar(ani);
			if (aux!=null)
				categoria += "-" + aux;
		}
		
		return categoria;
			
	}
	
	public int cantidadAnimales (){
		return this.getAnimales().size();
	}
	

	public double promedioPeso() {
		if (this.getAnimales().size()>0) 
			return (this.pesoTotal()/this.getAnimales().size());
		else 
			return 0;
	}
	
	public double getPromedioEdad() {
		double edad_total = 0;
		for (ElementoAgropecuario elem : elementos) {
			edad_total+= elem.getPromedioEdad();
		}
		
		if (this.cantidadAnimales()>0) 
			return (edad_total/this.cantidadAnimales());
		else 
			return 0;
	}
	
	public double pesoTotal() {
		double peso_total = 0;
		ArrayList<AnimalAgro> grupoAnimal = this.getAnimales();
		for (AnimalAgro ani : grupoAnimal) {
			peso_total+= ani.getPeso();
		}
		return peso_total;
	}
	
	public boolean darDeBaja(Integer i) {
		boolean aux = false;
		for(ElementoAgropecuario elem : elementos) {
			if (elem.darDeBaja(i)) {
				elementos.remove(elem);
				aux = true;
			}
		}
		return aux;
	}
	
	public void vender(Camion c) {
	  c.cargarCamion(this);
	}
		
	
}
