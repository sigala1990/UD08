package act1;
/*
 * @Auth Adria Queralt
 */

import act1.Persona.Sexo;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sexo mujer = Sexo.Mujer;
	//	SEXO hombre = SEXO.Hombre;
		
		Persona empleado1 = new Persona();
		Persona empleado2 = new Persona("juan",mujer, 80 );
		Persona empleado3 = new Persona("pepe",mujer ,19,"2346778r",80,1.6);

		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		
		//int  valor = 0;
	}

}
