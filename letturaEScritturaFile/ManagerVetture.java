package letturaEScritturaFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ManagerVetture {

	private static final String [] proprietario = 
		{
			"Cristiano Ronaldo",
			"Paulo Dybala",
			"Francesco Totti",
			"Diego Milito",
			"Alessandro Del Piero",
			"Claudio Marchisio",
			"Bobo Vieri",
			"Ronaldo il fenomeno",
			"Pavel Nedved",
			"Federico Chiesa", //10
			"Paul Pogba",
			"Lionel Messi",
			"Frank Lampard",
			"Jonh Terry",
			"Rio Ferdinand",
			"Garry Nevile",
			"Paul Schoolse",
			"Giorgio Chiellini",
			"Kevin De Bruine",
			"Tibois Curtois", //20
			"Gianluigi Buffon",
			"Giorgio Donnarumma",
			"Leonardo Bonucci",
			"Angel Di Maria",
			"Fabio Coentrao",
			"Neymar Jr",
			"Leonardo Paredes",
			"Cristian Chivu",
			"Adrian Mutu",
			"Gica Hagi" //30
			};
	
	private static final String [] caratteri = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "Z"};
	
	private static final int [] cifre = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	
	//metodi targa
	public static String randomCaratteri() {
	    int lettera = new Random().nextInt(caratteri.length);
	    return caratteri[lettera];
	}
	
	public static int randomCifre() {
		int cifra = new Random().nextInt(cifre.length);
		return cifre[cifra];
	}
	
	public static String randomTarga() {
		return  randomCaratteri() +randomCaratteri() + randomCifre() + randomCifre() + randomCaratteri() +randomCaratteri();
	}
	
	//metodi proprietario
	public static String randomProprietario() {
		int prop = new Random().nextInt(proprietario.length);
		return proprietario[prop];
	}
	
	//metodo vettura
	public static Vettura creaVettura() {
		Vettura vettura = new Vettura(EnumMarca.randomMarcaa() , randomTarga(), randomProprietario());
		return vettura;
	}
	
	//Creazione file
	public static boolean nuovoFile() {
	    String path = "C:\\Users\\Motogna\\eclipse-workspace\\letturaEScritturaFile\\src\\vetture.txt";
	    try {
	        File vetture = new File(path);
	        if (vetture.exists())
	            System.out.println("Il file " + path + " esiste");
	        else if (vetture.createNewFile())
	            System.out.println("Il file " + path + " è stato creato");
	        else
	            System.out.println("Il file " + path + " non può essere creato");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		return false;
	}
	
	//Scrittura su file
	public static boolean scriviFile() {
	    String path = "C:\\Users\\Motogna\\eclipse-workspace\\letturaEScritturaFile\\src\\vetture.txt";
	    try {
	        File vetture = new File(path);
	        FileWriter fileScritto = new FileWriter(vetture);
	        for(int i=0; i <31; i++) {
	        	fileScritto.write("" +EnumMarca.randomMarcaa()+ "\t" + "|" + "\t" +randomTarga()+ "\t" + "|" + "\t" +randomProprietario()+"\n");
	        }
	        fileScritto.flush();
	        fileScritto.close();
	    }
	    catch(IOException e) {
	        e.printStackTrace();
	    }
		return false;
	}
	
	
	
	
	
	
	//Creato per fare una prova sull'eccezione creata
	
//	static List<Vettura> listaVetture = new ArrayList<>();
//	
//	public static void aggiungiVettura() throws VehicleDuplicationException {
//		try {
//			listaVetture.add(creaVettura());
//		    if(listaVetture.contains(proprietario)) {
//			    throw new VehicleDuplicationException();
//			}
//		} 
//		catch(VehicleDuplicationException vdex) {
//			System.out.println("Stringa gia presente");
//		}
//	}
	

	public static void main(String[] args) {
		System.out.println(scriviFile());
	}
	
	
	@Override
	public String toString() {
		return "" +EnumMarca.randomMarcaa()+ "\t" + "|" + "\t" +randomTarga()+ "\t" + "|" + "\t" +randomProprietario()+"";
	}
	
	
}
