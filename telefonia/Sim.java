package telefonia;

import java.util.ArrayList;
import java.util.List;




public class Sim {
	
	private String numeroTelefono;
	private double credito;
	private List<Telefonata> listaTelefonate = new ArrayList<>();
	
	public Sim(String numeroTelefono, double credito, List<Telefonata> listaTelefonate) {
		this.numeroTelefono = numeroTelefono;
		this.credito = credito;
		this.listaTelefonate = listaTelefonate; //--> sia ricevute che efettuate(inizio chiamata, fine chiamata, durata chiamata)
	}
	
	
	//METODI

	
	
	//
	public void PrintSimAndCallList() {
		//ciclo for sulla lista delle sim, stampare sim e lista chiamate di quella sim
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
