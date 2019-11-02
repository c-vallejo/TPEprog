
public class TP_ProgII {
	
	public static void imprimirAnimal(AnimalAgro a) {
		System.out.println("El animal: "+a.getId()+" de raza: "+a.getRaza()+" pesa :"+a.getPeso());
	}
	public static void imprimirOrgAgro(OrgAgropecuaria org) {
		
		for (AnimalAgro o : org.getAnimales()) {
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
		
		AnimalAgro v1 = new AnimalAgro(400.00,23,"Angus",'F',false);
		AnimalAgro v2 = new AnimalAgro(300.00,7,"Aberdinangus",'F',false);
		AnimalAgro v3 = new AnimalAgro(200.00,6,"Holando",'F',false);
		AnimalAgro v4 = new AnimalAgro(600.00,68,"Hereford",'F',false);
		AnimalAgro t1 = new AnimalAgro(800.00,48,"Jersey",'M',false);
		AnimalAgro t2 = new AnimalAgro(850.00,55,"Brangus",'M',true);
		
		
		v2.setParidos(5);
		
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
	
		CriterioPesoMayorA critPesMay = new CriterioPesoMayorA(650.00);
		CriterioPesoMenorA critPesMen = new CriterioPesoMenorA(400.00);
		Criterio critEda = new CriterioEdadMayorA(39);
		Criterio criMix = new CriterioAnd(critEda,critPesMay);
		
		
		Criterio crite = new CriterioEdadMenorA(8);
		Criterio crit24 = new CriterioEdadMenorA(24);
		Criterio crit12 = new CriterioEdadMayorA(12);
		Criterio critmixto = new CriterioAnd(crit24,crit12);
		Criterio isVaca = new CriterioParidos(1);
		
		Clasificador cla1 = new Clasificador (crite,"LECHAL");
		Clasificador cla2 = new Clasificador (critmixto,"AÑOJO");
		Clasificador cla3 = new Clasificador(isVaca,"VACA");
		
		compania.addClasificador(cla1);
		compania.addClasificador(cla2);
		compania.addClasificador(cla3);
		
		System.out.println("Clasificador animales  ");
		for (AnimalAgro ani : rodeo.getAnimales() ) {
			System.out.println("----"+compania.clasificar(ani));
		}
		
		
		
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
