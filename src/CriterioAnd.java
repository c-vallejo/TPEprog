
public class CriterioAnd implements Criterio {
	
	Criterio c1,c2;
	
	public CriterioAnd(Criterio cc1, Criterio cc2) {
		c1 = cc1;
		c2 = cc2;
	}
	
	public boolean cumple(AnimalAgro a) {
		return(c1.cumple(a)&& c2.cumple(a));
	}

}
