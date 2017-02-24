package Decorador.Adiciones;

import Decorador.Componente.Bebida;


public class Ron extends Adicion{

	public Ron(Bebida bebida) {
		this.bebida= bebida;
	}

	@Override
	public int getPrecio() {
		return this.bebida.getPrecio()+300;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.bebida.getNombre()+" "+"Ron";
	}

}
