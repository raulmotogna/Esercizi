package letturaEScritturaFile;

import java.util.Random;

/*
 * - creare vetture in modo randomico.
 */

public class Vettura {
	
	private Marca marca;
	private Targa targa;
	private NomeProprietario nomeProprietario;
	private Random randomVettura = new Random();
	
	//COSTRUTTORE
	public Vettura() {
		
	}
	
	//METODI 
	
	
	
	
	
	
	
	
	
	
	
	

	//GET/SET marca
	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	//GET/SET targa
	public Targa getTarga() {
		return this.targa;
	}

	public void setTarga(Targa targa) {
		this.targa = targa;
	}

	//GET/SET nomeProprietario
	public NomeProprietario getNomeProprietario() {
		return this.nomeProprietario;
	}

	public void setNomeProprietario(NomeProprietario nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	//GET/SET randomVettura
	public Random getRandomVettura() {
		return this.randomVettura;
	}

	public void setRandomVettura(Random randomVettura) {
		this.randomVettura = randomVettura;
	}
	
	
	@Override
	public String toString() {
		return "Vettura: " +marca+ "\t" +targa+ "\t" +nomeProprietario+"";
	}
	
}
