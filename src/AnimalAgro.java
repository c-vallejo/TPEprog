import java.util.ArrayList;
public class AnimalAgro extends ElementoAgropecuario{
	
	private static Integer contador=0;
	private int id ;
	private double peso;
	private int edad;
	private String raza;
	private Character sexo;
	private boolean capado;
	private int paridos;
	
	public AnimalAgro(double pes, int eda, String raz, Character sex, boolean cap){
		contador++;
		id=contador;
		peso = pes;
		edad = eda;
		raza = raz;
		sexo = sex;
		capado = cap;
		paridos = 0;
		
	}
	
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the capado
	 */
	public boolean isCapado() {
		return capado;
	}

	/**
	 * @param capado the capado to set
	 */
	public void setCapado(boolean capado) {
		this.capado = capado;
	}

	/**
	 * @return the paridos
	 */
	public int getParidos() {
		return paridos;
	}

	/**
	 * @param paridos the paridos to sethara
	 */
	public void setParidos(int paridos) {
		this.paridos = paridos;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @return the sexo
	 */
	public Character getSexo() {
		return sexo;
	}
	
	
	
	public void actualizarPeso(double pes) {
		this.setPeso(pes);
	}

	
	public ArrayList<AnimalAgro> getAnimales(){
		ArrayList<AnimalAgro> res = new ArrayList<AnimalAgro>();
		res.add(this);
		return res;
	}
	
	
	public ArrayList<AnimalAgro> buscar(Criterio c){
		ArrayList<AnimalAgro> res = new ArrayList<AnimalAgro>();
		if(c.cumple(this)) {
			res.add(this);
		}
		return res;
	}
	
	public boolean darDeBaja(Integer i) {
		if (this.getId().equals(i))
			return true;
		else
			return false;
	}
	
	public double getPromedioEdad() {
		return edad;
	}
	
	public double pesoTotal() {
		return peso;
	}
}
	
	

