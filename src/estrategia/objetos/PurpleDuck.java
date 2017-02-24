package estrategia.objetos;

import estrategia.comportamiento.CanFly;
import estrategia.comportamiento.QuakRepublicano;

public class PurpleDuck extends Duck{

	public PurpleDuck(){
		super.flyBahavior = new CanFly();
		super.quakBehave  = new QuakRepublicano();
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.flyBahavior.fly();
	}

	@Override
	public void quak() {
		// TODO Auto-generated method stub
		super.quakBehave.quak();
	}

}
