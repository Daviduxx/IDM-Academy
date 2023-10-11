import com.exception.idm.CustomException;
import com.exception.idm.IncompatibleException;
import com.exception.idm.LocomotivaException;
import com.exception.idm.RestaurantException;
import com.exception.idm.VagoniIncompatibili;
import com.treno.idm.ConcreteBuilder;
import com.treno.idm.TnVagoneFactory;
import com.treno.idm.Treno;
import com.treno.idm.TrenoBuilder;
import com.treno.idm.VagoneFactory;

public class Main {

	public static void main(String[] args) {
		
			String sigla = "HCPH";
			VagoneFactory f = new TnVagoneFactory();
			TrenoBuilder b = new ConcreteBuilder(f);
			Treno t;
			try {
				t = b.costruisciTreno(sigla);
			} catch (VagoniIncompatibili e) {
				System.out.println(e.getMessage());
				System.out.println("Prova con "  + e.getSigla()); // fornire suggerimento all'utente per far sapere cosa cambiare
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//		System.out.println(t);
		
		
		
		
//		Treno t2 = new Treno("hcccc");
//		System.out.println(t2);
//		
//		Treno t3 = new Treno("hpprrc");
//		System.out.println(t3);
	}

}
