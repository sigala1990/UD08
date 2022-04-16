package act3;

import act3.Electrodomestico.Color;
import act3.Electrodomestico.ConsumoEnergetico;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @Auth Adria Queralt
		 */
		Color c1 = Color.azul;
		ConsumoEnergetico consumo1 = ConsumoEnergetico.D;
		Electrodomestico ele1 = new Electrodomestico();
		Electrodomestico ele2 = new Electrodomestico(5.5,80);
		Electrodomestico ele3 = new Electrodomestico(545, c1 ,consumo1,67);
		
		System.out.println(ele1+ "\n" +ele2 + "\n" +ele3);
	}

}
