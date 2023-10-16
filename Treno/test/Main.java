import com.idm.exception.CustomException;
import com.idm.exception.IncompatibleException;
import com.idm.exception.LocomotivaException;
import com.idm.exception.RestaurantException;
import com.idm.exception.VagoniIncompatibili;
import com.idm.treno.ConcreteBuilder;
import com.idm.treno.FrVagoneFactory;
import com.idm.treno.TnVagoneFactory;
import com.idm.treno.Treno;
import com.idm.treno.TrenoBuilder;
import com.idm.treno.VagoneFactory;

public class Main {

	public static void main(String[] args) {
		
			String sigla = "HPPP";
			VagoneFactory f = new FrVagoneFactory();
			TrenoBuilder b = new ConcreteBuilder(f);
			Treno t;
			try {
				t = b.costruisciTreno(sigla);
				System.out.println(t);
				System.out.println("Treno creato con successo!");
			} catch(LocomotivaException e) {
				System.out.println(e.getMessage() + ". Cambiare la signa con H" + e.getSigla());
			} 
			catch (VagoniIncompatibili e) {
				System.out.println(e.getMessage());
				System.out.println("Prova a rimuovere il vagone cargo all'indice " + e.getVagone1()); // fornire suggerimento all'utente per far sapere cosa cambiare
				System.out.println("Se invece vuoi costruire un treno cargo, prova a rimuovere il vagone cargo all'indice " + e.getVagone2());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
//		Treno t2 = new Treno("hcccc");
//		System.out.println(t2);
//		
//		Treno t3 = new Treno("hpprrc");
//		System.out.println(t3);
	}

}
