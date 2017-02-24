package estrategia.objetos;

import estrategia.comportamiento.Cantflay;
import estrategia.comportamiento.QuakDemocrata;

public class GumDuck extends Duck{
public int carro;

	public int getCarro() {
	return carro;
}

public void setCarro(int carro) {
	this.carro = carro;
}

	public GumDuck() {
		super.flyBahavior = new Cantflay();
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
