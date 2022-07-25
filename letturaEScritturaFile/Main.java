package letturaEScritturaFile;

import java.util.ArrayList;
import java.util.List;

/*
 * - creare 30 vetture, ogni proprietario possiede una sola vettura.
 * - creare il file con la struttura prevista.
 * - se il programma viene eseguito più volte, verificare la presenza del file precedente, cancellarlo e sostituirlo.
 * 
 * Se trovate buchi di analisi vedetele come libertà implementative, 
 * sfruttatele per creare un programma utilizzando le strutture che più preferite, ma portate a casa il risultato.
 * Il file si dovrà trovare in un percorso su disco specifico, che indicherete voi.
 */

public class Main {
	
	static List<Vettura> listaVetture = new ArrayList<>();
	
	public static void main(String[] args) {
		
		for(String s : proprietario) {
			EnumMarca marca = marca.randomMarcaa();
			String targa = targa.randomTarga();
			Vettura vettura = new Vettura(marca, targa, s);
			}
		
		
		
	}
	
	

	
	
	// .split(|) Metodo per inserire il separatore. Sostituire la virgola tra una lista e l'altra con |
	

}

