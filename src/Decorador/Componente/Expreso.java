package Decorador.Componente;

public class Expreso extends Bebida {
	public int precio =500;
	protected String nombre="Expreso";
	@Override
	public int getPrecio() {
		return precio;		
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
