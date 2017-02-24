package Decorador.Adiciones;

import Decorador.Componente.Bebida;


public class LecheDeslactosada extends Adicion{

	public LecheDeslactosada(Bebida bebida) {
		this.bebida= bebida;
	}

	@Override
	public int getPrecio() {
			return this.bebida.getPrecio()+100;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.bebida.getNombre()+" "+"leche deslactosada";
	}


}
