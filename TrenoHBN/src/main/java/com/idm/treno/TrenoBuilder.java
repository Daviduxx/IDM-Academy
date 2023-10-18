package com.idm.treno;


import com.idm.exception.ExcessRestaurantException;
import com.idm.exception.LocomotivaException;
import com.idm.exception.RestaurantException;
import com.idm.exception.TrenoException;
import com.idm.exception.VagoniIncompatibili;

public abstract class TrenoBuilder{

	
	public Treno costruisciTreno(String sigla) throws TrenoException  {
		
		// questo è il builder principale. è astratta perché si occupa solamente di implementare 
		// l'algoritmo generico della costruzione. Tutti i dettagli verranno poi delegati ai builder concreti.
		
		// la costruzione di un certo tipo di treno piuttosto che di un altro non arriva dalla sigla, ma dal tipo di factory che viene passata dal client o dal director
		
		
		// è in questo punto che bisogna fare i controlli sulla correttezza della sigla
		if(sigla.charAt(0) != 'H')
			throw new LocomotivaException("Locomotiva non in testa", sigla);
		if(sigla.contains("C") && sigla.contains("P")) {
			throw new VagoniIncompatibili("I vagoni sono incompatibili: per motivi di sicurezza i vagoni cargo e vagoni passeggeri non possono stare sullo stesso treno.", 
					sigla, sigla.indexOf('C'), sigla.indexOf('P') );
		}
		if(sigla.contains("C") && sigla.contains("R")) {
			throw new VagoniIncompatibili("I vagoni sono incompatibili: per motivi di sicurezza i vagoni cargo e vagoni ristorante non possono stare sullo stesso treno.", 
					sigla, sigla.indexOf('C'), sigla.indexOf('R') );
		}
		if(sigla.contains("R")) {
			if(sigla.indexOf("R") < (sigla.length()) / 2 || sigla.indexOf("R") > (sigla.length()) / 2 )
				throw new RestaurantException("Attenzione! Il ristorante non si trova in una posizione centrale. Cambiare la posizione del ristorante.", sigla);
		}
		for(int i = 0; i < sigla.toCharArray().length; i++) {
			if(sigla.toCharArray()[i] == 'R') {
				for (int j = i + 1; j < sigla.toCharArray().length; j++) {
					if(sigla.toCharArray()[j] == 'R') {
						throw new ExcessRestaurantException("Attenzione! E' stato inserito più di un ristorante!", sigla, i, j);
					}
				}
			}
		}
			
		Treno t = new Treno();

		for(int i = 0; i < sigla.length(); i++) {
			
			char c = sigla.charAt(i);
			
			switch (c) {
			case 'H':
				t.getVagoni().add(costruisciLocomotiva());
				break;
			case 'P':
				t.getVagoni().add(costruisciPasseggeri());		
				break;
			case 'R':
				t.getVagoni().add(costruisciRistorante());	
				break;
			case 'C':
				t.getVagoni().add(costruisciCargo());	
				break;
//			default:
//				throw new CustomException();
			}	
			
		}
		t.setMarca(impostaMarca());
		return t;
		}
	
	// questi metodi vengono implementati nel builder concreto
	protected abstract String impostaMarca();
	protected abstract Vagone costruisciLocomotiva();
	protected abstract Vagone costruisciPasseggeri();
	protected abstract Vagone costruisciRistorante();
	protected abstract Vagone costruisciCargo();
	

}
