import java.util.ArrayList;

public class CompaniaAgro {
	
	private String nombre;
	private OrgAgropecuaria principal;
	private ArrayList<Clasificador> clasificacion;
	
	public CompaniaAgro(String n) {
		nombre = n;
		principal = new OrgAgropecuaria();
		clasificacion = new ArrayList<Clasificador>();
	}
	

	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void addOrg(OrgAgropecuaria org) {
		principal.addElementos(org);
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
	
	public void vender(Camion c, OrgAgropecuaria org) {
		  c.cargarCamion(org);
		}
}
