package telefonia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Sim sim1 = new Sim("3265875163", 15.9, new ArrayList<Telefonata>());
		Sim sim2 = new Sim("3265875163", 15.9, new ArrayList<Telefonata>());
		Sim sim3 = new Sim("3265875163", 15.9, new ArrayList<Telefonata>());
		Sim sim4 = new Sim("3265875163", 15.9, new ArrayList<Telefonata>());
		
		
		List<Sim> listaSim = new ArrayList<>();
		
		listaSim.add(sim1);
		listaSim.add(sim2);
		listaSim.add(sim3);
		listaSim.add(sim4);
		
		
		List<Telefonata> listaTelefonate = new ArrayList<>();
		
		Scanner tellScanner = new Scanner(System.in);
		String scrivi = new String();
		
		Sim chiamante;
		Sim chiamato;
		
		while (!"1".equals(scrivi)) {
			System.out.println("Scrivi : \n0 Inserisci una nuova telefonata \n1 esci");
			scrivi = tellScanner.nextLine();
			switch(scrivi) {
			
			case "0":
				System.out.println();
				System.out.println("Seleziona chiamante : ");
				printNumbers(listaSim);
				int input = tellScanner.nextInt();
				chiamante = listaSim.get(input);

				System.out.println("Inserisci chiamato : ");
				printNumbers(listaSim);
				input = tellScanner.nextInt();
				chiamato = listaSim.get(input);
	
				
				System.out.println("Chiama");
				//fai partire il timer
				Telefonata telefonataCorrente = startCall(chiamante, chiamato);
				
				System.out.println("Attacca telefonata");
				//ferma il timer
				stopTelefonata(telefonataCorrente);
				
				
				//long tempoTrascorso = new Date().getTime() - new Date().getTime();
				
				//chiama metodo timerChiamata --> durataChiamata(fine timer - inizio timer)>>return durataChiamata
				
//				Telefonata telefonata = new Telefonata(numeroChiamante, numeroChiamato, //durataChiamata);
//				
//				listaTelefonate.add(telefonata);
				
				//System.out.println("Telefonata: "+ "Numero chiamante : "+numeroChiamante+"\n"+"Numero chiamato : "+numeroChiamato+"\n"+"Durata Telefonata : " + durataChiamata+"");
				tellScanner.nextLine();
				break;		
			}
		}
		tellScanner.close();
		
		
		
		
	}
	
	
	public static void printNumbers(List<Sim> listaSim) {
		for(int i= 0; i<listaSim.size(); i++) {
			System.out.println( i + "-" + listaSim.get(i).getNumeroTelefono()  );
		}
	}
	
	public static Telefonata startCall(Sim chiamante, Sim chiamato) {
		return new Telefonata(chiamante, chiamato);
	}
	
	public static void stopCall(Sim chiamante, Sim chiamato, Telefonata telefonata) {
		telefonata.setFineTelefonata(new Date());
		chiamante.getListaTelefonate().add(telefonata);
		chiamato.getListaTelefonate().add(telefonata);
	}
	
	public static void CallDuration() {
		
	}
	
}
