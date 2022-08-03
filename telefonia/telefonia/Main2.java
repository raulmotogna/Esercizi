package telefonia;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		Sim sim1 = new Sim("3265875163", 15.9);
		Sim sim2 = new Sim("3862019374", 19.2);
		Sim sim3 = new Sim("3756297584", 10.5);
		
		List<Sim> listaSim = new ArrayList<>();
		
		listaSim.add(sim1);
		listaSim.add(sim2);
		listaSim.add(sim3);
		
		List<Telefonata> listaTelefonate = new ArrayList<>();
		
		sim1.aggiungiTelefonata(sim1, sim2, 5);
		sim1.aggiungiTelefonata(sim1, sim3, 2);
		sim1.aggiungiTelefonata(sim1, sim2, 8);
		sim1.aggiungiTelefonata(sim1, sim2, 1);
		
		
		System.out.println(sim1.durataTotaleTelefonata());
		

		System.out.println(sim1.numeroTelefonateVerso(sim2));
		
		
		
		
		
		
		
		
	}
}
