package Decorador;

import Decorador.Adiciones.Adicion;
import Decorador.Adiciones.Arequipe;
import Decorador.Adiciones.LecheDeslactosada;
import Decorador.Componente.Bebida;
import Decorador.Componente.cafe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bebida c = new cafe();
		Adicion j = new Arequipe(c);
		Adicion v = new LecheDeslactosada(j);
		
		int precioTotal=v.getPrecio();
		String nombres=v.getNombre();
		System.out.println(precioTotal);
		System.out.println(nombres);
		
		
	}

}
