package act4;

public class Serie {
	/*
	 * @Auth Adria Queralt
	 */
	public enum Creador{
		Atari, Picachu,Tomate;
	}
	public enum Genero{
		Hombre,Mujer;
	}
	
	//Var
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private Genero genero;
	private Creador creador; 
	
	//constructor
	public Serie() {
		//super();
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = Genero.Hombre;
		this.creador = Creador.Atari;
	}
		
		
	public Serie(String titulo, Creador creador) {
		//super();
		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = Genero.Hombre;
		this.creador = creador;
	}


	public Serie(String titulo, int numeroTemporadas, boolean entregado, Genero genero,Creador creador) {
		//super();
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
		}

	//Methods
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}


	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}


	public boolean isEntregado() {
		return entregado;
	}


	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public Creador getCreador() {
		return creador;
	}


	public void setCreador(Creador creador) {
		this.creador = creador;
	}


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}


	
}
