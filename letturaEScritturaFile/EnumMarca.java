package letturaEScritturaFile;

import java.util.Random;

public enum EnumMarca {

	FIAT,
	ALFA_ROMEO,
	TOYOTA,
	FERRARI,
	FORD,
	BMW;
	
	
	public EnumMarca randomMarcaa() {
	    int rand = new Random().nextInt(EnumMarca.values().length);
	    return EnumMarca.values()[rand];
	}
	
//	public static void main(String[] args) {
//		System.out.println(randomMarcaa());
//	}
	
}
