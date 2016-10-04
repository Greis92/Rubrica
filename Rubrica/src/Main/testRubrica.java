package Main;
import Rubrica.Rubrica;
import Rubrica.Voce;

//import java.util.*;

public class testRubrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voce v1 = new Voce("Grazia", "Digilio", "09877665");
		Voce v2 = new Voce("Lucia", "Auletta", "98765433");
		Voce v3 = new Voce("Paolo", "Digilio", "65544331");
		
		Rubrica r1 = new Rubrica("a");
		r1.inserisciVoce(v1);
		r1.inserisciVoce(v2);
		r1.inserisciVoce(v3);
		
		System.out.println(r1.getContatti().toString());
	}

}
