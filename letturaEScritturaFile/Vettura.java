package letturaEScritturaFile;

import java.util.List;
import java.util.Random;

/*
 * - creare vetture in modo randomico.
 */

public class Vettura {
	
	private EnumMarca marca;
	private String targa;
	private String nomeProprietario;
	
	//COSTRUTTORE
	public Vettura(EnumMarca marca, String targa, String nomeProprietario) {
		this.marca = marca;
		this.targa = targa;
		this.nomeProprietario = nomeProprietario;
	}
	
	//METODI 
	public void nuovaVettura() {
		
	}
	
	
	
	
	
	
	
	
	
	

	//GET/SET marca
	public EnumMarca getMarca() {
		return this.marca;
	}

	public void setMarca(EnumMarca marca) {
		this.marca = marca;
	}

	//GET/SET targa
	public String getTarga() {
		return this.targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	//GET/SET nomeProprietario
	public String getNomeProprietario() {
		return this.nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	
	
	@Override
	public String toString() {
		return "Vettura: " +marca+ "\t" +targa+ "\t" +nomeProprietario+"";
	}
	
}
