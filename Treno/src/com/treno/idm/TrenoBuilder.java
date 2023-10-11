package com.treno.idm;

import com.exception.idm.CustomException;
import com.exception.idm.LocomotivaException;
import com.exception.idm.VagoniIncompatibili;

public abstract class TrenoBuilder{

	
	public Treno costruisciTreno(String sigla) throws LocomotivaException {
		if(sigla.charAt(0) != 'H')
			throw new LocomotivaException("Locomotiva non in testa", sigla);
		if(sigla.contains("C") && sigla.contains("P")) {
			throw new VagoniIncompatibili("I vagoni sono incompatibili", sigla, sigla.indexOf('C'), sigla.indexOf('P') );
		}
			
		Treno t = new Treno();

		for( int i = 0; i < sigla.length(); i++) {
			
			char c = sigla.charAt(i);
			
			switch (c) {
			case 'H':
				t.getVagoni().add(costruisciLocomotiva());
				break;
			case 'P':
				t.getVagoni().add(costruisciPasseggeri());		//ritorna un vagone passeggeri
				break;
			case 'R':
				t.getVagoni().add(costruisciRistorante());	// ritorna un vagone ristorante
				break;
			case 'C':
				t.getVagoni().add(costruisciCargo());		// ritorna un vagone cargo
				break;
//			default:
//				throw new CustomException();
			}	
			
		}
		t.setMarca(impostaMarca());
		return t;
		}

	protected abstract String impostaMarca();
	protected abstract Vagone costruisciLocomotiva();
	protected abstract Vagone costruisciPasseggeri();
	protected abstract Vagone costruisciRistorante();
	protected abstract Vagone costruisciCargo();

}
