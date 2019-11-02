
public class TP_ProgII {
	
	public static void imprimirAnimal(AnimalAgro a) {
		System.out.println("El animal : "+a.getId()+"-raza : "+a.getRaza()+" - pesa : "+a.getPeso());
	}
	public static void imprimirOrgAgro(OrgAgropecuaria org) {
		
		for (AnimalAgro o : org.getAnimales()) {
			//System.out.println("El animal : "+o.getId()+"-raza : "+o.getRaza()+" - pesa : "+o.getPeso());
			imprimirAnimal(o);
		}
	}
	public static void imprimirCamion(Camion c) {
		
		for (AnimalAgro a : c.getCarga()) {
			imprimirAnimal(a);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompaniaAgro compania = new CompaniaAgro("Soluciones Agro");
		
		AnimalAgro v1 = new AnimalAgro(400.00,28,"Angus",'F',false);
		AnimalAgro v2 = new AnimalAgro(300.00,48,"Aberdinangus",'F',false);
		AnimalAgro v3 = new AnimalAgro(200.00,38,"Holando",'F',false);
		AnimalAgro v4 = new AnimalAgro(600.00,68,"Hereford",'F',false);
		AnimalAgro t1 = new AnimalAgro(800.00,48,"Jersey",'M',false);
		AnimalAgro t2 = new AnimalAgro(850.00,55,"Brangus",'M',true);
		
		OrgAgropecuaria rodeo = new OrgAgropecuaria();
		rodeo.addElementos(v1);
		rodeo.addElementos(v3);
		rodeo.addElementos(v2);
		
		OrgAgropecuaria estab = new OrgAgropecuaria();
		estab.addElementos(v4);
		estab.addElementos(t1);
		estab.addElementos(t2);
		
		compania.addOrg(rodeo);
		compania.addOrg(estab);
	
		CriterioPesoMayorA critPesMay = new CriterioPesoMayorA(400.00);
		CriterioPesoMenorA critPesMen = new CriterioPesoMenorA(400.00);
		Criterio critEda = new CriterioEdadMayorA(39);
		Criterio criMix = new CriterioAnd(critEda,critPesMay);
		
		Criterio crite = new CriterioEdadMenorA(8);
		Criterio crit = new CriterioEdadMayorA(24);
		
		
		Clasificador cla1 = new Clasificador (crite,"LECHAL");
		Clasificador cla2 = new Clasificador (crit,"");
		
		Camion cam1 = new Camion(40,critPesMay);
		Camion cam2 = new Camion(40,critPesMen);
		Camion cam3 = new Camion(40,criMix);
		
		System.out.println("Organizacion antes de vender");
		imprimirOrgAgro(estab);
		System.out.println("-----------------------------------------------------------------------------------");
		
		compania.vender(cam1,estab);
		
		
		System.out.println("Camion cargado");
		imprimirCamion(cam1);
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("Organizacion despues de vender");
		imprimirOrgAgro(estab);
		System.out.println("-----------------------------------------------------------------------------------");
		
		
		
	
	}

}
