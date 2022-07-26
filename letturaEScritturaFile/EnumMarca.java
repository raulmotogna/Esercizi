package letturaEScritturaFile;

import java.util.Random;

public enum EnumMarca {

	FIAT,
	ALFA_ROMEO,
	TOYOTA,
	FERRARI,
	FORD,
	BMW;
	
	
	public static EnumMarca randomMarcaa() {
	    int marca = new Random().nextInt(EnumMarca.values().length);
	    return EnumMarca.values()[marca];
	}
	
}
