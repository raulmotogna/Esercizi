package telefonia;

import java.util.Date;

public class Telefonata {
	
	private Sim numeroChiamante;
	private Sim numeroChiamato;
	private Date inizioChiamata;
	private Date fineChiamata;
	
	//Costruttore
	public Telefonata(Sim numeroChiamante, Sim numeroChiamato) {
		this.numeroChiamante = numeroChiamante;
		this.numeroChiamato = numeroChiamato ;
		this.inizioChiamata = new Date();
	}
	
	
	//METODI
	
	//quando sim1 chiama sim 2 registra data e ora inizio
	public void startCall() {
		
	}
	//quando la chiamata si stoppa registra data e ora fine
	public void stopCall() {
		//usa date
	}
	//calcola data e ora fine chiamata - data e ora inizio chiamata(=durata chiamata)
	public void CallDuration() {
	}
	//dalla listaTelefonate verifica quante volte ogni numero ha chiamato ogni altro numero
	public void numberCallsToNumber() {
		
	}

	

	

	
	
	
	
	
	


	//GET/SET numeroChiamante
	public String getNumeroChiamante() {
		return numeroChiamante;
	}

	public void setNumeroChiamante(String numeroChiamante) {
		this.numeroChiamante = numeroChiamante;
	}


	//GET/SET numeroChiamato
	public String getNumeroChiamato() {
		return numeroChiamato;
	}

	public void setNumeroChiamato(String numeroChiamato) {
		this.numeroChiamato = numeroChiamato;
	}

	//GET/SET durataTelefonata
	public double getDurataTelefonata() {
		return this.durataTelefonata;
	}
	
	public void setDurataTelefonata(double durataTelefonata) {
		this.durataTelefonata = durataTelefonata;
	}



	
	

}



	
	
	
	
	
	
