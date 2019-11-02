import java.util.ArrayList;


public class OrgAgropecuaria extends ElementoAgropecuario {
	
	private ArrayList<ElementoAgropecuario> elementos;
	
	public OrgAgropecuaria (){
		
		elementos = new ArrayList<ElementoAgropecuario>();
		
	}
	
	public OrgAgropecuaria getOrganizacion() {
		return this;
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
		double pesoT =0 ; 
		for (ElementoAgropecuario ele : elementos) {
			pesoT += ele.pesoTotal();
		}
		return pesoT;
	}
	
	public boolean darDeBaja(Integer i) {
		boolean aux = false;
		//for(ElementoAgropecuario elem : elementos) {
		for (int j =0;j<elementos.size();j++) {	
			if (elementos.get(j).darDeBaja(i)) {
			//if (elem.darDeBaja(i)) {
				
				elementos.remove(elementos.get(j));
				aux = true;
				//System.out.println("Eliminar animal  (DarDeBaja)");
				//System.out.println("El animal : "+elem.getId()+"-raza : "+a.getRaza()+" - pesa : "+a.getPeso());
				
			}
		}
		return aux;
		
		
					
	}
	
		
		
	
}
