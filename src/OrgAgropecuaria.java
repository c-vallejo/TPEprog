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
			if (cla.getCrit().cumple(ani)) 
				categoria += "-" + cla.getEtiqueta();
		}
		
		return categoria;
			
	}
	
	public int cantidadAnimales (){
		return this.getAnimales().size();
	}
	
	public double promedioPeso(ArrayList<AnimalAgro> grupoAnimal) {
		double peso_total = 0;	
		for (AnimalAgro ani : grupoAnimal) {
			peso_total+= ani.getPeso();
		}
		
		if (grupoAnimal.size()>0) 
			return (peso_total/grupoAnimal.size());
		else 
			return 0;
	}
	
	public double promedioEdad(ArrayList<AnimalAgro> grupoAnimal) {
		double edad_total = 0;	
		for (AnimalAgro ani : grupoAnimal) {
			edad_total+= ani.getEdad();
		}
		
		if (grupoAnimal.size()>0) 
			return (edad_total/grupoAnimal.size());
		else 
			return 0;
	}
	
	public double pesoTotal(ArrayList<AnimalAgro> grupoAnimal) {
		double peso_total = 0;	
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
		ArrayList<AnimalAgro> animalesVenta = new ArrayList<AnimalAgro>();
		animalesVenta = this.getAnimales();
		Criterio crit = c.getCriterio();
		int indice = 0;
		int capacidad = 0;
		while (capacidad<c.getCapacidad() && indice<animalesVenta.size()) {
			if (crit.cumple(animalesVenta.get(indice))) {
				c.cargarCamion(animalesVenta.get(indice));
				this.darDeBaja(animalesVenta.get(indice).getId());
				indice++;
				capacidad++;
			}else{
				indice++;
			}
		}
	}
		
	
}
