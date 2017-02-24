package estrategia;

import estrategia.objetos.GumDuck;
import estrategia.objetos.PurpleDuck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PurpleDuck patoPurple = new PurpleDuck();
		patoPurple.fly();
		patoPurple.quak();
		GumDuck    patoGoma   = new GumDuck();
		patoGoma.fly();
		patoGoma.quak();
	}

}
