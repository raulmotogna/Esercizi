package telefonia;


public class Telefonata {
	
	private Sim numeroChiamante;
	private Sim numeroChiamato;
	private long durataChiamata;
	
	//Costruttore
	public Telefonata(Sim numeroChiamante, Sim numeroChiamato, long durataChiamata) {
		this.numeroChiamante = numeroChiamante;
		this.numeroChiamato = numeroChiamato ;
		this.durataChiamata = durataChiamata;
	}
		
	
	//GET/SET numeroChiamante
	public Sim getNumeroChiamante() {
		return numeroChiamante;
	}

	public void setNumeroChiamante(Sim numeroChiamante) {
		this.numeroChiamante = numeroChiamante;
	}


	//GET/SET numeroChiamato
	public Sim getNumeroChiamato() {
		return numeroChiamato;
	}

	public void setNumeroChiamato(Sim numeroChiamato) {
		this.numeroChiamato = numeroChiamato;
	}

	
	//GET/SET durataChiamata
	public long getDurataChiamata() {
		return durataChiamata;
	}


	public void setDurataChiamata(long durataChiamata) {
		this.durataChiamata = durataChiamata;
	}
	
	
	@Override
	public String toString() {
		return "" +numeroChiamante+ "\n" +numeroChiamato+ "\n" +durataChiamata;
	}




	

}



	
	
	
	
	
	
