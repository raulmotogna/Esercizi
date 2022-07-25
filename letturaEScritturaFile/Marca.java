package letturaEScritturaFile;

import java.util.Random;

/*
 * - La marca deve essere presa, randomicamente da un enum FIAT, ALFA_ROMEO, TOYOTA, FERRARI, FORD, BMW.
 */

public class Marca {

	private EnumMarca marca;

	private Random randomMarca = new Random();
	
	//COSTRUTTORE
	public Marca(EnumMarca marca) {
		this.marca = marca;
	}
	
	//METODI
	public void mostraMarca() {
		
	}
	
	
	
	
	
	
	
	//GET/SET marca
	public EnumMarca getMarca() {
		return this.marca;
	}
	
	public void setMarca(EnumMarca marca) {
		this.marca = marca;
	}
	
	//GET/SET randomMarca
	public Random getRandomMarca() {
		return this.randomMarca;
	}

	public void setRandomMarca(Random randomMarca) {
		this.randomMarca = randomMarca;
	}
	
	@Override
	public String toString() {
		return marca + "marca";
	}

}

