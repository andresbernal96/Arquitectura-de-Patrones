package Decorador.Adiciones;

import Decorador.Componente.Bebida;

public class Arequipe extends Adicion{

	public Arequipe(Bebida bebida) {
		this.bebida=bebida;
	}

	@Override
	public int getPrecio() {
		return this.bebida.getPrecio()+200;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.bebida.getNombre()+" "+"Arequipe";
	}


}
