package estrategia.objetos;

import estrategia.comportamiento.CanFly;
import estrategia.comportamiento.QuakDemocrata;

public class BlackDuck extends Duck{

	public BlackDuck(){
		super.flyBahavior = new CanFly();
		super.quakBehave  = new QuakDemocrata();
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
