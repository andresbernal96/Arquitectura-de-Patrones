package estrategia.objetos;

import estrategia.comportamiento.Flyable;
import estrategia.comportamiento.Quakable;

public abstract class Duck {
	
	protected Flyable flyBahavior;
	protected Quakable quakBehave;
	
	public abstract void fly();
	public abstract void quak();

}
