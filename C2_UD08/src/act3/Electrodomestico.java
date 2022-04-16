package act3;

public class Electrodomestico {

	/*
	 * @Auth Adria Queralt
	 */
	
	//var 
	public enum Color{//enum
		blanco,
		negro,
		rojo,
		azul,
		gris
	}
	public enum ConsumoEnergetico{ //enum
		A,B,C,D,E,F
	}
	private double precioBase;
	private Color color;
	private ConsumoEnergetico consumoEnergetico;
	private double peso;
	
	//Constructor
	public Electrodomestico() {
		//super();
		this.precioBase = 100;
		this.color = Color.blanco;
		this.consumoEnergetico = ConsumoEnergetico.F;
		this.peso = 5;
	}

	public Electrodomestico(double precioBase, double peso) {
		//super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = Color.blanco;
		this.consumoEnergetico = ConsumoEnergetico.F;
	}

	public Electrodomestico(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
		//super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	
	//get set
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}



	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso +"]";
	}


	
	
}
