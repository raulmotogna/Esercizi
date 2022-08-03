package telefonia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Sim sim1 = new Sim("3265875163", 15.9);
		Sim sim2 = new Sim("3862019374", 19.2);
		Sim sim3 = new Sim("3756297584", 10.5);
		Sim sim4 = new Sim("3756283028", 5.1);
		
		
		List<Sim> listaSim = new ArrayList<>();
		
		listaSim.add(sim1);
		listaSim.add(sim2);
		listaSim.add(sim3);
		listaSim.add(sim4);
		
		
		List<Telefonata> listaTelefonate = new ArrayList<>();
		
		Telefonata telefonata1 = new Telefonata(sim1, sim4, 5);
		Telefonata telefonata2 = new Telefonata(sim2, sim1, 2);
		Telefonata telefonata3 = new Telefonata(sim1, sim2, 4);
		Telefonata telefonata4 = new Telefonata(sim1, sim3, 7);
		
		listaTelefonate.add(telefonata1);
		listaTelefonate.add(telefonata2);
		listaTelefonate.add(telefonata3);
		listaTelefonate.add(telefonata4);
		
//		Scanner tellScanner = new Scanner(System.in);
//		String scrivi = new String();
//		
//		Sim chiamante;
//		Sim chiamato;
//		Sim numeroStampa;
//		
//		while (!"3".equals(scrivi)) {
//			System.out.println("Scrivi : \n0 Inserisci una nuova telefonata \n1 Stampa dati Sim \n2 Vedi telefonate verso un numero selezionato \n3 esci");
//			scrivi = tellScanner.nextLine();
//			switch(scrivi) {
//			
//			case "0":
//				System.out.println("Seleziona chiamante : ");
//				printNumbers(listaSim);
//				int input = tellScanner.nextInt();
//				chiamante = listaSim.get(input);
//
//				System.out.println("Inserisci chiamato : ");
//				printNumbers(listaSim);
//				input = tellScanner.nextInt();
//				chiamato = listaSim.get(input);
//	
//				
//				System.out.println("Chiama");
//				//fai partire il timer
//				Telefonata telefonataCorrente = startCall(chiamante, chiamato);
//
//				scrivi = tellScanner.nextLine();
//				
//
//				
//				System.out.println("Attacca telefonata");
//				scrivi = tellScanner.nextLine();
//				//ferma il timer
//				stopCall(chiamante, chiamato, telefonataCorrente);
//				
//				listaTelefonate.add(telefonataCorrente);
//				scrivi = tellScanner.nextLine();
//				
//				System.out.println(listaTelefonate);
//
//				
//				tellScanner.nextLine();
//				break;	
//				
//			case "2":
//				System.out.println("Inserisci chiamato : ");
//				printNumbers(listaSim);
//				input = tellScanner.nextInt();
//				chiamato = listaSim.get(input);
//				
//				for(int i=0; i<listaTelefonate.size(); i++) {
//					//stampare la lista delle telefonate verso questo numero
//				}
//				
//				
//				tellScanner.nextLine();
//				break;	
//				
//			case "3":
//				System.out.println("Seleziona Sim : ");
//				printNumbers(listaSim);
//				input = tellScanner.nextInt();
//				numeroStampa = listaSim.get(input);
//				//Stampare Sim
//
//				
//				scrivi = tellScanner.nextLine();
//				
//				tellScanner.nextLine();
//				break;
//			}
//		}
//		tellScanner.close();
//		
//		
//		
//		
//	}
//	
//
//	
//	
//	public static void printNumbers(List<Sim> listaSim) {
//		for(int i= 0; i<listaSim.size(); i++) {
//			System.out.println( i + "-" + listaSim.get(i).getNumeroTelefono());
//		}
//	}
//	
//	public static Telefonata startCall(Sim chiamante, Sim chiamato) {
//		return new Telefonata(chiamante, chiamato);
//	}
//	
//	public static void stopCall(Sim chiamante, Sim chiamato, Telefonata telefonata) {
//		telefonata.setFineChiamata(new Date());
//		chiamante.getListaTelefonate().add(telefonata);
//		chiamato.getListaTelefonate().add(telefonata);
//	}
//	
//	public static void CallDuration() {
//		//long tempoTrascorso = new Date().getTime() - new Date().getTime();

	}
	


	

}
