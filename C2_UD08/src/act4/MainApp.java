package act4;

import act4.Serie.Creador;
import act4.Serie.Genero;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * @Auth Adria Queralt
		 */
		Creador akiraToryiama = Creador.Picachu;
		Creador picachu = Creador.Picachu;
		Genero mujer = Genero.Mujer;
		Genero hombre = Genero.Hombre;
		
		Serie s1 = new Serie();
		Serie s2 = new Serie("el señor de los fingers de pollo",akiraToryiama.Atari );
		Serie s3 = new Serie("batman",8, true,mujer,picachu);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
