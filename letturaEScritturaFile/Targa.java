package letturaEScritturaFile;

import java.nio.charset.Charset;
import java.util.Random;

/*
 * - creare randomicamente le targhe (del tipo XC45FR, quindi 2 caratteri maiuscoli, seguiti da 2 cifre da 0 a 9 e altri 2 caratteri maiuscoli.
 * 
 * - le targhe devono essere univoche (eseguire un controllo prima di scrivere su file, in caso di collisione lanciare 
     una eccezione custom, VehicleDuplicationException.
 */

public class Targa {

	private final String [] caratteri = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z"};
	
	private final int [] cifre = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	private Random randomCaratteri = new Random();//2caratteri
	private Random randomCifre = new Random();//2cifre
	
	private String targa;
	
	StringBuffer thebuffer;
	
	//COSTRUTTORE
	public Targa() {

	}
	
	//METODI
	public String componiTarga(int i) {
		
		for(int i = 0; i < caratteri.length; i++ ) {
			char n = targa.charAt(i);
			if ((n >= 'A' && n <= 'Z') && (i > 0)) {
				thebuffer.append(n);
				i--; 
			}
		}
		return thebuffer.toString(); 
		
	}
	
	
	

	

	
	
	
	

	//GET caratteri
	public String[] getCaratteri() {
		return this.caratteri;
	}

	//GET cifre
	public int [] getCifre() {
		return this.cifre;
	}

	
	//GET/SET targa
	public String getTarga() {
		return this.targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	@Override
	public String toString() {
		return targa + "targa";
	}
	
}
