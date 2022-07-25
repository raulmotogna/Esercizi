package letturaEScritturaFile;

import java.util.Random;

/*
 * - i nominativi devono essere presi da un array statico definito da qualche parte, che contiene le stringhe 
     (nome e cognome in un unico attributo). 
     (creare 30 persone, vanno bene anche supereroi, minny e paperino).
 */

public class NomeProprietario {

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
	
	private Random randomProprietario = new Random();
	
	//COSTRUTTORE
	public NomeProprietario() {
		
	}
	
	//METODI
	
	
	
	
	
	
	
	
	
	
	//GET proprietario
	public static String [] getProprietario() {
		return proprietario;
	}

	//GET/SET randomProprietario
	public Random getRandomProprietario() {
		return this.randomProprietario;
	}

	public void setRandomProprietario(Random randomProprietario) {
		this.randomProprietario = randomProprietario;
	}
	
	@Override
	public String toString() {
		return proprietario + "proprietario";
	}
	
}
