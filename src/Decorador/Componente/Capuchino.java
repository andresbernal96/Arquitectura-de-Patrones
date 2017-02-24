package Decorador.Componente;

public class Capuchino extends Bebida{
	public int precio=600;
	protected String nombre="Capuchino";
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
