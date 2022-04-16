package act1;

public class Persona {
	
	/*
	 * @Auth Adria Queralt
	 */
	
	//var
	public enum Sexo{Hombre,Mujer};	
	
	
	private String nombre;
	private Sexo sexo;
	private int edad;
	private String dNI;
	private double peso;
	private double altura;

	//constructors
	public Persona() {
		//super();
		this.nombre = "";
		this.edad = 0;
		this.peso = 0;
		this.altura = 0;
		this.sexo = sexo.Hombre;
	}
	
	public Persona(String nombre, Sexo sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, Sexo sexo, int edad, String dNI, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.dNI = dNI;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + dNI + ", peso=" + peso + ", altura=" + altura
				+ "]";
	}

	//get set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getdNI() {
		return dNI;
	}

	public void setdNI(String dNI) {
		this.dNI = dNI;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



	

}
