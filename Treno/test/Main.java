import com.exception.idm.CustomException;
import com.exception.idm.IncompatibleException;
import com.exception.idm.LocomotivaException;
import com.exception.idm.RestaurantException;
import com.treno.idm.Treno;

public class Main {

	public static void main(String[] args) throws Exception {
		
		try {
			Treno t1 = new Treno("hrpppp");
			System.out.println(t1);
		} catch(CustomException e) {
			System.out.println(e.getMessage());
		} catch(LocomotivaException le) {
			System.out.println(le.getMessage());
		} catch(IncompatibleException Ie) {
			System.out.println(Ie.getMessage());
		} catch(RestaurantException Re) {
			System.out.println(Re.getMessage());
		}
		
		
		
//		Treno t2 = new Treno("hcccc");
//		System.out.println(t2);
//		
//		Treno t3 = new Treno("hpprrc");
//		System.out.println(t3);
	}

}
