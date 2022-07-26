package letturaEScritturaFile;

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
	
	
	public static void main(String[] args) {
		System.out.println(creaVettura());
	}
	
	
	
	
	
}
