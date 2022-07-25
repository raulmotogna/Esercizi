package letturaEScritturaFile;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * - creare randomicamente le targhe (del tipo XC45FR, quindi 2 caratteri maiuscoli, seguiti da 2 cifre da 0 a 9 e altri 2 caratteri maiuscoli. -->FATTO
 * 
 * - le targhe devono essere univoche (eseguire un controllo prima di scrivere su file, in caso di collisione lanciare 
     una eccezione custom, VehicleDuplicationException.
 */

public class Targa {

	private static final String [] caratteri = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z"};
	
	private final int [] cifre = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	private static String targa;
	
	static StringBuffer thebuffer;
	
	private static List<String> listaTarghe = new ArrayList<>();
	
	//COSTRUTTORE
	public Targa() {
		
	}
	
	//METODI

	
	
	//Per fare questo metodo ho preso spunto da un metodo simili su internet che ho adattato alla mia esigenza. 
	//La classe è da mettere a posto cancellando le cose che non servono come in questo caso i due array che avevo creato, 
	//ma prima di cancellare tutto e dover riscrivere po vi condivido il tutto e se va bene come l'ho fatto, procedo poi con il togliere le cose superflue.
	public static  String prendiLettere(int i) {
		byte[] bytearray;
		bytearray = new byte[256]; 
		String stringaLettere;
		StringBuffer thebuffer;
        new Random().nextBytes(bytearray);
        stringaLettere = new String(bytearray, Charset.forName("UTF-8"));
        thebuffer = new StringBuffer(); 
        
		for(int m = 0; m < stringaLettere.length(); m++ ) {
			char n = stringaLettere.charAt(m);
			if ((n >= 'A' && n <= 'Z') && (i > 0)) {
				thebuffer.append(n);
				i--; 
			}
		}
		return thebuffer.toString(); 
		
	}
	

	public static  String prendinumeri(int i) {
		byte[] bytearray;
		bytearray = new byte[256]; 
		String stringaNumeri;
		StringBuffer thebuffer;
        new Random().nextBytes(bytearray);
        stringaNumeri = new String(bytearray, Charset.forName("UTF-8"));
        thebuffer = new StringBuffer(); 
        
		for(int m = 0; m < stringaNumeri.length(); m++ ) {
			char n = stringaNumeri.charAt(m);
			if ((n >= '0' && n <= '9') && (i > 0)) {
				thebuffer.append(n);
				i--; 
			}
		}
		return thebuffer.toString(); 
		
	}
	
	
	
	public static String randomTarga() {
		int i = 2;
		return targa = prendiLettere(i) +  prendinumeri(i) + prendiLettere(i);
		
	}
	
	public void aggiungiAListaTarghe() {
		listaTarghe.add(targa);
	}
	
//	public static void main(String[] args) {
//		
//		System.out.println("Targa: "+ randomTarga());
//
//	}

	
	
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
