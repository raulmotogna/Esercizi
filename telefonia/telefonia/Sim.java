package telefonia;

import java.util.ArrayList;
import java.util.List;




public class Sim {
	
	private String numeroTelefono;
	private double credito;
	private List<Telefonata> listaTelefonate ;
	
	public Sim(String numeroTelefono, double credito) {
		this.numeroTelefono = numeroTelefono;
		this.credito = credito;
		this.listaTelefonate = new ArrayList<>();
	}
	
	
	//METODI
	
	public void aggiungiTelefonata(Sim numeroChiamatante, Sim numeroChiamato, long durataChiamata) {
		Telefonata telefonata = new Telefonata(numeroChiamatante, numeroChiamato, durataChiamata);
		listaTelefonate.add(telefonata);
	}
	
	public long durataTotaleTelefonata() {
		long durataTotale = 0;
		for(Telefonata telefonata : listaTelefonate) {
			durataTotale += telefonata.getDurataChiamata();
		}
		return durataTotale;
	}
	
	
	public int numeroTelefonateVerso(Sim numeroChiamato) {
		int numeroTotale = 0;
		for(Telefonata telefonata : listaTelefonate) {
			Sim simNumeroChiamato=telefonata.getNumeroChiamato();
			//String numero=simNumeroChiamato.getNumeroTelefono();
			if(simNumeroChiamato.equals(numeroChiamato)) {
				numeroTotale ++;
			}
		}
		return numeroTotale;
	}
	/*
	public void datiSim(String numeroTelefono) { //non serve! stampa tutte le chiamate di questa sim
		List<Sim> listaSim = new ArrayList<>(); //lista vuota! non fa nulla il ciclo dopo
		for(Sim sim : listaSim) { //non ha senso
			String numeroSelezionato = sim.getNumeroTelefono();
			if(numeroSelezionato.equals(numeroTelefono)) {
				System.out.println("numeroTelefono + credito");
			}
		}
		
		//quello che fa: stampa tutte le telefonate fatte da questa sim verso il numero passato in input (numerotelefono)
		for(Telefonata telefonata : listaTelefonate) {
			Sim numeroChiamante = telefonata.getNumeroChiamante();
			String numeroSelezionato = numeroChiamante.getNumeroTelefono();
			if(numeroSelezionato.equals(numeroTelefono)) {
				System.out.println(telefonata); 
			}
		}
	}*/

	public void stampaDatiSim() {
		System.out.println("Numero: "+this.numeroTelefono);
		System.out.println("Credito: "+this.getCredito());
		System.out.println("Lista chiamate:");
		for (Telefonata telefonata:listaTelefonate) {
			System.out.println(telefonata.getNumeroChiamato()+"\t"+telefonata.getDurataChiamata()+" min");
		}
	}

	
	//GET/SET numeroTelefono
	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	//GET/SET credito
	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	//GET/SET listaTelefonate
	public List<Telefonata> getListaTelefonate() {
		return listaTelefonate;
	}

	public void setListaTelefonate(List<Telefonata> listaTelefonate) {
		this.listaTelefonate = listaTelefonate;
	}






	

	

}
