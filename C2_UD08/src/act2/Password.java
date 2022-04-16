package act2;

public class Password {

	/*
	 * @Auth Adria Queralt
	 */
	private int longitud;
	private String password;
	
	public Password() {
		this.longitud = 8;
		this.password = randomPassword(this.longitud);
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.password = randomPassword(this.longitud);
	}
	
	public String randomPassword(int size) { //recoge valor por codigo ASCII
		int i = 0;
		String passwordfinal = ""; 
		while(i < size) {
			int numRandom = numRandom(1, 4);
			int numTipo = 0;
			switch (numRandom) {
			case 1:
				numTipo = numRandom(48,57); //0-9
				break;
			case 2:
				numTipo = numRandom(65,91); //A-Z
				break;
			case 3:			
				numTipo = numRandom(97,123); //a-z
				break;
			}i++;
			char caracter = (char) numTipo;
			passwordfinal += caracter; 
		}
		return passwordfinal;	
	}
	
	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", password=" + password + "]";
	}
	
	

}
