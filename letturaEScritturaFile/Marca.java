package letturaEScritturaFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * - La marca deve essere presa, randomicamente da un enum FIAT, ALFA_ROMEO, TOYOTA, FERRARI, FORD, BMW. -->FATTO DENTRO L'ENUM
 */

public class Marca {

	private EnumMarca marca;
	
	//COSTRUTTORE
	public Marca(EnumMarca marca) {
		this.marca = marca;
	}
	
	//METODI


	
	
	//GET/SET marca
	public EnumMarca getMarca() {
		return this.marca;
	}
	
	public void setMarca(EnumMarca marca) {
		this.marca = marca;
	}
	
	
	@Override
	public String toString() {
		return marca + "marca";
	}

}

