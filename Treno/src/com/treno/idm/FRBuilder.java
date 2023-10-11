//package com.treno.idm;
//
//import com.exception.idm.CustomException;
//
//public class FRBuilder extends TrenoBuilder {
//
//	private Treno treno;
//
//	public FRBuilder(String sigla) {
//		super(sigla);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	protected void reset() {
//		try {
//			this.treno = new Treno(this.sigla);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//
//	@Override
//	protected void aggiungiLocomotiva() throws Exception {
//		for ( int i = 0; i < this.sigla.toCharArray().length; i ++) {
//			if(this.sigla.toCharArray()[i] == 'h') {
//				Vagone v = f.getVagone(this.sigla.toCharArray()[i]);
//				System.out.println(v);
//				this.treno.getVagoni().add(v);
//			}
//					
//		}
//		
//	}
//
//	@Override
//	protected void aggiungiPasseggeri() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	protected void aggiungiRistorante() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	protected void aggiungiCargo() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	public Treno getTreno() {
//		return this.treno;
//		}
//
//	
//
//}
