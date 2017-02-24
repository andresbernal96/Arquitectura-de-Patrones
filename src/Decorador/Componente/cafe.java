package Decorador.Componente;

public class cafe extends Bebida{
	public int precio=400;
	protected String nombre="Cafe";
	@Override
	public int getPrecio() {
		return this.precio;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
}
